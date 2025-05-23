// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectAuthenticationOauthSystemSlackProviderTokenManagement {
    private @Nullable String callbackDomain;
    private @Nullable String redirectUrl;

    private ProjectAuthenticationOauthSystemSlackProviderTokenManagement() {}
    public Optional<String> callbackDomain() {
        return Optional.ofNullable(this.callbackDomain);
    }
    public Optional<String> redirectUrl() {
        return Optional.ofNullable(this.redirectUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectAuthenticationOauthSystemSlackProviderTokenManagement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String callbackDomain;
        private @Nullable String redirectUrl;
        public Builder() {}
        public Builder(ProjectAuthenticationOauthSystemSlackProviderTokenManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackDomain = defaults.callbackDomain;
    	      this.redirectUrl = defaults.redirectUrl;
        }

        @CustomType.Setter
        public Builder callbackDomain(@Nullable String callbackDomain) {

            this.callbackDomain = callbackDomain;
            return this;
        }
        @CustomType.Setter
        public Builder redirectUrl(@Nullable String redirectUrl) {

            this.redirectUrl = redirectUrl;
            return this;
        }
        public ProjectAuthenticationOauthSystemSlackProviderTokenManagement build() {
            final var _resultValue = new ProjectAuthenticationOauthSystemSlackProviderTokenManagement();
            _resultValue.callbackDomain = callbackDomain;
            _resultValue.redirectUrl = redirectUrl;
            return _resultValue;
        }
    }
}
