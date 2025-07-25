package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class dc1 {

    /* renamed from: a */
    private byte[] f78039a;

    /* renamed from: b */
    private int f78040b;

    /* renamed from: c */
    private int f78041c;

    /* renamed from: d */
    private int f78042d;

    public dc1(byte[] bArr, int i, int i2) {
        m34970a(bArr, i, i2);
    }

    /* renamed from: a */
    private void m34972a() {
        int i = this.f78041c;
        if (i >= 0) {
            int i2 = this.f78040b;
            if (i < i2) {
                return;
            }
            if (i == i2 && this.f78042d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final boolean m34969b() {
        int i = this.f78041c;
        int i2 = this.f78042d;
        int i3 = 0;
        while (this.f78041c < this.f78040b && !m34967c()) {
            i3++;
        }
        boolean z = this.f78041c == this.f78040b;
        this.f78041c = i;
        this.f78042d = i2;
        return !z && m34971a((i3 * 2) + 1);
    }

    /* renamed from: c */
    public final boolean m34967c() {
        boolean z = (this.f78039a[this.f78041c] & (128 >> this.f78042d)) != 0;
        m34962f();
        return z;
    }

    /* renamed from: d */
    public final int m34965d() {
        int i = 0;
        while (!m34967c()) {
            i++;
        }
        int m34968b = ((1 << i) - 1) + (i > 0 ? m34968b(i) : 0);
        return ((m34968b + 1) / 2) * (m34968b % 2 == 0 ? -1 : 1);
    }

    /* renamed from: e */
    public final int m34963e() {
        int i = 0;
        int i2 = 0;
        while (!m34967c()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = m34968b(i2);
        }
        return i3 + i;
    }

    /* renamed from: f */
    public final void m34962f() {
        int i = 1;
        int i2 = this.f78042d + 1;
        this.f78042d = i2;
        if (i2 == 8) {
            this.f78042d = 0;
            int i3 = this.f78041c;
            if (m34966c(i3 + 1)) {
                i = 2;
            }
            this.f78041c = i3 + i;
        }
        m34972a();
    }

    /* renamed from: c */
    private boolean m34966c(int i) {
        if (2 <= i && i < this.f78040b) {
            byte[] bArr = this.f78039a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m34971a(int i) {
        int i2 = this.f78041c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f78042d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f78040b) {
                break;
            } else if (m34966c(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f78040b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* renamed from: d */
    public final void m34964d(int i) {
        int i2 = this.f78041c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f78041c = i4;
        int i5 = (i - (i3 * 8)) + this.f78042d;
        this.f78042d = i5;
        if (i5 > 7) {
            this.f78041c = i4 + 1;
            this.f78042d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.f78041c) {
                if (m34966c(i2)) {
                    this.f78041c++;
                    i2 += 2;
                }
            } else {
                m34972a();
                return;
            }
        }
    }

    /* renamed from: b */
    public final int m34968b(int i) {
        int i2;
        this.f78042d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f78042d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f78042d = i4;
            byte[] bArr = this.f78039a;
            int i5 = this.f78041c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!m34966c(i5 + 1)) {
                r3 = 1;
            }
            this.f78041c = i5 + r3;
        }
        byte[] bArr2 = this.f78039a;
        int i6 = this.f78041c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f78042d = 0;
            this.f78041c = i6 + (m34966c(i6 + 1) ? 2 : 1);
        }
        m34972a();
        return i7;
    }

    /* renamed from: a */
    public final void m34970a(byte[] bArr, int i, int i2) {
        this.f78039a = bArr;
        this.f78041c = i;
        this.f78040b = i2;
        this.f78042d = 0;
        m34972a();
    }
}
