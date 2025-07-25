package com.bytedance.adsdk.p183IL;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: com.bytedance.adsdk.IL.xxp  reason: invalid class name */
/* loaded from: classes3.dex */
class animationInterpolatorC6871xxp implements Interpolator {

    /* renamed from: IL */
    private final float[] f14764IL;

    /* renamed from: bg */
    private final float[] f14765bg;

    animationInterpolatorC6871xxp(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f14765bg = new float[i];
        this.f14764IL = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
            this.f14765bg[i2] = fArr[0];
            this.f14764IL[i2] = fArr[1];
        }
    }

    /* renamed from: bg */
    private static Path m90591bg(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.f14765bg.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f14765bg[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f14765bg;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.f14764IL[i];
        }
        float[] fArr2 = this.f14764IL;
        float f5 = fArr2[i];
        return f5 + (((f - f3) / f4) * (fArr2[length] - f5));
    }

    animationInterpolatorC6871xxp(float f, float f2, float f3, float f4) {
        this(m90591bg(f, f2, f3, f4));
    }
}
