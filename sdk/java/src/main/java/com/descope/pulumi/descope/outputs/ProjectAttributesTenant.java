// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.descope.pulumi.descope.outputs.ProjectAttributesTenantAuthorization;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectAttributesTenant {
    /**
     * @return Determines the required permissions for this tenant.
     * 
     */
    private @Nullable ProjectAttributesTenantAuthorization authorization;
    /**
     * @return The name of the attribute.
     * 
     */
    private String name;
    /**
     * @return When the attribute type is &#34;multiselect&#34;. A list of options to choose from.
     * 
     */
    private @Nullable List<String> selectOptions;
    /**
     * @return The type of the attribute. Choose one of &#34;string&#34;, &#34;number&#34;, &#34;boolean&#34;, &#34;singleselect&#34;, &#34;multiselect&#34;, &#34;date&#34;.
     * 
     */
    private String type;

    private ProjectAttributesTenant() {}
    /**
     * @return Determines the required permissions for this tenant.
     * 
     */
    public Optional<ProjectAttributesTenantAuthorization> authorization() {
        return Optional.ofNullable(this.authorization);
    }
    /**
     * @return The name of the attribute.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return When the attribute type is &#34;multiselect&#34;. A list of options to choose from.
     * 
     */
    public List<String> selectOptions() {
        return this.selectOptions == null ? List.of() : this.selectOptions;
    }
    /**
     * @return The type of the attribute. Choose one of &#34;string&#34;, &#34;number&#34;, &#34;boolean&#34;, &#34;singleselect&#34;, &#34;multiselect&#34;, &#34;date&#34;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectAttributesTenant defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ProjectAttributesTenantAuthorization authorization;
        private String name;
        private @Nullable List<String> selectOptions;
        private String type;
        public Builder() {}
        public Builder(ProjectAttributesTenant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorization = defaults.authorization;
    	      this.name = defaults.name;
    	      this.selectOptions = defaults.selectOptions;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder authorization(@Nullable ProjectAttributesTenantAuthorization authorization) {

            this.authorization = authorization;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ProjectAttributesTenant", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder selectOptions(@Nullable List<String> selectOptions) {

            this.selectOptions = selectOptions;
            return this;
        }
        public Builder selectOptions(String... selectOptions) {
            return selectOptions(List.of(selectOptions));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ProjectAttributesTenant", "type");
            }
            this.type = type;
            return this;
        }
        public ProjectAttributesTenant build() {
            final var _resultValue = new ProjectAttributesTenant();
            _resultValue.authorization = authorization;
            _resultValue.name = name;
            _resultValue.selectOptions = selectOptions;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
