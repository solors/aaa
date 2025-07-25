package com.bytedance.adsdk.ugeno.yoga;

/* renamed from: com.bytedance.adsdk.ugeno.yoga.VB */
/* loaded from: classes3.dex */
public class C7146VB {
    /* renamed from: bg */
    public static long m89898bg(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return Float.floatToRawIntBits(f2) | (floatToRawIntBits << 32);
    }

    /* renamed from: bg */
    public static long m89897bg(int i, int i2) {
        return m89898bg(i, i2);
    }
}
