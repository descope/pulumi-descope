package descope

import (
	"bytes"
	"os"
	"testing"
)

func TestSchemaHCLExamplesUseTerraformBlock(t *testing.T) {
	schema, err := os.ReadFile("cmd/pulumi-resource-descope/schema.json")
	if err != nil {
		t.Fatal(err)
	}

	if bytes.Contains(schema, []byte(`pulumi {\n  required_providers`)) {
		t.Fatal("schema contains HCL examples with unsupported pulumi provider blocks")
	}
	if !bytes.Contains(schema, []byte(`terraform {\n  required_providers`)) {
		t.Fatal("schema has no HCL examples with terraform provider blocks")
	}
}
