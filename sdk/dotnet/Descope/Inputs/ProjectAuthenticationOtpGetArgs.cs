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

    public sealed class ProjectAuthenticationOtpGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        [Input("emailService")]
        public Input<Inputs.ProjectAuthenticationOtpEmailServiceGetArgs>? EmailService { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("expirationTime")]
        public Input<int>? ExpirationTime { get; set; }

        [Input("expirationTimeUnit")]
        public Input<string>? ExpirationTimeUnit { get; set; }

        [Input("textService")]
        public Input<Inputs.ProjectAuthenticationOtpTextServiceGetArgs>? TextService { get; set; }

        [Input("voiceService")]
        public Input<Inputs.ProjectAuthenticationOtpVoiceServiceGetArgs>? VoiceService { get; set; }

        public ProjectAuthenticationOtpGetArgs()
        {
        }
        public static new ProjectAuthenticationOtpGetArgs Empty => new ProjectAuthenticationOtpGetArgs();
    }
}