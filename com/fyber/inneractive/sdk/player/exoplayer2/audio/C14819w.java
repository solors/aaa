package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.w */
/* loaded from: classes4.dex */
public final class C14819w {

    /* renamed from: a */
    public final int f28212a;

    /* renamed from: b */
    public final int f28213b;

    /* renamed from: c */
    public final int f28214c;

    /* renamed from: d */
    public final int f28215d;

    /* renamed from: e */
    public final int f28216e;

    /* renamed from: f */
    public final short[] f28217f;

    /* renamed from: g */
    public int f28218g;

    /* renamed from: h */
    public short[] f28219h;

    /* renamed from: i */
    public int f28220i;

    /* renamed from: j */
    public short[] f28221j;

    /* renamed from: k */
    public int f28222k;

    /* renamed from: l */
    public short[] f28223l;

    /* renamed from: q */
    public int f28228q;

    /* renamed from: r */
    public int f28229r;

    /* renamed from: s */
    public int f28230s;

    /* renamed from: t */
    public int f28231t;

    /* renamed from: v */
    public int f28233v;

    /* renamed from: w */
    public int f28234w;

    /* renamed from: x */
    public int f28235x;

    /* renamed from: m */
    public int f28224m = 0;

    /* renamed from: n */
    public int f28225n = 0;

    /* renamed from: u */
    public int f28232u = 0;

    /* renamed from: o */
    public float f28226o = 1.0f;

    /* renamed from: p */
    public float f28227p = 1.0f;

    public C14819w(int i, int i2) {
        this.f28212a = i;
        this.f28213b = i2;
        this.f28214c = i / 400;
        int i3 = i / 65;
        this.f28215d = i3;
        int i4 = i3 * 2;
        this.f28216e = i4;
        this.f28217f = new short[i4];
        this.f28218g = i4;
        int i5 = i2 * i4;
        this.f28219h = new short[i5];
        this.f28220i = i4;
        this.f28221j = new short[i5];
        this.f28222k = i4;
        this.f28223l = new short[i5];
    }

    /* renamed from: a */
    public final void m77544a(int i) {
        int i2 = this.f28228q + i;
        int i3 = this.f28218g;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.f28218g = i4;
            this.f28219h = Arrays.copyOf(this.f28219h, i4 * this.f28213b);
        }
    }

    /* renamed from: b */
    public final void m77540b(int i) {
        int i2 = this.f28229r + i;
        int i3 = this.f28220i;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.f28220i = i4;
            this.f28221j = Arrays.copyOf(this.f28221j, i4 * this.f28213b);
        }
    }

    /* renamed from: a */
    public final void m77542a(short[] sArr, int i, int i2) {
        int i3 = this.f28216e / i2;
        int i4 = this.f28213b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f28217f[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: a */
    public final int m77541a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f28213b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f28234w = i6 / i7;
        this.f28235x = i8 / i5;
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024b A[LOOP:4: B:12:0x0045->B:101:0x024b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0172 A[EDGE_INSN: B:111:0x0172->B:64:0x0172 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m77545a() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C14819w.m77545a():void");
    }

    /* renamed from: a */
    public static void m77543a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
