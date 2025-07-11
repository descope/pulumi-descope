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
    public sealed class ProjectConnectorsEightByEightWhatsapp
    {
        /// <summary>
        /// The 8x8 API key for authentication.
        /// </summary>
        public readonly string ApiKey;
        /// <summary>
        /// The country code or region where your Viber messaging service is configured.
        /// </summary>
        public readonly string? Country;
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
        /// The 8x8 sub-account ID is required for the Messaging API.
        /// </summary>
        public readonly string SubAccountId;
        /// <summary>
        /// The ID of a WhatsApp message template.
        /// </summary>
        public readonly string TemplateId;
        /// <summary>
        /// Whether the connector should send all requests from specific static IPs.
        /// </summary>
        public readonly bool? UseStaticIps;

        [OutputConstructor]
        private ProjectConnectorsEightByEightWhatsapp(
            string apiKey,

            string? country,

            string? description,

            string? id,

            string name,

            string subAccountId,

            string templateId,

            bool? useStaticIps)
        {
            ApiKey = apiKey;
            Country = country;
            Description = description;
            Id = id;
            Name = name;
            SubAccountId = subAccountId;
            TemplateId = templateId;
            UseStaticIps = useStaticIps;
        }
    }
}
