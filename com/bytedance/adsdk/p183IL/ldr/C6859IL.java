package com.bytedance.adsdk.p183IL.ldr;

/* renamed from: com.bytedance.adsdk.IL.ldr.IL */
/* loaded from: classes3.dex */
public class C6859IL {
    /* renamed from: IL */
    private static float m90652IL(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: bg */
    private static float m90651bg(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: bg */
    public static int m90650bg(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float m90652IL = m90652IL(((i >> 16) & 255) / 255.0f);
        float m90652IL2 = m90652IL(((i >> 8) & 255) / 255.0f);
        float m90652IL3 = m90652IL((i & 255) / 255.0f);
        float m90652IL4 = m90652IL(((i2 >> 16) & 255) / 255.0f);
        float m90652IL5 = m90652IL(((i2 >> 8) & 255) / 255.0f);
        float m90652IL6 = m90652IL3 + (f * (m90652IL((i2 & 255) / 255.0f) - m90652IL3));
        return (Math.round(m90651bg(m90652IL + ((m90652IL4 - m90652IL) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(m90651bg(m90652IL2 + ((m90652IL5 - m90652IL2) * f)) * 255.0f) << 8) | Math.round(m90651bg(m90652IL6) * 255.0f);
    }
}
