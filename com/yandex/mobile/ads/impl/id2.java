package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class id2 {

    /* renamed from: a */
    private final byte[] f80432a;

    /* renamed from: b */
    private final int f80433b;

    /* renamed from: c */
    private int f80434c;

    /* renamed from: d */
    private int f80435d;

    public id2(byte[] bArr) {
        this.f80432a = bArr;
        this.f80433b = bArr.length;
    }

    /* renamed from: a */
    public final int m33295a() {
        return (this.f80434c * 8) + this.f80435d;
    }

    /* renamed from: b */
    public final boolean m33293b() {
        boolean z = (((this.f80432a[this.f80434c] & 255) >> this.f80435d) & 1) == 1;
        m33292b(1);
        return z;
    }

    /* renamed from: a */
    public final int m33294a(int i) {
        int i2 = this.f80434c;
        int min = Math.min(i, 8 - this.f80435d);
        int i3 = i2 + 1;
        int i4 = ((this.f80432a[i2] & 255) >> this.f80435d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f80432a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m33292b(i);
        return i5;
    }

    /* renamed from: b */
    public final void m33292b(int i) {
        int i2 = i / 8;
        int i3 = this.f80434c + i2;
        this.f80434c = i3;
        int i4 = (i - (i2 * 8)) + this.f80435d;
        this.f80435d = i4;
        if (i4 > 7) {
            this.f80434c = i3 + 1;
            this.f80435d = i4 - 8;
        }
        int i5 = this.f80434c;
        if (i5 >= 0) {
            int i6 = this.f80433b;
            if (i5 < i6) {
                return;
            }
            if (i5 == i6 && this.f80435d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }
}
