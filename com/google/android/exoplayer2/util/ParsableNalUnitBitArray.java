package com.google.android.exoplayer2.util;

/* loaded from: classes4.dex */
public final class ParsableNalUnitBitArray {

    /* renamed from: a */
    private byte[] f36138a;

    /* renamed from: b */
    private int f36139b;

    /* renamed from: c */
    private int f36140c;

    /* renamed from: d */
    private int f36141d;

    public ParsableNalUnitBitArray(byte[] bArr, int i, int i2) {
        reset(bArr, i, i2);
    }

    /* renamed from: a */
    private void m72569a() {
        boolean z;
        int i;
        int i2 = this.f36140c;
        if (i2 >= 0 && (i2 < (i = this.f36139b) || (i2 == i && this.f36141d == 0))) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
    }

    /* renamed from: b */
    private int m72568b() {
        int i = 0;
        int i2 = 0;
        while (!readBit()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = readBits(i2);
        }
        return i3 + i;
    }

    /* renamed from: c */
    private boolean m72567c(int i) {
        if (2 <= i && i < this.f36139b) {
            byte[] bArr = this.f36138a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean canReadBits(int i) {
        int i2 = this.f36140c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f36141d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f36139b) {
                break;
            } else if (m72567c(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f36139b;
        if (i4 < i6) {
            return true;
        }
        if (i4 == i6 && i5 == 0) {
            return true;
        }
        return false;
    }

    public boolean canReadExpGolombCodedNum() {
        boolean z;
        int i = this.f36140c;
        int i2 = this.f36141d;
        int i3 = 0;
        while (this.f36140c < this.f36139b && !readBit()) {
            i3++;
        }
        if (this.f36140c == this.f36139b) {
            z = true;
        } else {
            z = false;
        }
        this.f36140c = i;
        this.f36141d = i2;
        if (z || !canReadBits((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public boolean readBit() {
        boolean z;
        if ((this.f36138a[this.f36140c] & (128 >> this.f36141d)) != 0) {
            z = true;
        } else {
            z = false;
        }
        skipBit();
        return z;
    }

    public int readBits(int i) {
        int i2;
        int i3;
        this.f36141d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f36141d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f36141d = i5;
            byte[] bArr = this.f36138a;
            int i6 = this.f36140c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m72567c(i6 + 1)) {
                i3 = 1;
            }
            this.f36140c = i6 + i3;
        }
        byte[] bArr2 = this.f36138a;
        int i7 = this.f36140c;
        int i8 = ((-1) >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f36141d = 0;
            if (!m72567c(i7 + 1)) {
                i3 = 1;
            }
            this.f36140c = i7 + i3;
        }
        m72569a();
        return i8;
    }

    public int readSignedExpGolombCodedInt() {
        int i;
        int m72568b = m72568b();
        if (m72568b % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return i * ((m72568b + 1) / 2);
    }

    public int readUnsignedExpGolombCodedInt() {
        return m72568b();
    }

    public void reset(byte[] bArr, int i, int i2) {
        this.f36138a = bArr;
        this.f36140c = i;
        this.f36139b = i2;
        this.f36141d = 0;
        m72569a();
    }

    public void skipBit() {
        int i = 1;
        int i2 = this.f36141d + 1;
        this.f36141d = i2;
        if (i2 == 8) {
            this.f36141d = 0;
            int i3 = this.f36140c;
            if (m72567c(i3 + 1)) {
                i = 2;
            }
            this.f36140c = i3 + i;
        }
        m72569a();
    }

    public void skipBits(int i) {
        int i2 = this.f36140c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f36140c = i4;
        int i5 = this.f36141d + (i - (i3 * 8));
        this.f36141d = i5;
        if (i5 > 7) {
            this.f36140c = i4 + 1;
            this.f36141d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.f36140c) {
                if (m72567c(i2)) {
                    this.f36140c++;
                    i2 += 2;
                }
            } else {
                m72569a();
                return;
            }
        }
    }
}
