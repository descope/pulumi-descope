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

    public sealed class ProjectAuthenticationEmbeddedLinkArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("expirationTime")]
        public Input<int>? ExpirationTime { get; set; }

        [Input("expirationTimeUnit")]
        public Input<string>? ExpirationTimeUnit { get; set; }

        public ProjectAuthenticationEmbeddedLinkArgs()
        {
        }
        public static new ProjectAuthenticationEmbeddedLinkArgs Empty => new ProjectAuthenticationEmbeddedLinkArgs();
    }
}