package com.yandex.mobile.ads.impl;

import android.opengl.Matrix;

/* loaded from: classes8.dex */
final class ca0 {

    /* renamed from: a */
    private final float[] f77563a = new float[16];

    /* renamed from: b */
    private final float[] f77564b = new float[16];

    /* renamed from: c */
    private final f02<float[]> f77565c = new f02<>();

    /* renamed from: d */
    private boolean f77566d;

    /* renamed from: a */
    public static void m35325a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / sqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3;
    }

    /* renamed from: b */
    public final void m35324b(long j, float[] fArr) {
        this.f77565c.m34399a(fArr, j);
    }

    /* renamed from: a */
    public final void m35326a(long j, float[] fArr) {
        float[] m34397b = this.f77565c.m34397b(j);
        if (m34397b == null) {
            return;
        }
        float[] fArr2 = this.f77564b;
        float f = m34397b[0];
        float f2 = -m34397b[1];
        float f3 = -m34397b[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr2, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(fArr2, 0);
        }
        if (!this.f77566d) {
            m35325a(this.f77563a, this.f77564b);
            this.f77566d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f77563a, 0, this.f77564b, 0);
    }

    /* renamed from: a */
    public final void m35327a() {
        this.f77565c.m34401a();
        this.f77566d = false;
    }
}
