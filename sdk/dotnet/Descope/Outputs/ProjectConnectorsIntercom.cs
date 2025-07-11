// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
    public sealed class ProjectConnectorsIntercom
    {
        /// <summary>
        /// A description of what your connector is used for.
        /// </summary>
        public readonly string? Description;
        public readonly string? Id;
        /// <summary>
        /// A custom name for your connector.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Regional Hosting - US, EU, or AU. default: US
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// The Intercom access token.
        /// </summary>
        public readonly string Token;

        [OutputConstructor]
        private ProjectConnectorsIntercom(
            string? description,

            string? id,

            string name,

            string? region,

            string token)
        {
            Description = description;
            Id = id;
            Name = name;
            Region = region;
            Token = token;
        }
    }
}
