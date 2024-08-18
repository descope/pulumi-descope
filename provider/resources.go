package descope

import (
	"fmt"
	"path"

	// Allow embedding bridge-metadata.json in the provider.
	_ "embed"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"golang.org/x/text/cases"
	"golang.org/x/text/language"

	// Replace this provider with the provider you are bridging.
	descope "github.com/descope/terraform-provider-descope/shim"

	"github.com/descope/pulumi-descope/provider/pkg/version"
)

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	mainPkg = "descope"
	// modules:
	mainMod   = "index" // the descope module
	publisher = "descope"
)

//go:embed cmd/pulumi-resource-descope/bridge-metadata.json
var metadata []byte

func Provider() tfbridge.ProviderInfo {
	caser := cases.Title(language.English)

	prov := tfbridge.ProviderInfo{
		P: pfbridge.ShimProvider(descope.Provider(version.Version)),

		Name:              mainPkg,
		Version:           version.Version,
		DisplayName:       caser.String(mainPkg),
		Publisher:         caser.String(publisher),
		LogoURL:           "",
		PluginDownloadURL: fmt.Sprintf("github://api.github.com/%s", publisher),
		Description:       "A Pulumi package for creating and managing descope cloud resources.",
		Keywords:          []string{"descope", "category/cloud"},
		License:           "Apache-2.0",
		Homepage:          "https://www.descope.com",
		Repository:        "https://github.com/descope/pulumi-descope",
		GitHubOrg:         "descope",
		MetadataInfo:      tfbridge.NewProviderMetadata(metadata),
		Config:            map[string]*tfbridge.SchemaInfo{},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: fmt.Sprintf("@%s/pulumi-%s", publisher, mainPkg),
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			PackageName: fmt.Sprintf("%s_pulumi", publisher),
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/%s/pulumi-%s/sdk/", publisher, mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RootNamespace: fmt.Sprintf("%s.Pulumi", caser.String(publisher)),
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	// MustComputeTokens maps all resources and datasources from the upstream provider into Pulumi.
	//
	// tokens.SingleModule puts every upstream item into your provider's main module.
	//
	// You shouldn't need to override anything, but if you do, use the [tfbridge.ProviderInfo.Resources]
	// and [tfbridge.ProviderInfo.DataSources].
	prov.MustComputeTokens(tokens.SingleModule("descope_", mainMod,
		tokens.MakeStandard(mainPkg)))

	prov.MustApplyAutoAliases()
	prov.SetAutonaming(255, "-")

	return prov
}
