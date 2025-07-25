package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class Sonic {

    /* renamed from: a */
    private final int f32575a;

    /* renamed from: b */
    private final int f32576b;

    /* renamed from: c */
    private final float f32577c;

    /* renamed from: d */
    private final float f32578d;

    /* renamed from: e */
    private final float f32579e;

    /* renamed from: f */
    private final int f32580f;

    /* renamed from: g */
    private final int f32581g;

    /* renamed from: h */
    private final int f32582h;

    /* renamed from: i */
    private final short[] f32583i;

    /* renamed from: j */
    private short[] f32584j;

    /* renamed from: k */
    private int f32585k;

    /* renamed from: l */
    private short[] f32586l;

    /* renamed from: m */
    private int f32587m;

    /* renamed from: n */
    private short[] f32588n;

    /* renamed from: o */
    private int f32589o;

    /* renamed from: p */
    private int f32590p;

    /* renamed from: q */
    private int f32591q;

    /* renamed from: r */
    private int f32592r;

    /* renamed from: s */
    private int f32593s;

    /* renamed from: t */
    private int f32594t;

    /* renamed from: u */
    private int f32595u;

    /* renamed from: v */
    private int f32596v;

    public Sonic(int i, int i2, float f, float f2, int i3) {
        this.f32575a = i;
        this.f32576b = i2;
        this.f32577c = f;
        this.f32578d = f2;
        this.f32579e = i / i3;
        this.f32580f = i / 400;
        int i4 = i / 65;
        this.f32581g = i4;
        int i5 = i4 * 2;
        this.f32582h = i5;
        this.f32583i = new short[i5];
        this.f32584j = new short[i5 * i2];
        this.f32586l = new short[i5 * i2];
        this.f32588n = new short[i5 * i2];
    }

    /* renamed from: a */
    private void m74920a(float f, int i) {
        int i2;
        int i3;
        if (this.f32587m == i) {
            return;
        }
        int i4 = this.f32575a;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        m74910k(i);
        int i6 = 0;
        while (true) {
            int i7 = this.f32589o;
            boolean z = true;
            if (i6 < i7 - 1) {
                while (true) {
                    i2 = this.f32590p;
                    int i8 = (i2 + 1) * i5;
                    i3 = this.f32591q;
                    if (i8 <= i3 * i4) {
                        break;
                    }
                    this.f32586l = m74915f(this.f32586l, this.f32587m, 1);
                    int i9 = 0;
                    while (true) {
                        int i10 = this.f32576b;
                        if (i9 < i10) {
                            this.f32586l[(this.f32587m * i10) + i9] = m74911j(this.f32588n, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                    }
                    this.f32591q++;
                    this.f32587m++;
                }
                int i11 = i2 + 1;
                this.f32590p = i11;
                if (i11 == i4) {
                    this.f32590p = 0;
                    if (i3 != i5) {
                        z = false;
                    }
                    Assertions.checkState(z);
                    this.f32591q = 0;
                }
                i6++;
            } else {
                m74906o(i7 - 1);
                return;
            }
        }
    }

    /* renamed from: b */
    private void m74919b(float f) {
        int m74912i;
        int i = this.f32585k;
        if (i < this.f32582h) {
            return;
        }
        int i2 = 0;
        do {
            if (this.f32592r > 0) {
                m74912i = m74918c(i2);
            } else {
                int m74914g = m74914g(this.f32584j, i2);
                if (f > 1.0d) {
                    m74912i = m74914g + m74904q(this.f32584j, i2, f, m74914g);
                } else {
                    m74912i = m74912i(this.f32584j, i2, f, m74914g);
                }
            }
            i2 += m74912i;
        } while (this.f32582h + i2 <= i);
        m74905p(i2);
    }

    /* renamed from: c */
    private int m74918c(int i) {
        int min = Math.min(this.f32582h, this.f32592r);
        m74917d(this.f32584j, i, min);
        this.f32592r -= min;
        return min;
    }

    /* renamed from: d */
    private void m74917d(short[] sArr, int i, int i2) {
        short[] m74915f = m74915f(this.f32586l, this.f32587m, i2);
        this.f32586l = m74915f;
        int i3 = this.f32576b;
        System.arraycopy(sArr, i * i3, m74915f, this.f32587m * i3, i3 * i2);
        this.f32587m += i2;
    }

    /* renamed from: e */
    private void m74916e(short[] sArr, int i, int i2) {
        int i3 = this.f32582h / i2;
        int i4 = this.f32576b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f32583i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: f */
    private short[] m74915f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f32576b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: g */
    private int m74914g(short[] sArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = this.f32575a;
        if (i5 > 4000) {
            i2 = i5 / 4000;
        } else {
            i2 = 1;
        }
        if (this.f32576b == 1 && i2 == 1) {
            i3 = m74913h(sArr, i, this.f32580f, this.f32581g);
        } else {
            m74916e(sArr, i, i2);
            int m74913h = m74913h(this.f32583i, 0, this.f32580f / i2, this.f32581g / i2);
            if (i2 != 1) {
                int i6 = m74913h * i2;
                int i7 = i2 * 4;
                int i8 = i6 - i7;
                int i9 = i6 + i7;
                int i10 = this.f32580f;
                if (i8 < i10) {
                    i8 = i10;
                }
                int i11 = this.f32581g;
                if (i9 > i11) {
                    i9 = i11;
                }
                if (this.f32576b == 1) {
                    i3 = m74913h(sArr, i, i8, i9);
                } else {
                    m74916e(sArr, i, 1);
                    i3 = m74913h(this.f32583i, 0, i8, i9);
                }
            } else {
                i3 = m74913h;
            }
        }
        if (m74908m(this.f32595u, this.f32596v)) {
            i4 = this.f32593s;
        } else {
            i4 = i3;
        }
        this.f32594t = this.f32595u;
        this.f32593s = i3;
        return i4;
    }

    /* renamed from: h */
    private int m74913h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f32576b;
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
        this.f32595u = i6 / i7;
        this.f32596v = i8 / i5;
        return i7;
    }

    /* renamed from: i */
    private int m74912i(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f32592r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] m74915f = m74915f(this.f32586l, this.f32587m, i4);
        this.f32586l = m74915f;
        int i5 = this.f32576b;
        System.arraycopy(sArr, i * i5, m74915f, this.f32587m * i5, i5 * i2);
        m74909l(i3, this.f32576b, this.f32586l, this.f32587m + i2, sArr, i + i2, sArr, i);
        this.f32587m += i4;
        return i3;
    }

    /* renamed from: j */
    private short m74911j(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f32576b];
        int i4 = this.f32591q * i2;
        int i5 = this.f32590p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: k */
    private void m74910k(int i) {
        int i2 = this.f32587m - i;
        short[] m74915f = m74915f(this.f32588n, this.f32589o, i2);
        this.f32588n = m74915f;
        short[] sArr = this.f32586l;
        int i3 = this.f32576b;
        System.arraycopy(sArr, i * i3, m74915f, this.f32589o * i3, i3 * i2);
        this.f32587m = i;
        this.f32589o += i2;
    }

    /* renamed from: l */
    private static void m74909l(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: m */
    private boolean m74908m(int i, int i2) {
        if (i == 0 || this.f32593s == 0 || i2 > i * 3 || i * 2 <= this.f32594t * 3) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private void m74907n() {
        int i = this.f32587m;
        float f = this.f32577c;
        float f2 = this.f32578d;
        float f3 = f / f2;
        float f4 = this.f32579e * f2;
        double d = f3;
        if (d <= 1.00001d && d >= 0.99999d) {
            m74917d(this.f32584j, 0, this.f32585k);
            this.f32585k = 0;
        } else {
            m74919b(f3);
        }
        if (f4 != 1.0f) {
            m74920a(f4, i);
        }
    }

    /* renamed from: o */
    private void m74906o(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f32588n;
        int i2 = this.f32576b;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.f32589o - i) * i2);
        this.f32589o -= i;
    }

    /* renamed from: p */
    private void m74905p(int i) {
        int i2 = this.f32585k - i;
        short[] sArr = this.f32584j;
        int i3 = this.f32576b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f32585k = i2;
    }

    /* renamed from: q */
    private int m74904q(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f32592r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] m74915f = m74915f(this.f32586l, this.f32587m, i3);
        this.f32586l = m74915f;
        m74909l(i3, this.f32576b, m74915f, this.f32587m, sArr, i, sArr, i + i2);
        this.f32587m += i3;
        return i3;
    }

    public void flush() {
        this.f32585k = 0;
        this.f32587m = 0;
        this.f32589o = 0;
        this.f32590p = 0;
        this.f32591q = 0;
        this.f32592r = 0;
        this.f32593s = 0;
        this.f32594t = 0;
        this.f32595u = 0;
        this.f32596v = 0;
    }

    public void getOutput(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f32576b, this.f32587m);
        shortBuffer.put(this.f32586l, 0, this.f32576b * min);
        int i = this.f32587m - min;
        this.f32587m = i;
        short[] sArr = this.f32586l;
        int i2 = this.f32576b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public int getOutputSize() {
        return this.f32587m * this.f32576b * 2;
    }

    public int getPendingInputBytes() {
        return this.f32585k * this.f32576b * 2;
    }

    public void queueEndOfStream() {
        int i;
        int i2 = this.f32585k;
        float f = this.f32577c;
        float f2 = this.f32578d;
        int i3 = this.f32587m + ((int) ((((i2 / (f / f2)) + this.f32589o) / (this.f32579e * f2)) + 0.5f));
        this.f32584j = m74915f(this.f32584j, i2, (this.f32582h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f32582h;
            int i5 = this.f32576b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f32584j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f32585k += i * 2;
        m74907n();
        if (this.f32587m > i3) {
            this.f32587m = i3;
        }
        this.f32585k = 0;
        this.f32592r = 0;
        this.f32589o = 0;
    }

    public void queueInput(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f32576b;
        int i2 = remaining / i;
        short[] m74915f = m74915f(this.f32584j, this.f32585k, i2);
        this.f32584j = m74915f;
        shortBuffer.get(m74915f, this.f32585k * this.f32576b, ((i * i2) * 2) / 2);
        this.f32585k += i2;
        m74907n();
    }
}
