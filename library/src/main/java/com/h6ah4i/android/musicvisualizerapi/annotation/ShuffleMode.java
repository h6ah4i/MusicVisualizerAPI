package com.h6ah4i.android.musicvisualizerapi.annotation;

import com.h6ah4i.android.musicvisualizerapi.MusicVisualizerAPI;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * Shuffle modes
 */
@Retention(RetentionPolicy.SOURCE)
@androidx.annotation.IntDef({
        MusicVisualizerAPI.SHUFFLE_ROTATE,
        MusicVisualizerAPI.SHUFFLE_DISABLED,
        MusicVisualizerAPI.SHUFFLE_ENABLED})
public @interface ShuffleMode {
}
