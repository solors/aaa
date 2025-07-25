package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class ByteMatrix {

    /* renamed from: a */
    private final byte[][] f44741a;

    /* renamed from: b */
    private final int f44742b;

    /* renamed from: c */
    private final int f44743c;

    public ByteMatrix(int i, int i2) {
        this.f44741a = (byte[][]) Array.newInstance(Byte.TYPE, i2, i);
        this.f44742b = i;
        this.f44743c = i2;
    }

    public void clear(byte b) {
        for (byte[] bArr : this.f44741a) {
            Arrays.fill(bArr, b);
        }
    }

    public byte get(int i, int i2) {
        return this.f44741a[i2][i];
    }

    public byte[][] getArray() {
        return this.f44741a;
    }

    public int getHeight() {
        return this.f44743c;
    }

    public int getWidth() {
        return this.f44742b;
    }

    public void set(int i, int i2, byte b) {
        this.f44741a[i2][i] = b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f44742b * 2 * this.f44743c) + 2);
        for (int i = 0; i < this.f44743c; i++) {
            byte[] bArr = this.f44741a[i];
            for (int i2 = 0; i2 < this.f44742b; i2++) {
                byte b = bArr[i2];
                if (b != 0) {
                    if (b != 1) {
                        sb2.append("  ");
                    } else {
                        sb2.append(" 1");
                    }
                } else {
                    sb2.append(" 0");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }

    public void set(int i, int i2, int i3) {
        this.f44741a[i2][i] = (byte) i3;
    }

    public void set(int i, int i2, boolean z) {
        this.f44741a[i2][i] = z ? (byte) 1 : (byte) 0;
    }
}
