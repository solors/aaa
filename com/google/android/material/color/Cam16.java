package com.google.android.material.color;

/* loaded from: classes5.dex */
final class Cam16 {

    /* renamed from: j */
    static final float[][] f37160j = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: k */
    static final float[][] f37161k = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: a */
    private final float f37162a;

    /* renamed from: b */
    private final float f37163b;

    /* renamed from: c */
    private final float f37164c;

    /* renamed from: d */
    private final float f37165d;

    /* renamed from: e */
    private final float f37166e;

    /* renamed from: f */
    private final float f37167f;

    /* renamed from: g */
    private final float f37168g;

    /* renamed from: h */
    private final float f37169h;

    /* renamed from: i */
    private final float f37170i;

    private Cam16(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f37162a = f;
        this.f37163b = f2;
        this.f37164c = f3;
        this.f37165d = f4;
        this.f37166e = f5;
        this.f37167f = f6;
        this.f37168g = f7;
        this.f37169h = f8;
        this.f37170i = f9;
    }

    /* renamed from: b */
    static Cam16 m71711b(int i, ViewingConditions viewingConditions) {
        double d;
        double d2;
        float f;
        float pow;
        float linearized = ColorUtils.linearized(((16711680 & i) >> 16) / 255.0f) * 100.0f;
        float linearized2 = ColorUtils.linearized(((65280 & i) >> 8) / 255.0f) * 100.0f;
        float linearized3 = ColorUtils.linearized((i & 255) / 255.0f) * 100.0f;
        float f2 = (0.41233894f * linearized) + (0.35762063f * linearized2) + (0.18051042f * linearized3);
        float f3 = (0.2126f * linearized) + (0.7152f * linearized2) + (0.0722f * linearized3);
        float f4 = (linearized * 0.01932141f) + (linearized2 * 0.11916382f) + (linearized3 * 0.9503448f);
        float[][] fArr = f37160j;
        float[] fArr2 = fArr[0];
        float f5 = (fArr2[0] * f2) + (fArr2[1] * f3) + (fArr2[2] * f4);
        float[] fArr3 = fArr[1];
        float f6 = (fArr3[0] * f2) + (fArr3[1] * f3) + (fArr3[2] * f4);
        float[] fArr4 = fArr[2];
        float f7 = (f2 * fArr4[0]) + (f3 * fArr4[1]) + (f4 * fArr4[2]);
        float f8 = viewingConditions.getRgbD()[0] * f5;
        float f9 = viewingConditions.getRgbD()[1] * f6;
        float f10 = viewingConditions.getRgbD()[2] * f7;
        float pow2 = (float) Math.pow((viewingConditions.m71642b() * Math.abs(f8)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((viewingConditions.m71642b() * Math.abs(f9)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((viewingConditions.m71642b() * Math.abs(f10)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d3 = signum3;
        float f11 = signum2 * 20.0f;
        float f12 = (((signum * 20.0f) + f11) + (21.0f * signum3)) / 20.0f;
        float f13 = (((signum * 40.0f) + f11) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(((float) ((signum + signum2) - (d3 * 2.0d))) / 9.0f, ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d3)) / 11.0f)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f14 = (3.1415927f * atan2) / 180.0f;
        float pow5 = ((float) Math.pow((f13 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.m71643a() * viewingConditions.m71639e())) * 100.0f;
        float m71643a = (4.0f / viewingConditions.m71643a()) * ((float) Math.sqrt(pow5 / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        if (atan2 < 20.14d) {
            f = 360.0f + atan2;
        } else {
            f = atan2;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(Math.toRadians(f) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.m71641c()) * viewingConditions.m71640d()) * ((float) Math.hypot(d2, d))) / (f12 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float flRoot = pow6 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt((pow * viewingConditions.m71643a()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f15 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log1p = ((float) Math.log1p(0.0228f * flRoot)) * 43.85965f;
        double d4 = f14;
        return new Cam16(atan2, pow6, pow5, m71643a, flRoot, sqrt, f15, log1p * ((float) Math.cos(d4)), log1p * ((float) Math.sin(d4)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Cam16 m71710c(float f, float f2, float f3) {
        return m71709d(f, f2, f3, ViewingConditions.DEFAULT);
    }

    /* renamed from: d */
    private static Cam16 m71709d(float f, float f2, float f3, ViewingConditions viewingConditions) {
        double d;
        float m71643a = (4.0f / viewingConditions.m71643a()) * ((float) Math.sqrt(f / 100.0d)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = f2 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * viewingConditions.m71643a()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log1p = ((float) Math.log1p(flRoot * 0.0228d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new Cam16(f3, f2, f, m71643a, flRoot, sqrt, f4, log1p * ((float) Math.cos(d2)), log1p * ((float) Math.sin(d2)));
    }

    public static Cam16 fromInt(int i) {
        return m71711b(i, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcs(float f, float f2, float f3) {
        return fromUcsInViewingConditions(f, f2, f3, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(float f, float f2, float f3, ViewingConditions viewingConditions) {
        double d = f2;
        double d2 = f3;
        double expm1 = (Math.expm1(Math.hypot(d, d2) * 0.02280000038444996d) / 0.02280000038444996d) / viewingConditions.getFlRoot();
        double atan2 = Math.atan2(d2, d) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return m71709d(f / (1.0f - ((f - 100.0f) * 0.007f)), (float) expm1, (float) atan2, viewingConditions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float m71712a(Cam16 cam16) {
        float jStar = getJStar() - cam16.getJStar();
        float aStar = getAStar() - cam16.getAStar();
        float bStar = getBStar() - cam16.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m71708e(ViewingConditions viewingConditions) {
        float f;
        float f2;
        if (getChroma() != 0.0d && getJ() != 0.0d) {
            f = getChroma() / ((float) Math.sqrt(getJ() / 100.0d));
        } else {
            f = 0.0f;
        }
        float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float aw = viewingConditions.getAw() * ((float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.m71643a()) / viewingConditions.m71639e()));
        float cos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f * 3846.1538f * viewingConditions.m71641c() * viewingConditions.m71640d();
        float nbb = aw / viewingConditions.getNbb();
        float sin = (float) Math.sin(hue);
        float cos2 = (float) Math.cos(hue);
        float f3 = (((0.305f + nbb) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = nbb * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / viewingConditions.m71642b()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / viewingConditions.m71642b()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum3 = Math.signum(((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f) * (100.0f / viewingConditions.m71642b()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f2) * 27.13d) / (400.0d - Math.abs(f2))), 2.380952380952381d));
        float f9 = signum / viewingConditions.getRgbD()[0];
        float f10 = signum2 / viewingConditions.getRgbD()[1];
        float f11 = signum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = f37161k;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[0] * f9) + (fArr2[1] * f10) + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return ColorUtils.intFromXyzComponents(f12, (fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11), (f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2]));
    }

    public float getAStar() {
        return this.f37169h;
    }

    public float getBStar() {
        return this.f37170i;
    }

    public float getChroma() {
        return this.f37163b;
    }

    public float getHue() {
        return this.f37162a;
    }

    public int getInt() {
        return m71708e(ViewingConditions.DEFAULT);
    }

    public float getJ() {
        return this.f37164c;
    }

    public float getJStar() {
        return this.f37168g;
    }

    public float getM() {
        return this.f37166e;
    }

    public float getQ() {
        return this.f37165d;
    }

    public float getS() {
        return this.f37167f;
    }
}
