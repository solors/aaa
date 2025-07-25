package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public final class VorbisBitArray {

    /* renamed from: a */
    private final byte[] f32934a;

    /* renamed from: b */
    private final int f32935b;

    /* renamed from: c */
    private int f32936c;

    /* renamed from: d */
    private int f32937d;

    public VorbisBitArray(byte[] bArr) {
        this.f32934a = bArr;
        this.f32935b = bArr.length;
    }

    /* renamed from: a */
    private void m74707a() {
        boolean z;
        int i;
        int i2 = this.f32936c;
        if (i2 >= 0 && (i2 < (i = this.f32935b) || (i2 == i && this.f32937d == 0))) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
    }

    public int bitsLeft() {
        return ((this.f32935b - this.f32936c) * 8) - this.f32937d;
    }

    public int getPosition() {
        return (this.f32936c * 8) + this.f32937d;
    }

    public boolean readBit() {
        boolean z;
        if ((((this.f32934a[this.f32936c] & 255) >> this.f32937d) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        skipBits(1);
        return z;
    }

    public int readBits(int i) {
        int i2 = this.f32936c;
        int min = Math.min(i, 8 - this.f32937d);
        int i3 = i2 + 1;
        int i4 = ((this.f32934a[i2] & 255) >> this.f32937d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f32934a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        skipBits(i);
        return i5;
    }

    public void reset() {
        this.f32936c = 0;
        this.f32937d = 0;
    }

    public void setPosition(int i) {
        int i2 = i / 8;
        this.f32936c = i2;
        this.f32937d = i - (i2 * 8);
        m74707a();
    }

    public void skipBits(int i) {
        int i2 = i / 8;
        int i3 = this.f32936c + i2;
        this.f32936c = i3;
        int i4 = this.f32937d + (i - (i2 * 8));
        this.f32937d = i4;
        if (i4 > 7) {
            this.f32936c = i3 + 1;
            this.f32937d = i4 - 8;
        }
        m74707a();
    }
}
