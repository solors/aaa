package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ps1;
import com.yandex.mobile.ads.impl.yy0;

/* loaded from: classes8.dex */
final class i52 implements ss1 {

    /* renamed from: a */
    private final long[] f80324a;

    /* renamed from: b */
    private final long[] f80325b;

    /* renamed from: c */
    private final long f80326c;

    /* renamed from: d */
    private final long f80327d;

    private i52(long[] jArr, long[] jArr2, long j, long j2) {
        this.f80324a = jArr;
        this.f80325b = jArr2;
        this.f80326c = j;
        this.f80327d = j2;
    }

    @Nullable
    /* renamed from: a */
    public static i52 m33361a(long j, long j2, yy0.C31938a c31938a, cc1 cc1Var) {
        int m35270t;
        cc1Var.m35284f(10);
        int m35282h = cc1Var.m35282h();
        if (m35282h <= 0) {
            return null;
        }
        int i = c31938a.f88621d;
        long m27088a = y32.m27088a(m35282h, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int m35264z = cc1Var.m35264z();
        int m35264z2 = cc1Var.m35264z();
        int m35264z3 = cc1Var.m35264z();
        cc1Var.m35284f(2);
        long j3 = j2 + c31938a.f88620c;
        long[] jArr = new long[m35264z];
        long[] jArr2 = new long[m35264z];
        int i2 = 0;
        long j4 = j2;
        while (i2 < m35264z) {
            int i3 = m35264z2;
            long j5 = j3;
            jArr[i2] = (i2 * m27088a) / m35264z;
            jArr2[i2] = Math.max(j4, j5);
            if (m35264z3 == 1) {
                m35270t = cc1Var.m35270t();
            } else if (m35264z3 == 2) {
                m35270t = cc1Var.m35264z();
            } else if (m35264z3 == 3) {
                m35270t = cc1Var.m35267w();
            } else if (m35264z3 != 4) {
                return null;
            } else {
                m35270t = cc1Var.m35266x();
            }
            j4 += m35270t * i3;
            i2++;
            jArr = jArr;
            m35264z2 = i3;
            j3 = j5;
        }
        long[] jArr3 = jArr;
        if (j != -1 && j != j4) {
            gq0.m33792d("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new i52(jArr3, jArr2, m27088a, j4);
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final boolean mo28595b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: c */
    public final long mo28592c() {
        return this.f80326c;
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final ps1.C31150a mo28594b(long j) {
        int m27056b = y32.m27056b(this.f80324a, j, true);
        long[] jArr = this.f80324a;
        long j2 = jArr[m27056b];
        long[] jArr2 = this.f80325b;
        rs1 rs1Var = new rs1(j2, jArr2[m27056b]);
        if (j2 < j && m27056b != jArr.length - 1) {
            int i = m27056b + 1;
            return new ps1.C31150a(rs1Var, new rs1(jArr[i], jArr2[i]));
        }
        return new ps1.C31150a(rs1Var, rs1Var);
    }

    @Override // com.yandex.mobile.ads.impl.ss1
    /* renamed from: a */
    public final long mo28948a() {
        return this.f80327d;
    }

    @Override // com.yandex.mobile.ads.impl.ss1
    /* renamed from: a */
    public final long mo28947a(long j) {
        return this.f80324a[y32.m27056b(this.f80325b, j, true)];
    }
}
