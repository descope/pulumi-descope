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

    public sealed class ProjectConnectorsSeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS Access key ID.
        /// </summary>
        [Input("accessKeyId", required: true)]
        public Input<string> AccessKeyId { get; set; } = null!;

        /// <summary>
        /// A description of what your connector is used for.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// An optional endpoint URL (hostname only or fully qualified URI).
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// A custom name for your connector.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// AWS region to send requests to (e.g. `us-west-2`).
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("secret", required: true)]
        private Input<string>? _secret;

        /// <summary>
        /// AWS Secret Access Key.
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The sender details that should be displayed in the email message.
        /// </summary>
        [Input("sender", required: true)]
        public Input<Inputs.ProjectConnectorsSeSenderGetArgs> Sender { get; set; } = null!;

        public ProjectConnectorsSeGetArgs()
        {
        }
        public static new ProjectConnectorsSeGetArgs Empty => new ProjectConnectorsSeGetArgs();
    }
}
