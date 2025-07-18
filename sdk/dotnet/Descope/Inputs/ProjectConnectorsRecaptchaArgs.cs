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

    public sealed class ProjectConnectorsRecaptchaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When configured, the Recaptcha action will return the score without assessing the request. The score ranges between 0 and 1, where 1 is a human interaction and 0 is a bot.
        /// </summary>
        [Input("assessmentScore")]
        public Input<double>? AssessmentScore { get; set; }

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
        /// Override the default assessment model. Note: Overriding assessment is intended for automated testing and should not be utilized in production environments.
        /// </summary>
        [Input("overrideAssessment")]
        public Input<bool>? OverrideAssessment { get; set; }

        [Input("secretKey", required: true)]
        private Input<string>? _secretKey;

        /// <summary>
        /// The secret key authorizes communication between Descope backend and the reCAPTCHA server to verify the user's response.
        /// </summary>
        public Input<string>? SecretKey
        {
            get => _secretKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The site key is used to invoke reCAPTCHA service on your site or mobile application.
        /// </summary>
        [Input("siteKey", required: true)]
        public Input<string> SiteKey { get; set; } = null!;

        public ProjectConnectorsRecaptchaArgs()
        {
        }
        public static new ProjectConnectorsRecaptchaArgs Empty => new ProjectConnectorsRecaptchaArgs();
    }
}
