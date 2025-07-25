package io.bidmachine.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.source.chunk.Chunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final Format[] formats;
    protected final TrackGroup group;
    private int hashCode;
    protected final int length;
    protected final int[] tracks;
    private final int type;

    public BaseTrackSelection(TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, 0);
    }

    public static /* synthetic */ int lambda$new$0(Format format, Format format2) {
        return format2.bitrate - format.bitrate;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
        if (this.group == baseTrackSelection.group && Arrays.equals(this.tracks, baseTrackSelection.tracks)) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean excludeTrack(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean isTrackExcluded = isTrackExcluded(i, elapsedRealtime);
        for (int i2 = 0; i2 < this.length && !isTrackExcluded; i2++) {
            if (i2 != i && !isTrackExcluded(i2, elapsedRealtime)) {
                isTrackExcluded = true;
            } else {
                isTrackExcluded = false;
            }
        }
        if (!isTrackExcluded) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        jArr[i] = Math.max(jArr[i], Util.addWithOverflowDefault(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final Format getFormat(int i) {
        return this.formats[i];
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i) {
        return this.tracks[i];
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public abstract /* synthetic */ int getSelectedIndex();

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    @Nullable
    public abstract /* synthetic */ Object getSelectionData();

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public abstract /* synthetic */ int getSelectionReason();

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.group;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = (System.identityHashCode(this.group) * 31) + Arrays.hashCode(this.tracks);
        }
        return this.hashCode;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(Format format) {
        for (int i = 0; i < this.length; i++) {
            if (this.formats[i] == format) {
                return i;
            }
        }
        return -1;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean isTrackExcluded(int i, long j) {
        if (this.excludeUntilTimes[i] > j) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
        super.onDiscontinuity();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z) {
        super.onPlayWhenReadyChanged(z);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ void onRebuffer() {
        super.onRebuffer();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j, Chunk chunk, List list) {
        return super.shouldCancelChunkLoad(j, chunk, list);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public abstract /* synthetic */ void updateSelectedTrack(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr);

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr, int i) {
        int i2 = 0;
        Assertions.checkState(iArr.length > 0);
        this.type = i;
        this.group = (TrackGroup) Assertions.checkNotNull(trackGroup);
        int length = iArr.length;
        this.length = length;
        this.formats = new Format[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.formats[i3] = trackGroup.getFormat(iArr[i3]);
        }
        Arrays.sort(this.formats, new Comparator() { // from class: io.bidmachine.media3.exoplayer.trackselection.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$new$0;
                lambda$new$0 = BaseTrackSelection.lambda$new$0((Format) obj, (Format) obj2);
                return lambda$new$0;
            }
        });
        this.tracks = new int[this.length];
        while (true) {
            int i4 = this.length;
            if (i2 < i4) {
                this.tracks[i2] = trackGroup.indexOf(this.formats[i2]);
                i2++;
            } else {
                this.excludeUntilTimes = new long[i4];
                return;
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.length; i2++) {
            if (this.tracks[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f) {
    }
}
