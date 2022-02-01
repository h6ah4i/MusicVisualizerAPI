package com.h6ah4i.android.musicvisualizerapi.annotation;

import com.h6ah4i.android.musicvisualizerapi.MusicVisualizerAPI;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * Commands
 */
@Retention(RetentionPolicy.SOURCE)
@androidx.annotation.StringDef({
        MusicVisualizerAPI.COMMAND_PLAY,
        MusicVisualizerAPI.COMMAND_PAUSE,
        MusicVisualizerAPI.COMMAND_RESUME,
        MusicVisualizerAPI.COMMAND_PREVIOUS,
        MusicVisualizerAPI.COMMAND_NEXT,
        MusicVisualizerAPI.COMMAND_TOGGLE_PAUSE,
        MusicVisualizerAPI.COMMAND_SEEK,
        MusicVisualizerAPI.COMMAND_SET_SHUFFLE,
        MusicVisualizerAPI.COMMAND_SET_REPEAT
})
public @interface Command {
}
