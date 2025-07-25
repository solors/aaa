package io.bidmachine.media3.common.util;

import androidx.annotation.GuardedBy;
import java.util.concurrent.TimeoutException;

@UnstableApi
/* loaded from: classes9.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    @GuardedBy("this")
    private long firstSampleTimestampUs;
    @GuardedBy("this")
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();
    @GuardedBy("this")
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public static long ptsToUs(long j) {
        return (j * 1000000) / 90000;
    }

    public static long usToNonWrappedPts(long j) {
        return (j * 90000) / 1000000;
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % MAX_PTS_PLUS_ONE;
    }

    public synchronized long adjustSampleTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!isInitialized()) {
            long j2 = this.firstSampleTimestampUs;
            if (j2 == 9223372036854775806L) {
                j2 = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
            }
            this.timestampOffsetUs = j2 - j;
            notifyAll();
        }
        this.lastUnadjustedTimestampUs = j;
        return j + this.timestampOffsetUs;
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.lastUnadjustedTimestampUs;
        if (j2 != -9223372036854775807L) {
            long usToNonWrappedPts = usToNonWrappedPts(j2);
            long j3 = (4294967296L + usToNonWrappedPts) / MAX_PTS_PLUS_ONE;
            long j4 = ((j3 - 1) * MAX_PTS_PLUS_ONE) + j;
            j += j3 * MAX_PTS_PLUS_ONE;
            if (Math.abs(j4 - usToNonWrappedPts) < Math.abs(j - usToNonWrappedPts)) {
                j = j4;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j;
        j = this.firstSampleTimestampUs;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long firstSampleTimestampUs;
        long j = this.lastUnadjustedTimestampUs;
        if (j != -9223372036854775807L) {
            firstSampleTimestampUs = j + this.timestampOffsetUs;
        } else {
            firstSampleTimestampUs = getFirstSampleTimestampUs();
        }
        return firstSampleTimestampUs;
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized boolean isInitialized() {
        boolean z;
        if (this.timestampOffsetUs != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized void reset(long j) {
        long j2;
        this.firstSampleTimestampUs = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.timestampOffsetUs = j2;
        this.lastUnadjustedTimestampUs = -9223372036854775807L;
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j, long j2) throws InterruptedException, TimeoutException {
        boolean z2;
        boolean z3;
        if (this.firstSampleTimestampUs == 9223372036854775806L) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        if (isInitialized()) {
            return;
        }
        if (z) {
            this.nextSampleTimestampUs.set(Long.valueOf(j));
        } else {
            long j3 = 0;
            long j4 = j2;
            while (!isInitialized()) {
                if (j2 == 0) {
                    wait();
                } else {
                    if (j4 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Assertions.checkState(z3);
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    wait(j4);
                    j3 += android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (j3 >= j2 && !isInitialized()) {
                        throw new TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                    }
                    j4 = j2 - j3;
                }
            }
        }
    }
}
