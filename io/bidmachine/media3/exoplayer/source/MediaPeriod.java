package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.source.SequenceableLoader;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public interface MediaPeriod extends SequenceableLoader {

    /* loaded from: classes9.dex */
    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader.Callback
        /* synthetic */ void onContinueLoadingRequested(MediaPeriod mediaPeriod);

        void onPrepared(MediaPeriod mediaPeriod);
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    boolean continueLoading(long j);

    void discardBuffer(long j, boolean z);

    long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters);

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    long getBufferedPositionUs();

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    long getNextLoadPositionUs();

    default List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return Collections.emptyList();
    }

    TrackGroupArray getTrackGroups();

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    void prepare(Callback callback, long j);

    long readDiscontinuity();

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    void reevaluateBuffer(long j);

    long seekToUs(long j);

    long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j);
}
