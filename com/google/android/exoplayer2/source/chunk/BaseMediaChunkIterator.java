package com.google.android.exoplayer2.source.chunk;

/* loaded from: classes4.dex */
public abstract class BaseMediaChunkIterator implements MediaChunkIterator {

    /* renamed from: a */
    private final long f34569a;

    /* renamed from: b */
    private final long f34570b;

    /* renamed from: c */
    private long f34571c;

    public BaseMediaChunkIterator(long j, long j2) {
        this.f34569a = j;
        this.f34570b = j2;
        reset();
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean isEnded() {
        if (this.f34571c > this.f34570b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean next() {
        this.f34571c++;
        return !isEnded();
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public void reset() {
        this.f34571c = this.f34569a - 1;
    }
}
