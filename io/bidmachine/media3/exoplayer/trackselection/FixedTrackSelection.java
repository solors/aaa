package io.bidmachine.media3.exoplayer.trackselection;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.source.chunk.Chunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public final class FixedTrackSelection extends BaseTrackSelection {
    @Nullable
    private final Object data;
    private final int reason;

    public FixedTrackSelection(TrackGroup trackGroup, int i) {
        this(trackGroup, i, 0);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return 0;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return this.data;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
        super.onDiscontinuity();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z) {
        super.onPlayWhenReadyChanged(z);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ void onRebuffer() {
        super.onRebuffer();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j, Chunk chunk, List list) {
        return super.shouldCancelChunkLoad(j, chunk, list);
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i, int i2) {
        this(trackGroup, i, i2, 0, null);
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i, int i2, int i3, @Nullable Object obj) {
        super(trackGroup, new int[]{i}, i2);
        this.reason = i3;
        this.data = obj;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
    }
}
