package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.v */
/* loaded from: classes4.dex */
public final class C15129v {

    /* renamed from: a */
    public long f29828a;

    /* renamed from: b */
    public long f29829b;

    /* renamed from: c */
    public volatile long f29830c = -9223372036854775807L;

    public C15129v(long j) {
        m77169c(j);
    }

    /* renamed from: a */
    public final long m77171a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f29830c != -9223372036854775807L) {
            this.f29830c = j;
        } else {
            long j2 = this.f29828a;
            if (j2 != Long.MAX_VALUE) {
                this.f29829b = j2 - j;
            }
            synchronized (this) {
                this.f29830c = j;
                notifyAll();
            }
        }
        return j + this.f29829b;
    }

    /* renamed from: b */
    public final long m77170b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f29830c != -9223372036854775807L) {
            long j2 = (this.f29830c * 90000) / 1000000;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return m77171a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public final synchronized void m77169c(long j) {
        if (this.f29830c == -9223372036854775807L) {
            this.f29828a = j;
        } else {
            throw new IllegalStateException();
        }
    }
}
