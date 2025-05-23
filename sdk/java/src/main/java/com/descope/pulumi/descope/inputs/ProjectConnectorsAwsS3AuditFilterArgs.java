// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ProjectConnectorsAwsS3AuditFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectConnectorsAwsS3AuditFilterArgs Empty = new ProjectConnectorsAwsS3AuditFilterArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="operator", required=true)
    private Output<String> operator;

    public Output<String> operator() {
        return this.operator;
    }

    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private ProjectConnectorsAwsS3AuditFilterArgs() {}

    private ProjectConnectorsAwsS3AuditFilterArgs(ProjectConnectorsAwsS3AuditFilterArgs $) {
        this.key = $.key;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectConnectorsAwsS3AuditFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectConnectorsAwsS3AuditFilterArgs $;

        public Builder() {
            $ = new ProjectConnectorsAwsS3AuditFilterArgs();
        }

        public Builder(ProjectConnectorsAwsS3AuditFilterArgs defaults) {
            $ = new ProjectConnectorsAwsS3AuditFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ProjectConnectorsAwsS3AuditFilterArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsAwsS3AuditFilterArgs", "key");
            }
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsAwsS3AuditFilterArgs", "operator");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("ProjectConnectorsAwsS3AuditFilterArgs", "values");
            }
            return $;
        }
    }

}
