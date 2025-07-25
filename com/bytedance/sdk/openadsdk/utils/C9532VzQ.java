package com.bytedance.sdk.openadsdk.utils;

/* renamed from: com.bytedance.sdk.openadsdk.utils.VzQ */
/* loaded from: classes3.dex */
public class C9532VzQ {
    /* renamed from: bg */
    public static int m82559bg() {
        try {
            int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 33554432);
            if (maxMemory <= 2) {
                return 2;
            }
            if (maxMemory >= 5) {
                return 5;
            }
            return maxMemory;
        } catch (Throwable unused) {
            return 2;
        }
    }
}
