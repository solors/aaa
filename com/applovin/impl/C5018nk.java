package com.applovin.impl;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.applovin.impl.nk */
/* loaded from: classes2.dex */
final class C5018nk {

    /* renamed from: a */
    private final int f8604a;

    /* renamed from: b */
    private final int f8605b;

    /* renamed from: c */
    private final float f8606c;

    /* renamed from: d */
    private final float f8607d;

    /* renamed from: e */
    private final float f8608e;

    /* renamed from: f */
    private final int f8609f;

    /* renamed from: g */
    private final int f8610g;

    /* renamed from: h */
    private final int f8611h;

    /* renamed from: i */
    private final short[] f8612i;

    /* renamed from: j */
    private short[] f8613j;

    /* renamed from: k */
    private int f8614k;

    /* renamed from: l */
    private short[] f8615l;

    /* renamed from: m */
    private int f8616m;

    /* renamed from: n */
    private short[] f8617n;

    /* renamed from: o */
    private int f8618o;

    /* renamed from: p */
    private int f8619p;

    /* renamed from: q */
    private int f8620q;

    /* renamed from: r */
    private int f8621r;

    /* renamed from: s */
    private int f8622s;

    /* renamed from: t */
    private int f8623t;

    /* renamed from: u */
    private int f8624u;

    /* renamed from: v */
    private int f8625v;

    public C5018nk(int i, int i2, float f, float f2, int i3) {
        this.f8604a = i;
        this.f8605b = i2;
        this.f8606c = f;
        this.f8607d = f2;
        this.f8608e = i / i3;
        this.f8609f = i / 400;
        int i4 = i / 65;
        this.f8610g = i4;
        int i5 = i4 * 2;
        this.f8611h = i5;
        this.f8612i = new short[i5];
        int i6 = i5 * i2;
        this.f8613j = new short[i6];
        this.f8615l = new short[i6];
        this.f8617n = new short[i6];
    }

