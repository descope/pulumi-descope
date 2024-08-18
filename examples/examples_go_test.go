//go:build go || all
// +build go all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func getGoBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions()
	baseGo := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			filepath.Join("..", "sdk"),
		},
	})

	return baseGo
}
func TestAccDescopeGo(t *testing.T) {
	test := getGoBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "go"),
		})
	integration.ProgramTest(t, &test)
}
