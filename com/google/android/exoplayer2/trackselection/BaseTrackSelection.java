package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {

    /* renamed from: a */
    protected final TrackGroup f35042a;

    /* renamed from: b */
    protected final int f35043b;

    /* renamed from: c */
    protected final int[] f35044c;

    /* renamed from: d */
    private final int f35045d;

    /* renamed from: e */
    private final Format[] f35046e;

    /* renamed from: f */
    private final long[] f35047f;

    /* renamed from: g */
    private int f35048g;

    public BaseTrackSelection(TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, 0);
    }

    /* renamed from: a */
    public static /* synthetic */ int m73333a(Format format, Format format2) {
        return m73332b(format, format2);
    }

    /* renamed from: b */
    public static /* synthetic */ int m73332b(Format format, Format format2) {
        return format2.bitrate - format.bitrate;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean blacklist(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean isBlacklisted = isBlacklisted(i, elapsedRealtime);
        for (int i2 = 0; i2 < this.f35043b && !isBlacklisted; i2++) {
            if (i2 != i && !isBlacklisted(i2, elapsedRealtime)) {
                isBlacklisted = true;
            } else {
                isBlacklisted = false;
            }
        }
        if (!isBlacklisted) {
            return false;
        }
        long[] jArr = this.f35047f;
        jArr[i] = Math.max(jArr[i], Util.addWithOverflowDefault(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
        if (this.f35042a == baseTrackSelection.f35042a && Arrays.equals(this.f35044c, baseTrackSelection.f35044c)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final Format getFormat(int i) {
        return this.f35046e[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i) {
        return this.f35044c[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
        return this.f35046e[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.f35044c[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.f35042a;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getType() {
        return this.f35045d;
    }

    public int hashCode() {
        if (this.f35048g == 0) {
            this.f35048g = (System.identityHashCode(this.f35042a) * 31) + Arrays.hashCode(this.f35044c);
        }
        return this.f35048g;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(Format format) {
        for (int i = 0; i < this.f35043b; i++) {
            if (this.f35046e[i] == format) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean isBlacklisted(int i, long j) {
        if (this.f35047f[i] > j) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int length() {
        return this.f35044c.length;
    }

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr, int i) {
        int i2 = 0;
        Assertions.checkState(iArr.length > 0);
        this.f35045d = i;
        this.f35042a = (TrackGroup) Assertions.checkNotNull(trackGroup);
        int length = iArr.length;
        this.f35043b = length;
        this.f35046e = new Format[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f35046e[i3] = trackGroup.getFormat(iArr[i3]);
        }
        Arrays.sort(this.f35046e, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BaseTrackSelection.m73333a((Format) obj, (Format) obj2);
            }
        });
        this.f35044c = new int[this.f35043b];
        while (true) {
            int i4 = this.f35043b;
            if (i2 < i4) {
                this.f35044c[i2] = trackGroup.indexOf(this.f35046e[i2]);
                i2++;
            } else {
                this.f35047f = new long[i4];
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.f35043b; i2++) {
            if (this.f35044c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void enable() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f) {
    }
}
