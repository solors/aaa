package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.util.SlidingPercentile;

/* loaded from: classes6.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener<Object> {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    private long bitrateEstimate;
    private final Clock clock;
    @Nullable
    private final Handler eventHandler;
    @Nullable
    private final BandwidthMeter.EventListener eventListener;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;

    /* loaded from: classes6.dex */
    public static final class Builder {
        @Nullable
        private Handler eventHandler;
        @Nullable
        private BandwidthMeter.EventListener eventListener;
        private long initialBitrateEstimate = 1000000;
        private int slidingWindowMaxWeight = 2000;
        private Clock clock = Clock.DEFAULT;

        public final DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.eventHandler, this.eventListener, this.initialBitrateEstimate, this.slidingWindowMaxWeight, this.clock);
        }

        public final Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public final Builder setEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
            boolean z;
            if (handler != null && eventListener != null) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            this.eventHandler = handler;
            this.eventListener = eventListener;
            return this;
        }

        public final Builder setInitialBitrateEstimate(long j) {
            this.initialBitrateEstimate = j;
            return this;
        }

        public final Builder setSlidingWindowMaxWeight(int i) {
            this.slidingWindowMaxWeight = i;
            return this;
        }
    }

    private void notifyBandwidthSample(final int i, final long j, final long j2) {
        Handler handler = this.eventHandler;
        if (handler != null && this.eventListener != null) {
            handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultBandwidthMeter.1
                @Override // java.lang.Runnable
                public void run() {
                    DefaultBandwidthMeter.this.eventListener.onBandwidthSample(i, j, j2);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter
    public final synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener
    public final synchronized void onBytesTransferred(Object obj, int i) {
        this.sampleBytesTransferred += i;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener
    public final synchronized void onTransferEnd(Object obj) {
        boolean z;
        if (this.streamCount > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        long elapsedRealtime = this.clock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.sampleStartTimeMs);
        long j = i;
        this.totalElapsedTimeMs += j;
        long j2 = this.totalBytesTransferred;
        long j3 = this.sampleBytesTransferred;
        this.totalBytesTransferred = j2 + j3;
        if (i > 0) {
            this.slidingPercentile.addSample((int) Math.sqrt(j3), (float) ((8000 * j3) / j));
            if (this.totalElapsedTimeMs >= 2000 || this.totalBytesTransferred >= 524288) {
                this.bitrateEstimate = this.slidingPercentile.getPercentile(0.5f);
            }
        }
        notifyBandwidthSample(i, this.sampleBytesTransferred, this.bitrateEstimate);
        int i2 = this.streamCount - 1;
        this.streamCount = i2;
        if (i2 > 0) {
            this.sampleStartTimeMs = elapsedRealtime;
        }
        this.sampleBytesTransferred = 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener
    public final synchronized void onTransferStart(Object obj, DataSpec dataSpec) {
        if (this.streamCount == 0) {
            this.sampleStartTimeMs = this.clock.elapsedRealtime();
        }
        this.streamCount++;
    }

    public DefaultBandwidthMeter() {
        this(null, null, 1000000L, 2000, Clock.DEFAULT);
    }

    @Deprecated
    public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventListener) {
        this(handler, eventListener, 1000000L, 2000, Clock.DEFAULT);
    }

    @Deprecated
    public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventListener, int i) {
        this(handler, eventListener, 1000000L, i, Clock.DEFAULT);
    }

    private DefaultBandwidthMeter(@Nullable Handler handler, @Nullable BandwidthMeter.EventListener eventListener, long j, int i, Clock clock) {
        this.eventHandler = handler;
        this.eventListener = eventListener;
        this.slidingPercentile = new SlidingPercentile(i);
        this.clock = clock;
        this.bitrateEstimate = j;
    }
}
