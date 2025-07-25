package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f36545a = new float[9];

    /* renamed from: b */
    private final float[] f36546b = new float[9];

    /* renamed from: c */
    private final Matrix f36547c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @NonNull
    public Matrix evaluate(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.f36545a);
        matrix2.getValues(this.f36546b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f36546b;
            float f2 = fArr[i];
            float f3 = this.f36545a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f36547c.setValues(this.f36546b);
        return this.f36547c;
    }
}
