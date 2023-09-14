package com.assemblyai.api.types;

import com.assemblyai.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = SendAudio.Builder.class)
public final class SendAudio {
    private final String audioData;

    private SendAudio(String audioData) {
        this.audioData = audioData;
    }

    /**
     * @return Raw audio data, base64 encoded. This can be the raw data recorded directly from a microphone or read from an audio file.
     */
    @JsonProperty("audio_data")
    public String getAudioData() {
        return audioData;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SendAudio && equalTo((SendAudio) other);
    }

    private boolean equalTo(SendAudio other) {
        return audioData.equals(other.audioData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.audioData);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AudioDataStage builder() {
        return new Builder();
    }

    public interface AudioDataStage {
        _FinalStage audioData(String audioData);

        Builder from(SendAudio other);
    }

    public interface _FinalStage {
        SendAudio build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AudioDataStage, _FinalStage {
        private String audioData;

        private Builder() {}

        @Override
        public Builder from(SendAudio other) {
            audioData(other.getAudioData());
            return this;
        }

        /**
         * <p>Raw audio data, base64 encoded. This can be the raw data recorded directly from a microphone or read from an audio file.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("audio_data")
        public _FinalStage audioData(String audioData) {
            this.audioData = audioData;
            return this;
        }

        @Override
        public SendAudio build() {
            return new SendAudio(audioData);
        }
    }
}