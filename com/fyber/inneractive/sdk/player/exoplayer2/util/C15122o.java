package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.o */
/* loaded from: classes4.dex */
public final class C15122o {

    /* renamed from: a */
    public byte[] f29807a;

    /* renamed from: b */
    public int f29808b;

    /* renamed from: c */
    public int f29809c;

    /* renamed from: d */
    public int f29810d = 0;

    public C15122o(byte[] bArr, int i, int i2) {
        this.f29807a = bArr;
        this.f29809c = i;
        this.f29808b = i2;
        m77186a();
    }

    /* renamed from: a */
    public final boolean m77185a(int i) {
        int i2 = this.f29809c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f29810d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f29808b) {
                break;
            } else if (m77181c(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f29808b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* renamed from: b */
    public final int m77183b(int i) {
        int i2;
        this.f29810d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f29810d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f29810d = i4;
            byte[] bArr = this.f29807a;
            int i5 = this.f29809c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!m77181c(i5 + 1)) {
                r3 = 1;
            }
            this.f29809c = i5 + r3;
        }
        byte[] bArr2 = this.f29807a;
        int i6 = this.f29809c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f29810d = 0;
            this.f29809c = i6 + (m77181c(i6 + 1) ? 2 : 1);
        }
        m77186a();
        return i7;
    }

    /* renamed from: c */
    public final boolean m77182c() {
        boolean z = (this.f29807a[this.f29809c] & (128 >> this.f29810d)) != 0;
        m77177f();
        return z;
    }

    /* renamed from: d */
    public final void m77179d(int i) {
        int i2 = this.f29809c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f29809c = i4;
        int i5 = (i - (i3 * 8)) + this.f29810d;
        this.f29810d = i5;
        if (i5 > 7) {
            this.f29809c = i4 + 1;
            this.f29810d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.f29809c) {
                if (m77181c(i2)) {
                    this.f29809c++;
                    i2 += 2;
                }
            } else {
                m77186a();
                return;
            }
        }
    }

    /* renamed from: e */
    public final int m77178e() {
        int i;
        int m77180d = m77180d();
        if (m77180d % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return ((m77180d + 1) / 2) * i;
    }

    /* renamed from: f */
    public final void m77177f() {
        int i = 1;
        int i2 = this.f29810d + 1;
        this.f29810d = i2;
        if (i2 == 8) {
            this.f29810d = 0;
            int i3 = this.f29809c;
            if (m77181c(i3 + 1)) {
                i = 2;
            }
            this.f29809c = i3 + i;
        }
        m77186a();
    }

    /* renamed from: c */
    public final boolean m77181c(int i) {
        if (2 <= i && i < this.f29808b) {
            byte[] bArr = this.f29807a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m77186a() {
        int i = this.f29809c;
        if (i >= 0) {
            int i2 = this.f29808b;
            if (i < i2) {
                return;
            }
            if (i == i2 && this.f29810d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final boolean m77184b() {
        int i = this.f29809c;
        int i2 = this.f29810d;
        int i3 = 0;
        while (this.f29809c < this.f29808b && !m77182c()) {
            i3++;
        }
        boolean z = this.f29809c == this.f29808b;
        this.f29809c = i;
        this.f29810d = i2;
        return !z && m77185a((i3 * 2) + 1);
    }

    /* renamed from: d */
    public final int m77180d() {
        int i = 0;
        while (!m77182c()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m77183b(i) : 0);
    }
}
