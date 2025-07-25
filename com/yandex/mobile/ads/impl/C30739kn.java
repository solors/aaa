package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ps1;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.yandex.mobile.ads.impl.kn */
/* loaded from: classes8.dex */
public final class C30739kn {

    /* renamed from: a */
    protected final x02 f81491a;

    /* renamed from: b */
    private final int f81492b;

    /* renamed from: c */
    private final int f81493c;

    /* renamed from: d */
    private final long f81494d;

    /* renamed from: e */
    private final int f81495e;

    /* renamed from: f */
    private int f81496f;

    /* renamed from: g */
    private int f81497g;

    /* renamed from: h */
    private int f81498h;

    /* renamed from: i */
    private int f81499i;

    /* renamed from: j */
    private int f81500j;

    /* renamed from: k */
    private long[] f81501k;

    /* renamed from: l */
    private int[] f81502l;

    public C30739kn(int i, int i2, long j, int i3, x02 x02Var) {
        int i4;
        int i5;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        C30937nf.m31567a(z);
        this.f81494d = j;
        this.f81495e = i3;
        this.f81491a = x02Var;
        if (i2 == 2) {
            i4 = 1667497984;
        } else {
            i4 = 1651965952;
        }
        this.f81492b = m32482a(i, i4);
        if (i2 == 2) {
            i5 = m32482a(i, 1650720768);
        } else {
            i5 = -1;
        }
        this.f81493c = i5;
        this.f81501k = new long[512];
        this.f81502l = new int[512];
    }

    /* renamed from: a */
    public final void m32481a(long j) {
        if (this.f81500j == this.f81502l.length) {
            long[] jArr = this.f81501k;
            this.f81501k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f81502l;
            this.f81502l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f81501k;
        int i = this.f81500j;
        jArr2[i] = j;
        this.f81502l[i] = this.f81499i;
        this.f81500j = i + 1;
    }

    /* renamed from: b */
    public final ps1.C31150a m32477b(long j) {
        int[] iArr;
        long j2 = 1;
        int i = (int) (j / ((this.f81494d * j2) / this.f81495e));
        int m27069a = y32.m27069a(this.f81502l, i, true, true);
        int i2 = this.f81502l[m27069a];
        if (i2 == i) {
            rs1 rs1Var = new rs1(((this.f81494d * j2) / this.f81495e) * i2, this.f81501k[m27069a]);
            return new ps1.C31150a(rs1Var, rs1Var);
        }
        long j3 = i2;
        long j4 = (this.f81494d * j2) / this.f81495e;
        long[] jArr = this.f81501k;
        rs1 rs1Var2 = new rs1(j3 * j4, jArr[m27069a]);
        int i3 = m27069a + 1;
        if (i3 < jArr.length) {
            return new ps1.C31150a(rs1Var2, new rs1(j4 * iArr[i3], jArr[i3]));
        }
        return new ps1.C31150a(rs1Var2, rs1Var2);
    }

    /* renamed from: c */
    public final void m32476c(long j) {
        if (this.f81500j == 0) {
            this.f81498h = 0;
            return;
        }
        this.f81498h = this.f81502l[y32.m27056b(this.f81501k, j, true)];
    }

    /* renamed from: a */
    public final void m32484a() {
        this.f81501k = Arrays.copyOf(this.f81501k, this.f81500j);
        this.f81502l = Arrays.copyOf(this.f81502l, this.f81500j);
    }

    /* renamed from: a */
    private static int m32482a(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    /* renamed from: a */
    public final boolean m32483a(int i) {
        return this.f81492b == i || this.f81493c == i;
    }

    /* renamed from: a */
    public final boolean m32480a(C30513hy c30513hy) throws IOException {
        int i = this.f81497g;
        int m27708b = i - this.f81491a.m27708b(c30513hy, i, false);
        this.f81497g = m27708b;
        boolean z = m27708b == 0;
        if (z) {
            if (this.f81496f > 0) {
                x02 x02Var = this.f81491a;
                int i2 = this.f81498h;
                x02Var.mo26069a((this.f81494d * i2) / this.f81495e, Arrays.binarySearch(this.f81502l, i2) >= 0 ? 1 : 0, this.f81496f, 0, null);
            }
            this.f81498h++;
        }
        return z;
    }

    /* renamed from: b */
    public final void m32479b() {
        this.f81499i++;
    }

    /* renamed from: b */
    public final void m32478b(int i) {
        this.f81496f = i;
        this.f81497g = i;
    }
}
