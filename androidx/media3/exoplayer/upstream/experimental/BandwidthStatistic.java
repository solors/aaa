package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface BandwidthStatistic {
    void addSample(long j, long j2);

    long getBandwidthEstimate();

    void reset();
}
