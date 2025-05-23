// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.descope.pulumi.descope.inputs.ProjectAuthenticationOtpEmailServiceArgs;
import com.descope.pulumi.descope.inputs.ProjectAuthenticationOtpTextServiceArgs;
import com.descope.pulumi.descope.inputs.ProjectAuthenticationOtpVoiceServiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectAuthenticationOtpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectAuthenticationOtpArgs Empty = new ProjectAuthenticationOtpArgs();

    /**
     * Setting this to `true` will disallow using this authentication method directly via API and SDK calls. Note that this does not affect authentication flows that are configured to use this authentication method.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Setting this to `true` will disallow using this authentication method directly via API and SDK calls. Note that this does not affect authentication flows that are configured to use this authentication method.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The domain to embed in OTP messages.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The domain to embed in OTP messages.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * Settings related to sending emails with OTP codes.
     * 
     */
    @Import(name="emailService")
    private @Nullable Output<ProjectAuthenticationOtpEmailServiceArgs> emailService;

    /**
     * @return Settings related to sending emails with OTP codes.
     * 
     */
    public Optional<Output<ProjectAuthenticationOtpEmailServiceArgs>> emailService() {
        return Optional.ofNullable(this.emailService);
    }

    /**
     * The amount of time that an OTP code will be valid for.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<String> expirationTime;

    /**
     * @return The amount of time that an OTP code will be valid for.
     * 
     */
    public Optional<Output<String>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    /**
     * Settings related to sending SMS messages with OTP codes.
     * 
     */
    @Import(name="textService")
    private @Nullable Output<ProjectAuthenticationOtpTextServiceArgs> textService;

    /**
     * @return Settings related to sending SMS messages with OTP codes.
     * 
     */
    public Optional<Output<ProjectAuthenticationOtpTextServiceArgs>> textService() {
        return Optional.ofNullable(this.textService);
    }

    /**
     * Settings related to voice calls with OTP codes.
     * 
     */
    @Import(name="voiceService")
    private @Nullable Output<ProjectAuthenticationOtpVoiceServiceArgs> voiceService;

    /**
     * @return Settings related to voice calls with OTP codes.
     * 
     */
    public Optional<Output<ProjectAuthenticationOtpVoiceServiceArgs>> voiceService() {
        return Optional.ofNullable(this.voiceService);
    }

    private ProjectAuthenticationOtpArgs() {}

    private ProjectAuthenticationOtpArgs(ProjectAuthenticationOtpArgs $) {
        this.disabled = $.disabled;
        this.domain = $.domain;
        this.emailService = $.emailService;
        this.expirationTime = $.expirationTime;
        this.textService = $.textService;
        this.voiceService = $.voiceService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectAuthenticationOtpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectAuthenticationOtpArgs $;

        public Builder() {
            $ = new ProjectAuthenticationOtpArgs();
        }

        public Builder(ProjectAuthenticationOtpArgs defaults) {
            $ = new ProjectAuthenticationOtpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled Setting this to `true` will disallow using this authentication method directly via API and SDK calls. Note that this does not affect authentication flows that are configured to use this authentication method.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Setting this to `true` will disallow using this authentication method directly via API and SDK calls. Note that this does not affect authentication flows that are configured to use this authentication method.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param domain The domain to embed in OTP messages.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain to embed in OTP messages.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param emailService Settings related to sending emails with OTP codes.
         * 
         * @return builder
         * 
         */
        public Builder emailService(@Nullable Output<ProjectAuthenticationOtpEmailServiceArgs> emailService) {
            $.emailService = emailService;
            return this;
        }

        /**
         * @param emailService Settings related to sending emails with OTP codes.
         * 
         * @return builder
         * 
         */
        public Builder emailService(ProjectAuthenticationOtpEmailServiceArgs emailService) {
            return emailService(Output.of(emailService));
        }

        /**
         * @param expirationTime The amount of time that an OTP code will be valid for.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime The amount of time that an OTP code will be valid for.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        /**
         * @param textService Settings related to sending SMS messages with OTP codes.
         * 
         * @return builder
         * 
         */
        public Builder textService(@Nullable Output<ProjectAuthenticationOtpTextServiceArgs> textService) {
            $.textService = textService;
            return this;
        }

        /**
         * @param textService Settings related to sending SMS messages with OTP codes.
         * 
         * @return builder
         * 
         */
        public Builder textService(ProjectAuthenticationOtpTextServiceArgs textService) {
            return textService(Output.of(textService));
        }

        /**
         * @param voiceService Settings related to voice calls with OTP codes.
         * 
         * @return builder
         * 
         */
        public Builder voiceService(@Nullable Output<ProjectAuthenticationOtpVoiceServiceArgs> voiceService) {
            $.voiceService = voiceService;
            return this;
        }

        /**
         * @param voiceService Settings related to voice calls with OTP codes.
         * 
         * @return builder
         * 
         */
        public Builder voiceService(ProjectAuthenticationOtpVoiceServiceArgs voiceService) {
            return voiceService(Output.of(voiceService));
        }

        public ProjectAuthenticationOtpArgs build() {
            return $;
        }
    }

}
