package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;

/* loaded from: classes5.dex */
public class GlobalHistogramBinarizer extends Binarizer {

    /* renamed from: d */
    private static final byte[] f44364d = new byte[0];

    /* renamed from: b */
    private byte[] f44365b;

    /* renamed from: c */
    private final int[] f44366c;

    public GlobalHistogramBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
        this.f44365b = f44364d;
        this.f44366c = new int[32];
    }

    /* renamed from: a */
    private static int m66025a(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        if (i3 - i6 > length / 16) {
            int i12 = i3 - 1;
            int i13 = -1;
            int i14 = i12;
            while (i12 > i6) {
                int i15 = i12 - i6;
                int i16 = i15 * i15 * (i3 - i12) * (i2 - iArr[i12]);
                if (i16 > i13) {
                    i14 = i12;
                    i13 = i16;
                }
                i12--;
            }
            return i14 << 3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: b */
    private void m66024b(int i) {
        if (this.f44365b.length < i) {
            this.f44365b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f44366c[i2] = 0;
        }
    }

    @Override // com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new GlobalHistogramBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.Binarizer
    public BitMatrix getBlackMatrix() throws NotFoundException {
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        BitMatrix bitMatrix = new BitMatrix(width, height);
        m66024b(width);
        int[] iArr = this.f44366c;
        for (int i = 1; i < 5; i++) {
            byte[] row = luminanceSource.getRow((height * i) / 5, this.f44365b);
            int i2 = (width << 2) / 5;
            for (int i3 = width / 5; i3 < i2; i3++) {
                int i4 = (row[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int m66025a = m66025a(iArr);
        byte[] matrix = luminanceSource.getMatrix();
        for (int i5 = 0; i5 < height; i5++) {
            int i6 = i5 * width;
            for (int i7 = 0; i7 < width; i7++) {
                if ((matrix[i6 + i7] & 255) < m66025a) {
                    bitMatrix.set(i7, i5);
                }
            }
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Binarizer
    public BitArray getBlackRow(int i, BitArray bitArray) throws NotFoundException {
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        if (bitArray != null && bitArray.getSize() >= width) {
            bitArray.clear();
        } else {
            bitArray = new BitArray(width);
        }
        m66024b(width);
        byte[] row = luminanceSource.getRow(i, this.f44365b);
        int[] iArr = this.f44366c;
        for (int i2 = 0; i2 < width; i2++) {
            int i3 = (row[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int m66025a = m66025a(iArr);
        if (width < 3) {
            for (int i4 = 0; i4 < width; i4++) {
                if ((row[i4] & 255) < m66025a) {
                    bitArray.set(i4);
                }
            }
        } else {
            int i5 = row[1] & 255;
            int i6 = 1;
            int i7 = row[0] & 255;
            int i8 = i5;
            while (i6 < width - 1) {
                int i9 = i6 + 1;
                int i10 = row[i9] & 255;
                if ((((i8 << 2) - i7) - i10) / 2 < m66025a) {
                    bitArray.set(i6);
                }
                i7 = i8;
                i6 = i9;
                i8 = i10;
            }
        }
        return bitArray;
    }
}
