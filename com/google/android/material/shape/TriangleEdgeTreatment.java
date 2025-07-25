package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {

    /* renamed from: b */
    private final float f38257b;

    /* renamed from: c */
    private final boolean f38258c;

    public TriangleEdgeTreatment(float f, boolean z) {
        this.f38257b = f;
        this.f38258c = z;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        if (this.f38258c) {
            shapePath.lineTo(f2 - (this.f38257b * f3), 0.0f);
            float f4 = this.f38257b;
            shapePath.lineTo(f2, f4 * f3, (f4 * f3) + f2, 0.0f);
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f5 = this.f38257b;
        shapePath.lineTo(f2 - (f5 * f3), 0.0f, f2, (-f5) * f3);
        shapePath.lineTo(f2 + (this.f38257b * f3), 0.0f, f, 0.0f);
    }
}
