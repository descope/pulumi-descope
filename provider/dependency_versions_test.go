package descope

import (
	"fmt"
	"os"
	"regexp"
	"testing"
)

type semanticVersion struct {
	major int
	minor int
	patch int
}

func Test_SecurityCriticalDependencies_meet_patched_versions(t *testing.T) {
	// Given
	minimums := map[string]semanticVersion{
		"go.opentelemetry.io/otel": {major: 1, minor: 41},
		"golang.org/x/net":         {minor: 55},
	}
	goMod, err := os.ReadFile("go.mod")
	if err != nil {
		t.Fatalf("read go.mod: %v", err)
	}

	for module, minimum := range minimums {
		t.Run(module, func(t *testing.T) {
			// When
			selected := selectedModuleVersion(t, goMod, module)

			// Then
			if selected.lessThan(minimum) {
				t.Fatalf("%s version %s is below security minimum %s", module, selected, minimum)
			}
		})
	}
}

func selectedModuleVersion(t *testing.T, goMod []byte, module string) semanticVersion {
	t.Helper()

	match := regexp.MustCompile(`(?m)^\s*` + regexp.QuoteMeta(module) + ` v(\d+)\.(\d+)\.(\d+)`).FindSubmatch(goMod)
	if match == nil {
		t.Fatalf("module %s is missing from go.mod", module)
	}

	var version semanticVersion
	versionText := fmt.Sprintf("%s.%s.%s", match[1], match[2], match[3])
	if _, err := fmt.Sscanf(versionText, "%d.%d.%d", &version.major, &version.minor, &version.patch); err != nil {
		t.Fatalf("parse %s version: %v", module, err)
	}
	return version
}

func (version semanticVersion) lessThan(other semanticVersion) bool {
	if version.major != other.major {
		return version.major < other.major
	}
	if version.minor != other.minor {
		return version.minor < other.minor
	}
	return version.patch < other.patch
}

func (version semanticVersion) String() string {
	return fmt.Sprintf("v%d.%d.%d", version.major, version.minor, version.patch)
}
