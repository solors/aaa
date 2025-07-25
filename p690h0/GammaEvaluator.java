package p690h0;

/* renamed from: h0.d */
/* loaded from: classes2.dex */
public class GammaEvaluator {
    /* renamed from: a */
    private static float m23911a(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: b */
    private static float m23910b(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: c */
    public static int m23909c(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float m23911a = m23911a(((i >> 16) & 255) / 255.0f);
        float m23911a2 = m23911a(((i >> 8) & 255) / 255.0f);
        float m23911a3 = m23911a((i & 255) / 255.0f);
        float m23911a4 = m23911a(((i2 >> 16) & 255) / 255.0f);
        float m23911a5 = m23911a(((i2 >> 8) & 255) / 255.0f);
        float m23911a6 = m23911a3 + (f * (m23911a((i2 & 255) / 255.0f) - m23911a3));
        return (Math.round(m23910b(m23911a + ((m23911a4 - m23911a) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(m23910b(m23911a2 + ((m23911a5 - m23911a2) * f)) * 255.0f) << 8) | Math.round(m23910b(m23911a6) * 255.0f);
    }
}
