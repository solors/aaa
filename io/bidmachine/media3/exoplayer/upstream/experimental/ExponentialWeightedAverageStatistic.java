package io.bidmachine.media3.exoplayer.upstream.experimental;

import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public class ExponentialWeightedAverageStatistic implements BandwidthStatistic {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.9999d;
    private long bitrateEstimate;
    private final double smoothingFactor;

    public ExponentialWeightedAverageStatistic() {
        this(0.9999d);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j2) {
        long j3 = (8000000 * j) / j2;
        if (this.bitrateEstimate == Long.MIN_VALUE) {
            this.bitrateEstimate = j3;
            return;
        }
        double pow = Math.pow(this.smoothingFactor, Math.sqrt(j));
        this.bitrateEstimate = (long) ((this.bitrateEstimate * pow) + ((1.0d - pow) * j3));
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    public ExponentialWeightedAverageStatistic(double d) {
        this.smoothingFactor = d;
        this.bitrateEstimate = Long.MIN_VALUE;
    }
}
