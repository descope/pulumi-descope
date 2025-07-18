// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectConnectorsRecaptchaEnterpriseArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectConnectorsRecaptchaEnterpriseArgs Empty = new ProjectConnectorsRecaptchaEnterpriseArgs();

    /**
     * API key associated with the current project.
     * 
     */
    @Import(name="apiKey", required=true)
    private Output<String> apiKey;

    /**
     * @return API key associated with the current project.
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }

    /**
     * When configured, the Recaptcha action will return the score without assessing the request. The score ranges between 0 and 1, where 1 is a human interaction and 0 is a bot.
     * 
     */
    @Import(name="assessmentScore")
    private @Nullable Output<Double> assessmentScore;

    /**
     * @return When configured, the Recaptcha action will return the score without assessing the request. The score ranges between 0 and 1, where 1 is a human interaction and 0 is a bot.
     * 
     */
    public Optional<Output<Double>> assessmentScore() {
        return Optional.ofNullable(this.assessmentScore);
    }

    /**
     * A description of what your connector is used for.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of what your connector is used for.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A custom name for your connector.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A custom name for your connector.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Override the default assessment model. Note: Overriding assessment is intended for automated testing and should not be utilized in production environments.
     * 
     */
    @Import(name="overrideAssessment")
    private @Nullable Output<Boolean> overrideAssessment;

    /**
     * @return Override the default assessment model. Note: Overriding assessment is intended for automated testing and should not be utilized in production environments.
     * 
     */
    public Optional<Output<Boolean>> overrideAssessment() {
        return Optional.ofNullable(this.overrideAssessment);
    }

    /**
     * The Google Cloud project ID where the reCAPTCHA Enterprise is managed.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The Google Cloud project ID where the reCAPTCHA Enterprise is managed.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * The site key is used to invoke reCAPTCHA Enterprise service on your site or mobile application.
     * 
     */
    @Import(name="siteKey", required=true)
    private Output<String> siteKey;

    /**
     * @return The site key is used to invoke reCAPTCHA Enterprise service on your site or mobile application.
     * 
     */
    public Output<String> siteKey() {
        return this.siteKey;
    }

    private ProjectConnectorsRecaptchaEnterpriseArgs() {}

    private ProjectConnectorsRecaptchaEnterpriseArgs(ProjectConnectorsRecaptchaEnterpriseArgs $) {
        this.apiKey = $.apiKey;
        this.assessmentScore = $.assessmentScore;
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.overrideAssessment = $.overrideAssessment;
        this.projectId = $.projectId;
        this.siteKey = $.siteKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectConnectorsRecaptchaEnterpriseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectConnectorsRecaptchaEnterpriseArgs $;

        public Builder() {
            $ = new ProjectConnectorsRecaptchaEnterpriseArgs();
        }

        public Builder(ProjectConnectorsRecaptchaEnterpriseArgs defaults) {
            $ = new ProjectConnectorsRecaptchaEnterpriseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey API key associated with the current project.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey API key associated with the current project.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param assessmentScore When configured, the Recaptcha action will return the score without assessing the request. The score ranges between 0 and 1, where 1 is a human interaction and 0 is a bot.
         * 
         * @return builder
         * 
         */
        public Builder assessmentScore(@Nullable Output<Double> assessmentScore) {
            $.assessmentScore = assessmentScore;
            return this;
        }

        /**
         * @param assessmentScore When configured, the Recaptcha action will return the score without assessing the request. The score ranges between 0 and 1, where 1 is a human interaction and 0 is a bot.
         * 
         * @return builder
         * 
         */
        public Builder assessmentScore(Double assessmentScore) {
            return assessmentScore(Output.of(assessmentScore));
        }

        /**
         * @param description A description of what your connector is used for.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of what your connector is used for.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name A custom name for your connector.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A custom name for your connector.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param overrideAssessment Override the default assessment model. Note: Overriding assessment is intended for automated testing and should not be utilized in production environments.
         * 
         * @return builder
         * 
         */
        public Builder overrideAssessment(@Nullable Output<Boolean> overrideAssessment) {
            $.overrideAssessment = overrideAssessment;
            return this;
        }

        /**
         * @param overrideAssessment Override the default assessment model. Note: Overriding assessment is intended for automated testing and should not be utilized in production environments.
         * 
         * @return builder
         * 
         */
        public Builder overrideAssessment(Boolean overrideAssessment) {
            return overrideAssessment(Output.of(overrideAssessment));
        }

        /**
         * @param projectId The Google Cloud project ID where the reCAPTCHA Enterprise is managed.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The Google Cloud project ID where the reCAPTCHA Enterprise is managed.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param siteKey The site key is used to invoke reCAPTCHA Enterprise service on your site or mobile application.
         * 
         * @return builder
         * 
         */
        public Builder siteKey(Output<String> siteKey) {
            $.siteKey = siteKey;
            return this;
        }

        /**
         * @param siteKey The site key is used to invoke reCAPTCHA Enterprise service on your site or mobile application.
         * 
         * @return builder
         * 
         */
        public Builder siteKey(String siteKey) {
            return siteKey(Output.of(siteKey));
        }

        public ProjectConnectorsRecaptchaEnterpriseArgs build() {
            if ($.apiKey == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsRecaptchaEnterpriseArgs", "apiKey");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsRecaptchaEnterpriseArgs", "name");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsRecaptchaEnterpriseArgs", "projectId");
            }
            if ($.siteKey == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsRecaptchaEnterpriseArgs", "siteKey");
            }
            return $;
        }
    }

}
