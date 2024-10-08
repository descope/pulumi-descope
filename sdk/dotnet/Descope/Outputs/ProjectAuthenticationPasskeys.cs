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
    public sealed class ProjectAuthenticationPasskeys
    {
        public readonly bool? Enabled;
        /// <summary>
        /// Passkeys will be usable in the following domain and all its subdomains.
        /// </summary>
        public readonly string? TopLevelDomain;

        [OutputConstructor]
        private ProjectAuthenticationPasskeys(
            bool? enabled,

            string? topLevelDomain)
        {
            Enabled = enabled;
            TopLevelDomain = topLevelDomain;
        }
    }
}
