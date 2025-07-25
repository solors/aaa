package com.google.android.material.color;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = m71638f(ColorUtils.whitePointD65(), (float) ((ColorUtils.yFromLstar(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    private final float f37254a;

    /* renamed from: b */
    private final float f37255b;

    /* renamed from: c */
    private final float f37256c;

    /* renamed from: d */
    private final float f37257d;

    /* renamed from: e */
    private final float f37258e;

    /* renamed from: f */
    private final float f37259f;

    /* renamed from: g */
    private final float[] f37260g;

    /* renamed from: h */
    private final float f37261h;

    /* renamed from: i */
    private final float f37262i;

    /* renamed from: j */
    private final float f37263j;

    private ViewingConditions(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f37259f = f;
        this.f37254a = f2;
        this.f37255b = f3;
        this.f37256c = f4;
        this.f37257d = f5;
        this.f37258e = f6;
        this.f37260g = fArr;
        this.f37261h = f7;
        this.f37262i = f8;
        this.f37263j = f9;
    }

    /* renamed from: f */
    static ViewingConditions m71638f(float[] fArr, float f, float f2, float f3, boolean z) {
        float lerp;
        float exp;
        float[][] fArr2 = Cam16.f37160j;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = (fArr3[0] * f4) + (fArr3[1] * f5) + (fArr3[2] * f6);
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[0] * f4) + (fArr4[1] * f5) + (fArr4[2] * f6);
        float[] fArr5 = fArr2[2];
        float f9 = (f4 * fArr5[0]) + (f5 * fArr5[1]) + (f6 * fArr5[2]);
        float f10 = (f3 / 10.0f) + 0.8f;
        if (f10 >= 0.9d) {
            lerp = MathUtils.lerp(0.59f, 0.69f, (f10 - 0.9f) * 10.0f);
        } else {
            lerp = MathUtils.lerp(0.525f, 0.59f, (f10 - 0.8f) * 10.0f);
        }
        float f11 = lerp;
        if (z) {
            exp = 1.0f;
        } else {
            exp = (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f10;
        }
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * f) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (f13 * f) + (0.1f * f14 * f14 * ((float) Math.cbrt(f * 5.0d)));
        float yFromLstar = ColorUtils.yFromLstar(f2) / fArr[1];
        double d2 = yFromLstar;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f9) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f8) / 100.0d, 0.42d), pow2};
        float f15 = fArr7[0];
        float f16 = fArr7[1];
        return new ViewingConditions(yFromLstar, ((((f15 * 400.0f) / (f15 + 27.13f)) * 2.0f) + ((f16 * 400.0f) / (f16 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f11, f10, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float m71643a() {
        return this.f37257d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m71642b() {
        return this.f37261h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m71641c() {
        return this.f37258e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m71640d() {
        return this.f37256c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m71639e() {
        return this.f37263j;
    }

    public float getAw() {
        return this.f37254a;
    }

    public float getFlRoot() {
        return this.f37262i;
    }

    public float getN() {
        return this.f37259f;
    }

    public float getNbb() {
        return this.f37255b;
    }

    public float[] getRgbD() {
        return this.f37260g;
    }
}
