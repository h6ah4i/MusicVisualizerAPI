package com.h6ah4i.android.musicvisualizerapi.annotation;

import com.h6ah4i.android.musicvisualizerapi.MusicVisualizerAPI;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * Play states
 */
@Retention(RetentionPolicy.SOURCE)
@androidx.annotation.IntDef({
        MusicVisualizerAPI.PLAY_STATE_STOPPED,
        MusicVisualizerAPI.PLAY_STATE_PLAYING,
        MusicVisualizerAPI.PLAY_STATE_PAUSED})
public @interface PlayState {
}
