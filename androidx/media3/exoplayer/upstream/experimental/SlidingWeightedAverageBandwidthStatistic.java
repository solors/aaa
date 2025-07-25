package androidx.media3.exoplayer.upstream.experimental;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.Deque;

@UnstableApi
/* loaded from: classes2.dex */
public class SlidingWeightedAverageBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    private double bitrateWeightProductSum;
    private final Clock clock;
    private final SampleEvictionFunction sampleEvictionFunction;
    private final ArrayDeque<Sample> samples;
    private double weightSum;

    /* loaded from: classes2.dex */
    public static class Sample {
        public final long bitrate;
        public final long timeAddedMs;
        public final double weight;

        public Sample(long j, double d, long j2) {
            this.bitrate = j;
            this.weight = d;
            this.timeAddedMs = j2;
        }
    }

    /* loaded from: classes2.dex */
    public interface SampleEvictionFunction {
        boolean shouldEvictSample(Deque<Sample> deque);
    }

    public SlidingWeightedAverageBandwidthStatistic() {
        this(getMaxCountEvictionFunction(10L));
    }

    public static SampleEvictionFunction getAgeBasedEvictionFunction(long j) {
        return getAgeBasedEvictionFunction(j, Clock.DEFAULT);
    }

    public static SampleEvictionFunction getMaxCountEvictionFunction(final long j) {
        return new SampleEvictionFunction() { // from class: androidx.media3.exoplayer.upstream.experimental.b
            @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                boolean lambda$getMaxCountEvictionFunction$0;
                lambda$getMaxCountEvictionFunction$0 = SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(j, deque);
                return lambda$getMaxCountEvictionFunction$0;
            }
        };
    }

    public static /* synthetic */ boolean lambda$getAgeBasedEvictionFunction$1(long j, Clock clock, Deque deque) {
        if (deque.isEmpty() || ((Sample) Util.castNonNull((Sample) deque.peek())).timeAddedMs + j >= clock.elapsedRealtime()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean lambda$getMaxCountEvictionFunction$0(long j, Deque deque) {
        if (deque.size() >= j) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j2) {
        while (this.sampleEvictionFunction.shouldEvictSample(this.samples)) {
            Sample remove = this.samples.remove();
            double d = this.bitrateWeightProductSum;
            double d2 = remove.weight;
            this.bitrateWeightProductSum = d - (remove.bitrate * d2);
            this.weightSum -= d2;
        }
        Sample sample = new Sample((j * 8000000) / j2, Math.sqrt(j), this.clock.elapsedRealtime());
        this.samples.add(sample);
        double d3 = this.bitrateWeightProductSum;
        double d4 = sample.weight;
        this.bitrateWeightProductSum = d3 + (sample.bitrate * d4);
        this.weightSum += d4;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.bitrateWeightProductSum / this.weightSum);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.bitrateWeightProductSum = 0.0d;
        this.weightSum = 0.0d;
    }

    public SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction) {
        this(sampleEvictionFunction, Clock.DEFAULT);
    }

    @VisibleForTesting
    static SampleEvictionFunction getAgeBasedEvictionFunction(final long j, final Clock clock) {
        return new SampleEvictionFunction() { // from class: androidx.media3.exoplayer.upstream.experimental.c
            @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                boolean lambda$getAgeBasedEvictionFunction$1;
                lambda$getAgeBasedEvictionFunction$1 = SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(j, clock, deque);
                return lambda$getAgeBasedEvictionFunction$1;
            }
        };
    }

    @VisibleForTesting
    SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction, Clock clock) {
        this.samples = new ArrayDeque<>();
        this.sampleEvictionFunction = sampleEvictionFunction;
        this.clock = clock;
    }
}
