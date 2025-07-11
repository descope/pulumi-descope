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
    public sealed class ProjectConnectorsSe
    {
        /// <summary>
        /// AWS Access key ID.
        /// </summary>
        public readonly string AccessKeyId;
        /// <summary>
        /// A description of what your connector is used for.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// An optional endpoint URL (hostname only or fully qualified URI).
        /// </summary>
        public readonly string? Endpoint;
        public readonly string? Id;
        /// <summary>
        /// A custom name for your connector.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// AWS region to send requests to (e.g. `us-west-2`).
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// AWS Secret Access Key.
        /// </summary>
        public readonly string Secret;
        /// <summary>
        /// The sender details that should be displayed in the email message.
        /// </summary>
        public readonly Outputs.ProjectConnectorsSeSender Sender;

        [OutputConstructor]
        private ProjectConnectorsSe(
            string accessKeyId,

            string? description,

            string? endpoint,

            string? id,

            string name,

            string region,

            string secret,

            Outputs.ProjectConnectorsSeSender sender)
        {
            AccessKeyId = accessKeyId;
            Description = description;
            Endpoint = endpoint;
            Id = id;
            Name = name;
            Region = region;
            Secret = secret;
            Sender = sender;
        }
    }
}
