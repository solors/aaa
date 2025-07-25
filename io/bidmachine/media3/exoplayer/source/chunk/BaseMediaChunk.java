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
public abstract class BaseMediaChunk extends MediaChunk {
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;
    private int[] firstSampleIndices;
    private BaseMediaChunkOutput output;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j5);
        this.clippedStartTimeUs = j3;
        this.clippedEndTimeUs = j4;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunk, io.bidmachine.media3.exoplayer.source.chunk.Chunk, io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
    public abstract /* synthetic */ void cancelLoad();

    public final int getFirstSampleIndex(int i) {
        return ((int[]) Assertions.checkStateNotNull(this.firstSampleIndices))[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final BaseMediaChunkOutput getOutput() {
        return (BaseMediaChunkOutput) Assertions.checkStateNotNull(this.output);
    }

    public void init(BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunk, io.bidmachine.media3.exoplayer.source.chunk.Chunk, io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
    public abstract /* synthetic */ void load() throws IOException;
}
