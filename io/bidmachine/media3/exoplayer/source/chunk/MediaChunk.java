package io.bidmachine.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.DataSpec;
import java.io.IOException;

@UnstableApi
/* loaded from: classes9.dex */
public abstract class MediaChunk extends Chunk {
    public final long chunkIndex;

    public MediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, @Nullable Object obj, long j, long j2, long j3) {
        super(dataSource, dataSpec, 1, format, i, obj, j, j2);
        Assertions.checkNotNull(format);
        this.chunkIndex = j3;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.Chunk, io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
    public abstract /* synthetic */ void cancelLoad();

    public long getNextChunkIndex() {
        long j = this.chunkIndex;
        if (j == -1) {
            return -1L;
        }
        return 1 + j;
    }

    public abstract boolean isLoadCompleted();

    @Override // io.bidmachine.media3.exoplayer.source.chunk.Chunk, io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
    public abstract /* synthetic */ void load() throws IOException;
}
