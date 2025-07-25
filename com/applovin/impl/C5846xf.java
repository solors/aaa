package com.applovin.impl;

import java.util.Arrays;

/* renamed from: com.applovin.impl.xf */
/* loaded from: classes2.dex */
final class C5846xf {

    /* renamed from: a */
    private final int f12095a;

    /* renamed from: b */
    private boolean f12096b;

    /* renamed from: c */
    private boolean f12097c;

    /* renamed from: d */
    public byte[] f12098d;

    /* renamed from: e */
    public int f12099e;

    public C5846xf(int i, int i2) {
        this.f12095a = i;
        byte[] bArr = new byte[i2 + 3];
        this.f12098d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m93114a(byte[] bArr, int i, int i2) {
        if (this.f12096b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f12098d;
            int length = bArr2.length;
            int i4 = this.f12099e + i3;
            if (length < i4) {
                this.f12098d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f12098d, this.f12099e, i3);
            this.f12099e += i3;
        }
    }

    /* renamed from: b */
    public void m93113b() {
        this.f12096b = false;
        this.f12097c = false;
    }

    /* renamed from: b */
    public void m93112b(int i) {
        AbstractC4100b1.m100577b(!this.f12096b);
        boolean z = i == this.f12095a;
        this.f12096b = z;
        if (z) {
            this.f12099e = 3;
            this.f12097c = false;
        }
    }

    /* renamed from: a */
    public boolean m93115a(int i) {
        if (this.f12096b) {
            this.f12099e -= i;
            this.f12096b = false;
            this.f12097c = true;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m93116a() {
        return this.f12097c;
    }
}
