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
    public sealed class ProjectConnectorsExternalTokenHttpAuthentication
    {
        /// <summary>
        /// API key authentication configuration.
        /// </summary>
        public readonly Outputs.ProjectConnectorsExternalTokenHttpAuthenticationApiKey? ApiKey;
        /// <summary>
        /// Basic authentication credentials (username and password).
        /// </summary>
        public readonly Outputs.ProjectConnectorsExternalTokenHttpAuthenticationBasic? Basic;
        /// <summary>
        /// Bearer token for HTTP authentication.
        /// </summary>
        public readonly string? BearerToken;

        [OutputConstructor]
        private ProjectConnectorsExternalTokenHttpAuthentication(
            Outputs.ProjectConnectorsExternalTokenHttpAuthenticationApiKey? apiKey,

            Outputs.ProjectConnectorsExternalTokenHttpAuthenticationBasic? basic,

            string? bearerToken)
        {
            ApiKey = apiKey;
            Basic = basic;
            BearerToken = bearerToken;
        }
    }
}
