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

    public sealed class ProjectAuthenticationEnchantedLinkEmailServiceArgs : global::Pulumi.ResourceArgs
    {
        [Input("connector", required: true)]
        public Input<string> Connector { get; set; } = null!;

        [Input("templates")]
        private InputList<Inputs.ProjectAuthenticationEnchantedLinkEmailServiceTemplateArgs>? _templates;
        public InputList<Inputs.ProjectAuthenticationEnchantedLinkEmailServiceTemplateArgs> Templates
        {
            get => _templates ?? (_templates = new InputList<Inputs.ProjectAuthenticationEnchantedLinkEmailServiceTemplateArgs>());
            set => _templates = value;
        }

        public ProjectAuthenticationEnchantedLinkEmailServiceArgs()
        {
        }
        public static new ProjectAuthenticationEnchantedLinkEmailServiceArgs Empty => new ProjectAuthenticationEnchantedLinkEmailServiceArgs();
    }
}
