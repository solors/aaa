package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;

/* renamed from: com.bytedance.sdk.openadsdk.core.bg */
/* loaded from: classes3.dex */
public final class C8910bg {

    /* renamed from: bg */
    private static final String f19707bg = m84428bX();

    /* renamed from: IL */
    private static final String f19706IL = C8838VzQ.eqN().mo83786bX();

    /* renamed from: IL */
    public static String m84429IL() {
        return new String(Base64.decode(f19706IL, 0)).substring(2);
    }

    /* renamed from: bX */
    private static String m84428bX() {
        char[] cArr = {203, 182, 168, 176, 207, 148, 149, 178, 205, 182, 149, 166, 134, 178, 184, 176, 206, 174, 187, 178, 150, 185, 167, 166};
        char[] cArr2 = new char[24];
        for (int i = 23; i >= 0; i--) {
            cArr2[23 - i] = (char) (cArr[i] ^ 255);
        }
        return new String(cArr2);
    }

    /* renamed from: bg */
    public static String m84427bg() {
        return new String(Base64.decode(f19707bg, 0)).substring(2);
    }
}
