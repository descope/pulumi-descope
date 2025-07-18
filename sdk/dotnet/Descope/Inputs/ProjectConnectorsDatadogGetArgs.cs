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

    public sealed class ProjectConnectorsDatadogGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiKey", required: true)]
        private Input<string>? _apiKey;

        /// <summary>
        /// The unique Datadog organization key.
        /// </summary>
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Whether to enable streaming of audit events.
        /// </summary>
        [Input("auditEnabled")]
        public Input<bool>? AuditEnabled { get; set; }

        [Input("auditFilters")]
        private InputList<Inputs.ProjectConnectorsDatadogAuditFilterGetArgs>? _auditFilters;

        /// <summary>
        /// Specify which events will be sent to the external audit service (including tenant selection).
        /// </summary>
        public InputList<Inputs.ProjectConnectorsDatadogAuditFilterGetArgs> AuditFilters
        {
            get => _auditFilters ?? (_auditFilters = new InputList<Inputs.ProjectConnectorsDatadogAuditFilterGetArgs>());
            set => _auditFilters = value;
        }

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
        /// The Datadog site to send logs to. Default is `datadoghq.com`. European, free tier and other customers should set their site accordingly.
        /// </summary>
        [Input("site")]
        public Input<string>? Site { get; set; }

        /// <summary>
        /// Whether to send troubleshooting events.
        /// </summary>
        [Input("troubleshootLogEnabled")]
        public Input<bool>? TroubleshootLogEnabled { get; set; }

        public ProjectConnectorsDatadogGetArgs()
        {
        }
        public static new ProjectConnectorsDatadogGetArgs Empty => new ProjectConnectorsDatadogGetArgs();
    }
}
