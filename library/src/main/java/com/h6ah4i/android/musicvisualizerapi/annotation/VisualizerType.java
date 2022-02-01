package com.h6ah4i.android.musicvisualizerapi.annotation;

import com.h6ah4i.android.musicvisualizerapi.MusicVisualizerAPI;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * Visualizer Types
 */
@Retention(RetentionPolicy.SOURCE)
@androidx.annotation.StringDef({
        MusicVisualizerAPI.VISUALIZER_MAIN_APP,
        MusicVisualizerAPI.VISUALIZER_LIVE_WALLPAPER,
        MusicVisualizerAPI.VISUALIZER_SCREENSAVER,
})
public @interface VisualizerType {
}
