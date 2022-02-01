package com.h6ah4i.android.musicvisualizerapi;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;

import com.h6ah4i.android.musicvisualizerapi.annotation.Command;
import com.h6ah4i.android.musicvisualizerapi.annotation.Renderer;
import com.h6ah4i.android.musicvisualizerapi.annotation.VisualizerType;

@SuppressWarnings("unused")
public class MusicVisualizerAPI {
    /*
     * Application package name
     */
    public static final String APP_PACKAGE_NAME = BuildConfig.TARGET_APP_PACKAGE_NAME;
    public static final String API_CLIENT_LIBRARY_VERSION = BuildConfig.API_CLIENT_LIBRARY_VERSION;

    /*
     * Activity/Service names
     */
    public static final String CLASS_NAME_VISUALIZER_RENDERER_SELECT_ACTIVITY = "com.h6ah4i.android.music_visualizer.preference.activities.MusicVisualizerRendererSelectActivity";
    public static final String CLASS_NAME_BUILTIN_PLAYER_SERVICE = "com.h6ah4i.android.music_visualizer.builtin_player.BuiltInPlayerService";

    /*
     * Component names
     */
    public static final ComponentName COMPONENT_VISUALIZER_RENDERER_SELECT_ACTIVITY =
            new ComponentName(APP_PACKAGE_NAME, CLASS_NAME_VISUALIZER_RENDERER_SELECT_ACTIVITY);

    public static final ComponentName COMPONENT_BUILTIN_PLAYER_SERVICE =
            new ComponentName(APP_PACKAGE_NAME, CLASS_NAME_BUILTIN_PLAYER_SERVICE);

    /*
     * Extra
     */
    public static final String EXTRA_TARGET_APP_PACKAGE = "targetAppPackageName"; // string
    public static final String EXTRA_API_CLIENT_VERSION = "apiClientVersion"; // string
    public static final String EXTRA_API_CLIENT_APP_PACKAGE = "apiClientAppPackageName"; // string
    public static final String EXTRA_COMMAND = "command"; // string
    public static final String EXTRA_VISUALIZER_RENDERER = "renderer"; // string
    public static final String EXTRA_SHUFFLE_MODE = "shuffleMode"; // int
    public static final String EXTRA_REPEAT_MODE = "repeatMode"; // int

    /*
     * Action names
     */
    public static final String ACTION_BUILTIN_PLAYER_SERVICE_COMMAND = "com.h6ah4i.android.music_visualizer.builtin_player.intent.action.CONTROL_COMMAND";
    public static final String ACTION_VISUALIZER_SWITCH_RENDERER = "com.h6ah4i.android.music_visualizer.visualizer.intent.action.SWITCH_RENDERER";

    /*
     * Categories
     */
    public static final String CATEGORY_MAIN_APP = "com.h6ah4i.android.music_visualizer.main_app.intent.category.MAIN_APP";
    public static final String CATEGORY_LIVE_WALLPAPER = "com.h6ah4i.android.music_visualizer.live_wallpaper.intent.category.LIVE_WALLPAPER";
    public static final String CATEGORY_SCREENSAVER = "com.h6ah4i.android.music_visualizer.screensaver.intent.category.SCREENSAVER";
    public static final String CATEGORY_BUILTIN_PLAYER = "com.h6ah4i.android.music_visualizer.builtin_player.intent.category.BUILTIN_PLAYER";

    /*
     * Built-in player commands
     */
    public static final String COMMAND_PLAY = "play";
    public static final String COMMAND_PAUSE = "pause";
    public static final String COMMAND_RESUME = "resume";
    public static final String COMMAND_PREVIOUS = "previous";
    public static final String COMMAND_NEXT = "next";
    public static final String COMMAND_TOGGLE_PAUSE = "togglePause";
    public static final String COMMAND_SEEK = "seek";
    public static final String COMMAND_SET_SHUFFLE = "setShuffle";
    public static final String COMMAND_SET_REPEAT = "setRepeat";

    /*
     * Repeat modes
     */
    public static final int REPEAT_ROTATE = -1;
    public static final int REPEAT_DISABLED = 0;
    public static final int REPEAT_ALL = 1;
    public static final int REPEAT_ONE = 2;

    /*
     * Shuffle modes
     */
    public static final int SHUFFLE_ROTATE = -1;
    public static final int SHUFFLE_DISABLED = 0;
    public static final int SHUFFLE_ENABLED = 1;

