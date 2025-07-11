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
    public sealed class ProjectConnectorsAuditWebhook
    {
        /// <summary>
        /// Specify which events will be sent to the external audit service (including tenant selection).
        /// </summary>
        public readonly ImmutableArray<Outputs.ProjectConnectorsAuditWebhookAuditFilter> AuditFilters;
        /// <summary>
        /// Authentication Information
        /// </summary>
        public readonly Outputs.ProjectConnectorsAuditWebhookAuthentication? Authentication;
        /// <summary>
        /// The base URL to fetch
        /// </summary>
        public readonly string BaseUrl;
        /// <summary>
        /// A description of what your connector is used for.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The headers to send with the request
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Headers;
        /// <summary>
        /// HMAC is a method for message signing with a symmetrical key. This secret will be used to sign the payload, and the resulting signature will be sent in the `x-descope-webhook-s256` header. The receiving service should use this secret to verify the integrity and authenticity of the payload by checking the provided signature
        /// </summary>
        public readonly string? HmacSecret;
        public readonly string? Id;
        /// <summary>
        /// Will ignore certificate errors raised by the client
        /// </summary>
        public readonly bool? Insecure;
        /// <summary>
        /// A custom name for your connector.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private ProjectConnectorsAuditWebhook(
            ImmutableArray<Outputs.ProjectConnectorsAuditWebhookAuditFilter> auditFilters,

            Outputs.ProjectConnectorsAuditWebhookAuthentication? authentication,

            string baseUrl,

            string? description,

            ImmutableDictionary<string, string>? headers,

            string? hmacSecret,

            string? id,

            bool? insecure,

            string name)
        {
            AuditFilters = auditFilters;
            Authentication = authentication;
            BaseUrl = baseUrl;
            Description = description;
            Headers = headers;
            HmacSecret = hmacSecret;
            Id = id;
            Insecure = insecure;
            Name = name;
        }
    }
}
