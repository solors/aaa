package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.internal.ViewUtils;

/* loaded from: classes5.dex */
public class MaterialShapeUtils {
    private MaterialShapeUtils() {
    }

    @NonNull
    /* renamed from: a */
    public static CornerTreatment m71081a(int i) {
        if (i != 0) {
            if (i != 1) {
                return m71080b();
            }
            return new CutCornerTreatment();
        }
        return new RoundedCornerTreatment();
    }

    @NonNull
    /* renamed from: b */
    public static CornerTreatment m71080b() {
        return new RoundedCornerTreatment();
    }

    @NonNull
    /* renamed from: c */
    public static EdgeTreatment m71079c() {
        return new EdgeTreatment();
    }

    public static void setElevation(@NonNull View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).setElevation(f);
        }
    }

    public static void setParentAbsoluteElevation(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            setParentAbsoluteElevation(view, (MaterialShapeDrawable) background);
        }
    }

    public static void setParentAbsoluteElevation(@NonNull View view, @NonNull MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.isElevationOverlayEnabled()) {
            materialShapeDrawable.setParentAbsoluteElevation(ViewUtils.getParentAbsoluteElevation(view));
        }
    }
}
