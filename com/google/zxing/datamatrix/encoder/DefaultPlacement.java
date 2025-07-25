package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* loaded from: classes5.dex */
public class DefaultPlacement {

    /* renamed from: a */
    private final CharSequence f44432a;

    /* renamed from: b */
    private final int f44433b;

    /* renamed from: c */
    private final int f44434c;

    /* renamed from: d */
    private final byte[] f44435d;

    public DefaultPlacement(CharSequence charSequence, int i, int i2) {
        this.f44432a = charSequence;
        this.f44434c = i;
        this.f44433b = i2;
        byte[] bArr = new byte[i * i2];
        this.f44435d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    private void m65941a(int i) {
        m65936f(this.f44433b - 1, 0, i, 1);
        m65936f(this.f44433b - 1, 1, i, 2);
        m65936f(this.f44433b - 1, 2, i, 3);
        m65936f(0, this.f44434c - 2, i, 4);
        m65936f(0, this.f44434c - 1, i, 5);
        m65936f(1, this.f44434c - 1, i, 6);
        m65936f(2, this.f44434c - 1, i, 7);
        m65936f(3, this.f44434c - 1, i, 8);
    }

    /* renamed from: b */
    private void m65940b(int i) {
        m65936f(this.f44433b - 3, 0, i, 1);
        m65936f(this.f44433b - 2, 0, i, 2);
        m65936f(this.f44433b - 1, 0, i, 3);
        m65936f(0, this.f44434c - 4, i, 4);
        m65936f(0, this.f44434c - 3, i, 5);
        m65936f(0, this.f44434c - 2, i, 6);
        m65936f(0, this.f44434c - 1, i, 7);
        m65936f(1, this.f44434c - 1, i, 8);
    }

    /* renamed from: c */
    private void m65939c(int i) {
        m65936f(this.f44433b - 3, 0, i, 1);
        m65936f(this.f44433b - 2, 0, i, 2);
        m65936f(this.f44433b - 1, 0, i, 3);
        m65936f(0, this.f44434c - 2, i, 4);
        m65936f(0, this.f44434c - 1, i, 5);
        m65936f(1, this.f44434c - 1, i, 6);
        m65936f(2, this.f44434c - 1, i, 7);
        m65936f(3, this.f44434c - 1, i, 8);
    }

    /* renamed from: d */
    private void m65938d(int i) {
        m65936f(this.f44433b - 1, 0, i, 1);
        m65936f(this.f44433b - 1, this.f44434c - 1, i, 2);
        m65936f(0, this.f44434c - 3, i, 3);
        m65936f(0, this.f44434c - 2, i, 4);
        m65936f(0, this.f44434c - 1, i, 5);
        m65936f(1, this.f44434c - 3, i, 6);
        m65936f(1, this.f44434c - 2, i, 7);
        m65936f(1, this.f44434c - 1, i, 8);
    }

    /* renamed from: e */
    private boolean m65937e(int i, int i2) {
        if (this.f44435d[(i2 * this.f44434c) + i] >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m65936f(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f44433b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f44434c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.f44432a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        m65935g(i2, i, z);
    }

    /* renamed from: g */
    private void m65935g(int i, int i2, boolean z) {
        this.f44435d[(i2 * this.f44434c) + i] = z ? (byte) 1 : (byte) 0;
    }

    /* renamed from: h */
    private void m65934h(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m65936f(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m65936f(i4, i6, i3, 2);
        int i7 = i - 1;
        m65936f(i7, i5, i3, 3);
        m65936f(i7, i6, i3, 4);
        m65936f(i7, i2, i3, 5);
        m65936f(i, i5, i3, 6);
        m65936f(i, i6, i3, 7);
        m65936f(i, i2, i3, 8);
    }

    public final boolean getBit(int i, int i2) {
        if (this.f44435d[(i2 * this.f44434c) + i] == 1) {
            return true;
        }
        return false;
    }

    public final void place() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f44433b && i3 == 0) {
                m65941a(i4);
                i4++;
            }
            if (i5 == this.f44433b - 2 && i3 == 0 && this.f44434c % 4 != 0) {
                m65940b(i4);
                i4++;
            }
            if (i5 == this.f44433b - 2 && i3 == 0 && this.f44434c % 8 == 4) {
                m65939c(i4);
                i4++;
            }
            if (i5 == this.f44433b + 4 && i3 == 2 && this.f44434c % 8 == 0) {
                m65938d(i4);
                i4++;
            }
            do {
                if (i5 < this.f44433b && i3 >= 0 && !m65937e(i3, i5)) {
                    m65934h(i5, i3, i4);
                    i4++;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0) {
                    break;
                }
            } while (i3 < this.f44434c);
            int i6 = i5 + 1;
            int i7 = i3 + 3;
            do {
                if (i6 >= 0 && i7 < this.f44434c && !m65937e(i7, i6)) {
                    m65934h(i6, i7, i4);
                    i4++;
                }
                i6 += 2;
                i7 -= 2;
                i = this.f44433b;
                if (i6 >= i) {
                    break;
                }
            } while (i7 >= 0);
            i5 = i6 + 3;
            i3 = i7 + 1;
            if (i5 >= i && i3 >= (i2 = this.f44434c)) {
                break;
            }
        }
        if (!m65937e(i2 - 1, i - 1)) {
            m65935g(this.f44434c - 1, this.f44433b - 1, true);
            m65935g(this.f44434c - 2, this.f44433b - 2, true);
        }
    }
}
