package com.google.zxing;

/* loaded from: classes5.dex */
public abstract class LuminanceSource {

    /* renamed from: a */
    private final int f44158a;

    /* renamed from: b */
    private final int f44159b;

    /* JADX INFO: Access modifiers changed from: protected */
    public LuminanceSource(int i, int i2) {
        this.f44158a = i;
        this.f44159b = i2;
    }

    public LuminanceSource crop(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int getHeight() {
        return this.f44159b;
    }

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int i, byte[] bArr);

    public final int getWidth() {
        return this.f44158a;
    }

    public LuminanceSource invert() {
        return new InvertedLuminanceSource(this);
    }

    public boolean isCropSupported() {
        return false;
    }

    public boolean isRotateSupported() {
        return false;
    }

    public LuminanceSource rotateCounterClockwise() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public LuminanceSource rotateCounterClockwise45() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        char c;
        int i = this.f44158a;
        byte[] bArr = new byte[i];
        StringBuilder sb2 = new StringBuilder(this.f44159b * (i + 1));
        for (int i2 = 0; i2 < this.f44159b; i2++) {
            bArr = getRow(i2, bArr);
            for (int i3 = 0; i3 < this.f44158a; i3++) {
                int i4 = bArr[i3] & 255;
                if (i4 < 64) {
                    c = '#';
                } else if (i4 < 128) {
                    c = '+';
                } else if (i4 < 192) {
                    c = '.';
                } else {
                    c = ' ';
                }
                sb2.append(c);
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
