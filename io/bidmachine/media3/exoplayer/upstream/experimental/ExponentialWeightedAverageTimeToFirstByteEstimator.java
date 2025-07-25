package io.bidmachine.media3.exoplayer.upstream.experimental;

import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import java.util.LinkedHashMap;
import java.util.Map;

@UnstableApi
/* loaded from: classes9.dex */
public final class ExponentialWeightedAverageTimeToFirstByteEstimator implements TimeToFirstByteEstimator {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.85d;
    private static final int MAX_DATA_SPECS = 10;
    private final Clock clock;
    private long estimateUs;
    private final LinkedHashMap<DataSpec, Long> initializedDataSpecs;
    private final double smoothingFactor;

    /* renamed from: io.bidmachine.media3.exoplayer.upstream.experimental.ExponentialWeightedAverageTimeToFirstByteEstimator$a */
    /* loaded from: classes9.dex */
    private static class C36469a<K, V> extends LinkedHashMap<K, V> {
        private final int maxSize;

        public C36469a(int i) {
            this.maxSize = i;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
            if (size() > this.maxSize) {
                return true;
            }
            return false;
        }
    }

    public ExponentialWeightedAverageTimeToFirstByteEstimator() {
        this(0.85d, Clock.DEFAULT);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public long getTimeToFirstByteEstimateUs() {
        return this.estimateUs;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferInitializing(DataSpec dataSpec) {
        this.initializedDataSpecs.remove(dataSpec);
        this.initializedDataSpecs.put(dataSpec, Long.valueOf(Util.msToUs(this.clock.elapsedRealtime())));
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferStart(DataSpec dataSpec) {
        Long remove = this.initializedDataSpecs.remove(dataSpec);
        if (remove == null) {
            return;
        }
        long msToUs = Util.msToUs(this.clock.elapsedRealtime()) - remove.longValue();
        long j = this.estimateUs;
        if (j == -9223372036854775807L) {
            this.estimateUs = msToUs;
            return;
        }
        double d = this.smoothingFactor;
        this.estimateUs = (long) ((j * d) + ((1.0d - d) * msToUs));
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void reset() {
        this.estimateUs = -9223372036854775807L;
    }

    public ExponentialWeightedAverageTimeToFirstByteEstimator(double d) {
        this(d, Clock.DEFAULT);
    }

    @VisibleForTesting
    ExponentialWeightedAverageTimeToFirstByteEstimator(double d, Clock clock) {
        this.smoothingFactor = d;
        this.clock = clock;
        this.initializedDataSpecs = new C36469a(10);
        this.estimateUs = -9223372036854775807L;
    }
}
