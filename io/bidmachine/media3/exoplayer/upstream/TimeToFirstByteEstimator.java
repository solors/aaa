package io.bidmachine.media3.exoplayer.upstream;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSpec;

@UnstableApi
/* loaded from: classes9.dex */
public interface TimeToFirstByteEstimator {
    long getTimeToFirstByteEstimateUs();

    void onTransferInitializing(DataSpec dataSpec);

    void onTransferStart(DataSpec dataSpec);

    void reset();
}
