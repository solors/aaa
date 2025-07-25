package com.google.zxing;

import androidx.core.view.ViewCompat;

/* loaded from: classes5.dex */
public final class PlanarYUVLuminanceSource extends LuminanceSource {

    /* renamed from: c */
    private final byte[] f44164c;

    /* renamed from: d */
    private final int f44165d;

    /* renamed from: e */
    private final int f44166e;

    /* renamed from: f */
    private final int f44167f;

    /* renamed from: g */
    private final int f44168g;

    public PlanarYUVLuminanceSource(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 <= i && i4 + i6 <= i2) {
            this.f44164c = bArr;
            this.f44165d = i;
            this.f44166e = i2;
            this.f44167f = i3;
            this.f44168g = i4;
            if (z) {
                m66136a(i5, i6);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    /* renamed from: a */
    private void m66136a(int i, int i2) {
        byte[] bArr = this.f44164c;
        int i3 = (this.f44168g * this.f44165d) + this.f44167f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f44165d;
        }
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i, int i2, int i3, int i4) {
        return new PlanarYUVLuminanceSource(this.f44164c, this.f44165d, this.f44166e, this.f44167f + i, this.f44168g + i2, i3, i4, false);
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        int i = this.f44165d;
        if (width == i && height == this.f44166e) {
            return this.f44164c;
        }
        int i2 = width * height;
        byte[] bArr = new byte[i2];
        int i3 = (this.f44168g * i) + this.f44167f;
        if (width == i) {
            System.arraycopy(this.f44164c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < height; i4++) {
            System.arraycopy(this.f44164c, i3, bArr, i4 * width, width);
            i3 += this.f44165d;
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
            System.arraycopy(this.f44164c, ((i + this.f44168g) * this.f44165d) + this.f44167f, bArr, 0, width);
            return bArr;
        }
        throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
    }

    public int getThumbnailHeight() {
        return getHeight() / 2;
    }

    public int getThumbnailWidth() {
        return getWidth() / 2;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }

    public int[] renderThumbnail() {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int[] iArr = new int[width * height];
        byte[] bArr = this.f44164c;
        int i = (this.f44168g * this.f44165d) + this.f44167f;
        for (int i2 = 0; i2 < height; i2++) {
            int i3 = i2 * width;
            for (int i4 = 0; i4 < width; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 << 1) + i] & 255) * 65793) | ViewCompat.MEASURED_STATE_MASK;
            }
            i += this.f44165d << 1;
        }
        return iArr;
    }
}
