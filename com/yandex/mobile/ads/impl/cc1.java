package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class cc1 {

    /* renamed from: a */
    private byte[] f77593a;

    /* renamed from: b */
    private int f77594b;

    /* renamed from: c */
    private int f77595c;

    public cc1() {
        this.f77593a = y32.f88015f;
    }

    /* renamed from: A */
    public final long m35300A() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.f77593a[this.f77594b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.f77593a[this.f77594b + i] & 192) == 128) {
                    j = (j << 6) | (b & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f77594b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    /* renamed from: a */
    public final int m35299a() {
        return this.f77595c - this.f77594b;
    }

    /* renamed from: b */
    public final int m35293b() {
        return this.f77593a.length;
    }

    /* renamed from: c */
    public final byte[] m35291c() {
        return this.f77593a;
    }

    /* renamed from: d */
    public final int m35289d() {
        return this.f77594b;
    }

    /* renamed from: e */
    public final int m35287e() {
        return this.f77595c;
    }

    /* renamed from: f */
    public final char m35285f() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: g */
    public final int m35283g() {
        return this.f77593a[this.f77594b] & 255;
    }

    /* renamed from: h */
    public final int m35282h() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        this.f77594b = i + 4;
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: i */
    public final int m35281i() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        int i2 = (bArr[i + 1] & 255) << 8;
        this.f77594b = i + 3;
        return (bArr[i + 2] & 255) | i2 | (((bArr[i] & 255) << 24) >> 8);
    }

    @Nullable
    /* renamed from: j */
    public final String m35280j() {
        int i = this.f77595c;
        int i2 = this.f77594b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f77595c) {
            byte b = this.f77593a[i2];
            int i3 = y32.f88010a;
            if (b == 10 || b == 13) {
                break;
            }
            i2++;
        }
        int i4 = this.f77594b;
        if (i2 - i4 >= 3) {
            byte[] bArr = this.f77593a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f77594b = i4 + 3;
            }
        }
        byte[] bArr2 = this.f77593a;
        int i5 = this.f77594b;
        String m27070a = y32.m27070a(bArr2, i5, i2 - i5);
        this.f77594b = i2;
        int i6 = this.f77595c;
        if (i2 == i6) {
            return m27070a;
        }
        byte[] bArr3 = this.f77593a;
        if (bArr3[i2] == 13) {
            int i7 = i2 + 1;
            this.f77594b = i7;
            if (i7 == i6) {
                return m27070a;
            }
        }
        int i8 = this.f77594b;
        if (bArr3[i8] == 10) {
            this.f77594b = i8 + 1;
        }
        return m27070a;
    }

    /* renamed from: k */
    public final int m35279k() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f77594b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: l */
    public final long m35278l() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        long j = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40);
        this.f77594b = i + 8;
        return ((bArr[i + 7] & 255) << 56) | j | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: m */
    public final short m35277m() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        this.f77594b = i + 2;
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: n */
    public final long m35276n() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        this.f77594b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: o */
    public final int m35275o() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        this.f77594b = i + 2;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: p */
    public final long m35274p() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24);
        this.f77594b = i + 8;
        return (bArr[i + 7] & 255) | j | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    @Nullable
    /* renamed from: q */
    public final String m35273q() {
        int i = this.f77595c;
        int i2 = this.f77594b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f77595c && this.f77593a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f77593a;
        int i3 = this.f77594b;
        String m27070a = y32.m27070a(bArr, i3, i2 - i3);
        this.f77594b = i2;
        if (i2 < this.f77595c) {
            this.f77594b = i2 + 1;
            return m27070a;
        }
        return m27070a;
    }

    /* renamed from: r */
    public final short m35272r() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        this.f77594b = i + 2;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: s */
    public final int m35271s() {
        return (m35270t() << 21) | (m35270t() << 14) | (m35270t() << 7) | m35270t();
    }

    /* renamed from: t */
    public final int m35270t() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        this.f77594b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: u */
    public final int m35269u() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        int i2 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
        this.f77594b = i + 4;
        return i2;
    }

    /* renamed from: v */
    public final long m35268v() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        this.f77594b = i + 4;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: w */
    public final int m35267w() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        int i2 = (bArr[i + 1] & 255) << 8;
        this.f77594b = i + 3;
        return (bArr[i + 2] & 255) | i2 | ((bArr[i] & 255) << 16);
    }

    /* renamed from: x */
    public final int m35266x() {
        int m35282h = m35282h();
        if (m35282h >= 0) {
            return m35282h;
        }
        throw new IllegalStateException(C31736wd.m27978a("Top bit not zero: ", m35282h));
    }

    /* renamed from: y */
    public final long m35265y() {
        long m35274p = m35274p();
        if (m35274p >= 0) {
            return m35274p;
        }
        throw new IllegalStateException("Top bit not zero: " + m35274p);
    }

    /* renamed from: z */
    public final int m35264z() {
        byte[] bArr = this.f77593a;
        int i = this.f77594b;
        this.f77594b = i + 2;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: a */
    public final void m35298a(int i) {
        byte[] bArr = this.f77593a;
        if (i > bArr.length) {
            this.f77593a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: b */
    public final String m35292b(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f77594b;
        int i3 = (i2 + i) - 1;
        String m27070a = y32.m27070a(this.f77593a, i2, (i3 >= this.f77595c || this.f77593a[i3] != 0) ? i : i - 1);
        this.f77594b += i;
        return m27070a;
    }

    /* renamed from: c */
    public final void m35290c(int i) {
        byte[] bArr = this.f77593a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        this.f77593a = bArr;
        this.f77595c = i;
        this.f77594b = 0;
    }

    /* renamed from: d */
    public final void m35288d(int i) {
        if (i >= 0 && i <= this.f77593a.length) {
            this.f77595c = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m35286e(int i) {
        if (i >= 0 && i <= this.f77595c) {
            this.f77594b = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final void m35284f(int i) {
        m35286e(this.f77594b + i);
    }

    public cc1(int i) {
        this.f77593a = new byte[i];
        this.f77595c = i;
    }

    /* renamed from: a */
    public final void m35294a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f77593a, this.f77594b, bArr, i, i2);
        this.f77594b += i2;
    }

    public cc1(int i, byte[] bArr) {
        this.f77593a = bArr;
        this.f77595c = i;
    }

    /* renamed from: a */
    public final void m35296a(int i, byte[] bArr) {
        this.f77593a = bArr;
        this.f77595c = i;
        this.f77594b = 0;
    }

    public cc1(byte[] bArr) {
        this.f77593a = bArr;
        this.f77595c = bArr.length;
    }

    /* renamed from: a */
    public final void m35295a(byte[] bArr) {
        int length = bArr.length;
        this.f77593a = bArr;
        this.f77595c = length;
        this.f77594b = 0;
    }

    /* renamed from: a */
    public final String m35297a(int i, Charset charset) {
        String str = new String(this.f77593a, this.f77594b, i, charset);
        this.f77594b += i;
        return str;
    }
}
