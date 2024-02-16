/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.assemblyai.api.resources.realtime.types;

import com.assemblyai.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TerminateSession.Builder.class)
public final class TerminateSession {
    private final boolean terminateSession;

    private final Map<String, Object> additionalProperties;

    private TerminateSession(boolean terminateSession, Map<String, Object> additionalProperties) {
        this.terminateSession = terminateSession;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Set to true to end your real-time session forever
     */
    @JsonProperty("terminate_session")
    public boolean getTerminateSession() {
        return terminateSession;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TerminateSession && equalTo((TerminateSession) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TerminateSession other) {
        return terminateSession == other.terminateSession;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.terminateSession);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TerminateSessionStage builder() {
        return new Builder();
    }

    public interface TerminateSessionStage {
        _FinalStage terminateSession(boolean terminateSession);

        Builder from(TerminateSession other);
    }

    public interface _FinalStage {
        TerminateSession build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TerminateSessionStage, _FinalStage {
        private boolean terminateSession;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(TerminateSession other) {
            terminateSession(other.getTerminateSession());
            return this;
        }

        /**
         * <p>Set to true to end your real-time session forever</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("terminate_session")
        public _FinalStage terminateSession(boolean terminateSession) {
            this.terminateSession = terminateSession;
            return this;
        }

        @Override
        public TerminateSession build() {
            return new TerminateSession(terminateSession, additionalProperties);
        }
    }
}
