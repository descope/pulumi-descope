package shim

import (
	p "github.com/descope/terraform-provider-descope/internal/provider"
	"github.com/hashicorp/terraform-plugin-framework/provider"
)

func Provider(version string) provider.Provider {
	return p.New(version)()
}
