package com.applovin.impl;

import android.opengl.Matrix;

/* renamed from: com.applovin.impl.j9 */
/* loaded from: classes2.dex */
final class C4642j9 {

    /* renamed from: a */
    private final float[] f7127a = new float[16];

    /* renamed from: b */
    private final float[] f7128b = new float[16];

    /* renamed from: c */
    private final C4342eo f7129c = new C4342eo();

    /* renamed from: d */
    private boolean f7130d;

    /* renamed from: a */
    public static void m98284a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10] / sqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3;
    }

    /* renamed from: b */
    private static void m98283b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    /* renamed from: a */
    public boolean m98285a(float[] fArr, long j) {
        float[] fArr2 = (float[]) this.f7129c.m99470c(j);
        if (fArr2 == null) {
            return false;
        }
        m98283b(this.f7128b, fArr2);
        if (!this.f7130d) {
            m98284a(this.f7127a, this.f7128b);
            this.f7130d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f7127a, 0, this.f7128b, 0);
        return true;
    }

    /* renamed from: a */
    public void m98287a() {
        this.f7129c.m99479a();
        this.f7130d = false;
    }

    /* renamed from: a */
    public void m98286a(long j, float[] fArr) {
        this.f7129c.m99476a(j, fArr);
    }
}
