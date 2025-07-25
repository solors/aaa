package io.bidmachine.media3.exoplayer.upstream.experimental;

import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.exoplayer.upstream.SlidingPercentile;
import io.bidmachine.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import java.util.LinkedHashMap;
import java.util.Map;

@UnstableApi
/* loaded from: classes9.dex */
public final class PercentileTimeToFirstByteEstimator implements TimeToFirstByteEstimator {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    public static final float DEFAULT_PERCENTILE = 0.5f;
    private static final int MAX_DATA_SPECS = 10;
    private final Clock clock;
    private final LinkedHashMap<DataSpec, Long> initializedDataSpecs;
    private boolean isEmpty;
    private final float percentile;
    private final SlidingPercentile slidingPercentile;

    /* renamed from: io.bidmachine.media3.exoplayer.upstream.experimental.PercentileTimeToFirstByteEstimator$a */
    /* loaded from: classes9.dex */
    private static class C36470a<K, V> extends LinkedHashMap<K, V> {
        private final int maxSize;

        public C36470a(int i) {
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

    public PercentileTimeToFirstByteEstimator() {
        this(10, 0.5f);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public long getTimeToFirstByteEstimateUs() {
        if (!this.isEmpty) {
            return this.slidingPercentile.getPercentile(this.percentile);
        }
        return -9223372036854775807L;
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
        this.slidingPercentile.addSample(1, (float) (Util.msToUs(this.clock.elapsedRealtime()) - remove.longValue()));
        this.isEmpty = false;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void reset() {
        this.slidingPercentile.reset();
        this.isEmpty = true;
    }

    public PercentileTimeToFirstByteEstimator(int i, float f) {
        this(i, f, Clock.DEFAULT);
    }

    @VisibleForTesting
    PercentileTimeToFirstByteEstimator(int i, float f, Clock clock) {
        Assertions.checkArgument(i > 0 && f > 0.0f && f <= 1.0f);
        this.percentile = f;
        this.clock = clock;
        this.initializedDataSpecs = new C36470a(10);
        this.slidingPercentile = new SlidingPercentile(i);
        this.isEmpty = true;
    }
}
