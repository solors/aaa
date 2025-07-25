package com.yandex.mobile.ads.impl;

import androidx.core.view.MotionEventCompat;
import java.nio.charset.Charset;

/* loaded from: classes8.dex */
public final class bc1 {

    /* renamed from: a */
    public byte[] f77261a;

    /* renamed from: b */
    private int f77262b;

    /* renamed from: c */
    private int f77263c;

    /* renamed from: d */
    private int f77264d;

    public bc1() {
        this.f77261a = y32.f88015f;
    }

    /* renamed from: a */
    private void m35508a() {
        int i = this.f77262b;
        if (i >= 0) {
            int i2 = this.f77264d;
            if (i < i2) {
                return;
            }
            if (i == i2 && this.f77263c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final int m35503b() {
        return ((this.f77264d - this.f77262b) * 8) - this.f77263c;
    }

    /* renamed from: c */
    public final void m35500c() {
        if (this.f77263c == 0) {
            return;
        }
        this.f77263c = 0;
        this.f77262b++;
        m35508a();
    }

    /* renamed from: d */
    public final int m35498d() {
        if (this.f77263c == 0) {
            return this.f77262b;
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final int m35496e() {
        return (this.f77262b * 8) + this.f77263c;
    }

    /* renamed from: f */
    public final boolean m35494f() {
        boolean z;
        if ((this.f77261a[this.f77262b] & (128 >> this.f77263c)) != 0) {
            z = true;
        } else {
            z = false;
        }
        m35492h();
        return z;
    }

    /* renamed from: g */
    public final long m35493g() {
        int m35502b = m35502b(4);
        int m35502b2 = m35502b(32);
        int i = y32.f88010a;
        return ((m35502b & 4294967295L) << 32) | (m35502b2 & 4294967295L);
    }

    /* renamed from: h */
    public final void m35492h() {
        int i = this.f77263c + 1;
        this.f77263c = i;
        if (i == 8) {
            this.f77263c = 0;
            this.f77262b++;
        }
        m35508a();
    }

    /* renamed from: b */
    public final int m35502b(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f77263c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f77263c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f77263c = i4;
            byte[] bArr = this.f77261a;
            int i5 = this.f77262b;
            this.f77262b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f77261a;
        int i6 = this.f77262b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f77263c = 0;
            this.f77262b = i6 + 1;
        }
        m35508a();
        return i7;
    }

    /* renamed from: e */
    public final void m35495e(int i) {
        if (this.f77263c == 0) {
            this.f77262b += i;
            m35508a();
            return;
        }
        throw new IllegalStateException();
    }

    public bc1(int i, byte[] bArr) {
        this.f77261a = bArr;
        this.f77264d = i;
    }

    /* renamed from: a */
    public final void m35507a(int i) {
        int i2 = i & 16383;
        int min = Math.min(8 - this.f77263c, 14);
        int i3 = this.f77263c;
        int i4 = (8 - i3) - min;
        int i5 = (MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i3) | ((1 << i4) - 1);
        byte[] bArr = this.f77261a;
        int i6 = this.f77262b;
        byte b = (byte) (i5 & bArr[i6]);
        bArr[i6] = b;
        int i7 = 14 - min;
        bArr[i6] = (byte) (b | ((i2 >>> i7) << i4));
        int i8 = i6 + 1;
        while (i7 > 8) {
            this.f77261a[i8] = (byte) (i2 >>> (i7 - 8));
            i7 -= 8;
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f77261a;
        byte b2 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b2;
        bArr2[i8] = (byte) (((i2 & ((1 << i7) - 1)) << i9) | b2);
        m35497d(14);
        m35508a();
    }

    /* renamed from: d */
    public final void m35497d(int i) {
        int i2 = i / 8;
        int i3 = this.f77262b + i2;
        this.f77262b = i3;
        int i4 = (i - (i2 * 8)) + this.f77263c;
        this.f77263c = i4;
        if (i4 > 7) {
            this.f77262b = i3 + 1;
            this.f77263c = i4 - 8;
        }
        m35508a();
    }

    /* renamed from: c */
    public final void m35499c(int i) {
        int i2 = i / 8;
        this.f77262b = i2;
        this.f77263c = i - (i2 * 8);
        m35508a();
    }

    public bc1(byte[] bArr) {
        this(bArr.length, bArr);
    }

    /* renamed from: b */
    public final void m35501b(byte[] bArr, int i) {
        if (this.f77263c == 0) {
            System.arraycopy(this.f77261a, this.f77262b, bArr, 0, i);
            this.f77262b += i;
            m35508a();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void m35504a(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f77261a;
            int i4 = this.f77262b;
            int i5 = i4 + 1;
            this.f77262b = i5;
            byte b = bArr2[i4];
            int i6 = this.f77263c;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.f77263c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f77261a;
            int i9 = this.f77262b;
            this.f77262b = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f77263c = i8 - 8;
        }
        int i10 = this.f77263c + i7;
        this.f77263c = i10;
        byte[] bArr4 = this.f77261a;
        int i11 = this.f77262b;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f77263c = 0;
            this.f77262b = i11 + 1;
        }
        m35508a();
    }

    /* renamed from: a */
    public final String m35506a(int i, Charset charset) {
        byte[] bArr = new byte[i];
        m35501b(bArr, i);
        return new String(bArr, charset);
    }

    /* renamed from: a */
    public final void m35505a(int i, byte[] bArr) {
        this.f77261a = bArr;
        this.f77262b = 0;
        this.f77263c = 0;
        this.f77264d = i;
    }
}
