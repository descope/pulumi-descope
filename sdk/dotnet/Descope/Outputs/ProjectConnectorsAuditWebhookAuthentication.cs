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
    public sealed class ProjectConnectorsAuditWebhookAuthentication
    {
        public readonly Outputs.ProjectConnectorsAuditWebhookAuthenticationApiKey? ApiKey;
        public readonly Outputs.ProjectConnectorsAuditWebhookAuthenticationBasic? Basic;
        public readonly string? BearerToken;

        [OutputConstructor]
        private ProjectConnectorsAuditWebhookAuthentication(
            Outputs.ProjectConnectorsAuditWebhookAuthenticationApiKey? apiKey,

            Outputs.ProjectConnectorsAuditWebhookAuthenticationBasic? basic,

            string? bearerToken)
        {
            ApiKey = apiKey;
            Basic = basic;
            BearerToken = bearerToken;
        }
    }
}