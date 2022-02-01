package com.h6ah4i.android.musicvisualizerapi.annotation;

import com.h6ah4i.android.musicvisualizerapi.MusicVisualizerAPI;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * Renderers
 */
@Retention(RetentionPolicy.SOURCE)
@androidx.annotation.StringDef({
        MusicVisualizerAPI.RENDERER_RANDOMIZED,
        MusicVisualizerAPI.RENDERER_WAVEFORM,
        MusicVisualizerAPI.RENDERER_SHINY_PARTICLES,
        MusicVisualizerAPI.RENDERER_NOISE_FLOW,
        MusicVisualizerAPI.RENDERER_COLORFUL_ORB,
        MusicVisualizerAPI.RENDERER_SIMPLE_BARS,
        MusicVisualizerAPI.RENDERER_HEART_BEATS,
        MusicVisualizerAPI.RENDERER_LASER,
        MusicVisualizerAPI.RENDERER_DIGITAL_EQUALIZER,
        MusicVisualizerAPI.RENDERER_HEX_TILES,
        MusicVisualizerAPI.RENDERER_ENERGY_SPHERE,
        MusicVisualizerAPI.RENDERER_ALBUM_ART,
        MusicVisualizerAPI.RENDERER_SELECT_SEQUENTIAL,
        MusicVisualizerAPI.RENDERER_SELECT_RANDOM
})
public @interface Renderer {
}
