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

    public sealed class ProjectConnectorsGoogleCloudTranslationArgs : global::Pulumi.ResourceArgs
    {
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
        /// The Google Cloud project ID where the Google Cloud Translation is managed.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("serviceAccountJson", required: true)]
        private Input<string>? _serviceAccountJson;

        /// <summary>
        /// Service Account JSON associated with the current project.
        /// </summary>
        public Input<string>? ServiceAccountJson
        {
            get => _serviceAccountJson;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _serviceAccountJson = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ProjectConnectorsGoogleCloudTranslationArgs()
        {
        }
        public static new ProjectConnectorsGoogleCloudTranslationArgs Empty => new ProjectConnectorsGoogleCloudTranslationArgs();
    }
}
