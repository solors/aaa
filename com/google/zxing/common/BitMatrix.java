package com.google.zxing.common;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class BitMatrix implements Cloneable {

    /* renamed from: b */
    private final int f44340b;

    /* renamed from: c */
    private final int f44341c;

    /* renamed from: d */
    private final int f44342d;

    /* renamed from: f */
    private final int[] f44343f;

    public BitMatrix(int i) {
        this(i, i);
    }

    /* renamed from: b */
    private String m66026b(String str, String str2, String str3) {
        String str4;
        StringBuilder sb2 = new StringBuilder(this.f44341c * (this.f44340b + 1));
        for (int i = 0; i < this.f44341c; i++) {
            for (int i2 = 0; i2 < this.f44340b; i2++) {
                if (get(i2, i)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                sb2.append(str4);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public static BitMatrix parse(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        BitMatrix bitMatrix = new BitMatrix(length2, length);
        for (int i = 0; i < length; i++) {
            boolean[] zArr2 = zArr[i];
            for (int i2 = 0; i2 < length2; i2++) {
                if (zArr2[i2]) {
                    bitMatrix.set(i2, i);
                }
            }
        }
        return bitMatrix;
    }

    public void clear() {
        int length = this.f44343f.length;
        for (int i = 0; i < length; i++) {
            this.f44343f[i] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        if (this.f44340b != bitMatrix.f44340b || this.f44341c != bitMatrix.f44341c || this.f44342d != bitMatrix.f44342d || !Arrays.equals(this.f44343f, bitMatrix.f44343f)) {
            return false;
        }
        return true;
    }

    public void flip(int i, int i2) {
        int i3 = (i2 * this.f44342d) + (i / 32);
        int[] iArr = this.f44343f;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public boolean get(int i, int i2) {
        if (((this.f44343f[(i2 * this.f44342d) + (i / 32)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public int[] getBottomRightOnBit() {
        int length = this.f44343f.length - 1;
        while (length >= 0 && this.f44343f[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f44342d;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f44343f[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public int[] getEnclosingRectangle() {
        int i = this.f44340b;
        int i2 = this.f44341c;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f44341c; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f44342d;
                if (i6 < i7) {
                    int i8 = this.f44343f[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 << 5;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public int getHeight() {
        return this.f44341c;
    }

    public BitArray getRow(int i, BitArray bitArray) {
        if (bitArray != null && bitArray.getSize() >= this.f44340b) {
            bitArray.clear();
        } else {
            bitArray = new BitArray(this.f44340b);
        }
        int i2 = i * this.f44342d;
        for (int i3 = 0; i3 < this.f44342d; i3++) {
            bitArray.setBulk(i3 << 5, this.f44343f[i2 + i3]);
        }
        return bitArray;
    }

    public int getRowSize() {
        return this.f44342d;
    }

    public int[] getTopLeftOnBit() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f44343f;
            if (i >= iArr.length || iArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f44342d;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    public int getWidth() {
        return this.f44340b;
    }

    public int hashCode() {
        int i = this.f44340b;
        return (((((((i * 31) + i) * 31) + this.f44341c) * 31) + this.f44342d) * 31) + Arrays.hashCode(this.f44343f);
    }

    public void rotate180() {
        int width = getWidth();
        int height = getHeight();
        BitArray bitArray = new BitArray(width);
        BitArray bitArray2 = new BitArray(width);
        for (int i = 0; i < (height + 1) / 2; i++) {
            bitArray = getRow(i, bitArray);
            int i2 = (height - 1) - i;
            bitArray2 = getRow(i2, bitArray2);
            bitArray.reverse();
            bitArray2.reverse();
            setRow(i, bitArray2);
            setRow(i2, bitArray);
        }
    }

    public void set(int i, int i2) {
        int i3 = (i2 * this.f44342d) + (i / 32);
        int[] iArr = this.f44343f;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void setRegion(int i, int i2, int i3, int i4) {
        if (i2 >= 0 && i >= 0) {
            if (i4 > 0 && i3 > 0) {
                int i5 = i3 + i;
                int i6 = i4 + i2;
                if (i6 <= this.f44341c && i5 <= this.f44340b) {
                    while (i2 < i6) {
                        int i7 = this.f44342d * i2;
                        for (int i8 = i; i8 < i5; i8++) {
                            int[] iArr = this.f44343f;
                            int i9 = (i8 / 32) + i7;
                            iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                        }
                        i2++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public void setRow(int i, BitArray bitArray) {
        int[] bitArray2 = bitArray.getBitArray();
        int[] iArr = this.f44343f;
        int i2 = this.f44342d;
        System.arraycopy(bitArray2, 0, iArr, i * i2, i2);
    }

    public String toString() {
        return toString("X ", "  ");
    }

    public void unset(int i, int i2) {
        int i3 = (i2 * this.f44342d) + (i / 32);
        int[] iArr = this.f44343f;
        iArr[i3] = (~(1 << (i & 31))) & iArr[i3];
    }

    public void xor(BitMatrix bitMatrix) {
        if (this.f44340b == bitMatrix.getWidth() && this.f44341c == bitMatrix.getHeight() && this.f44342d == bitMatrix.getRowSize()) {
            BitArray bitArray = new BitArray(this.f44340b);
            for (int i = 0; i < this.f44341c; i++) {
                int i2 = this.f44342d * i;
                int[] bitArray2 = bitMatrix.getRow(i, bitArray).getBitArray();
                for (int i3 = 0; i3 < this.f44342d; i3++) {
                    int[] iArr = this.f44343f;
                    int i4 = i2 + i3;
                    iArr[i4] = iArr[i4] ^ bitArray2[i3];
                }
            }
            return;
        }
        throw new IllegalArgumentException("input matrix dimensions do not match");
    }

    public BitMatrix(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f44340b = i;
            this.f44341c = i2;
            int i3 = (i + 31) / 32;
            this.f44342d = i3;
            this.f44343f = new int[i3 * i2];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    /* renamed from: clone */
    public BitMatrix m110232clone() {
        return new BitMatrix(this.f44340b, this.f44341c, this.f44342d, (int[]) this.f44343f.clone());
    }

    public String toString(String str, String str2) {
        return m66026b(str, str2, "\n");
    }

    @Deprecated
    public String toString(String str, String str2, String str3) {
        return m66026b(str, str2, str3);
    }

    public static BitMatrix parse(String str, String str2, String str3) {
        if (str != null) {
            boolean[] zArr = new boolean[str.length()];
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i2 < str.length()) {
                if (str.charAt(i2) == '\n' || str.charAt(i2) == '\r') {
                    if (i3 > i4) {
                        if (i == -1) {
                            i = i3 - i4;
                        } else if (i3 - i4 != i) {
                            throw new IllegalArgumentException("row lengths do not match");
                        }
                        i5++;
                        i4 = i3;
                    }
                    i2++;
                } else {
                    if (str.substring(i2, str2.length() + i2).equals(str2)) {
                        i2 += str2.length();
                        zArr[i3] = true;
                    } else if (str.substring(i2, str3.length() + i2).equals(str3)) {
                        i2 += str3.length();
                        zArr[i3] = false;
                    } else {
                        throw new IllegalArgumentException("illegal character encountered: " + str.substring(i2));
                    }
                    i3++;
                }
            }
            if (i3 > i4) {
                if (i == -1) {
                    i = i3 - i4;
                } else if (i3 - i4 != i) {
                    throw new IllegalArgumentException("row lengths do not match");
                }
                i5++;
            }
            BitMatrix bitMatrix = new BitMatrix(i, i5);
            for (int i6 = 0; i6 < i3; i6++) {
                if (zArr[i6]) {
                    bitMatrix.set(i6 % i, i6 / i);
                }
            }
            return bitMatrix;
        }
        throw new IllegalArgumentException();
    }

    private BitMatrix(int i, int i2, int i3, int[] iArr) {
        this.f44340b = i;
        this.f44341c = i2;
        this.f44342d = i3;
        this.f44343f = iArr;
    }
}
