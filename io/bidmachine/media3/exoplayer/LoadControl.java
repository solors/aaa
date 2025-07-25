package io.bidmachine.media3.exoplayer;

import io.bidmachine.media3.common.MediaPeriodId;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.source.TrackGroupArray;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.upstream.Allocator;

@UnstableApi
/* loaded from: classes9.dex */
public interface LoadControl {
    @Deprecated
    public static final MediaPeriodId EMPTY_MEDIA_PERIOD_ID = new MediaPeriodId(new Object());

    Allocator getAllocator();

    long getBackBufferDurationUs();

    void onPrepared();

    void onReleased();

    void onStopped();

    default void onTracksSelected(Timeline timeline, MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        onTracksSelected(rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    boolean retainBackBufferFromKeyframe();

    boolean shouldContinueLoading(long j, long j2, float f);

    default boolean shouldStartPlayback(Timeline timeline, MediaPeriodId mediaPeriodId, long j, float f, boolean z, long j2) {
        return shouldStartPlayback(j, f, z, j2);
    }

    @Deprecated
    default void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        onTracksSelected(Timeline.EMPTY, EMPTY_MEDIA_PERIOD_ID, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Deprecated
    default boolean shouldStartPlayback(long j, float f, boolean z, long j2) {
        return shouldStartPlayback(Timeline.EMPTY, EMPTY_MEDIA_PERIOD_ID, j, f, z, j2);
    }
}
