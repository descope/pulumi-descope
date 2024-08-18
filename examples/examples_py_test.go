//go:build python || all
// +build python all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func getPythonBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions()
	basePython := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			filepath.Join("..", "sdk", "python", "bin"),
		},
	})

	return basePython
}

func TestAccDescopePy(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "py"),
		})
	integration.ProgramTest(t, &test)
}
