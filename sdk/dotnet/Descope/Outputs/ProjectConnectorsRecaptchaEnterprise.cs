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
    public sealed class ProjectConnectorsRecaptchaEnterprise
    {
        /// <summary>
        /// API key associated with the current project.
        /// </summary>
        public readonly string ApiKey;
        /// <summary>
        /// When configured, the Recaptcha action will return the score without assessing the request. The score ranges between 0 and 1, where 1 is a human interaction and 0 is a bot.
        /// </summary>
        public readonly double? AssessmentScore;
        /// <summary>
        /// A description of what your connector is used for.
        /// </summary>
        public readonly string? Description;
        public readonly string? Id;
        /// <summary>
        /// A custom name for your connector.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Override the default assessment model. Note: Overriding assessment is intended for automated testing and should not be utilized in production environments.
        /// </summary>
        public readonly bool? OverrideAssessment;
        /// <summary>
        /// The Google Cloud project ID where the reCAPTCHA Enterprise is managed.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// The site key is used to invoke reCAPTCHA Enterprise service on your site or mobile application.
        /// </summary>
        public readonly string SiteKey;

        [OutputConstructor]
        private ProjectConnectorsRecaptchaEnterprise(
            string apiKey,

            double? assessmentScore,

            string? description,

            string? id,

            string name,

            bool? overrideAssessment,

            string projectId,

            string siteKey)
        {
            ApiKey = apiKey;
            AssessmentScore = assessmentScore;
            Description = description;
            Id = id;
            Name = name;
            OverrideAssessment = overrideAssessment;
            ProjectId = projectId;
            SiteKey = siteKey;
        }
    }
}
