package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

/* loaded from: classes5.dex */
public final class MaterialArcMotion extends PathMotion {
    /* renamed from: a */
    private static PointF m70315a(float f, float f2, float f3, float f4) {
        if (f2 > f4) {
            return new PointF(f3, f2);
        }
        return new PointF(f, f4);
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF m70315a = m70315a(f, f2, f3, f4);
        path.quadTo(m70315a.x, m70315a.y, f3, f4);
        return path;
    }
}
