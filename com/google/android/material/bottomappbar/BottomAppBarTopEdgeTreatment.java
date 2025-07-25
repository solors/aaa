package com.google.android.material.bottomappbar;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* loaded from: classes5.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {

    /* renamed from: b */
    private float f36797b;

    /* renamed from: c */
    private float f36798c;

    /* renamed from: d */
    private float f36799d;

    /* renamed from: f */
    private float f36800f;

    /* renamed from: g */
    private float f36801g;

    /* renamed from: h */
    private float f36802h = -1.0f;

    public BottomAppBarTopEdgeTreatment(float f, float f2, float f3) {
        this.f36798c = f;
        this.f36797b = f2;
        m71998f(f3);
        this.f36801g = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m72001c() {
        return this.f36800f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m72000d() {
        return this.f36798c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m71999e() {
        return this.f36797b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m71998f(@FloatRange(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.f36800f = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m71997g(float f) {
        this.f36798c = f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        boolean z;
        float f4;
        float f5;
        float f6 = this.f36799d;
        if (f6 == 0.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f7 = ((this.f36798c * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f36797b;
        float f9 = f2 + this.f36801g;
        float f10 = (this.f36800f * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f11 = this.f36802h;
        float f12 = f11 * f3;
        if (f11 != -1.0f && Math.abs((f11 * 2.0f) - f6) >= 0.1f) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        if (!z2) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f10;
            f5 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - sqrt;
        float f16 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        shapePath.lineTo(f15, 0.0f);
        float f18 = f8 * 2.0f;
        shapePath.addArc(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z2) {
            shapePath.addArc(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.f36798c;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            shapePath.addArc(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f9 + f7;
            float f23 = this.f36798c;
            shapePath.lineTo(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.f36798c;
            shapePath.addArc(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        shapePath.addArc(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        shapePath.lineTo(f, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.f36802h;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getFabDiameter() {
        return this.f36799d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getHorizontalOffset() {
        return this.f36801g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m71996h(float f) {
        this.f36797b = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m71995i(float f) {
        this.f36801g = f;
    }

    public void setFabCornerSize(float f) {
        this.f36802h = f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFabDiameter(float f) {
        this.f36799d = f;
    }
}
