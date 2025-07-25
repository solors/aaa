package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class AFj1iSDK extends FilterInputStream {
    private final int AFLogger;
    private final byte[] afInfoLog;

    /* renamed from: d */
    private final int[] f13075d;

    /* renamed from: e */
    private final byte[][] f13076e;
    private int force;
    private final int[] registerClient;
    private final byte[] unregisterClient;

    /* renamed from: v */
    private int f13077v;

    /* renamed from: w */
    private int f13078w;
    private static final byte[] values = AFj1hSDK.AFInAppEventType;
    private static final int[] valueOf = AFj1hSDK.AFKeystoreWrapper;
    private static final int[] AFInAppEventParameterName = AFj1hSDK.values;
    private static final int[] AFInAppEventType = AFj1hSDK.AFInAppEventParameterName;
    private static final int[] AFKeystoreWrapper = AFj1hSDK.valueOf;

    public AFj1iSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.f13075d = new int[4];
        this.unregisterClient = new byte[16];
        this.afInfoLog = new byte[16];
        this.f13078w = Integer.MAX_VALUE;
        this.f13077v = 16;
        this.force = 16;
        this.AFLogger = i;
        this.registerClient = AFj1hSDK.AFInAppEventParameterName(bArr, i);
        this.f13076e = values(bArr2);
    }

    private void AFKeystoreWrapper(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f13075d;
        char c = 1;
        int i = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.registerClient;
        iArr[0] = i ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i2 = 4;
        int i3 = 1;
        while (i3 < this.AFLogger) {
            int[] iArr3 = valueOf;
            int[] iArr4 = this.f13075d;
            byte[][] bArr3 = this.f13076e;
            byte[] bArr4 = bArr3[0];
            int i4 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = AFInAppEventParameterName;
            byte[] bArr5 = bArr3[c];
            int i5 = i4 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFInAppEventType;
            byte[] bArr6 = bArr3[2];
            int i6 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i5;
            int[] iArr7 = AFKeystoreWrapper;
            byte[] bArr7 = bArr3[3];
            int i7 = iArr7[iArr4[bArr7[0]] & 255] ^ i6;
            int[] iArr8 = this.registerClient;
            int i8 = i7 ^ iArr8[i2];
            int i9 = ((iArr6[(iArr4[bArr6[c]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c]] >>> 24] ^ iArr5[(iArr4[bArr5[c]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c]] & 255]) ^ iArr8[i2 + 1];
            int i10 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i2 + 2];
            iArr4[0] = i8;
            iArr4[1] = i9;
            iArr4[2] = i10;
            iArr4[3] = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i2 + 3];
            i3++;
            i2 += 4;
            c = 1;
        }
        int[] iArr9 = this.registerClient;
        int i11 = iArr9[i2];
        byte[] bArr8 = values;
        int[] iArr10 = this.f13075d;
        byte[][] bArr9 = this.f13076e;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i11 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i11 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i11 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i11);
        int i12 = iArr9[i2 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i12 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i12 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i12 >>> 8));
        bArr2[7] = (byte) (i12 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i13 = iArr9[i2 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i13 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[11] = (byte) (i13 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i14 = iArr9[i2 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i14 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i14 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i14 >>> 8));
        bArr2[15] = (byte) (i14 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    private static byte[][] values(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 < bArr3.length) {
                    bArr2[i][bArr3[i2]] = (byte) i2;
                    i2++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        values();
        return this.force - this.f13077v;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        values();
        int i = this.f13077v;
        if (i >= this.force) {
            return -1;
        }
        byte[] bArr = this.afInfoLog;
        this.f13077v = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            values();
            int i5 = this.f13077v;
            if (i5 >= this.force) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.afInfoLog;
            this.f13077v = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    private int values() throws IOException {
        if (this.f13078w == Integer.MAX_VALUE) {
            this.f13078w = ((FilterInputStream) this).in.read();
        }
        if (this.f13077v == 16) {
            byte[] bArr = this.unregisterClient;
            int i = this.f13078w;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.unregisterClient, i2, 16 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 16);
            if (i2 >= 16) {
                AFKeystoreWrapper(this.unregisterClient, this.afInfoLog);
                int read2 = ((FilterInputStream) this).in.read();
                this.f13078w = read2;
                this.f13077v = 0;
                this.force = read2 < 0 ? 16 - (this.afInfoLog[15] & 255) : 16;
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.force;
    }
}
