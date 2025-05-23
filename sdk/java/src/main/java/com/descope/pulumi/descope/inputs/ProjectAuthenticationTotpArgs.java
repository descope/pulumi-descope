// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectAuthenticationTotpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectAuthenticationTotpArgs Empty = new ProjectAuthenticationTotpArgs();

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

    private ProjectAuthenticationTotpArgs() {}

    private ProjectAuthenticationTotpArgs(ProjectAuthenticationTotpArgs $) {
        this.disabled = $.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectAuthenticationTotpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectAuthenticationTotpArgs $;

        public Builder() {
            $ = new ProjectAuthenticationTotpArgs();
        }

        public Builder(ProjectAuthenticationTotpArgs defaults) {
            $ = new ProjectAuthenticationTotpArgs(Objects.requireNonNull(defaults));
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

        public ProjectAuthenticationTotpArgs build() {
            return $;
        }
    }

}
