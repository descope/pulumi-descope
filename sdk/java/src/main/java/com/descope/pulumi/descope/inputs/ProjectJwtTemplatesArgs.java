// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.descope.pulumi.descope.inputs.ProjectJwtTemplatesAccessKeyTemplateArgs;
import com.descope.pulumi.descope.inputs.ProjectJwtTemplatesUserTemplateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectJwtTemplatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectJwtTemplatesArgs Empty = new ProjectJwtTemplatesArgs();

    /**
     * A list of `Access Key` type JWT Templates.
     * 
     */
    @Import(name="accessKeyTemplates")
    private @Nullable Output<List<ProjectJwtTemplatesAccessKeyTemplateArgs>> accessKeyTemplates;

    /**
     * @return A list of `Access Key` type JWT Templates.
     * 
     */
    public Optional<Output<List<ProjectJwtTemplatesAccessKeyTemplateArgs>>> accessKeyTemplates() {
        return Optional.ofNullable(this.accessKeyTemplates);
    }

    /**
     * A list of `User` type JWT Templates.
     * 
     */
    @Import(name="userTemplates")
    private @Nullable Output<List<ProjectJwtTemplatesUserTemplateArgs>> userTemplates;

    /**
     * @return A list of `User` type JWT Templates.
     * 
     */
    public Optional<Output<List<ProjectJwtTemplatesUserTemplateArgs>>> userTemplates() {
        return Optional.ofNullable(this.userTemplates);
    }

    private ProjectJwtTemplatesArgs() {}

    private ProjectJwtTemplatesArgs(ProjectJwtTemplatesArgs $) {
        this.accessKeyTemplates = $.accessKeyTemplates;
        this.userTemplates = $.userTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectJwtTemplatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectJwtTemplatesArgs $;

        public Builder() {
            $ = new ProjectJwtTemplatesArgs();
        }

        public Builder(ProjectJwtTemplatesArgs defaults) {
            $ = new ProjectJwtTemplatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKeyTemplates A list of `Access Key` type JWT Templates.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyTemplates(@Nullable Output<List<ProjectJwtTemplatesAccessKeyTemplateArgs>> accessKeyTemplates) {
            $.accessKeyTemplates = accessKeyTemplates;
            return this;
        }

        /**
         * @param accessKeyTemplates A list of `Access Key` type JWT Templates.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyTemplates(List<ProjectJwtTemplatesAccessKeyTemplateArgs> accessKeyTemplates) {
            return accessKeyTemplates(Output.of(accessKeyTemplates));
        }

        /**
         * @param accessKeyTemplates A list of `Access Key` type JWT Templates.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyTemplates(ProjectJwtTemplatesAccessKeyTemplateArgs... accessKeyTemplates) {
            return accessKeyTemplates(List.of(accessKeyTemplates));
        }

        /**
         * @param userTemplates A list of `User` type JWT Templates.
         * 
         * @return builder
         * 
         */
        public Builder userTemplates(@Nullable Output<List<ProjectJwtTemplatesUserTemplateArgs>> userTemplates) {
            $.userTemplates = userTemplates;
            return this;
        }

        /**
         * @param userTemplates A list of `User` type JWT Templates.
         * 
         * @return builder
         * 
         */
        public Builder userTemplates(List<ProjectJwtTemplatesUserTemplateArgs> userTemplates) {
            return userTemplates(Output.of(userTemplates));
        }

        /**
         * @param userTemplates A list of `User` type JWT Templates.
         * 
         * @return builder
         * 
         */
        public Builder userTemplates(ProjectJwtTemplatesUserTemplateArgs... userTemplates) {
            return userTemplates(List.of(userTemplates));
        }

        public ProjectJwtTemplatesArgs build() {
            return $;
        }
    }

}
