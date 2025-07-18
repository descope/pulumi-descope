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

    public sealed class ProjectConnectorsAwsTranslateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS access key ID.
        /// </summary>
        [Input("accessKeyId", required: true)]
        public Input<string> AccessKeyId { get; set; } = null!;

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
        /// The AWS region to which this client will send requests. (e.g. us-east-1.)
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("secretAccessKey", required: true)]
        private Input<string>? _secretAccessKey;

        /// <summary>
        /// AWS secret access key.
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

        [Input("sessionToken")]
        private Input<string>? _sessionToken;

        /// <summary>
        /// (Optional) A security or session token to use with these credentials. Usually present for temporary credentials.
        /// </summary>
        public Input<string>? SessionToken
        {
            get => _sessionToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sessionToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ProjectConnectorsAwsTranslateArgs()
        {
        }
        public static new ProjectConnectorsAwsTranslateArgs Empty => new ProjectConnectorsAwsTranslateArgs();
    }
}
