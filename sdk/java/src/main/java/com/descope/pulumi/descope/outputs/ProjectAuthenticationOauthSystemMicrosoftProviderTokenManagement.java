// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ProjectAuthenticationOauthSystemMicrosoftProviderTokenManagement {
    private ProjectAuthenticationOauthSystemMicrosoftProviderTokenManagement() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectAuthenticationOauthSystemMicrosoftProviderTokenManagement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(ProjectAuthenticationOauthSystemMicrosoftProviderTokenManagement defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ProjectAuthenticationOauthSystemMicrosoftProviderTokenManagement build() {
            final var _resultValue = new ProjectAuthenticationOauthSystemMicrosoftProviderTokenManagement();
            return _resultValue;
        }
    }
}
