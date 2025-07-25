package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {

    /* renamed from: b */
    private final EdgeTreatment f38190b;

    /* renamed from: c */
    private final float f38191c;

    public OffsetEdgeTreatment(@NonNull EdgeTreatment edgeTreatment, float f) {
        this.f38190b = edgeTreatment;
        this.f38191c = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.shape.EdgeTreatment
    /* renamed from: b */
    public boolean mo71078b() {
        return this.f38190b.mo71078b();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        this.f38190b.getEdgePath(f, f2 - this.f38191c, f3, shapePath);
    }
}
