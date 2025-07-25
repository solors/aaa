package com.google.zxing;

/* loaded from: classes5.dex */
public final class RGBLuminanceSource extends LuminanceSource {

    /* renamed from: c */
    private final byte[] f44169c;

    /* renamed from: d */
    private final int f44170d;

    /* renamed from: e */
    private final int f44171e;

    /* renamed from: f */
    private final int f44172f;

    /* renamed from: g */
    private final int f44173g;

    public RGBLuminanceSource(int i, int i2, int[] iArr) {
        super(i, i2);
        this.f44170d = i;
        this.f44171e = i2;
        this.f44172f = 0;
        this.f44173g = 0;
        int i3 = i * i2;
        this.f44169c = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            this.f44169c[i4] = (byte) (((((i5 >> 16) & 255) + ((i5 >> 7) & 510)) + (i5 & 255)) / 4);
        }
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i, int i2, int i3, int i4) {
        return new RGBLuminanceSource(this.f44169c, this.f44170d, this.f44171e, this.f44172f + i, this.f44173g + i2, i3, i4);
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        int i = this.f44170d;
        if (width == i && height == this.f44171e) {
            return this.f44169c;
        }
        int i2 = width * height;
        byte[] bArr = new byte[i2];
        int i3 = (this.f44173g * i) + this.f44172f;
        if (width == i) {
            System.arraycopy(this.f44169c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < height; i4++) {
            System.arraycopy(this.f44169c, i3, bArr, i4 * width, width);
            i3 += this.f44170d;
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i, byte[] bArr) {
        if (i >= 0 && i < getHeight()) {
            int width = getWidth();
            if (bArr == null || bArr.length < width) {
                bArr = new byte[width];
            }
            System.arraycopy(this.f44169c, ((i + this.f44173g) * this.f44170d) + this.f44172f, bArr, 0, width);
            return bArr;
        }
        throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }

    private RGBLuminanceSource(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 <= i && i6 + i4 <= i2) {
            this.f44169c = bArr;
            this.f44170d = i;
            this.f44171e = i2;
            this.f44172f = i3;
            this.f44173g = i4;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }
}
