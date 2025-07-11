// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.descope.pulumi.descope.inputs.ProjectAuthenticationMagicLinkEmailServiceArgs;
import com.descope.pulumi.descope.inputs.ProjectAuthenticationMagicLinkTextServiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectAuthenticationMagicLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectAuthenticationMagicLinkArgs Empty = new ProjectAuthenticationMagicLinkArgs();

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
     * Settings related to sending emails as part of the magic link authentication.
     * 
     */
    @Import(name="emailService")
    private @Nullable Output<ProjectAuthenticationMagicLinkEmailServiceArgs> emailService;

    /**
     * @return Settings related to sending emails as part of the magic link authentication.
     * 
     */
    public Optional<Output<ProjectAuthenticationMagicLinkEmailServiceArgs>> emailService() {
        return Optional.ofNullable(this.emailService);
    }

    /**
     * How long the magic link remains valid before it expires.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<String> expirationTime;

    /**
     * @return How long the magic link remains valid before it expires.
     * 
     */
    public Optional<Output<String>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    /**
     * The URL to redirect users to after they log in using the magic link.
     * 
     */
    @Import(name="redirectUrl")
    private @Nullable Output<String> redirectUrl;

    /**
     * @return The URL to redirect users to after they log in using the magic link.
     * 
     */
    public Optional<Output<String>> redirectUrl() {
        return Optional.ofNullable(this.redirectUrl);
    }

    /**
     * Settings related to sending SMS messages as part of the magic link authentication.
     * 
     */
    @Import(name="textService")
    private @Nullable Output<ProjectAuthenticationMagicLinkTextServiceArgs> textService;

    /**
     * @return Settings related to sending SMS messages as part of the magic link authentication.
     * 
     */
    public Optional<Output<ProjectAuthenticationMagicLinkTextServiceArgs>> textService() {
        return Optional.ofNullable(this.textService);
    }

    private ProjectAuthenticationMagicLinkArgs() {}

    private ProjectAuthenticationMagicLinkArgs(ProjectAuthenticationMagicLinkArgs $) {
        this.disabled = $.disabled;
        this.emailService = $.emailService;
        this.expirationTime = $.expirationTime;
        this.redirectUrl = $.redirectUrl;
        this.textService = $.textService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectAuthenticationMagicLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectAuthenticationMagicLinkArgs $;

        public Builder() {
            $ = new ProjectAuthenticationMagicLinkArgs();
        }

        public Builder(ProjectAuthenticationMagicLinkArgs defaults) {
            $ = new ProjectAuthenticationMagicLinkArgs(Objects.requireNonNull(defaults));
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
         * @param emailService Settings related to sending emails as part of the magic link authentication.
         * 
         * @return builder
         * 
         */
        public Builder emailService(@Nullable Output<ProjectAuthenticationMagicLinkEmailServiceArgs> emailService) {
            $.emailService = emailService;
            return this;
        }

        /**
         * @param emailService Settings related to sending emails as part of the magic link authentication.
         * 
         * @return builder
         * 
         */
        public Builder emailService(ProjectAuthenticationMagicLinkEmailServiceArgs emailService) {
            return emailService(Output.of(emailService));
        }

        /**
         * @param expirationTime How long the magic link remains valid before it expires.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime How long the magic link remains valid before it expires.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        /**
         * @param redirectUrl The URL to redirect users to after they log in using the magic link.
         * 
         * @return builder
         * 
         */
        public Builder redirectUrl(@Nullable Output<String> redirectUrl) {
            $.redirectUrl = redirectUrl;
            return this;
        }

        /**
         * @param redirectUrl The URL to redirect users to after they log in using the magic link.
         * 
         * @return builder
         * 
         */
        public Builder redirectUrl(String redirectUrl) {
            return redirectUrl(Output.of(redirectUrl));
        }

        /**
         * @param textService Settings related to sending SMS messages as part of the magic link authentication.
         * 
         * @return builder
         * 
         */
        public Builder textService(@Nullable Output<ProjectAuthenticationMagicLinkTextServiceArgs> textService) {
            $.textService = textService;
            return this;
        }

        /**
         * @param textService Settings related to sending SMS messages as part of the magic link authentication.
         * 
         * @return builder
         * 
         */
        public Builder textService(ProjectAuthenticationMagicLinkTextServiceArgs textService) {
            return textService(Output.of(textService));
        }

        public ProjectAuthenticationMagicLinkArgs build() {
            return $;
        }
    }

}
