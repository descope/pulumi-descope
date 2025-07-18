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

    public sealed class ProjectConnectorsAwsS3GetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKeyId")]
        private Input<string>? _accessKeyId;

        /// <summary>
        /// The unique AWS access key ID.
        /// </summary>
        public Input<string>? AccessKeyId
        {
            get => _accessKeyId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKeyId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Whether to enable streaming of audit events.
        /// </summary>
        [Input("auditEnabled")]
        public Input<bool>? AuditEnabled { get; set; }

        [Input("auditFilters")]
        private InputList<Inputs.ProjectConnectorsAwsS3AuditFilterGetArgs>? _auditFilters;

        /// <summary>
        /// Specify which events will be sent to the external audit service (including tenant selection).
        /// </summary>
        public InputList<Inputs.ProjectConnectorsAwsS3AuditFilterGetArgs> AuditFilters
        {
            get => _auditFilters ?? (_auditFilters = new InputList<Inputs.ProjectConnectorsAwsS3AuditFilterGetArgs>());
            set => _auditFilters = value;
        }

        /// <summary>
        /// The authentication type to use.
        /// </summary>
        [Input("authType", required: true)]
        public Input<string> AuthType { get; set; } = null!;

        /// <summary>
        /// The AWS S3 bucket. This bucket should already exist for the connector to work.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// A description of what your connector is used for.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The external ID to use when assuming the role.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// A custom name for your connector.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The AWS S3 region, e.g. `us-east-1`.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the role to assume.
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        [Input("secretAccessKey")]
        private Input<string>? _secretAccessKey;

        /// <summary>
        /// The secret AWS access key.
        /// </summary>
        public Input<string>? SecretAccessKey
        {
            get => _secretAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Whether to send troubleshooting events.
        /// </summary>
        [Input("troubleshootLogEnabled")]
        public Input<bool>? TroubleshootLogEnabled { get; set; }

        public ProjectConnectorsAwsS3GetArgs()
        {
        }
        public static new ProjectConnectorsAwsS3GetArgs Empty => new ProjectConnectorsAwsS3GetArgs();
    }
}
