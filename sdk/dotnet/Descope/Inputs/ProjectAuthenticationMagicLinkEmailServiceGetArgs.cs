// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Descope.Pulumi.Descope.Inputs
{

    public sealed class ProjectAuthenticationMagicLinkEmailServiceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("connector", required: true)]
        public Input<string> Connector { get; set; } = null!;

        [Input("templates")]
        private InputList<Inputs.ProjectAuthenticationMagicLinkEmailServiceTemplateGetArgs>? _templates;
        public InputList<Inputs.ProjectAuthenticationMagicLinkEmailServiceTemplateGetArgs> Templates
        {
            get => _templates ?? (_templates = new InputList<Inputs.ProjectAuthenticationMagicLinkEmailServiceTemplateGetArgs>());
            set => _templates = value;
        }

        public ProjectAuthenticationMagicLinkEmailServiceGetArgs()
        {
        }
        public static new ProjectAuthenticationMagicLinkEmailServiceGetArgs Empty => new ProjectAuthenticationMagicLinkEmailServiceGetArgs();
    }
}
