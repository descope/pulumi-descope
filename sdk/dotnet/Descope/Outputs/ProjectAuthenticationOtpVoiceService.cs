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
    public sealed class ProjectAuthenticationOtpVoiceService
    {
        /// <summary>
        /// The name of the voice connector to use for making voice calls.
        /// </summary>
        public readonly string Connector;
        /// <summary>
        /// A list of voice message templates for different purposes.
        /// </summary>
        public readonly ImmutableArray<Outputs.ProjectAuthenticationOtpVoiceServiceTemplate> Templates;

        [OutputConstructor]
        private ProjectAuthenticationOtpVoiceService(
            string connector,

            ImmutableArray<Outputs.ProjectAuthenticationOtpVoiceServiceTemplate> templates)
        {
            Connector = connector;
            Templates = templates;
        }
    }
}
