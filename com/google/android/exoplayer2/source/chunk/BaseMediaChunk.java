package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public abstract class BaseMediaChunk extends MediaChunk {

    /* renamed from: b */
    private BaseMediaChunkOutput f34567b;

    /* renamed from: c */
    private int[] f34568c;
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j5);
        this.clippedStartTimeUs = j3;
        this.clippedEndTimeUs = j4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final BaseMediaChunkOutput m73623a() {
        return (BaseMediaChunkOutput) Assertions.checkStateNotNull(this.f34567b);
    }

    public final int getFirstSampleIndex(int i) {
        return ((int[]) Assertions.checkStateNotNull(this.f34568c))[i];
    }

    public void init(BaseMediaChunkOutput baseMediaChunkOutput) {
        this.f34567b = baseMediaChunkOutput;
        this.f34568c = baseMediaChunkOutput.getWriteIndices();
    }
}
