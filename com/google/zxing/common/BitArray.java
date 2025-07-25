package com.google.zxing.common;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class BitArray implements Cloneable {

    /* renamed from: b */
    private int[] f44338b;

    /* renamed from: c */
    private int f44339c;

    public BitArray() {
        this.f44339c = 0;
        this.f44338b = new int[1];
    }

    /* renamed from: b */
    private void m66028b(int i) {
        if (i > (this.f44338b.length << 5)) {
            int[] m66027c = m66027c(i);
            int[] iArr = this.f44338b;
            System.arraycopy(iArr, 0, m66027c, 0, iArr.length);
            this.f44338b = m66027c;
        }
    }

    /* renamed from: c */
    private static int[] m66027c(int i) {
        return new int[(i + 31) / 32];
    }

    public void appendBit(boolean z) {
        m66028b(this.f44339c + 1);
        if (z) {
            int[] iArr = this.f44338b;
            int i = this.f44339c;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f44339c++;
    }

    public void appendBitArray(BitArray bitArray) {
        int i = bitArray.f44339c;
        m66028b(this.f44339c + i);
        for (int i2 = 0; i2 < i; i2++) {
            appendBit(bitArray.get(i2));
        }
    }

    public void appendBits(int i, int i2) {
        if (i2 >= 0 && i2 <= 32) {
            m66028b(this.f44339c + i2);
            while (i2 > 0) {
                boolean z = true;
                if (((i >> (i2 - 1)) & 1) != 1) {
                    z = false;
                }
                appendBit(z);
                i2--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public void clear() {
        int length = this.f44338b.length;
        for (int i = 0; i < length; i++) {
            this.f44338b[i] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        if (this.f44339c != bitArray.f44339c || !Arrays.equals(this.f44338b, bitArray.f44338b)) {
            return false;
        }
        return true;
    }

    public void flip(int i) {
        int[] iArr = this.f44338b;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) ^ iArr[i2];
    }

    public boolean get(int i) {
        if (((1 << (i & 31)) & this.f44338b[i / 32]) != 0) {
            return true;
        }
        return false;
    }

    public int[] getBitArray() {
        return this.f44338b;
    }

    public int getNextSet(int i) {
        int i2 = this.f44339c;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.f44338b[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f44338b;
            if (i3 == iArr.length) {
                return this.f44339c;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f44339c;
        if (numberOfTrailingZeros > i5) {
            return i5;
        }
        return numberOfTrailingZeros;
    }

    public int getNextUnset(int i) {
        int i2 = this.f44339c;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.f44338b[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f44338b;
            if (i3 == iArr.length) {
                return this.f44339c;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f44339c;
        if (numberOfTrailingZeros > i5) {
            return i5;
        }
        return numberOfTrailingZeros;
    }

    public int getSize() {
        return this.f44339c;
    }

    public int getSizeInBytes() {
        return (this.f44339c + 7) / 8;
    }

    public int hashCode() {
        return (this.f44339c * 31) + Arrays.hashCode(this.f44338b);
    }

    public boolean isRange(int i, int i2, boolean z) {
        int i3;
        if (i2 >= i && i >= 0 && i2 <= this.f44339c) {
            if (i2 == i) {
                return true;
            }
            int i4 = i2 - 1;
            int i5 = i / 32;
            int i6 = i4 / 32;
            for (int i7 = i5; i7 <= i6; i7++) {
                int i8 = 31;
                if (i7 > i5) {
                    i3 = 0;
                } else {
                    i3 = i & 31;
                }
                if (i7 >= i6) {
                    i8 = 31 & i4;
                }
                int i9 = (2 << i8) - (1 << i3);
                int i10 = this.f44338b[i7] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    public void reverse() {
        int[] iArr = new int[this.f44338b.length];
        int i = (this.f44339c - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.f44338b[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f44339c;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f44338b = iArr;
    }

    public void set(int i) {
        int[] iArr = this.f44338b;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public void setBulk(int i, int i2) {
        this.f44338b[i / 32] = i2;
    }

    public void setRange(int i, int i2) {
        int i3;
        if (i2 >= i && i >= 0 && i2 <= this.f44339c) {
            if (i2 == i) {
                return;
            }
            int i4 = i2 - 1;
            int i5 = i / 32;
            int i6 = i4 / 32;
            for (int i7 = i5; i7 <= i6; i7++) {
                int i8 = 31;
                if (i7 > i5) {
                    i3 = 0;
                } else {
                    i3 = i & 31;
                }
                if (i7 >= i6) {
                    i8 = 31 & i4;
                }
                int i9 = (2 << i8) - (1 << i3);
                int[] iArr = this.f44338b;
                iArr[i7] = i9 | iArr[i7];
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void toBytes(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (get(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public String toString() {
        char c;
        int i = this.f44339c;
        StringBuilder sb2 = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f44339c; i2++) {
            if ((i2 & 7) == 0) {
                sb2.append(' ');
            }
            if (get(i2)) {
                c = 'X';
            } else {
                c = '.';
            }
            sb2.append(c);
        }
        return sb2.toString();
    }

    public void xor(BitArray bitArray) {
        if (this.f44339c == bitArray.f44339c) {
            int i = 0;
            while (true) {
                int[] iArr = this.f44338b;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ bitArray.f44338b[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    /* renamed from: clone */
    public BitArray m110231clone() {
        return new BitArray((int[]) this.f44338b.clone(), this.f44339c);
    }

    public BitArray(int i) {
        this.f44339c = i;
        this.f44338b = m66027c(i);
    }

    BitArray(int[] iArr, int i) {
        this.f44338b = iArr;
        this.f44339c = i;
    }
}
