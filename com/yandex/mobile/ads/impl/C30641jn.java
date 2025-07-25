package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ps1;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.jn */
/* loaded from: classes8.dex */
public final class C30641jn implements ps1 {

    /* renamed from: a */
    public final int f81011a;

    /* renamed from: b */
    public final int[] f81012b;

    /* renamed from: c */
    public final long[] f81013c;

    /* renamed from: d */
    public final long[] f81014d;

    /* renamed from: e */
    public final long[] f81015e;

    /* renamed from: f */
    private final long f81016f;

    public C30641jn(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f81012b = iArr;
        this.f81013c = jArr;
        this.f81014d = jArr2;
        this.f81015e = jArr3;
        int length = iArr.length;
        this.f81011a = length;
        if (length > 0) {
            int i = length - 1;
            this.f81016f = jArr2[i] + jArr3[i];
            return;
        }
        this.f81016f = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final boolean mo28595b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: c */
    public final long mo28592c() {
        return this.f81016f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f81011a + ", sizes=" + Arrays.toString(this.f81012b) + ", offsets=" + Arrays.toString(this.f81013c) + ", timeUs=" + Arrays.toString(this.f81015e) + ", durationsUs=" + Arrays.toString(this.f81014d) + ")";
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final ps1.C31150a mo28594b(long j) {
        int m27056b = y32.m27056b(this.f81015e, j, true);
        long[] jArr = this.f81015e;
        long j2 = jArr[m27056b];
        long[] jArr2 = this.f81013c;
        rs1 rs1Var = new rs1(j2, jArr2[m27056b]);
        if (j2 < j && m27056b != this.f81011a - 1) {
            int i = m27056b + 1;
            return new ps1.C31150a(rs1Var, new rs1(jArr[i], jArr2[i]));
        }
        return new ps1.C31150a(rs1Var, rs1Var);
    }
}
