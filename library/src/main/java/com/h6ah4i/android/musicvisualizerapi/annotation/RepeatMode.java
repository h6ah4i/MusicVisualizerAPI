package com.h6ah4i.android.musicvisualizerapi.annotation;

import com.h6ah4i.android.musicvisualizerapi.MusicVisualizerAPI;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * Repeat modes
 */
@Retention(RetentionPolicy.SOURCE)
@androidx.annotation.IntDef({
        MusicVisualizerAPI.REPEAT_ROTATE,
        MusicVisualizerAPI.REPEAT_DISABLED,
        MusicVisualizerAPI.REPEAT_ALL,
        MusicVisualizerAPI.REPEAT_ONE})
public @interface RepeatMode {
}
