// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.descope.pulumi.descope.outputs.ProjectAuthorizationPermission;
import com.descope.pulumi.descope.outputs.ProjectAuthorizationRole;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ProjectAuthorization {
    /**
     * @return A list of `Permission` objects.
     * 
     */
    private @Nullable List<ProjectAuthorizationPermission> permissions;
    /**
     * @return A list of `Role` objects.
     * 
     */
    private @Nullable List<ProjectAuthorizationRole> roles;

    private ProjectAuthorization() {}
    /**
     * @return A list of `Permission` objects.
     * 
     */
    public List<ProjectAuthorizationPermission> permissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    /**
     * @return A list of `Role` objects.
     * 
     */
    public List<ProjectAuthorizationRole> roles() {
        return this.roles == null ? List.of() : this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectAuthorization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ProjectAuthorizationPermission> permissions;
        private @Nullable List<ProjectAuthorizationRole> roles;
        public Builder() {}
        public Builder(ProjectAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.roles = defaults.roles;
        }

        @CustomType.Setter
        public Builder permissions(@Nullable List<ProjectAuthorizationPermission> permissions) {

            this.permissions = permissions;
            return this;
        }
        public Builder permissions(ProjectAuthorizationPermission... permissions) {
            return permissions(List.of(permissions));
        }
        @CustomType.Setter
        public Builder roles(@Nullable List<ProjectAuthorizationRole> roles) {

            this.roles = roles;
            return this;
        }
        public Builder roles(ProjectAuthorizationRole... roles) {
            return roles(List.of(roles));
        }
        public ProjectAuthorization build() {
            final var _resultValue = new ProjectAuthorization();
            _resultValue.permissions = permissions;
            _resultValue.roles = roles;
            return _resultValue;
        }
    }
}
