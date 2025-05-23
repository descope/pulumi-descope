// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectConnectorsSendgridSenderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectConnectorsSendgridSenderArgs Empty = new ProjectConnectorsSendgridSenderArgs();

    @Import(name="email", required=true)
    private Output<String> email;

    public Output<String> email() {
        return this.email;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ProjectConnectorsSendgridSenderArgs() {}

    private ProjectConnectorsSendgridSenderArgs(ProjectConnectorsSendgridSenderArgs $) {
        this.email = $.email;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectConnectorsSendgridSenderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectConnectorsSendgridSenderArgs $;

        public Builder() {
            $ = new ProjectConnectorsSendgridSenderArgs();
        }

        public Builder(ProjectConnectorsSendgridSenderArgs defaults) {
            $ = new ProjectConnectorsSendgridSenderArgs(Objects.requireNonNull(defaults));
        }

        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        public Builder email(String email) {
            return email(Output.of(email));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ProjectConnectorsSendgridSenderArgs build() {
            if ($.email == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsSendgridSenderArgs", "email");
            }
            return $;
        }
    }

}
