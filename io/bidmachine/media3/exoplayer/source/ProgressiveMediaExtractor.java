package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.PositionHolder;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@UnstableApi
/* loaded from: classes9.dex */
public interface ProgressiveMediaExtractor {

    /* loaded from: classes9.dex */
    public interface Factory {
        ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId);
    }

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j, long j2, ExtractorOutput extractorOutput) throws IOException;

    int read(PositionHolder positionHolder) throws IOException;

    void release();

    void seek(long j, long j2);
}
