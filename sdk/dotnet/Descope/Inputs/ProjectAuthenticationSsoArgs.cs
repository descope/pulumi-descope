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

    public sealed class ProjectAuthenticationSsoArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Whether to merge existing user accounts with new ones created through SSO authentication.
        /// </summary>
        [Input("mergeUsers")]
        public Input<bool>? MergeUsers { get; set; }

        public ProjectAuthenticationSsoArgs()
        {
        }
        public static new ProjectAuthenticationSsoArgs Empty => new ProjectAuthenticationSsoArgs();
    }
}
