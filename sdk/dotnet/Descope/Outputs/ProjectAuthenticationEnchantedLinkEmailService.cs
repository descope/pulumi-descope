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
    public sealed class ProjectAuthenticationEnchantedLinkEmailService
    {
        /// <summary>
        /// The name of the email connector to use for sending emails.
        /// </summary>
        public readonly string Connector;
        /// <summary>
        /// A list of email templates for different authentication flows.
        /// </summary>
        public readonly ImmutableArray<Outputs.ProjectAuthenticationEnchantedLinkEmailServiceTemplate> Templates;

        [OutputConstructor]
        private ProjectAuthenticationEnchantedLinkEmailService(
            string connector,

            ImmutableArray<Outputs.ProjectAuthenticationEnchantedLinkEmailServiceTemplate> templates)
        {
            Connector = connector;
            Templates = templates;
        }
    }
}
