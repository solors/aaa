package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ps1;

/* renamed from: com.yandex.mobile.ads.impl.oq */
/* loaded from: classes8.dex */
public class C31059oq implements ps1 {

    /* renamed from: a */
    private final long f83573a;

    /* renamed from: b */
    private final long f83574b;

    /* renamed from: c */
    private final int f83575c;

    /* renamed from: d */
    private final long f83576d;

    /* renamed from: e */
    private final int f83577e;

    /* renamed from: f */
    private final long f83578f;

    /* renamed from: g */
    private final boolean f83579g;

    public C31059oq(int i, int i2, long j, long j2, boolean z) {
        this.f83573a = j;
        this.f83574b = j2;
        this.f83575c = i2 == -1 ? 1 : i2;
        this.f83577e = i;
        this.f83579g = z;
        if (j == -1) {
            this.f83576d = -1L;
            this.f83578f = -9223372036854775807L;
            return;
        }
        this.f83576d = j - j2;
        this.f83578f = m30951a(i, j, j2);
    }

    /* renamed from: a */
    public long m30950a(long j) {
        return m30949c(j);
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final ps1.C31150a mo28594b(long j) {
        long j2 = this.f83576d;
        int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        if (i == 0 && !this.f83579g) {
            rs1 rs1Var = new rs1(0L, this.f83574b);
            return new ps1.C31150a(rs1Var, rs1Var);
        }
        long j3 = this.f83575c;
        long j4 = (((this.f83577e * j) / 8000000) / j3) * j3;
        if (i != 0) {
            j4 = Math.min(j4, j2 - j3);
        }
        long max = Math.max(j4, 0L);
        long j5 = this.f83574b;
        long j6 = max + j5;
        long m30951a = m30951a(this.f83577e, j6, j5);
        rs1 rs1Var2 = new rs1(m30951a, j6);
        if (this.f83576d != -1 && m30951a < j) {
            long j7 = j6 + this.f83575c;
            if (j7 < this.f83573a) {
                return new ps1.C31150a(rs1Var2, new rs1(m30951a(this.f83577e, j7, this.f83574b), j7));
            }
        }
        return new ps1.C31150a(rs1Var2, rs1Var2);
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: c */
    public final long mo28592c() {
        return this.f83578f;
    }

    /* renamed from: a */
    private static long m30951a(int i, long j, long j2) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    /* renamed from: c */
    public final long m30949c(long j) {
        return m30951a(this.f83577e, j, this.f83574b);
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final boolean mo28595b() {
        return this.f83576d != -1 || this.f83579g;
    }
}
