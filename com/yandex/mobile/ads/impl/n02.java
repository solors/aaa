package com.yandex.mobile.ads.impl;

import androidx.annotation.GuardedBy;

/* loaded from: classes8.dex */
public final class n02 {
    @GuardedBy("this")

    /* renamed from: a */
    private long f82506a;
    @GuardedBy("this")

    /* renamed from: b */
    private long f82507b;
    @GuardedBy("this")

    /* renamed from: c */
    private long f82508c;

    /* renamed from: d */
    private final ThreadLocal<Long> f82509d = new ThreadLocal<>();

    public n02(long j) {
        m31716c(j);
    }

    /* renamed from: a */
    public final synchronized long m31720a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f82507b == -9223372036854775807L) {
            long j2 = this.f82506a;
            if (j2 == 9223372036854775806L) {
                Long l = this.f82509d.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.f82507b = j2 - j;
            notifyAll();
        }
        this.f82508c = j;
        return j + this.f82507b;
    }

    /* renamed from: b */
    public final synchronized long m31718b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f82508c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return m31720a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public final synchronized long m31717c() {
        return this.f82507b;
    }

    /* renamed from: c */
    public final synchronized void m31716c(long j) {
        this.f82506a = j;
        this.f82507b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f82508c = -9223372036854775807L;
    }

    /* renamed from: b */
    public final synchronized long m31719b() {
        long m31721a;
        long j = this.f82508c;
        if (j != -9223372036854775807L) {
            m31721a = j + this.f82507b;
        } else {
            m31721a = m31721a();
        }
        return m31721a;
    }

    /* renamed from: a */
    public final synchronized long m31721a() {
        long j;
        j = this.f82506a;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }
}
