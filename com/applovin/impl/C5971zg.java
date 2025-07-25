package com.applovin.impl;

import androidx.core.view.MotionEventCompat;
import java.nio.charset.Charset;

/* renamed from: com.applovin.impl.zg */
/* loaded from: classes2.dex */
public final class C5971zg {

    /* renamed from: a */
    public byte[] f12566a;

    /* renamed from: b */
    private int f12567b;

    /* renamed from: c */
    private int f12568c;

    /* renamed from: d */
    private int f12569d;

    public C5971zg() {
        this.f12566a = AbstractC5863xp.f12156f;
    }

    /* renamed from: a */
    private void m92404a() {
        int i;
        int i2 = this.f12567b;
        AbstractC4100b1.m100577b(i2 >= 0 && (i2 < (i = this.f12569d) || (i2 == i && this.f12568c == 0)));
    }

    /* renamed from: b */
    public int m92396b() {
        return ((this.f12569d - this.f12567b) * 8) - this.f12568c;
    }

    /* renamed from: c */
    public void m92393c() {
        if (this.f12568c == 0) {
            return;
        }
        this.f12568c = 0;
        this.f12567b++;
        m92404a();
    }

    /* renamed from: d */
    public int m92391d() {
        AbstractC4100b1.m100577b(this.f12568c == 0);
        return this.f12567b;
    }

    /* renamed from: e */
    public int m92389e() {
        return (this.f12567b * 8) + this.f12568c;
    }

    /* renamed from: f */
    public boolean m92387f() {
        boolean z;
        if ((this.f12566a[this.f12567b] & (128 >> this.f12568c)) != 0) {
            z = true;
        } else {
            z = false;
        }
        m92386g();
        return z;
    }

    /* renamed from: g */
    public void m92386g() {
        int i = this.f12568c + 1;
        this.f12568c = i;
        if (i == 8) {
            this.f12568c = 0;
            this.f12567b++;
        }
        m92404a();
    }

    /* renamed from: a */
    public void m92402a(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f12568c, i2);
        int i3 = this.f12568c;
        int i4 = (8 - i3) - min;
        int i5 = (MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i3) | ((1 << i4) - 1);
        byte[] bArr = this.f12566a;
        int i6 = this.f12567b;
        byte b = (byte) (i5 & bArr[i6]);
        bArr[i6] = b;
        int i7 = i2 - min;
        bArr[i6] = (byte) (b | ((i >>> i7) << i4));
        int i8 = i6 + 1;
        while (i7 > 8) {
            this.f12566a[i8] = (byte) (i >>> (i7 - 8));
            i7 -= 8;
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f12566a;
        byte b2 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b2;
        bArr2[i8] = (byte) (((i & ((1 << i7) - 1)) << i9) | b2);
        m92390d(i2);
        m92404a();
    }

    /* renamed from: b */
    public long m92395b(int i) {
        if (i <= 32) {
            return AbstractC5863xp.m92957i(m92403a(i));
        }
        return AbstractC5863xp.m92976c(m92403a(i - 32), m92403a(32));
    }

    /* renamed from: e */
    public void m92388e(int i) {
        AbstractC4100b1.m100577b(this.f12568c == 0);
        this.f12567b += i;
        m92404a();
    }

    public C5971zg(byte[] bArr) {
        this(bArr, bArr.length);
    }

    /* renamed from: d */
    public void m92390d(int i) {
        int i2 = i / 8;
        int i3 = this.f12567b + i2;
        this.f12567b = i3;
        int i4 = this.f12568c + (i - (i2 * 8));
        this.f12568c = i4;
        if (i4 > 7) {
            this.f12567b = i3 + 1;
            this.f12568c = i4 - 8;
        }
        m92404a();
    }

    public C5971zg(byte[] bArr, int i) {
        this.f12566a = bArr;
        this.f12569d = i;
    }

    /* renamed from: b */
    public void m92394b(byte[] bArr, int i, int i2) {
        AbstractC4100b1.m100577b(this.f12568c == 0);
        System.arraycopy(this.f12566a, this.f12567b, bArr, i, i2);
        this.f12567b += i2;
        m92404a();
    }

    /* renamed from: c */
    public void m92392c(int i) {
        int i2 = i / 8;
        this.f12567b = i2;
        this.f12568c = i - (i2 * 8);
        m92404a();
    }

    /* renamed from: a */
    public int m92403a(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f12568c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f12568c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f12568c = i4;
            byte[] bArr = this.f12566a;
            int i5 = this.f12567b;
            this.f12567b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f12566a;
        int i6 = this.f12567b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f12568c = 0;
            this.f12567b = i6 + 1;
        }
        m92404a();
        return i7;
    }

    /* renamed from: a */
    public void m92397a(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f12566a;
            int i4 = this.f12567b;
            int i5 = i4 + 1;
            this.f12567b = i5;
            byte b = bArr2[i4];
            int i6 = this.f12568c;
            byte b2 = (byte) (b << i6);
            bArr[i] = b2;
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i7));
        bArr[i3] = b3;
        int i8 = this.f12568c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f12566a;
            int i9 = this.f12567b;
            this.f12567b = i9 + 1;
            bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f12568c = i8 - 8;
        }
        int i10 = this.f12568c + i7;
        this.f12568c = i10;
        byte[] bArr4 = this.f12566a;
        int i11 = this.f12567b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
        if (i10 == 8) {
            this.f12568c = 0;
            this.f12567b = i11 + 1;
        }
        m92404a();
    }

    /* renamed from: a */
    public String m92401a(int i, Charset charset) {
        byte[] bArr = new byte[i];
        m92394b(bArr, 0, i);
        return new String(bArr, charset);
    }

    /* renamed from: a */
    public void m92400a(C4066ah c4066ah) {
        m92398a(c4066ah.m100787c(), c4066ah.m100783e());
        m92392c(c4066ah.m100785d() * 8);
    }

    /* renamed from: a */
    public void m92399a(byte[] bArr) {
        m92398a(bArr, bArr.length);
    }

    /* renamed from: a */
    public void m92398a(byte[] bArr, int i) {
        this.f12566a = bArr;
        this.f12567b = 0;
        this.f12568c = 0;
        this.f12569d = i;
    }
}
