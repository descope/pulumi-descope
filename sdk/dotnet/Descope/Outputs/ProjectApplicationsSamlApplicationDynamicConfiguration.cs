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
    public sealed class ProjectApplicationsSamlApplicationDynamicConfiguration
    {
        /// <summary>
        /// The metadata URL when retrieving the connection details dynamically.
        /// </summary>
        public readonly string MetadataUrl;

        [OutputConstructor]
        private ProjectApplicationsSamlApplicationDynamicConfiguration(string metadataUrl)
        {
            MetadataUrl = metadataUrl;
        }
    }
}
