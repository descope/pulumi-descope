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
    public sealed class ProjectConnectorsHubspot
    {
        public readonly string AccessToken;
        public readonly string? BaseUrl;
        public readonly string? Description;
        public readonly string? Id;
        public readonly string Name;

        [OutputConstructor]
        private ProjectConnectorsHubspot(
            string accessToken,

            string? baseUrl,

            string? description,

            string? id,

            string name)
        {
            AccessToken = accessToken;
            BaseUrl = baseUrl;
            Description = description;
            Id = id;
            Name = name;
        }
    }
}