package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.D0 */
/* loaded from: classes6.dex */
public final class C18888D0 extends Animation {

    /* renamed from: c */
    public final float f47157c;

    /* renamed from: d */
    public final float f47158d;

    /* renamed from: g */
    public Camera f47161g;

    /* renamed from: a */
    public final float f47155a = 0.0f;

    /* renamed from: b */
    public final float f47156b = 90.0f;

    /* renamed from: e */
    public final float f47159e = 0.0f;

    /* renamed from: f */
    public final boolean f47160f = true;

    public C18888D0(float f, float f2) {
        this.f47157c = f;
        this.f47158d = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation t) {
        Intrinsics.checkNotNullParameter(t, "t");
        float f2 = this.f47155a;
        float f3 = ((this.f47156b - f2) * f) + f2;
        float f4 = this.f47157c;
        float f5 = this.f47158d;
        Camera camera = this.f47161g;
        Matrix matrix = t.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.f47160f) {
                camera.translate(0.0f, 0.0f, this.f47159e * f);
            } else {
                camera.translate(0.0f, 0.0f, (1.0f - f) * this.f47159e);
            }
            camera.rotateY(f3);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.f47161g = new Camera();
    }
}
