// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ProjectAuthenticationOauthSystemAppleProviderTokenManagement {
    private ProjectAuthenticationOauthSystemAppleProviderTokenManagement() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectAuthenticationOauthSystemAppleProviderTokenManagement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(ProjectAuthenticationOauthSystemAppleProviderTokenManagement defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ProjectAuthenticationOauthSystemAppleProviderTokenManagement build() {
            final var _resultValue = new ProjectAuthenticationOauthSystemAppleProviderTokenManagement();
            return _resultValue;
        }
    }
}
