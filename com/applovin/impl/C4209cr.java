package com.applovin.impl;

/* renamed from: com.applovin.impl.cr */
/* loaded from: classes2.dex */
public final class C4209cr {

    /* renamed from: a */
    private final byte[] f5403a;

    /* renamed from: b */
    private final int f5404b;

    /* renamed from: c */
    private int f5405c;

    /* renamed from: d */
    private int f5406d;

    public C4209cr(byte[] bArr) {
        this.f5403a = bArr;
        this.f5404b = bArr.length;
    }

    /* renamed from: a */
    private void m100056a() {
        int i;
        int i2 = this.f5405c;
        AbstractC4100b1.m100577b(i2 >= 0 && (i2 < (i = this.f5404b) || (i2 == i && this.f5406d == 0)));
    }

    /* renamed from: b */
    public int m100054b() {
        return (this.f5405c * 8) + this.f5406d;
    }

    /* renamed from: c */
    public boolean m100052c() {
        boolean z;
        if ((((this.f5403a[this.f5405c] & 255) >> this.f5406d) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        m100053b(1);
        return z;
    }

    /* renamed from: a */
    public int m100055a(int i) {
        int i2 = this.f5405c;
        int min = Math.min(i, 8 - this.f5406d);
        int i3 = i2 + 1;
        int i4 = ((this.f5403a[i2] & 255) >> this.f5406d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f5403a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m100053b(i);
        return i5;
    }

    /* renamed from: b */
    public void m100053b(int i) {
        int i2 = i / 8;
        int i3 = this.f5405c + i2;
        this.f5405c = i3;
        int i4 = this.f5406d + (i - (i2 * 8));
        this.f5406d = i4;
        if (i4 > 7) {
            this.f5405c = i3 + 1;
            this.f5406d = i4 - 8;
        }
        m100056a();
    }
}
