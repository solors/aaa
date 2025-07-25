package com.google.zxing;

/* loaded from: classes5.dex */
public final class InvertedLuminanceSource extends LuminanceSource {

    /* renamed from: c */
    private final LuminanceSource f44157c;

    public InvertedLuminanceSource(LuminanceSource luminanceSource) {
        super(luminanceSource.getWidth(), luminanceSource.getHeight());
        this.f44157c = luminanceSource;
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i, int i2, int i3, int i4) {
        return new InvertedLuminanceSource(this.f44157c.crop(i, i2, i3, i4));
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        byte[] matrix = this.f44157c.getMatrix();
        int width = getWidth() * getHeight();
        byte[] bArr = new byte[width];
        for (int i = 0; i < width; i++) {
            bArr[i] = (byte) (255 - (matrix[i] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i, byte[] bArr) {
        byte[] row = this.f44157c.getRow(i, bArr);
        int width = getWidth();
        for (int i2 = 0; i2 < width; i2++) {
            row[i2] = (byte) (255 - (row[i2] & 255));
        }
        return row;
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource invert() {
        return this.f44157c;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return this.f44157c.isCropSupported();
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isRotateSupported() {
        return this.f44157c.isRotateSupported();
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource rotateCounterClockwise() {
        return new InvertedLuminanceSource(this.f44157c.rotateCounterClockwise());
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource rotateCounterClockwise45() {
        return new InvertedLuminanceSource(this.f44157c.rotateCounterClockwise45());
    }
}
