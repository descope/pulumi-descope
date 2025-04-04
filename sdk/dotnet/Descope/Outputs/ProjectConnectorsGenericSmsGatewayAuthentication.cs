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
    public sealed class ProjectConnectorsGenericSmsGatewayAuthentication
    {
        public readonly Outputs.ProjectConnectorsGenericSmsGatewayAuthenticationApiKey? ApiKey;
        public readonly Outputs.ProjectConnectorsGenericSmsGatewayAuthenticationBasic? Basic;
        public readonly string? BearerToken;

        [OutputConstructor]
        private ProjectConnectorsGenericSmsGatewayAuthentication(
            Outputs.ProjectConnectorsGenericSmsGatewayAuthenticationApiKey? apiKey,

            Outputs.ProjectConnectorsGenericSmsGatewayAuthenticationBasic? basic,

            string? bearerToken)
        {
            ApiKey = apiKey;
            Basic = basic;
            BearerToken = bearerToken;
        }
    }
}
