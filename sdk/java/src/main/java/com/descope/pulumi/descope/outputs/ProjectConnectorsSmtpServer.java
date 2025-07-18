// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.descope.pulumi.descope.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectConnectorsSmtpServer {
    /**
     * @return The hostname or IP address of the SMTP server.
     * 
     */
    private String host;
    /**
     * @return The port number to connect to on the SMTP server.
     * 
     */
    private @Nullable Integer port;

    private ProjectConnectorsSmtpServer() {}
    /**
     * @return The hostname or IP address of the SMTP server.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The port number to connect to on the SMTP server.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectConnectorsSmtpServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        private @Nullable Integer port;
        public Builder() {}
        public Builder(ProjectConnectorsSmtpServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("ProjectConnectorsSmtpServer", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        public ProjectConnectorsSmtpServer build() {
            final var _resultValue = new ProjectConnectorsSmtpServer();
            _resultValue.host = host;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
