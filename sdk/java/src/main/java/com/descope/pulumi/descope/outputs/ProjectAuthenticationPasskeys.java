// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectAuthenticationPasskeys {
    /**
     * @return Setting this to `true` will disallow using this authentication method directly via API and SDK calls. Note that this does not affect authentication flows that are configured to use this authentication method.
     * 
     */
    private @Nullable Boolean disabled;
    /**
     * @return Passkeys will be usable in the following domain and all its subdomains.
     * 
     */
    private @Nullable String topLevelDomain;

    private ProjectAuthenticationPasskeys() {}
    /**
     * @return Setting this to `true` will disallow using this authentication method directly via API and SDK calls. Note that this does not affect authentication flows that are configured to use this authentication method.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return Passkeys will be usable in the following domain and all its subdomains.
     * 
     */
    public Optional<String> topLevelDomain() {
        return Optional.ofNullable(this.topLevelDomain);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectAuthenticationPasskeys defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disabled;
        private @Nullable String topLevelDomain;
        public Builder() {}
        public Builder(ProjectAuthenticationPasskeys defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.topLevelDomain = defaults.topLevelDomain;
        }

        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {

            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder topLevelDomain(@Nullable String topLevelDomain) {

            this.topLevelDomain = topLevelDomain;
            return this;
        }
        public ProjectAuthenticationPasskeys build() {
            final var _resultValue = new ProjectAuthenticationPasskeys();
            _resultValue.disabled = disabled;
            _resultValue.topLevelDomain = topLevelDomain;
            return _resultValue;
        }
    }
}
