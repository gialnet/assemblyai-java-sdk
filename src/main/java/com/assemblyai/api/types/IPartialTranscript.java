/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.assemblyai.api.types;

import java.util.List;

public interface IPartialTranscript {
    String getMessageType();

    int getAudioStart();

    int getAudioEnd();

    double getConfidence();

    String getText();

    List<Word> getWords();

    String getCreated();
}