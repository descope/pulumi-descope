// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.descope.pulumi.descope.inputs.ProjectConnectorsTwilioVerifyAuthenticationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectConnectorsTwilioVerifyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectConnectorsTwilioVerifyArgs Empty = new ProjectConnectorsTwilioVerifyArgs();

    @Import(name="accountSid", required=true)
    private Output<String> accountSid;

    public Output<String> accountSid() {
        return this.accountSid;
    }

    @Import(name="authentication", required=true)
    private Output<ProjectConnectorsTwilioVerifyAuthenticationArgs> authentication;

    public Output<ProjectConnectorsTwilioVerifyAuthenticationArgs> authentication() {
        return this.authentication;
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

    @Import(name="sender")
    private @Nullable Output<String> sender;

    public Optional<Output<String>> sender() {
        return Optional.ofNullable(this.sender);
    }

    @Import(name="serviceSid", required=true)
    private Output<String> serviceSid;

    public Output<String> serviceSid() {
        return this.serviceSid;
    }

    private ProjectConnectorsTwilioVerifyArgs() {}

    private ProjectConnectorsTwilioVerifyArgs(ProjectConnectorsTwilioVerifyArgs $) {
        this.accountSid = $.accountSid;
        this.authentication = $.authentication;
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.sender = $.sender;
        this.serviceSid = $.serviceSid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectConnectorsTwilioVerifyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectConnectorsTwilioVerifyArgs $;

        public Builder() {
            $ = new ProjectConnectorsTwilioVerifyArgs();
        }

        public Builder(ProjectConnectorsTwilioVerifyArgs defaults) {
            $ = new ProjectConnectorsTwilioVerifyArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountSid(Output<String> accountSid) {
            $.accountSid = accountSid;
            return this;
        }

        public Builder accountSid(String accountSid) {
            return accountSid(Output.of(accountSid));
        }

        public Builder authentication(Output<ProjectConnectorsTwilioVerifyAuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        public Builder authentication(ProjectConnectorsTwilioVerifyAuthenticationArgs authentication) {
            return authentication(Output.of(authentication));
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

        public Builder sender(@Nullable Output<String> sender) {
            $.sender = sender;
            return this;
        }

        public Builder sender(String sender) {
            return sender(Output.of(sender));
        }

        public Builder serviceSid(Output<String> serviceSid) {
            $.serviceSid = serviceSid;
            return this;
        }

        public Builder serviceSid(String serviceSid) {
            return serviceSid(Output.of(serviceSid));
        }

        public ProjectConnectorsTwilioVerifyArgs build() {
            if ($.accountSid == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsTwilioVerifyArgs", "accountSid");
            }
            if ($.authentication == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsTwilioVerifyArgs", "authentication");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsTwilioVerifyArgs", "name");
            }
            if ($.serviceSid == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsTwilioVerifyArgs", "serviceSid");
            }
            return $;
        }
    }

}
