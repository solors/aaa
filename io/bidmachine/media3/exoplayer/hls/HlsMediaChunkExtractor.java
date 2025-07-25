package io.bidmachine.media3.exoplayer.hls;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import java.io.IOException;

@UnstableApi
/* loaded from: classes9.dex */
public interface HlsMediaChunkExtractor {
    void init(ExtractorOutput extractorOutput);

    boolean isPackedAudioExtractor();

    boolean isReusable();

    void onTruncatedSegmentParsed();

    boolean read(ExtractorInput extractorInput) throws IOException;

    HlsMediaChunkExtractor recreate();
}
