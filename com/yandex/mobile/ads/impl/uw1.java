package com.yandex.mobile.ads.impl;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes8.dex */
final class uw1 {

    /* renamed from: a */
    private final int f86424a;

    /* renamed from: b */
    private final int f86425b;

    /* renamed from: c */
    private final float f86426c;

    /* renamed from: d */
    private final float f86427d;

    /* renamed from: e */
    private final float f86428e;

    /* renamed from: f */
    private final int f86429f;

    /* renamed from: g */
    private final int f86430g;

    /* renamed from: h */
    private final int f86431h;

    /* renamed from: i */
    private final short[] f86432i;

    /* renamed from: j */
    private short[] f86433j;

    /* renamed from: k */
    private int f86434k;

    /* renamed from: l */
    private short[] f86435l;

    /* renamed from: m */
    private int f86436m;

    /* renamed from: n */
    private short[] f86437n;

    /* renamed from: o */
    private int f86438o;

    /* renamed from: p */
    private int f86439p;

    /* renamed from: q */
    private int f86440q;

    /* renamed from: r */
    private int f86441r;

    /* renamed from: s */
    private int f86442s;

    /* renamed from: t */
    private int f86443t;

    /* renamed from: u */
    private int f86444u;

    /* renamed from: v */
    private int f86445v;

    public uw1(int i, int i2, float f, float f2, int i3) {
        this.f86424a = i;
        this.f86425b = i2;
        this.f86426c = f;
        this.f86427d = f2;
        this.f86428e = i / i3;
        this.f86429f = i / 400;
        int i4 = i / 65;
        this.f86430g = i4;
        int i5 = i4 * 2;
        this.f86431h = i5;
        this.f86432i = new short[i5];
        int i6 = i5 * i2;
        this.f86433j = new short[i6];
        this.f86435l = new short[i6];
        this.f86437n = new short[i6];
    }

    /* renamed from: a */
    private void m28612a(short[] sArr, int i, int i2) {
        int i3 = this.f86431h / i2;
        int i4 = this.f86425b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f86432i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: b */
    private short[] m28608b(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f86425b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x018e A[EDGE_INSN: B:108:0x018e->B:64:0x018e ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025e A[LOOP:4: B:12:0x004a->B:98:0x025e, LOOP_END] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m28606d() {
        /*
            Method dump skipped, instructions count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.uw1.m28606d():void");
    }

    /* renamed from: c */
    public final int m28607c() {
        return this.f86434k * this.f86425b * 2;
    }

    /* renamed from: e */
    public final void m28605e() {
        int i;
        int i2 = this.f86434k;
        float f = this.f86426c;
        float f2 = this.f86427d;
        int i3 = this.f86436m + ((int) ((((i2 / (f / f2)) + this.f86438o) / (this.f86428e * f2)) + 0.5f));
        this.f86433j = m28608b(this.f86433j, i2, (this.f86431h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f86431h * 2;
            int i5 = this.f86425b;
            if (i4 >= i * i5) {
                break;
            }
            this.f86433j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f86434k = i + this.f86434k;
        m28606d();
        if (this.f86436m > i3) {
            this.f86436m = i3;
        }
        this.f86434k = 0;
        this.f86441r = 0;
        this.f86438o = 0;
    }

    /* renamed from: b */
    public final int m28610b() {
        return this.f86436m * this.f86425b * 2;
    }

    /* renamed from: b */
    public final void m28609b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f86425b;
        int i2 = remaining / i;
        short[] m28608b = m28608b(this.f86433j, this.f86434k, i2);
        this.f86433j = m28608b;
        shortBuffer.get(m28608b, this.f86434k * this.f86425b, ((i * i2) * 2) / 2);
        this.f86434k += i2;
        m28606d();
    }

    /* renamed from: a */
    private int m28611a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f86425b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
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
        this.f86444u = i6 / i7;
        this.f86445v = i8 / i5;
        return i7;
    }

    /* renamed from: a */
    public final void m28615a() {
        this.f86434k = 0;
        this.f86436m = 0;
        this.f86438o = 0;
        this.f86439p = 0;
        this.f86440q = 0;
        this.f86441r = 0;
        this.f86442s = 0;
        this.f86443t = 0;
        this.f86444u = 0;
        this.f86445v = 0;
    }

    /* renamed from: a */
    public final void m28613a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f86425b, this.f86436m);
        shortBuffer.put(this.f86435l, 0, this.f86425b * min);
        int i = this.f86436m - min;
        this.f86436m = i;
        short[] sArr = this.f86435l;
        int i2 = this.f86425b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: a */
    private static void m28614a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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
