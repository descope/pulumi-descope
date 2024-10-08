// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Descope.Pulumi.Descope.Outputs
{

    [OutputType]
    public sealed class ProjectAuthenticationSso
    {
        public readonly bool? Enabled;
        /// <summary>
        /// Whether to merge existing user accounts with new ones created through SSO authentication.
        /// </summary>
        public readonly bool? MergeUsers;

        [OutputConstructor]
        private ProjectAuthenticationSso(
            bool? enabled,

            bool? mergeUsers)
        {
            Enabled = enabled;
            MergeUsers = mergeUsers;
        }
    }
}
