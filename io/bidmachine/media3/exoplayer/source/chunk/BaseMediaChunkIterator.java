package io.bidmachine.media3.exoplayer.source.chunk;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSpec;
import java.util.NoSuchElementException;

@UnstableApi
/* loaded from: classes9.dex */
public abstract class BaseMediaChunkIterator implements MediaChunkIterator {
    private long currentIndex;
    private final long fromIndex;
    private final long toIndex;

    public BaseMediaChunkIterator(long j, long j2) {
        this.fromIndex = j;
        this.toIndex = j2;
        reset();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void checkInBounds() {
        long j = this.currentIndex;
        if (j >= this.fromIndex && j <= this.toIndex) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
    public abstract /* synthetic */ long getChunkEndTimeUs();

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
    public abstract /* synthetic */ long getChunkStartTimeUs();

    /* JADX INFO: Access modifiers changed from: protected */
    public final long getCurrentIndex() {
        return this.currentIndex;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
    public abstract /* synthetic */ DataSpec getDataSpec();

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
    public boolean isEnded() {
        if (this.currentIndex > this.toIndex) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
    public boolean next() {
        this.currentIndex++;
        return !isEnded();
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
    public void reset() {
        this.currentIndex = this.fromIndex - 1;
    }
}
