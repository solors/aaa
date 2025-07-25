package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {

    /* renamed from: b */
    private final float f38161b;

    public MarkerEdgeTreatment(float f) {
        this.f38161b = f - 0.001f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.shape.EdgeTreatment
    /* renamed from: b */
    public boolean mo71078b() {
        return true;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        float sqrt = (float) ((this.f38161b * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.f38161b, 2.0d) - Math.pow(sqrt, 2.0d));
        shapePath.reset(f2 - sqrt, ((float) (-((this.f38161b * Math.sqrt(2.0d)) - this.f38161b))) + sqrt2);
        shapePath.lineTo(f2, (float) (-((this.f38161b * Math.sqrt(2.0d)) - this.f38161b)));
        shapePath.lineTo(f2 + sqrt, ((float) (-((this.f38161b * Math.sqrt(2.0d)) - this.f38161b))) + sqrt2);
    }
}
