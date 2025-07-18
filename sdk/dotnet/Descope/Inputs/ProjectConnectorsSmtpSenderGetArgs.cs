// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Descope.Pulumi.Descope.Inputs
{

    public sealed class ProjectConnectorsSmtpSenderGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The email address that will appear as the sender of the email.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// The display name that will appear as the sender of the email.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ProjectConnectorsSmtpSenderGetArgs()
        {
        }
        public static new ProjectConnectorsSmtpSenderGetArgs Empty => new ProjectConnectorsSmtpSenderGetArgs();
    }
}
