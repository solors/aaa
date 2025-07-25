package com.applovin.impl;

/* renamed from: com.applovin.impl.bh */
/* loaded from: classes2.dex */
public final class C4123bh {

    /* renamed from: a */
    private byte[] f5002a;

    /* renamed from: b */
    private int f5003b;

    /* renamed from: c */
    private int f5004c;

    /* renamed from: d */
    private int f5005d;

    public C4123bh(byte[] bArr, int i, int i2) {
        m100437a(bArr, i, i2);
    }

    /* renamed from: a */
    private void m100439a() {
        int i;
        int i2 = this.f5004c;
        AbstractC4100b1.m100577b(i2 >= 0 && (i2 < (i = this.f5003b) || (i2 == i && this.f5005d == 0)));
    }

    /* renamed from: d */
    private int m100432d() {
        int i = 0;
        while (!m100434c()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m100435b(i) : 0);
    }

    /* renamed from: b */
    public boolean m100436b() {
        int i = this.f5004c;
        int i2 = this.f5005d;
        int i3 = 0;
        while (this.f5004c < this.f5003b && !m100434c()) {
            i3++;
        }
        boolean z = this.f5004c == this.f5003b;
        this.f5004c = i;
        this.f5005d = i2;
        return !z && m100438a((i3 * 2) + 1);
    }

    /* renamed from: c */
    public boolean m100434c() {
        boolean z = (this.f5002a[this.f5004c] & (128 >> this.f5005d)) != 0;
        m100428g();
        return z;
    }

    /* renamed from: e */
    public int m100430e() {
        int i;
        int m100432d = m100432d();
        if (m100432d % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return i * ((m100432d + 1) / 2);
    }

    /* renamed from: f */
    public int m100429f() {
        return m100432d();
    }

    /* renamed from: g */
    public void m100428g() {
        int i = 1;
        int i2 = this.f5005d + 1;
        this.f5005d = i2;
        if (i2 == 8) {
            this.f5005d = 0;
            int i3 = this.f5004c;
            if (m100433c(i3 + 1)) {
                i = 2;
            }
            this.f5004c = i3 + i;
        }
        m100439a();
    }

    /* renamed from: a */
    public boolean m100438a(int i) {
        int i2 = this.f5004c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f5005d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f5003b) {
                break;
            } else if (m100433c(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f5003b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m100433c(int i) {
        if (2 <= i && i < this.f5003b) {
            byte[] bArr = this.f5002a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void m100431d(int i) {
        int i2 = this.f5004c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f5004c = i4;
        int i5 = this.f5005d + (i - (i3 * 8));
        this.f5005d = i5;
        if (i5 > 7) {
            this.f5004c = i4 + 1;
            this.f5005d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.f5004c) {
                if (m100433c(i2)) {
                    this.f5004c++;
                    i2 += 2;
                }
            } else {
                m100439a();
                return;
            }
        }
    }

    /* renamed from: a */
    public void m100437a(byte[] bArr, int i, int i2) {
        this.f5002a = bArr;
        this.f5004c = i;
        this.f5003b = i2;
        this.f5005d = 0;
        m100439a();
    }

    /* renamed from: b */
    public int m100435b(int i) {
        int i2;
        this.f5005d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f5005d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f5005d = i4;
            byte[] bArr = this.f5002a;
            int i5 = this.f5004c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!m100433c(i5 + 1)) {
                r3 = 1;
            }
            this.f5004c = i5 + r3;
        }
        byte[] bArr2 = this.f5002a;
        int i6 = this.f5004c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f5005d = 0;
            this.f5004c = i6 + (m100433c(i6 + 1) ? 2 : 1);
        }
        m100439a();
        return i7;
    }
}
