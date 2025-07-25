package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class FixedTrackSelection extends BaseTrackSelection {

    /* renamed from: h */
    private final int f35143h;
    @Nullable

    /* renamed from: i */
    private final Object f35144i;

    public FixedTrackSelection(TrackGroup trackGroup, int i) {
        this(trackGroup, i, 0);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return this.f35144i;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.f35143h;
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i, int i2) {
        this(trackGroup, i, i2, 0, null);
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i, int i2, int i3, @Nullable Object obj) {
        super(trackGroup, new int[]{i}, i2);
        this.f35143h = i3;
        this.f35144i = obj;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
    }
}
