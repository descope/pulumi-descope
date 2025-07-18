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

    public sealed class ProjectConnectorsSmtpServerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The hostname or IP address of the SMTP server.
        /// </summary>
        [Input("host", required: true)]
        public Input<string> Host { get; set; } = null!;

        /// <summary>
        /// The port number to connect to on the SMTP server.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        public ProjectConnectorsSmtpServerGetArgs()
        {
        }
        public static new ProjectConnectorsSmtpServerGetArgs Empty => new ProjectConnectorsSmtpServerGetArgs();
    }
}
