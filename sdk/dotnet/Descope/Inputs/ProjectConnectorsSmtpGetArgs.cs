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

    public sealed class ProjectConnectorsSmtpGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// SMTP server authentication credentials and method.
        /// </summary>
        [Input("authentication", required: true)]
        public Input<Inputs.ProjectConnectorsSmtpAuthenticationGetArgs> Authentication { get; set; } = null!;

        /// <summary>
        /// A description of what your connector is used for.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// A custom name for your connector.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The sender details that should be displayed in the email message.
        /// </summary>
        [Input("sender", required: true)]
        public Input<Inputs.ProjectConnectorsSmtpSenderGetArgs> Sender { get; set; } = null!;

        /// <summary>
        /// SMTP server connection details including hostname and port.
        /// </summary>
        [Input("server", required: true)]
        public Input<Inputs.ProjectConnectorsSmtpServerGetArgs> Server { get; set; } = null!;

        /// <summary>
        /// Whether the connector should send all requests from specific static IPs.
        /// </summary>
        [Input("useStaticIps")]
        public Input<bool>? UseStaticIps { get; set; }

        public ProjectConnectorsSmtpGetArgs()
        {
        }
        public static new ProjectConnectorsSmtpGetArgs Empty => new ProjectConnectorsSmtpGetArgs();
    }
}
