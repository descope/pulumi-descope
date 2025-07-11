// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectAuthenticationOtpTextServiceTemplate {
    /**
     * @return Whether this text template is currently active and in use.
     * 
     */
    private @Nullable Boolean active;
    /**
     * @return The content of the text message.
     * 
     */
    private String body;
    private @Nullable String id;
    /**
     * @return Unique name for this text template.
     * 
     */
    private String name;

    private ProjectAuthenticationOtpTextServiceTemplate() {}
    /**
     * @return Whether this text template is currently active and in use.
     * 
     */
    public Optional<Boolean> active() {
        return Optional.ofNullable(this.active);
    }
    /**
     * @return The content of the text message.
     * 
     */
    public String body() {
        return this.body;
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Unique name for this text template.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectAuthenticationOtpTextServiceTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean active;
        private String body;
        private @Nullable String id;
        private String name;
        public Builder() {}
        public Builder(ProjectAuthenticationOtpTextServiceTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.body = defaults.body;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder active(@Nullable Boolean active) {

            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder body(String body) {
            if (body == null) {
              throw new MissingRequiredPropertyException("ProjectAuthenticationOtpTextServiceTemplate", "body");
            }
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ProjectAuthenticationOtpTextServiceTemplate", "name");
            }
            this.name = name;
            return this;
        }
        public ProjectAuthenticationOtpTextServiceTemplate build() {
            final var _resultValue = new ProjectAuthenticationOtpTextServiceTemplate();
            _resultValue.active = active;
            _resultValue.body = body;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
