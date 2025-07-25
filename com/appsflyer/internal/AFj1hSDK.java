package com.appsflyer.internal;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes2.dex */
public final class AFj1hSDK {

    /* renamed from: e */
    private static byte[] f13074e = new byte[256];
    static final byte[] AFInAppEventType = new byte[256];
    static final int[] AFKeystoreWrapper = new int[256];
    static final int[] values = new int[256];
    static final int[] AFInAppEventParameterName = new int[256];
    static final int[] valueOf = new int[256];
    private static int[] AFLogger = new int[10];

    static {
        int i;
        byte b;
        byte[] bArr;
        int i2;
        byte b2 = 1;
        byte b3 = 1;
        do {
            int i3 = (b2 << 1) ^ b2;
            if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                i = 27;
            } else {
                i = 0;
            }
            b2 = (byte) (i ^ i3);
            byte b4 = (byte) (b3 ^ (b3 << 1));
            byte b5 = (byte) (b4 ^ (b4 << 2));
            byte b6 = (byte) (b5 ^ (b5 << 4));
            if ((b6 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                b = 9;
            } else {
                b = 0;
            }
            b3 = (byte) (b6 ^ b);
            bArr = f13074e;
            i2 = b2 & 255;
            int i4 = b3 & 255;
            bArr[i2] = (byte) (((((b3 ^ 99) ^ ((i4 << 1) | (i4 >> 7))) ^ ((i4 << 2) | (i4 >> 6))) ^ ((i4 << 3) | (i4 >> 5))) ^ ((i4 >> 4) | (i4 << 4)));
        } while (i2 != 1);
        bArr[0] = 99;
        for (int i5 = 0; i5 < 256; i5++) {
            int i6 = f13074e[i5] & 255;
            AFInAppEventType[i6] = (byte) i5;
            int i7 = i5 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 << 1;
            if (i8 >= 256) {
                i8 ^= 283;
            }
            int i9 = i8 << 1;
            if (i9 >= 256) {
                i9 ^= 283;
            }
            int i10 = i9 ^ i5;
            int i11 = ((i7 ^ (i8 ^ i9)) << 24) | (i10 << 16) | ((i10 ^ i8) << 8) | (i10 ^ i7);
            AFKeystoreWrapper[i6] = i11;
            values[i6] = (i11 >>> 8) | (i11 << 24);
            AFInAppEventParameterName[i6] = (i11 >>> 16) | (i11 << 16);
            valueOf[i6] = (i11 << 8) | (i11 >>> 24);
        }
        AFLogger[0] = 16777216;
        int i12 = 1;
        for (int i13 = 1; i13 < 10; i13++) {
            i12 <<= 1;
            if (i12 >= 256) {
                i12 ^= 283;
            }
            AFLogger[i13] = i12 << 24;
        }
    }

    public static byte[][] AFInAppEventParameterName(int i) {
        byte[][] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            byte[] bArr2 = new byte[4];
            bArr2[0] = (byte) (i3 & 3);
            bArr2[1] = (byte) ((i3 >> 2) & 3);
            bArr2[2] = (byte) ((i3 >> 4) & 3);
            bArr2[3] = (byte) ((i3 >> 6) & 3);
            bArr[i2] = bArr2;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] AFInAppEventParameterName(byte[] bArr, int i) throws IllegalArgumentException {
        if (bArr.length == 16) {
            int i2 = 4;
            int i3 = (i + 1) * 4;
            int[] iArr = new int[i3];
            int i4 = 0;
            int i5 = 0;
            while (i4 < 4) {
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = (bArr[i5] << 24) | ((bArr[i6] & 255) << 16);
                int i9 = i7 + 1;
                iArr[i4] = i8 | ((bArr[i7] & 255) << 8) | (bArr[i9] & 255);
                i4++;
                i5 = i9 + 1;
            }
            int i10 = 4;
            int i11 = 0;
            int i12 = 0;
            while (i10 < i3) {
                int i13 = iArr[i10 - 1];
                if (i11 == 0) {
                    byte[] bArr2 = f13074e;
                    i13 = ((bArr2[i13 >>> 24] & 255) | (((bArr2[(i13 >>> 16) & 255] << 24) | ((bArr2[(i13 >>> 8) & 255] & 255) << 16)) | ((bArr2[i13 & 255] & 255) << 8))) ^ AFLogger[i12];
                    i11 = 4;
                    i12++;
                }
                iArr[i10] = i13 ^ iArr[i10 - 4];
                i10++;
                i11--;
            }
            if (bArr.length == 16) {
                int[] iArr2 = new int[i3];
                int i14 = i * 4;
                int i15 = i14 + 1;
                iArr2[0] = iArr[i14];
                int i16 = i15 + 1;
                iArr2[1] = iArr[i15];
                int i17 = i16 + 1;
                iArr2[2] = iArr[i16];
                iArr2[3] = iArr[i17];
                int i18 = i17 - 7;
                for (int i19 = 1; i19 < i; i19++) {
                    int i20 = i18 + 1;
                    int i21 = iArr[i18];
                    int i22 = i2 + 1;
                    int[] iArr3 = AFKeystoreWrapper;
                    byte[] bArr3 = f13074e;
                    int i23 = iArr3[bArr3[i21 >>> 24] & 255];
                    int[] iArr4 = values;
                    int i24 = i23 ^ iArr4[bArr3[(i21 >>> 16) & 255] & 255];
                    int[] iArr5 = AFInAppEventParameterName;
                    int i25 = i24 ^ iArr5[bArr3[(i21 >>> 8) & 255] & 255];
                    int[] iArr6 = valueOf;
                    iArr2[i2] = iArr6[bArr3[i21 & 255] & 255] ^ i25;
                    int i26 = i20 + 1;
                    int i27 = iArr[i20];
                    int i28 = i22 + 1;
                    iArr2[i22] = iArr6[bArr3[i27 & 255] & 255] ^ ((iArr3[bArr3[i27 >>> 24] & 255] ^ iArr4[bArr3[(i27 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i27 >>> 8) & 255] & 255]);
                    int i29 = i26 + 1;
                    int i30 = iArr[i26];
                    int i31 = i28 + 1;
                    iArr2[i28] = iArr6[bArr3[i30 & 255] & 255] ^ ((iArr3[bArr3[i30 >>> 24] & 255] ^ iArr4[bArr3[(i30 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i30 >>> 8) & 255] & 255]);
                    int i32 = iArr[i29];
                    i2 = i31 + 1;
                    iArr2[i31] = iArr6[bArr3[i32 & 255] & 255] ^ ((iArr3[bArr3[i32 >>> 24] & 255] ^ iArr4[bArr3[(i32 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i32 >>> 8) & 255] & 255]);
                    i18 = i29 - 7;
                }
                int i33 = i2 + 1;
                int i34 = i18 + 1;
                iArr2[i2] = iArr[i18];
                int i35 = i33 + 1;
                int i36 = i34 + 1;
                iArr2[i33] = iArr[i34];
                iArr2[i35] = iArr[i36];
                iArr2[i35 + 1] = iArr[i36 + 1];
                return iArr2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
