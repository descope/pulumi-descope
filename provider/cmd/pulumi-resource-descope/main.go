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

package main

import (
	"context"

	_ "embed"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"

	descope "github.com/descope/pulumi-descope/provider"
)

//go:embed schema.json
var pulumiSchema []byte

func main() {
	tfbridge.Main(context.Background(), "descope", descope.Provider(),
		tfbridge.ProviderMetadata{PackageSchema: pulumiSchema})
}
