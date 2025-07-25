package io.bidmachine.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.extractor.ChunkIndex;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.TrackOutput;
import java.io.IOException;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public interface ChunkExtractor {

    /* loaded from: classes9.dex */
    public interface Factory {
        @Nullable
        ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List<Format> list, @Nullable TrackOutput trackOutput, PlayerId playerId);
    }

    /* loaded from: classes9.dex */
    public interface TrackOutputProvider {
        TrackOutput track(int i, int i2);
    }

    @Nullable
    ChunkIndex getChunkIndex();

    @Nullable
    Format[] getSampleFormats();

    void init(@Nullable TrackOutputProvider trackOutputProvider, long j, long j2);

    boolean read(ExtractorInput extractorInput) throws IOException;

    void release();
}
