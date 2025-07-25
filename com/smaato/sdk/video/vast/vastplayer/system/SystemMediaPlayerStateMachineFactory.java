package com.smaato.sdk.video.vast.vastplayer.system;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.video.vast.vastplayer.MediaPlayerState;
import com.smaato.sdk.video.vast.vastplayer.MediaPlayerTransition;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class SystemMediaPlayerStateMachineFactory {
    @NonNull
    private final MediaPlayerState initialState;

    public SystemMediaPlayerStateMachineFactory(@NonNull MediaPlayerState mediaPlayerState) {
        this.initialState = mediaPlayerState;
    }

    private void addErrorTransitions(@NonNull StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.ON_ERROR;
        MediaPlayerState mediaPlayerState = MediaPlayerState.ERROR;
        builder.addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.IDLE, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.INITIALIZED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.PREPARING, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.PREPARED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.STARTED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.RESUMED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.PAUSED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.STOPPED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.PLAYBACK_COMPLETED, mediaPlayerState));
    }

    private void addPausedTransitions(@NonNull StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.STOP;
        MediaPlayerState mediaPlayerState = MediaPlayerState.PAUSED;
        builder.addTransition(mediaPlayerTransition, Arrays.asList(mediaPlayerState, MediaPlayerState.STOPPED)).addTransition(MediaPlayerTransition.START, Arrays.asList(mediaPlayerState, MediaPlayerState.RESUMED));
    }

    private void addPlaybackCompletedTransitions(@NonNull StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        builder.addTransition(MediaPlayerTransition.STOP, Arrays.asList(MediaPlayerState.PLAYBACK_COMPLETED, MediaPlayerState.STOPPED));
    }

    private void addReleaseTransitions(@NonNull StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.RELEASE;
        MediaPlayerState mediaPlayerState = MediaPlayerState.END;
        builder.addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.IDLE, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.ERROR, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.INITIALIZED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.PREPARED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.PREPARING, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.STARTED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.RESUMED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.STOPPED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.PAUSED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.PLAYBACK_COMPLETED, mediaPlayerState));
    }

    private void addResetTransitions(@NonNull StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.RESET;
        MediaPlayerState mediaPlayerState = MediaPlayerState.IDLE;
        builder.addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.ERROR, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.INITIALIZED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.PREPARED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.PREPARING, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.STARTED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.RESUMED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.STOPPED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.PAUSED, mediaPlayerState)).addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.PLAYBACK_COMPLETED, mediaPlayerState));
    }

    private void addResumedTransitions(@NonNull StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.STOP;
        MediaPlayerState mediaPlayerState = MediaPlayerState.RESUMED;
        builder.addTransition(mediaPlayerTransition, Arrays.asList(mediaPlayerState, MediaPlayerState.STOPPED)).addTransition(MediaPlayerTransition.PAUSE, Arrays.asList(mediaPlayerState, MediaPlayerState.PAUSED)).addTransition(MediaPlayerTransition.ON_COMPLETE, Arrays.asList(mediaPlayerState, MediaPlayerState.PLAYBACK_COMPLETED));
    }

    private void addStartedTransitions(@NonNull StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.STOP;
        MediaPlayerState mediaPlayerState = MediaPlayerState.STARTED;
        builder.addTransition(mediaPlayerTransition, Arrays.asList(mediaPlayerState, MediaPlayerState.STOPPED)).addTransition(MediaPlayerTransition.PAUSE, Arrays.asList(mediaPlayerState, MediaPlayerState.PAUSED)).addTransition(MediaPlayerTransition.ON_COMPLETE, Arrays.asList(mediaPlayerState, MediaPlayerState.PLAYBACK_COMPLETED));
    }

    @NonNull
    public StateMachine<MediaPlayerTransition, MediaPlayerState> create() {
        StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder = new StateMachine.Builder<>();
        StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> initialState = builder.setInitialState(this.initialState);
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.SET_DATA_SOURCE;
        MediaPlayerState mediaPlayerState = MediaPlayerState.INITIALIZED;
        StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> addTransition = initialState.addTransition(mediaPlayerTransition, Arrays.asList(MediaPlayerState.IDLE, mediaPlayerState));
        MediaPlayerTransition mediaPlayerTransition2 = MediaPlayerTransition.PREPARE_ASYNC;
        MediaPlayerState mediaPlayerState2 = MediaPlayerState.PREPARING;
        StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> addTransition2 = addTransition.addTransition(mediaPlayerTransition2, Arrays.asList(mediaPlayerState, mediaPlayerState2));
        MediaPlayerState mediaPlayerState3 = MediaPlayerState.STOPPED;
        StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> addTransition3 = addTransition2.addTransition(mediaPlayerTransition2, Arrays.asList(mediaPlayerState3, mediaPlayerState2));
        MediaPlayerTransition mediaPlayerTransition3 = MediaPlayerTransition.ON_PREPARED;
        MediaPlayerState mediaPlayerState4 = MediaPlayerState.PREPARED;
        addTransition3.addTransition(mediaPlayerTransition3, Arrays.asList(mediaPlayerState2, mediaPlayerState4)).addTransition(MediaPlayerTransition.START, Arrays.asList(mediaPlayerState4, MediaPlayerState.STARTED)).addTransition(MediaPlayerTransition.STOP, Arrays.asList(mediaPlayerState4, mediaPlayerState3));
        addPlaybackCompletedTransitions(builder);
        addStartedTransitions(builder);
        addResumedTransitions(builder);
        addPausedTransitions(builder);
        addErrorTransitions(builder);
        addResetTransitions(builder);
        addReleaseTransitions(builder);
        return builder.build();
    }
}
