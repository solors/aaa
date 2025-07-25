package com.applovin.impl;

/* renamed from: com.applovin.impl.ho */
/* loaded from: classes2.dex */
public final class C4537ho {

    /* renamed from: a */
    private long f6674a;

    /* renamed from: b */
    private long f6675b;

    /* renamed from: c */
    private long f6676c;

    /* renamed from: d */
    private final ThreadLocal f6677d = new ThreadLocal();

    public C4537ho(long j) {
        m98642d(j);
    }

    /* renamed from: e */
    public static long m98641e(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: a */
    public synchronized long m98647a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f6675b == -9223372036854775807L) {
            long j2 = this.f6674a;
            if (j2 == 9223372036854775806L) {
                j2 = ((Long) AbstractC4100b1.m100583a((Long) this.f6677d.get())).longValue();
            }
            this.f6675b = j2 - j;
            notifyAll();
        }
        this.f6676c = j;
        return j + this.f6675b;
    }

    /* renamed from: b */
    public synchronized long m98645b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f6676c;
        if (j2 != -9223372036854775807L) {
            long m98641e = m98641e(j2);
            long j3 = (4294967296L + m98641e) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - m98641e) < Math.abs(j - m98641e)) {
                j = j4;
            }
        }
        return m98647a(m98643c(j));
    }

    /* renamed from: c */
    public synchronized long m98644c() {
        return this.f6675b;
    }

    /* renamed from: d */
    public synchronized void m98642d(long j) {
        long j2;
        this.f6674a = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.f6675b = j2;
        this.f6676c = -9223372036854775807L;
    }

    /* renamed from: c */
    public static long m98643c(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: b */
    public synchronized long m98646b() {
        long m98648a;
        long j = this.f6676c;
        if (j != -9223372036854775807L) {
            m98648a = j + this.f6675b;
        } else {
            m98648a = m98648a();
        }
        return m98648a;
    }

    /* renamed from: a */
    public synchronized long m98648a() {
        long j;
        j = this.f6674a;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }
}
