package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class AFj1kSDK extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private final int AFInAppEventType;
    private AFj1pSDK AFKeystoreWrapper;
    private int[] AFLogger;

    /* renamed from: d */
    private int f13083d;

    /* renamed from: e */
    private int f13084e;
    private int registerClient;
    private int unregisterClient;
    private byte[] valueOf;
    private byte[] values;

    public AFj1kSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.unregisterClient = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i, 3), 16);
        this.AFInAppEventType = min;
        this.values = new byte[8];
        byte[] bArr2 = new byte[8];
        this.valueOf = bArr2;
        this.AFInAppEventParameterName = new byte[8];
        this.AFLogger = new int[2];
        this.f13083d = 8;
        this.registerClient = 8;
        this.f13084e = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.AFKeystoreWrapper = new AFj1pSDK(iArr, min, true, false);
    }

    private void valueOf() {
        if (this.f13084e == 2) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.AFInAppEventParameterName, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        int i = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = this.AFInAppEventType;
        AFj1pSDK aFj1pSDK = this.AFKeystoreWrapper;
        AFj1lSDK.AFKeystoreWrapper(i, i2, false, i3, aFj1pSDK.values, aFj1pSDK.valueOf, this.AFLogger);
        int[] iArr = this.AFLogger;
        int i4 = iArr[0];
        int i5 = iArr[1];
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i4 >> 24);
        bArr3[1] = (byte) (i4 >> 16);
        bArr3[2] = (byte) (i4 >> 8);
        bArr3[3] = (byte) i4;
        bArr3[4] = (byte) (i5 >> 24);
        bArr3[5] = (byte) (i5 >> 16);
        bArr3[6] = (byte) (i5 >> 8);
        bArr3[7] = (byte) i5;
        if (this.f13084e == 2) {
            for (int i6 = 0; i6 < 8; i6++) {
                byte[] bArr4 = this.values;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.valueOf[i6]);
            }
            byte[] bArr5 = this.AFInAppEventParameterName;
            System.arraycopy(bArr5, 0, this.valueOf, 0, bArr5.length);
        }
    }

    private int values() throws IOException {
        if (this.unregisterClient == Integer.MAX_VALUE) {
            this.unregisterClient = ((FilterInputStream) this).in.read();
        }
        int i = 8;
        if (this.f13083d == 8) {
            byte[] bArr = this.values;
            int i2 = this.unregisterClient;
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
                    valueOf();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.unregisterClient = read2;
                    this.f13083d = 0;
                    if (read2 < 0) {
                        i = 8 - (this.values[7] & 255);
                    }
                    this.registerClient = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.registerClient;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        values();
        return this.registerClient - this.f13083d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        values();
        int i = this.f13083d;
        if (i >= this.registerClient) {
            return -1;
        }
        byte[] bArr = this.values;
        this.f13083d = i + 1;
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
            values();
            int i5 = this.f13083d;
            if (i5 >= this.registerClient) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.values;
            this.f13083d = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}
