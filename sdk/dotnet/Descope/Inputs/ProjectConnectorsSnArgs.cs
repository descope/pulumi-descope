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

    public sealed class ProjectConnectorsSnArgs : global::Pulumi.ResourceArgs
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

        /// <summary>
        /// The entity ID or principal entity (PE) ID for sending text messages to recipients in India.
        /// </summary>
        [Input("entityId")]
        public Input<string>? EntityId { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// A custom name for your connector.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// An optional phone number from which the text messages are going to be sent. Make sure it is registered properly in your server.
        /// </summary>
        [Input("organizationNumber")]
        public Input<string>? OrganizationNumber { get; set; }

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
        /// The name of the sender from which the text message is going to be sent (see SNS documentation regarding acceptable IDs and supported regions/countries).
        /// </summary>
        [Input("senderId")]
        public Input<string>? SenderId { get; set; }

        /// <summary>
        /// The template for sending text messages to recipients in India. The template ID must be associated with the sender ID.
        /// </summary>
        [Input("templateId")]
        public Input<string>? TemplateId { get; set; }

        public ProjectConnectorsSnArgs()
        {
        }
        public static new ProjectConnectorsSnArgs Empty => new ProjectConnectorsSnArgs();
    }
}
