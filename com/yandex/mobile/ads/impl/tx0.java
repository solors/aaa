package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.monetization.ads.exo.metadata.id3.MlltFrame;
import com.yandex.mobile.ads.impl.ps1;

/* loaded from: classes8.dex */
final class tx0 implements ss1 {

    /* renamed from: a */
    private final long[] f85983a;

    /* renamed from: b */
    private final long[] f85984b;

    /* renamed from: c */
    private final long f85985c;

    private tx0(long j, long[] jArr, long[] jArr2) {
        this.f85983a = jArr;
        this.f85984b = jArr2;
        this.f85985c = j == -9223372036854775807L ? y32.m27089a(jArr2[jArr2.length - 1]) : j;
    }

    @Override // com.yandex.mobile.ads.impl.ss1
    /* renamed from: a */
    public final long mo28948a() {
        return -1L;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final boolean mo28595b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: c */
    public final long mo28592c() {
        return this.f85985c;
    }

    /* renamed from: a */
    public static tx0 m28946a(long j, MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.f66290f.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += mlltFrame.f66288d + mlltFrame.f66290f[i3];
            j3 += mlltFrame.f66289e + mlltFrame.f66291g[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new tx0(j2, jArr, jArr2);
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final ps1.C31150a mo28594b(long j) {
        long j2 = this.f85985c;
        int i = y32.f88010a;
        Pair<Long, Long> m28945a = m28945a(y32.m27061b(Math.max(0L, Math.min(j, j2))), this.f85984b, this.f85983a);
        rs1 rs1Var = new rs1(y32.m27089a(((Long) m28945a.first).longValue()), ((Long) m28945a.second).longValue());
        return new ps1.C31150a(rs1Var, rs1Var);
    }

    @Override // com.yandex.mobile.ads.impl.ss1
    /* renamed from: a */
    public final long mo28947a(long j) {
        return y32.m27089a(((Long) m28945a(j, this.f85983a, this.f85984b).second).longValue());
    }

    /* renamed from: a */
    private static Pair<Long, Long> m28945a(long j, long[] jArr, long[] jArr2) {
        int m27056b = y32.m27056b(jArr, j, true);
        long j2 = jArr[m27056b];
        long j3 = jArr2[m27056b];
        int i = m27056b + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
