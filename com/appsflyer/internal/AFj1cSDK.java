package com.appsflyer.internal;

/* loaded from: classes2.dex */
public class AFj1cSDK {
    public static void values(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
