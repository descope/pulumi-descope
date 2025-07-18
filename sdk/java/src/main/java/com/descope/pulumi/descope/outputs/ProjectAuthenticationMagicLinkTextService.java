// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.descope.pulumi.descope.outputs.ProjectAuthenticationMagicLinkTextServiceTemplate;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ProjectAuthenticationMagicLinkTextService {
    /**
     * @return The name of the SMS/text connector to use for sending text messages.
     * 
     */
    private String connector;
    /**
     * @return A list of text message templates for different authentication flows.
     * 
     */
    private @Nullable List<ProjectAuthenticationMagicLinkTextServiceTemplate> templates;

    private ProjectAuthenticationMagicLinkTextService() {}
    /**
     * @return The name of the SMS/text connector to use for sending text messages.
     * 
     */
    public String connector() {
        return this.connector;
    }
    /**
     * @return A list of text message templates for different authentication flows.
     * 
     */
    public List<ProjectAuthenticationMagicLinkTextServiceTemplate> templates() {
        return this.templates == null ? List.of() : this.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectAuthenticationMagicLinkTextService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connector;
        private @Nullable List<ProjectAuthenticationMagicLinkTextServiceTemplate> templates;
        public Builder() {}
        public Builder(ProjectAuthenticationMagicLinkTextService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connector = defaults.connector;
    	      this.templates = defaults.templates;
        }

        @CustomType.Setter
        public Builder connector(String connector) {
            if (connector == null) {
              throw new MissingRequiredPropertyException("ProjectAuthenticationMagicLinkTextService", "connector");
            }
            this.connector = connector;
            return this;
        }
        @CustomType.Setter
        public Builder templates(@Nullable List<ProjectAuthenticationMagicLinkTextServiceTemplate> templates) {

            this.templates = templates;
            return this;
        }
        public Builder templates(ProjectAuthenticationMagicLinkTextServiceTemplate... templates) {
            return templates(List.of(templates));
        }
        public ProjectAuthenticationMagicLinkTextService build() {
            final var _resultValue = new ProjectAuthenticationMagicLinkTextService();
            _resultValue.connector = connector;
            _resultValue.templates = templates;
            return _resultValue;
        }
    }
}
