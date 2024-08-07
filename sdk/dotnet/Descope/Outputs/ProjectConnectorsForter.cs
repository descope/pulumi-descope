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
    public sealed class ProjectConnectorsForter
    {
        public readonly string? Description;
        public readonly string? Id;
        public readonly string Name;
        public readonly string? OverrideIpAddress;
        public readonly string? OverrideUserEmail;
        public readonly bool? Overrides;
        public readonly string SecretKey;
        public readonly string SiteId;

        [OutputConstructor]
        private ProjectConnectorsForter(
            string? description,

            string? id,

            string name,

            string? overrideIpAddress,

            string? overrideUserEmail,

            bool? overrides,

            string secretKey,

            string siteId)
        {
            Description = description;
            Id = id;
            Name = name;
            OverrideIpAddress = overrideIpAddress;
            OverrideUserEmail = overrideUserEmail;
            Overrides = overrides;
            SecretKey = secretKey;
            SiteId = siteId;
        }
    }
}
