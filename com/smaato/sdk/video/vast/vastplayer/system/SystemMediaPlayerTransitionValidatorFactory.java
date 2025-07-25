package com.smaato.sdk.video.vast.vastplayer.system;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.p569di.ClassFactory;
import com.smaato.sdk.core.p569di.DiConstructor;
import com.smaato.sdk.video.utils.EventValidator;
import com.smaato.sdk.video.vast.vastplayer.MediaPlayerState;
import com.smaato.sdk.video.vast.vastplayer.MediaPlayerTransition;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes7.dex */
public class SystemMediaPlayerTransitionValidatorFactory implements ClassFactory<EventValidator> {
    private void setValidStatesForRelease(@NonNull EventValidator.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        builder.setValidStatesForEvent(MediaPlayerTransition.RELEASE, Arrays.asList(MediaPlayerState.IDLE, MediaPlayerState.INITIALIZED, MediaPlayerState.PREPARING, MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.STOPPED, MediaPlayerState.PLAYBACK_COMPLETED, MediaPlayerState.ERROR));
    }

    private void setValidStatesForReset(@NonNull EventValidator.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        builder.setValidStatesForEvent(MediaPlayerTransition.RESET, Arrays.asList(MediaPlayerState.INITIALIZED, MediaPlayerState.PREPARING, MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.STOPPED, MediaPlayerState.PLAYBACK_COMPLETED, MediaPlayerState.ERROR));
    }

    @Override // com.smaato.sdk.core.p569di.ClassFactory
    @NonNull
    /* renamed from: get */
    public EventValidator get2(@NonNull DiConstructor diConstructor) {
        EventValidator.Builder<MediaPlayerTransition, MediaPlayerState> builder = new EventValidator.Builder<>();
        EventValidator.Builder<MediaPlayerTransition, MediaPlayerState> validStatesForEvent = builder.setValidStatesForEvent(MediaPlayerTransition.SET_DATA_SOURCE, Collections.singletonList(MediaPlayerState.IDLE)).setValidStatesForEvent(MediaPlayerTransition.PREPARE_ASYNC, Arrays.asList(MediaPlayerState.INITIALIZED, MediaPlayerState.STOPPED)).setValidStatesForEvent(MediaPlayerTransition.ON_PREPARED, Collections.singletonList(MediaPlayerState.PREPARING));
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.PAUSE;
        MediaPlayerState mediaPlayerState = MediaPlayerState.STARTED;
        MediaPlayerState mediaPlayerState2 = MediaPlayerState.RESUMED;
        MediaPlayerState mediaPlayerState3 = MediaPlayerState.PLAYBACK_COMPLETED;
        EventValidator.Builder<MediaPlayerTransition, MediaPlayerState> validStatesForEvent2 = validStatesForEvent.setValidStatesForEvent(mediaPlayerTransition, Arrays.asList(mediaPlayerState, mediaPlayerState2, mediaPlayerState3));
        MediaPlayerTransition mediaPlayerTransition2 = MediaPlayerTransition.START;
        MediaPlayerState mediaPlayerState4 = MediaPlayerState.PREPARED;
        MediaPlayerState mediaPlayerState5 = MediaPlayerState.PAUSED;
        validStatesForEvent2.setValidStatesForEvent(mediaPlayerTransition2, Arrays.asList(mediaPlayerState4, mediaPlayerState5, mediaPlayerState3)).setValidStatesForEvent(MediaPlayerTransition.STOP, Arrays.asList(mediaPlayerState4, mediaPlayerState, mediaPlayerState2, mediaPlayerState5, mediaPlayerState3)).setValidStatesForEvent(MediaPlayerTransition.ON_COMPLETE, Arrays.asList(mediaPlayerState, mediaPlayerState2, mediaPlayerState3));
        setValidStatesForRelease(builder);
        setValidStatesForReset(builder);
        return builder.build();
    }
}
