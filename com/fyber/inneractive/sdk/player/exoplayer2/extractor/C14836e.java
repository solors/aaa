package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.e */
/* loaded from: classes4.dex */
public final class C14836e {

    /* renamed from: i */
    public int f28302i;

    /* renamed from: j */
    public int f28303j;

    /* renamed from: k */
    public int f28304k;

    /* renamed from: l */
    public int f28305l;

    /* renamed from: q */
    public C15014o f28310q;

    /* renamed from: r */
    public int f28311r;

    /* renamed from: a */
    public int f28294a = 1000;

    /* renamed from: b */
    public int[] f28295b = new int[1000];

    /* renamed from: c */
    public long[] f28296c = new long[1000];

    /* renamed from: f */
    public long[] f28299f = new long[1000];

    /* renamed from: e */
    public int[] f28298e = new int[1000];

    /* renamed from: d */
    public int[] f28297d = new int[1000];

    /* renamed from: g */
    public byte[][] f28300g = new byte[1000];

    /* renamed from: h */
    public C15014o[] f28301h = new C15014o[1000];

    /* renamed from: m */
    public long f28306m = Long.MIN_VALUE;

    /* renamed from: n */
    public long f28307n = Long.MIN_VALUE;

    /* renamed from: p */
    public boolean f28309p = true;

    /* renamed from: o */
    public boolean f28308o = true;

    /* renamed from: a */
    public final synchronized void m77517a(long j, int i, long j2, int i2, byte[] bArr) {
        if (this.f28308o) {
            if ((i & 1) == 0) {
                return;
            }
            this.f28308o = false;
        }
        if (!this.f28309p) {
            m77516b(j);
            long[] jArr = this.f28299f;
            int i3 = this.f28305l;
            jArr[i3] = j;
            long[] jArr2 = this.f28296c;
            jArr2[i3] = j2;
            this.f28297d[i3] = i2;
            this.f28298e[i3] = i;
            this.f28300g[i3] = bArr;
            this.f28301h[i3] = this.f28310q;
            this.f28295b[i3] = this.f28311r;
            int i4 = this.f28302i + 1;
            this.f28302i = i4;
            int i5 = this.f28294a;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                int[] iArr = new int[i6];
                long[] jArr3 = new long[i6];
                long[] jArr4 = new long[i6];
                int[] iArr2 = new int[i6];
                int[] iArr3 = new int[i6];
                byte[][] bArr2 = new byte[i6];
                C15014o[] c15014oArr = new C15014o[i6];
                int i7 = this.f28304k;
                int i8 = i5 - i7;
                System.arraycopy(jArr2, i7, jArr3, 0, i8);
                System.arraycopy(this.f28299f, this.f28304k, jArr4, 0, i8);
                System.arraycopy(this.f28298e, this.f28304k, iArr2, 0, i8);
                System.arraycopy(this.f28297d, this.f28304k, iArr3, 0, i8);
                System.arraycopy(this.f28300g, this.f28304k, bArr2, 0, i8);
                System.arraycopy(this.f28301h, this.f28304k, c15014oArr, 0, i8);
                System.arraycopy(this.f28295b, this.f28304k, iArr, 0, i8);
                int i9 = this.f28304k;
                System.arraycopy(this.f28296c, 0, jArr3, i8, i9);
                System.arraycopy(this.f28299f, 0, jArr4, i8, i9);
                System.arraycopy(this.f28298e, 0, iArr2, i8, i9);
                System.arraycopy(this.f28297d, 0, iArr3, i8, i9);
                System.arraycopy(this.f28300g, 0, bArr2, i8, i9);
                System.arraycopy(this.f28301h, 0, c15014oArr, i8, i9);
                System.arraycopy(this.f28295b, 0, iArr, i8, i9);
                this.f28296c = jArr3;
                this.f28299f = jArr4;
                this.f28298e = iArr2;
                this.f28297d = iArr3;
                this.f28300g = bArr2;
                this.f28301h = c15014oArr;
                this.f28295b = iArr;
                this.f28304k = 0;
                int i10 = this.f28294a;
                this.f28305l = i10;
                this.f28302i = i10;
                this.f28294a = i6;
            } else {
                int i11 = i3 + 1;
                this.f28305l = i11;
                if (i11 == i5) {
                    this.f28305l = 0;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final synchronized void m77516b(long j) {
        this.f28307n = Math.max(this.f28307n, j);
    }

    /* renamed from: a */
    public final synchronized boolean m77518a(long j) {
        if (this.f28306m >= j) {
            return false;
        }
        int i = this.f28302i;
        while (i > 0 && this.f28299f[((this.f28304k + i) - 1) % this.f28294a] >= j) {
            i--;
        }
        int i2 = this.f28303j;
        int i3 = this.f28302i;
        int i4 = (i2 + i3) - (i + i2);
        if (i4 < 0 || i4 > i3) {
            throw new IllegalArgumentException();
        }
        if (i4 != 0) {
            int i5 = i3 - i4;
            this.f28302i = i5;
            int i6 = this.f28305l;
            int i7 = this.f28294a;
            this.f28305l = ((i6 + i7) - i4) % i7;
            this.f28307n = Long.MIN_VALUE;
            for (int i8 = i5 - 1; i8 >= 0; i8--) {
                int i9 = (this.f28304k + i8) % this.f28294a;
                this.f28307n = Math.max(this.f28307n, this.f28299f[i9]);
                if ((this.f28298e[i9] & 1) != 0) {
                    break;
                }
            }
            long j2 = this.f28296c[this.f28305l];
        } else if (i2 != 0) {
            int i10 = this.f28305l;
            if (i10 == 0) {
                i10 = this.f28294a;
            }
            int i11 = i10 - 1;
            long j3 = this.f28296c[i11];
            int i12 = this.f28297d[i11];
        }
        return true;
    }
}
