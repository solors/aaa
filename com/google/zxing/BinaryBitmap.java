package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes5.dex */
public final class BinaryBitmap {

    /* renamed from: a */
    private final Binarizer f44148a;

    /* renamed from: b */
    private BitMatrix f44149b;

    public BinaryBitmap(Binarizer binarizer) {
        if (binarizer != null) {
            this.f44148a = binarizer;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public BinaryBitmap crop(int i, int i2, int i3, int i4) {
        return new BinaryBitmap(this.f44148a.createBinarizer(this.f44148a.getLuminanceSource().crop(i, i2, i3, i4)));
    }

    public BitMatrix getBlackMatrix() throws NotFoundException {
        if (this.f44149b == null) {
            this.f44149b = this.f44148a.getBlackMatrix();
        }
        return this.f44149b;
    }

    public BitArray getBlackRow(int i, BitArray bitArray) throws NotFoundException {
        return this.f44148a.getBlackRow(i, bitArray);
    }

    public int getHeight() {
        return this.f44148a.getHeight();
    }

    public int getWidth() {
        return this.f44148a.getWidth();
    }

    public boolean isCropSupported() {
        return this.f44148a.getLuminanceSource().isCropSupported();
    }

    public boolean isRotateSupported() {
        return this.f44148a.getLuminanceSource().isRotateSupported();
    }

    public BinaryBitmap rotateCounterClockwise() {
        return new BinaryBitmap(this.f44148a.createBinarizer(this.f44148a.getLuminanceSource().rotateCounterClockwise()));
    }

    public BinaryBitmap rotateCounterClockwise45() {
        return new BinaryBitmap(this.f44148a.createBinarizer(this.f44148a.getLuminanceSource().rotateCounterClockwise45()));
    }

    public String toString() {
        try {
            return getBlackMatrix().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
