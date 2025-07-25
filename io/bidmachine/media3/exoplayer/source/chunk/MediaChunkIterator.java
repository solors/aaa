package io.bidmachine.media3.exoplayer.source.chunk;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSpec;
import java.util.NoSuchElementException;

@UnstableApi
/* loaded from: classes9.dex */
public interface MediaChunkIterator {
    public static final MediaChunkIterator EMPTY = new C36381a();

    long getChunkEndTimeUs();

    long getChunkStartTimeUs();

    DataSpec getDataSpec();

    boolean isEnded();

    boolean next();

    void reset();

    /* renamed from: io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator$a */
    /* loaded from: classes9.dex */
    class C36381a implements MediaChunkIterator {
        C36381a() {
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            throw new NoSuchElementException();
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public boolean isEnded() {
            return true;
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public boolean next() {
            return false;
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public void reset() {
        }
    }
}
