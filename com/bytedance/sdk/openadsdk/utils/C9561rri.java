package com.bytedance.sdk.openadsdk.utils;

import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.security.SecureRandom;
import java.util.UUID;

/* renamed from: com.bytedance.sdk.openadsdk.utils.rri */
/* loaded from: classes3.dex */
public class C9561rri {

    /* renamed from: bg */
    private static final ThreadLocal<SecureRandom> f21332bg = new ThreadLocal<>();

    /* renamed from: bg */
    public static String m82393bg() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = f21332bg;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | SignedBytes.MAX_POWER_OF_TWO);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | UnsignedBytes.MAX_POWER_OF_TWO);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | (bArr[i] & 255);
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return new UUID(j2, j).toString();
    }
}
