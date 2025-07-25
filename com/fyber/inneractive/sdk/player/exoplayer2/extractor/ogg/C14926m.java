package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.m */
/* loaded from: classes4.dex */
public final class C14926m {

    /* renamed from: a */
    public final byte[] f29007a;

    /* renamed from: b */
    public final int f29008b;

    /* renamed from: c */
    public int f29009c;

    /* renamed from: d */
    public int f29010d;

    public C14926m(byte[] bArr) {
        this.f29007a = bArr;
        this.f29008b = bArr.length;
    }

    /* renamed from: a */
    public final boolean m77431a() {
        boolean z = (((this.f29007a[this.f29009c] & 255) >> this.f29010d) & 1) == 1;
        m77429b(1);
        return z;
    }

    /* renamed from: b */
    public final void m77429b(int i) {
        int i2 = i / 8;
        int i3 = this.f29009c + i2;
        this.f29009c = i3;
        int i4 = (i - (i2 * 8)) + this.f29010d;
        this.f29010d = i4;
        if (i4 > 7) {
            this.f29009c = i3 + 1;
            this.f29010d = i4 - 8;
        }
        int i5 = this.f29009c;
        if (i5 >= 0) {
            int i6 = this.f29008b;
            if (i5 >= i6) {
                if (i5 == i6 && this.f29010d == 0) {
                    return;
                }
            } else {
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final int m77430a(int i) {
        int i2 = this.f29009c;
        int min = Math.min(i, 8 - this.f29010d);
        int i3 = i2 + 1;
        int i4 = ((this.f29007a[i2] & 255) >> this.f29010d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f29007a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m77429b(i);
        return i5;
    }
}
