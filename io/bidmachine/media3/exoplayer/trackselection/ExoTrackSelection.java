package io.bidmachine.media3.exoplayer.trackselection;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.chunk.Chunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public interface ExoTrackSelection extends TrackSelection {

    /* loaded from: classes9.dex */
    public static final class Definition {
        private static final String TAG = "ETSDefinition";
        public final TrackGroup group;
        public final int[] tracks;
        public final int type;

        public Definition(TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0);
        }

        public Definition(TrackGroup trackGroup, int[] iArr, int i) {
            if (iArr.length == 0) {
                Log.m19948e(TAG, "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.group = trackGroup;
            this.tracks = iArr;
            this.type = i;
        }
    }

    /* loaded from: classes9.dex */
    public interface Factory {
        ExoTrackSelection[] createTrackSelections(Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);
    }

    void disable();

    void enable();

    int evaluateQueueSize(long j, List<? extends MediaChunk> list);

    boolean excludeTrack(int i, long j);

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ Format getFormat(int i);

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ int getIndexInTrackGroup(int i);

    Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @Nullable
    Object getSelectionData();

    int getSelectionReason();

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ TrackGroup getTrackGroup();

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ int getType();

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ int indexOf(int i);

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ int indexOf(Format format);

    boolean isTrackExcluded(int i, long j);

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ int length();

    void onPlaybackSpeed(float f);

    default boolean shouldCancelChunkLoad(long j, Chunk chunk, List<? extends MediaChunk> list) {
        return false;
    }

    void updateSelectedTrack(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr);

    default void onDiscontinuity() {
    }

    default void onRebuffer() {
    }

    default void onPlayWhenReadyChanged(boolean z) {
    }
}
