package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14979m;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.n */
/* loaded from: classes4.dex */
public final class C15121n {

    /* renamed from: a */
    public byte[] f29804a;

    /* renamed from: b */
    public int f29805b;

    /* renamed from: c */
    public int f29806c;

    public C15121n() {
    }

    public C15121n(int i) {
        this.f29804a = new byte[i];
        this.f29806c = i;
    }

    /* renamed from: a */
    public final int m77207a() {
        byte[] bArr = this.f29804a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: b */
    public final int m77204b() {
        byte[] bArr = this.f29804a;
        int i = this.f29805b;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        this.f29805b = i + 4;
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: c */
    public final void m77201c(int i) {
        this.f29804a = m77207a() < i ? new byte[i] : this.f29804a;
        this.f29806c = i;
        this.f29805b = 0;
    }

    /* renamed from: d */
    public final void m77199d(int i) {
        if (i >= 0 && i <= this.f29804a.length) {
            this.f29806c = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m77197e(int i) {
        if (i >= 0 && i <= this.f29806c) {
            this.f29805b = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final int m77196f() {
        byte[] bArr = this.f29804a;
        int i = this.f29805b;
        this.f29805b = i + 2;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: g */
    public final long m77195g() {
        byte[] bArr = this.f29804a;
        int i = this.f29805b;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24);
        this.f29805b = i + 8;
        return (bArr[i + 7] & 255) | j | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    /* renamed from: h */
    public final void m77194h() {
        int i = this.f29806c;
        int i2 = this.f29805b;
        if (i - i2 == 0) {
            return;
        }
        while (i2 < this.f29806c && this.f29804a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f29804a;
        int i3 = this.f29805b;
        new String(bArr, i3, i2 - i3);
        this.f29805b = i2;
        if (i2 < this.f29806c) {
            this.f29805b = i2 + 1;
        }
    }

    /* renamed from: i */
    public final int m77193i() {
        return (m77192j() << 21) | (m77192j() << 14) | (m77192j() << 7) | m77192j();
    }

    /* renamed from: j */
    public final int m77192j() {
        byte[] bArr = this.f29804a;
        int i = this.f29805b;
        this.f29805b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: k */
    public final long m77191k() {
        byte[] bArr = this.f29804a;
        int i = this.f29805b;
        this.f29805b = i + 4;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: l */
    public final int m77190l() {
        byte[] bArr = this.f29804a;
        int i = this.f29805b;
        int i2 = (bArr[i + 1] & 255) << 8;
        this.f29805b = i + 3;
        return (bArr[i + 2] & 255) | i2 | ((bArr[i] & 255) << 16);
    }

    /* renamed from: m */
    public final int m77189m() {
        int m77204b = m77204b();
        if (m77204b >= 0) {
            return m77204b;
        }
        throw new IllegalStateException(AbstractC14979m.m77354a("Top bit not zero: ", m77204b));
    }

    /* renamed from: n */
    public final long m77188n() {
        long m77195g = m77195g();
        if (m77195g >= 0) {
            return m77195g;
        }
        throw new IllegalStateException("Top bit not zero: " + m77195g);
    }

    /* renamed from: o */
    public final int m77187o() {
        byte[] bArr = this.f29804a;
        int i = this.f29805b;
        this.f29805b = i + 2;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: a */
    public final void m77205a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f29804a, this.f29805b, bArr, i, i2);
        this.f29805b += i2;
    }

    /* renamed from: b */
    public final String m77203b(int i) {
        String str = new String(this.f29804a, this.f29805b, i, Charset.defaultCharset());
        this.f29805b += i;
        return str;
    }

    public C15121n(byte[] bArr) {
        this.f29804a = bArr;
        this.f29806c = bArr.length;
    }

    /* renamed from: a */
    public final String m77206a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f29805b;
        int i3 = (i2 + i) - 1;
        String str = new String(this.f29804a, i2, (i3 >= this.f29806c || this.f29804a[i3] != 0) ? i : i - 1);
        this.f29805b += i;
        return str;
    }

    /* renamed from: d */
    public final int m77200d() {
        byte[] bArr = this.f29804a;
        int i = this.f29805b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f29805b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: e */
    public final long m77198e() {
        byte[] bArr = this.f29804a;
        int i = this.f29805b;
        this.f29805b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    public final String m77202c() {
        int i = this.f29806c;
        int i2 = this.f29805b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f29806c) {
            byte b = this.f29804a[i2];
            int i3 = AbstractC15133z.f29832a;
            if (b == 10 || b == 13) {
                break;
            }
            i2++;
        }
        int i4 = this.f29805b;
        if (i2 - i4 >= 3) {
            byte[] bArr = this.f29804a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f29805b = i4 + 3;
            }
        }
        byte[] bArr2 = this.f29804a;
        int i5 = this.f29805b;
        String str = new String(bArr2, i5, i2 - i5);
        this.f29805b = i2;
        int i6 = this.f29806c;
        if (i2 == i6) {
            return str;
        }
        byte[] bArr3 = this.f29804a;
        if (bArr3[i2] == 13) {
            int i7 = i2 + 1;
            this.f29805b = i7;
            if (i7 == i6) {
                return str;
            }
        }
        int i8 = this.f29805b;
        if (bArr3[i8] == 10) {
            this.f29805b = i8 + 1;
        }
        return str;
    }

    public C15121n(int i, byte[] bArr) {
        this.f29804a = bArr;
        this.f29806c = i;
    }
}
