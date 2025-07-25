package com.applovin.impl;

import com.applovin.impl.InterfaceC4591ij;

/* renamed from: com.applovin.impl.o4 */
/* loaded from: classes2.dex */
public class C5047o4 implements InterfaceC4591ij {

    /* renamed from: a */
    private final long f8716a;

    /* renamed from: b */
    private final long f8717b;

    /* renamed from: c */
    private final int f8718c;

    /* renamed from: d */
    private final long f8719d;

    /* renamed from: e */
    private final int f8720e;

    /* renamed from: f */
    private final long f8721f;

    /* renamed from: g */
    private final boolean f8722g;

    public C5047o4(long j, long j2, int i, int i2, boolean z) {
        this.f8716a = j;
        this.f8717b = j2;
        this.f8718c = i2 == -1 ? 1 : i2;
        this.f8720e = i;
        this.f8722g = z;
        if (j == -1) {
            this.f8719d = -1L;
            this.f8721f = -9223372036854775807L;
            return;
        }
        this.f8719d = j - j2;
        this.f8721f = m96874a(j, j2, i);
    }

    /* renamed from: a */
    private static long m96874a(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    /* renamed from: c */
    private long m96873c(long j) {
        long j2 = this.f8718c;
        long j3 = (((j * this.f8720e) / 8000000) / j2) * j2;
        long j4 = this.f8719d;
        if (j4 != -1) {
            j3 = Math.min(j3, j4 - j2);
        }
        return this.f8717b + Math.max(j3, 0L);
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public InterfaceC4591ij.C4592a mo92787b(long j) {
        if (this.f8719d == -1 && !this.f8722g) {
            return new InterfaceC4591ij.C4592a(new C4719kj(0L, this.f8717b));
        }
        long m96873c = m96873c(j);
        long m96872d = m96872d(m96873c);
        C4719kj c4719kj = new C4719kj(m96872d, m96873c);
        if (this.f8719d != -1 && m96872d < j) {
            long j2 = m96873c + this.f8718c;
            if (j2 < this.f8716a) {
                return new InterfaceC4591ij.C4592a(c4719kj, new C4719kj(m96872d(j2), j2));
            }
        }
        return new InterfaceC4591ij.C4592a(c4719kj);
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: d */
    public long mo92786d() {
        return this.f8721f;
    }

    /* renamed from: d */
    public long m96872d(long j) {
        return m96874a(j, this.f8717b, this.f8720e);
    }

    @Override // com.applovin.impl.InterfaceC4591ij
    /* renamed from: b */
    public boolean mo92788b() {
        return this.f8719d != -1 || this.f8722g;
    }
}
