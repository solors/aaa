package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class AFj1jSDK extends FilterInputStream {
    private static final short AFInAppEventParameterName = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int AFLogger;

    /* renamed from: d */
    private int f13079d;

    /* renamed from: e */
    private int f13080e;
    private int force;

    /* renamed from: i */
    private int f13081i;
    private int registerClient;
    private int unregisterClient;
    private int valueOf;
    private byte[] values;

    /* renamed from: w */
    private int f13082w;

    public AFj1jSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.f13079d = Integer.MAX_VALUE;
        this.values = new byte[8];
        this.AFKeystoreWrapper = new byte[8];
        this.AFInAppEventType = new byte[8];
        this.valueOf = 8;
        this.unregisterClient = 8;
        this.f13080e = Math.min(Math.max(i2, 5), 16);
        this.registerClient = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, 8);
        }
        long j = ((iArr[0] & 4294967295L) << 32) | (4294967295L & iArr[1]);
        if (i == 0) {
            this.AFLogger = (int) j;
            long j2 = j >> 3;
            short s = AFInAppEventParameterName;
            this.f13082w = (int) ((s * j2) >> 32);
            this.f13081i = (int) (j >> 32);
            this.force = (int) (j2 + s);
            return;
        }
        int i4 = (int) j;
        this.AFLogger = i4;
        this.f13082w = i4 * i;
        this.f13081i = i4 ^ i;
        this.force = (int) (j >> 32);
    }

    private int AFInAppEventType() throws IOException {
        if (this.f13079d == Integer.MAX_VALUE) {
            this.f13079d = ((FilterInputStream) this).in.read();
        }
        int i = 8;
        if (this.valueOf == 8) {
            byte[] bArr = this.values;
            int i2 = this.f13079d;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.values, i3, 8 - i3);
                    if (read <= 0) {
                        break;
                    }
                    i3 += read;
                } while (i3 < 8);
                if (i3 >= 8) {
                    AFKeystoreWrapper();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.f13079d = read2;
                    this.valueOf = 0;
                    if (read2 < 0) {
                        i = 8 - (this.values[7] & 255);
                    }
                    this.unregisterClient = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.unregisterClient;
    }

    private void AFKeystoreWrapper() {
        if (this.registerClient == 3) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.AFInAppEventType, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        int i = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.f13080e;
            if (i3 >= i4) {
                break;
            }
            short s = AFInAppEventParameterName;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.f13081i)) ^ ((i >>> 5) + this.force);
            i -= (((i2 << 4) + this.AFLogger) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.f13082w);
            i3++;
        }
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.registerClient == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.values;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.AFKeystoreWrapper[i5]);
            }
            byte[] bArr5 = this.AFInAppEventType;
            System.arraycopy(bArr5, 0, this.AFKeystoreWrapper, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventType();
        return this.unregisterClient - this.valueOf;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventType();
        int i = this.valueOf;
        if (i >= this.unregisterClient) {
            return -1;
        }
        byte[] bArr = this.values;
        this.valueOf = i + 1;
        return bArr[i] & 255;
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
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFInAppEventType();
            int i5 = this.valueOf;
            if (i5 >= this.unregisterClient) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.values;
            this.valueOf = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}
