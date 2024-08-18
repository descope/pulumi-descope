package main

import (
	"github.com/descope/pulumi-descope/sdk/go/descope"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		project, err := descope.NewProject(ctx, "pulumi-go-test", &descope.ProjectArgs{})
		if err != nil {
			return err
		}
		ctx.Export("project", project)
		return nil
	})
}