    /* renamed from: a */
    private void m96950a(float f, int i) {
        int i2;
        int i3;
        if (this.f8616m == i) {
            return;
        }
        int i4 = this.f8604a;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        m96940b(i);
        int i6 = 0;
        while (true) {
            int i7 = this.f8618o - 1;
            if (i6 < i7) {
                while (true) {
                    i2 = this.f8619p + 1;
                    int i8 = i2 * i5;
                    i3 = this.f8620q;
                    if (i8 <= i3 * i4) {
                        break;
                    }
                    this.f8615l = m96933c(this.f8615l, this.f8616m, 1);
                    int i9 = 0;
                    while (true) {
                        int i10 = this.f8605b;
                        if (i9 < i10) {
                            this.f8615l[(this.f8616m * i10) + i9] = m96936b(this.f8617n, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                    }
                    this.f8620q++;
                    this.f8616m++;
                }
                this.f8619p = i2;
                if (i2 == i4) {
                    this.f8619p = 0;
                    AbstractC4100b1.m100577b(i3 == i5);
                    this.f8620q = 0;
                }
                i6++;
            } else {
                m96934c(i7);
                return;
            }
        }
    }

    /* renamed from: b */
    private void m96937b(short[] sArr, int i, int i2) {
        int i3 = this.f8611h / i2;
        int i4 = this.f8605b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f8612i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: c */
    private short[] m96933c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f8605b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: d */
    private void m96932d() {
        int i = this.f8616m;
        float f = this.f8606c;
        float f2 = this.f8607d;
        float f3 = f / f2;
        float f4 = this.f8608e * f2;
        double d = f3;
        if (d <= 1.00001d && d >= 0.99999d) {
            m96943a(this.f8613j, 0, this.f8614k);
            this.f8614k = 0;
        } else {
            m96951a(f3);
        }
        if (f4 != 1.0f) {
            m96950a(f4, i);
        }
    }

    /* renamed from: e */
    public void m96930e() {
        int i;
        int i2 = this.f8614k;
        float f = this.f8606c;
        float f2 = this.f8607d;
        int i3 = this.f8616m + ((int) ((((i2 / (f / f2)) + this.f8618o) / (this.f8608e * f2)) + 0.5f));
        this.f8613j = m96933c(this.f8613j, i2, (this.f8611h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f8611h * 2;
            int i5 = this.f8605b;
            if (i4 >= i * i5) {
                break;
            }
            this.f8613j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f8614k += i;
        m96932d();
        if (this.f8616m > i3) {
            this.f8616m = i3;
        }
        this.f8614k = 0;
        this.f8621r = 0;
        this.f8618o = 0;
    }

    /* renamed from: c */
    public int m96935c() {
        return this.f8614k * this.f8605b * 2;
    }

    /* renamed from: c */
    private void m96934c(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f8617n;
        int i2 = this.f8605b;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.f8618o - i) * i2);
        this.f8618o -= i;
    }

    /* renamed from: b */
    public int m96941b() {
        return this.f8616m * this.f8605b * 2;
    }

    /* renamed from: b */
    private short m96936b(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f8605b];
        int i4 = this.f8620q * i2;
        int i5 = this.f8619p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: d */
    private void m96931d(int i) {
        int i2 = this.f8614k - i;
        short[] sArr = this.f8613j;
        int i3 = this.f8605b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f8614k = i2;
    }

    /* renamed from: b */
    private void m96940b(int i) {
        int i2 = this.f8616m - i;
        short[] m96933c = m96933c(this.f8617n, this.f8618o, i2);
        this.f8617n = m96933c;
        short[] sArr = this.f8615l;
        int i3 = this.f8605b;
        System.arraycopy(sArr, i * i3, m96933c, this.f8618o * i3, i3 * i2);
        this.f8616m = i;
        this.f8618o += i2;
    }

    /* renamed from: b */
    public void m96939b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f8605b;
        int i2 = remaining / i;
        short[] m96933c = m96933c(this.f8613j, this.f8614k, i2);
        this.f8613j = m96933c;
        shortBuffer.get(m96933c, this.f8614k * this.f8605b, ((i * i2) * 2) / 2);
        this.f8614k += i2;
        m96932d();
    }

    /* renamed from: a */
    private void m96951a(float f) {
        int m96944a;
        int i = this.f8614k;
        if (i < this.f8611h) {
            return;
        }
        int i2 = 0;
        do {
            if (this.f8621r > 0) {
                m96944a = m96949a(i2);
            } else {
                int m96945a = m96945a(this.f8613j, i2);
                if (f > 1.0d) {
                    m96944a = m96945a + m96938b(this.f8613j, i2, f, m96945a);
                } else {
                    m96944a = m96944a(this.f8613j, i2, f, m96945a);
                }
            }
            i2 += m96944a;
        } while (this.f8611h + i2 <= i);
        m96931d(i2);
    }

    /* renamed from: b */
    private int m96938b(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f8621r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] m96933c = m96933c(this.f8615l, this.f8616m, i3);
        this.f8615l = m96933c;
        m96947a(i3, this.f8605b, m96933c, this.f8616m, sArr, i, sArr, i + i2);
        this.f8616m += i3;
        return i3;
    }

    /* renamed from: a */
    private int m96949a(int i) {
        int min = Math.min(this.f8611h, this.f8621r);
        m96943a(this.f8613j, i, min);
        this.f8621r -= min;
        return min;
    }

    /* renamed from: a */
    private void m96943a(short[] sArr, int i, int i2) {
        short[] m96933c = m96933c(this.f8615l, this.f8616m, i2);
        this.f8615l = m96933c;
        int i3 = this.f8605b;
        System.arraycopy(sArr, i * i3, m96933c, this.f8616m * i3, i3 * i2);
        this.f8616m += i2;
    }

    /* renamed from: a */
    private int m96945a(short[] sArr, int i) {
        int i2;
        int i3 = this.f8604a;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.f8605b == 1 && i4 == 1) {
            i2 = m96942a(sArr, i, this.f8609f, this.f8610g);
        } else {
            m96937b(sArr, i, i4);
            int m96942a = m96942a(this.f8612i, 0, this.f8609f / i4, this.f8610g / i4);
            if (i4 != 1) {
                int i5 = m96942a * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f8609f;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.f8610g;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.f8605b == 1) {
                    i2 = m96942a(sArr, i, i7, i8);
                } else {
                    m96937b(sArr, i, 1);
                    i2 = m96942a(this.f8612i, 0, i7, i8);
                }
            } else {
                i2 = m96942a;
            }
        }
        int i11 = m96948a(this.f8624u, this.f8625v) ? this.f8622s : i2;
        this.f8623t = this.f8624u;
        this.f8622s = i2;
        return i11;
    }

    /* renamed from: a */
    private int m96942a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f8605b;
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
        this.f8624u = i6 / i7;
        this.f8625v = i8 / i5;
        return i7;
    }

    /* renamed from: a */
    public void m96952a() {
        this.f8614k = 0;
        this.f8616m = 0;
        this.f8618o = 0;
        this.f8619p = 0;
        this.f8620q = 0;
        this.f8621r = 0;
        this.f8622s = 0;
        this.f8623t = 0;
        this.f8624u = 0;
        this.f8625v = 0;
    }

    /* renamed from: a */
    public void m96946a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f8605b, this.f8616m);
        shortBuffer.put(this.f8615l, 0, this.f8605b * min);
        int i = this.f8616m - min;
        this.f8616m = i;
        short[] sArr = this.f8615l;
        int i2 = this.f8605b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: a */
    private int m96944a(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f8621r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] m96933c = m96933c(this.f8615l, this.f8616m, i4);
        this.f8615l = m96933c;
        int i5 = this.f8605b;
        System.arraycopy(sArr, i * i5, m96933c, this.f8616m * i5, i5 * i2);
        m96947a(i3, this.f8605b, this.f8615l, this.f8616m + i2, sArr, i + i2, sArr, i);
        this.f8616m += i4;
        return i3;
    }

    /* renamed from: a */
    private static void m96947a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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

    /* renamed from: a */
    private boolean m96948a(int i, int i2) {
        return i != 0 && this.f8622s != 0 && i2 <= i * 3 && i * 2 > this.f8623t * 3;
    }
}
