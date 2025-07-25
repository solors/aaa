package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ps1;

/* loaded from: classes8.dex */
public final class di0 implements ps1 {

    /* renamed from: a */
    private final long[] f78146a;

    /* renamed from: b */
    private final long[] f78147b;

    /* renamed from: c */
    private final long f78148c;

    /* renamed from: d */
    private final boolean f78149d;

    public di0(long j, long[] jArr, long[] jArr2) {
        boolean z;
        boolean z2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C30937nf.m31567a(z);
        int length = jArr2.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f78149d = z2;
        if (z2 && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f78146a = jArr3;
            long[] jArr4 = new long[i];
            this.f78147b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f78146a = jArr;
            this.f78147b = jArr2;
        }
        this.f78148c = j;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final ps1.C31150a mo28594b(long j) {
        if (!this.f78149d) {
            rs1 rs1Var = rs1.f84870c;
            return new ps1.C31150a(rs1Var, rs1Var);
        }
        int m27056b = y32.m27056b(this.f78147b, j, true);
        long[] jArr = this.f78147b;
        long j2 = jArr[m27056b];
        long[] jArr2 = this.f78146a;
        rs1 rs1Var2 = new rs1(j2, jArr2[m27056b]);
        if (j2 != j && m27056b != jArr.length - 1) {
            int i = m27056b + 1;
            return new ps1.C31150a(rs1Var2, new rs1(jArr[i], jArr2[i]));
        }
        return new ps1.C31150a(rs1Var2, rs1Var2);
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: c */
    public final long mo28592c() {
        return this.f78148c;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final boolean mo28595b() {
        return this.f78149d;
    }
}
