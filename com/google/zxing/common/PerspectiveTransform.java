package com.google.zxing.common;

/* loaded from: classes5.dex */
public final class PerspectiveTransform {

    /* renamed from: a */
    private final float f44369a;

    /* renamed from: b */
    private final float f44370b;

    /* renamed from: c */
    private final float f44371c;

    /* renamed from: d */
    private final float f44372d;

    /* renamed from: e */
    private final float f44373e;

    /* renamed from: f */
    private final float f44374f;

    /* renamed from: g */
    private final float f44375g;

    /* renamed from: h */
    private final float f44376h;

    /* renamed from: i */
    private final float f44377i;

    private PerspectiveTransform(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f44369a = f;
        this.f44370b = f4;
        this.f44371c = f7;
        this.f44372d = f2;
        this.f44373e = f5;
        this.f44374f = f8;
        this.f44375g = f3;
        this.f44376h = f6;
        this.f44377i = f9;
    }

    public static PerspectiveTransform quadrilateralToQuadrilateral(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return squareToQuadrilateral(f9, f10, f11, f12, f13, f14, f15, f16).m66017b(quadrilateralToSquare(f, f2, f3, f4, f5, f6, f7, f8));
    }

    public static PerspectiveTransform quadrilateralToSquare(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return squareToQuadrilateral(f, f2, f3, f4, f5, f6, f7, f8).m66018a();
    }

    public static PerspectiveTransform squareToQuadrilateral(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new PerspectiveTransform(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new PerspectiveTransform((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* renamed from: a */
    PerspectiveTransform m66018a() {
        float f = this.f44373e;
        float f2 = this.f44377i;
        float f3 = this.f44374f;
        float f4 = this.f44376h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f44375g;
        float f7 = this.f44372d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f44371c;
        float f11 = this.f44370b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f44369a;
        return new PerspectiveTransform(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* renamed from: b */
    PerspectiveTransform m66017b(PerspectiveTransform perspectiveTransform) {
        float f = this.f44369a;
        float f2 = perspectiveTransform.f44369a;
        float f3 = this.f44372d;
        float f4 = perspectiveTransform.f44370b;
        float f5 = this.f44375g;
        float f6 = perspectiveTransform.f44371c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = perspectiveTransform.f44372d;
        float f9 = perspectiveTransform.f44373e;
        float f10 = perspectiveTransform.f44374f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = perspectiveTransform.f44375g;
        float f13 = perspectiveTransform.f44376h;
        float f14 = perspectiveTransform.f44377i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f44370b;
        float f17 = this.f44373e;
        float f18 = this.f44376h;
        float f19 = (f18 * f14) + (f16 * f12) + (f17 * f13);
        float f20 = this.f44371c;
        float f21 = this.f44374f;
        float f22 = (f2 * f20) + (f4 * f21);
        float f23 = this.f44377i;
        return new PerspectiveTransform(f7, f11, f15, (f16 * f2) + (f17 * f4) + (f18 * f6), (f16 * f8) + (f17 * f9) + (f18 * f10), f19, (f6 * f23) + f22, (f8 * f20) + (f9 * f21) + (f10 * f23), (f20 * f12) + (f21 * f13) + (f23 * f14));
    }

    public void transformPoints(float[] fArr) {
        int length = fArr.length;
        float f = this.f44369a;
        float f2 = this.f44370b;
        float f3 = this.f44371c;
        float f4 = this.f44372d;
        float f5 = this.f44373e;
        float f6 = this.f44374f;
        float f7 = this.f44375g;
        float f8 = this.f44376h;
        float f9 = this.f44377i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            int i2 = i + 1;
            float f11 = fArr[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }

    public void transformPoints(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f = fArr[i];
            float f2 = fArr2[i];
            float f3 = (this.f44371c * f) + (this.f44374f * f2) + this.f44377i;
            fArr[i] = (((this.f44369a * f) + (this.f44372d * f2)) + this.f44375g) / f3;
            fArr2[i] = (((this.f44370b * f) + (this.f44373e * f2)) + this.f44376h) / f3;
        }
    }
}
