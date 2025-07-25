package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.C16310R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

/* loaded from: classes5.dex */
public class ElevationOverlayProvider {

    /* renamed from: f */
    private static final int f37473f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    private final boolean f37474a;

    /* renamed from: b */
    private final int f37475b;

    /* renamed from: c */
    private final int f37476c;

    /* renamed from: d */
    private final int f37477d;

    /* renamed from: e */
    private final float f37478e;

    public ElevationOverlayProvider(@NonNull Context context) {
        this(MaterialAttributes.resolveBoolean(context, C16310R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, C16310R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, C16310R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, C16310R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    private boolean m71477a(@ColorInt int i) {
        if (ColorUtils.setAlphaComponent(i, 255) == this.f37477d) {
            return true;
        }
        return false;
    }

    public int calculateOverlayAlpha(float f) {
        return Math.round(calculateOverlayAlphaFraction(f) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f) {
        float f2 = this.f37478e;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i, float f, @NonNull View view) {
        return compositeOverlay(i, f + getParentAbsoluteElevation(view));
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i, float f, @NonNull View view) {
        return compositeOverlayIfNeeded(i, f + getParentAbsoluteElevation(view));
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f, @NonNull View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f + getParentAbsoluteElevation(view));
    }

    public float getParentAbsoluteElevation(@NonNull View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    @ColorInt
    public int getThemeElevationOverlayColor() {
        return this.f37475b;
    }

    @ColorInt
    public int getThemeSurfaceColor() {
        return this.f37477d;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.f37474a;
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i, float f) {
        int i2;
        float calculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f);
        int alpha = Color.alpha(i);
        int layer = MaterialColors.layer(ColorUtils.setAlphaComponent(i, 255), this.f37475b, calculateOverlayAlphaFraction);
        if (calculateOverlayAlphaFraction > 0.0f && (i2 = this.f37476c) != 0) {
            layer = MaterialColors.layer(layer, ColorUtils.setAlphaComponent(i2, f37473f));
        }
        return ColorUtils.setAlphaComponent(layer, alpha);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i, float f) {
        return (this.f37474a && m71477a(i)) ? compositeOverlay(i, f) : i;
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f) {
        return compositeOverlayIfNeeded(this.f37477d, f);
    }

    public ElevationOverlayProvider(boolean z, @ColorInt int i, @ColorInt int i2, @ColorInt int i3, float f) {
        this.f37474a = z;
        this.f37475b = i;
        this.f37476c = i2;
        this.f37477d = i3;
        this.f37478e = f;
    }
}
