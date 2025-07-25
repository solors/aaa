package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.m */
/* loaded from: classes4.dex */
public final class C15120m {

    /* renamed from: a */
    public final byte[] f29800a;

    /* renamed from: b */
    public int f29801b;

    /* renamed from: c */
    public int f29802c;

    /* renamed from: d */
    public final int f29803d;

    public C15120m(byte[] bArr) {
        int length = bArr.length;
        this.f29800a = bArr;
        this.f29803d = length;
    }

    /* renamed from: a */
    public final int m77211a(int i) {
        int i2;
        this.f29802c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f29802c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f29802c = i4;
            byte[] bArr = this.f29800a;
            int i5 = this.f29801b;
            this.f29801b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f29800a;
        int i6 = this.f29801b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f29802c = 0;
            this.f29801b = i6 + 1;
        }
        m77212a();
        return i7;
    }

    /* renamed from: b */
    public final void m77209b(int i) {
        int i2 = i / 8;
        this.f29801b = i2;
        this.f29802c = i - (i2 * 8);
        m77212a();
    }

    /* renamed from: c */
    public final void m77208c(int i) {
        int i2 = i / 8;
        int i3 = this.f29801b + i2;
        this.f29801b = i3;
        int i4 = (i - (i2 * 8)) + this.f29802c;
        this.f29802c = i4;
        if (i4 > 7) {
            this.f29801b = i3 + 1;
            this.f29802c = i4 - 8;
        }
        m77212a();
    }

    /* renamed from: b */
    public final boolean m77210b() {
        byte[] bArr = this.f29800a;
        int i = this.f29801b;
        byte b = bArr[i];
        int i2 = this.f29802c;
        boolean z = (b & (128 >> i2)) != 0;
        int i3 = i2 + 1;
        this.f29802c = i3;
        if (i3 == 8) {
            this.f29802c = 0;
            this.f29801b = i + 1;
        }
        m77212a();
        return z;
    }

    /* renamed from: a */
    public final void m77212a() {
        int i = this.f29801b;
        if (i >= 0) {
            int i2 = this.f29803d;
            if (i < i2) {
                return;
            }
            if (i == i2 && this.f29802c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }
}
