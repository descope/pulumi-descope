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
    public sealed class ProjectAuthenticationWebauthn
    {
        public readonly bool? Enabled;
        public readonly string? TopLevelDomain;

        [OutputConstructor]
        private ProjectAuthenticationWebauthn(
            bool? enabled,

            string? topLevelDomain)
        {
            Enabled = enabled;
            TopLevelDomain = topLevelDomain;
        }
    }
}