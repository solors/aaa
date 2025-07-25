package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;

/* loaded from: classes4.dex */
public final class TimestampAdjuster {
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    @GuardedBy("this")

    /* renamed from: a */
    private long f36173a;
    @GuardedBy("this")

    /* renamed from: b */
    private long f36174b;
    @GuardedBy("this")

    /* renamed from: c */
    private long f36175c;

    /* renamed from: d */
    private final ThreadLocal<Long> f36176d = new ThreadLocal<>();

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
        return usToNonWrappedPts(j) % 8589934592L;
    }

    public synchronized long adjustSampleTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f36174b == -9223372036854775807L) {
            long j2 = this.f36173a;
            if (j2 == 9223372036854775806L) {
                j2 = ((Long) Assertions.checkNotNull(this.f36176d.get())).longValue();
            }
            this.f36174b = j2 - j;
            notifyAll();
        }
        this.f36175c = j;
        return j + this.f36174b;
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f36175c;
        if (j2 != -9223372036854775807L) {
            long usToNonWrappedPts = usToNonWrappedPts(j2);
            long j3 = (4294967296L + usToNonWrappedPts) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - usToNonWrappedPts) < Math.abs(j - usToNonWrappedPts)) {
                j = j4;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j;
        j = this.f36173a;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long firstSampleTimestampUs;
        long j = this.f36175c;
        if (j != -9223372036854775807L) {
            firstSampleTimestampUs = j + this.f36174b;
        } else {
            firstSampleTimestampUs = getFirstSampleTimestampUs();
        }
        return firstSampleTimestampUs;
    }

    public synchronized long getTimestampOffsetUs() {
        return this.f36174b;
    }

    public synchronized void reset(long j) {
        long j2;
        this.f36173a = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.f36174b = j2;
        this.f36175c = -9223372036854775807L;
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j) throws InterruptedException {
        boolean z2;
        if (this.f36173a == 9223372036854775806L) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        if (this.f36174b != -9223372036854775807L) {
            return;
        }
        if (z) {
            this.f36176d.set(Long.valueOf(j));
        } else {
            while (this.f36174b == -9223372036854775807L) {
                wait();
            }
        }
    }
}
