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

    public sealed class ProjectConnectorsTwilioCoreSendersVoiceArgs : global::Pulumi.ResourceArgs
    {
        [Input("phoneNumber", required: true)]
        public Input<string> PhoneNumber { get; set; } = null!;

        public ProjectConnectorsTwilioCoreSendersVoiceArgs()
        {
        }
        public static new ProjectConnectorsTwilioCoreSendersVoiceArgs Empty => new ProjectConnectorsTwilioCoreSendersVoiceArgs();
    }
}