    /*
     * Play states
     */
    public static final int PLAY_STATE_STOPPED = 0;
    public static final int PLAY_STATE_PLAYING = 1;
    public static final int PLAY_STATE_PAUSED = 2;

    /*
     * Renderers
     */
    public static final String RENDERER_RANDOMIZED = "Randomized";
    public static final String RENDERER_WAVEFORM = "WaveForm";
    public static final String RENDERER_SHINY_PARTICLES = "ShinyParticles";
    public static final String RENDERER_NOISE_FLOW = "NoiseFlow";
    public static final String RENDERER_COLORFUL_ORB = "ColorfulOrb";
    public static final String RENDERER_SIMPLE_BARS = "SimpleBars";
    public static final String RENDERER_HEART_BEATS = "HeartBeats";
    public static final String RENDERER_LASER = "Laser";
    public static final String RENDERER_DIGITAL_EQUALIZER = "DigitalEqualizer";
    public static final String RENDERER_HEX_TILES = "HexTiles";
    public static final String RENDERER_ENERGY_SPHERE = "EnergySphere";
    public static final String RENDERER_ALBUM_ART = "AlbumArt";

    /*
     * Renderers (special)
     */
    public static final String RENDERER_SELECT_SEQUENTIAL = "*sequential*";
    public static final String RENDERER_SELECT_RANDOM = "*random*";

    /*
     * Visualizer types
     */
    public static final String VISUALIZER_MAIN_APP = "MainApp";
    public static final String VISUALIZER_LIVE_WALLPAPER = "LiveWallpaper";
    public static final String VISUALIZER_SCREENSAVER = "Screensaver";

    /*
     * Utility methods
     */
    public static void putCommonApiExtras(@NonNull Context context, @NonNull Intent intent) {
        intent.putExtra(EXTRA_TARGET_APP_PACKAGE, APP_PACKAGE_NAME);
        intent.putExtra(EXTRA_API_CLIENT_VERSION, API_CLIENT_LIBRARY_VERSION);
        intent.putExtra(EXTRA_API_CLIENT_APP_PACKAGE, context.getPackageName());
    }

    public static Intent createPlayerCommandServiceIntent(@NonNull Context context, @NonNull @Command String command) {
        Intent intent = new Intent();
        intent.setComponent(COMPONENT_BUILTIN_PLAYER_SERVICE);
        intent.addCategory(CATEGORY_BUILTIN_PLAYER);
        intent.setAction(ACTION_BUILTIN_PLAYER_SERVICE_COMMAND);
        intent.putExtra(EXTRA_COMMAND, command);
        putCommonApiExtras(context, intent);

        return intent;
    }

    public static Intent createVisualizerSwitchRendererBroadcastIntent(@NonNull Context context, @VisualizerType String visualizer, @NonNull @Renderer String renderer) {
        String category;

        switch (visualizer) {
            case VISUALIZER_MAIN_APP: category = CATEGORY_MAIN_APP; break;
            case VISUALIZER_LIVE_WALLPAPER: category = CATEGORY_LIVE_WALLPAPER; break;
            case VISUALIZER_SCREENSAVER: category = CATEGORY_SCREENSAVER; break;
            default:
                throw new IllegalArgumentException("Not supported");
        }

        Intent intent = new Intent();
        intent.addCategory(category);
        intent.setAction(ACTION_VISUALIZER_SWITCH_RENDERER);
        intent.putExtra(EXTRA_VISUALIZER_RENDERER, renderer);
        putCommonApiExtras(context, intent);

        return intent;
    }

    public static Intent createVisualizerRendererSelectorActivityIntent(@NonNull Context context, @VisualizerType String visualizer) {
        String category;

        switch (visualizer) {
            case VISUALIZER_MAIN_APP: category = CATEGORY_MAIN_APP; break;
            case VISUALIZER_LIVE_WALLPAPER: category = CATEGORY_LIVE_WALLPAPER; break;
            case VISUALIZER_SCREENSAVER:
            default:
                throw new IllegalArgumentException("Not supported");
        }

        Intent intent = new Intent();
        intent.setComponent(COMPONENT_VISUALIZER_RENDERER_SELECT_ACTIVITY);
        intent.addCategory(category);
        intent.setAction(ACTION_VISUALIZER_SWITCH_RENDERER);
        putCommonApiExtras(context, intent);

        return intent;
    }
}
