// Copyright 2016-2024, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package descope

import (
	"path"

	// Allow embedding bridge-metadata.json in the provider.
	_ "embed"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"

	// Replace this provider with the provider you are bridging.
	descope "github.com/descope/terraform-provider-descope/provider"

	"github.com/descope/pulumi-descope/provider/pkg/version"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
)

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	mainPkg = "descope"
	// modules:
	mainMod = "index" // the descope module
)

//go:embed cmd/pulumi-resource-descope/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the provider.
func Provider() tfbridge.ProviderInfo {
	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		// 3. Providers written with terraform-plugin-framework:
		//
		//    If the provider you are bridging is written with the terraform-plugin-framework, then
		//    you will need to adapt the boilerplate:
		//
		//    - Remove the `shimv2` import and add:
		//
		//      	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
		//
		//    - Replace `shimv2.NewProvider` with `pfbridge.ShimProvider`.
		//
		//    - In provider/cmd/pulumi-tfgen-descope/main.go, replace the
		//      "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen" import with
		//      "github.com/pulumi/pulumi-terraform-bridge/pf/tfgen". Remove the `version.Version`
		//      argument to `tfgen.Main`.
		//
		//    - In provider/cmd/pulumi-resource-descope/main.go, replace the
		//      "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge" import with
		//      "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge". Replace the arguments to the
		//      `tfbridge.Main` so it looks like this:
		//
		//      	tfbridge.Main(context.Background(), "descope", descope.Provider(),
		//			tfbridge.ProviderMetadata{PulumiSchema: pulumiSchema})
		//
		//   Detailed instructions can be found at
		//   https://github.com/pulumi/pulumi-terraform-bridge/blob/master/pf/README.md#how-to-upgrade-a-bridged-provider-to-plugin-framework.
		//   After that, you can proceed as normal.
		//
		P: pfbridge.ShimProvider(descope.New(version.Version)()),

		Name:    "descope",
		Version: version.Version,
		// DisplayName is a way to be able to change the casing of the provider name when being
		// displayed on the Pulumi registry
		DisplayName: "Descope",
		// Change this to your personal name (or a company name) that you would like to be shown in
		// the Pulumi Registry if this package is published there.
		Publisher: "descope",
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL: "",
		// PluginDownloadURL is an optional URL used to download the Provider
		// for use in Pulumi programs
		// e.g https://github.com/org/pulumi-provider-name/releases/
		PluginDownloadURL: "https://github.com/descope/pulumi-descope/releases/",
		Description:       "A Pulumi package for creating and managing descope cloud resources.",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords:   []string{"descope", "descope", "category/cloud"},
		License:    "Apache-2.0",
		Homepage:   "https://www.pulumi.com",
		Repository: "https://github.com/descope/pulumi-descope",
		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this should
		// match the TF provider module's require directive, not any replace directives.
		GitHubOrg:    "descope",
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		Config:       map[string]*tfbridge.SchemaInfo{
			// Add any required configuration here, or remove the example below if
			// no additional points are required.
			// "region": {
			// 	Type: tfbridge.MakeType("region", "Region"),
			// 	Default: &tfbridge.DefaultInfo{
			// 		EnvVars: []string{"AWS_REGION", "AWS_DEFAULT_REGION"},
			// 	},
			// },
		},
		JavaScript: &tfbridge.JavaScriptInfo{
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
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				"github.com/descope/pulumi-descope/sdk/",
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
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
