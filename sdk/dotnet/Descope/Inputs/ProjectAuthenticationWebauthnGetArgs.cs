// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Descope.Pulumi.Descope.Inputs
{

    public sealed class ProjectAuthenticationWebauthnGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("topLevelDomain")]
        public Input<string>? TopLevelDomain { get; set; }

        public ProjectAuthenticationWebauthnGetArgs()
        {
        }
        public static new ProjectAuthenticationWebauthnGetArgs Empty => new ProjectAuthenticationWebauthnGetArgs();
    }
}