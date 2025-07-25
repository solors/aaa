package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.google.android.material.C16310R;
import com.google.android.material.resources.MaterialAttributes;

/* loaded from: classes5.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;

    private MaterialColors() {
    }

    @ColorInt
    /* renamed from: a */
    private static int m71648a(@ColorInt int i, @IntRange(from = 0, m105510to = 100) int i2) {
        Hct fromInt = Hct.fromInt(i);
        fromInt.setTone(i2);
        return fromInt.toInt();
    }

    /* renamed from: b */
    private static int m71647b(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i = typedValue.resourceId;
        if (i != 0) {
            return ContextCompat.getColor(context, i);
        }
        return typedValue.data;
    }

    /* renamed from: c */
    private static ColorStateList m71646c(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i = typedValue.resourceId;
        if (i != 0) {
            return ContextCompat.getColorStateList(context, i);
        }
        return ColorStateList.valueOf(typedValue.data);
    }

    @ColorInt
    public static int compositeARGBWithAlpha(@ColorInt int i, @IntRange(from = 0, m105510to = 255) int i2) {
        return androidx.core.graphics.ColorUtils.setAlphaComponent(i, (Color.alpha(i) * i2) / 255);
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i) {
        return m71647b(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i));
    }

    @NonNull
    public static ColorRoles getColorRoles(@NonNull Context context, @ColorInt int i) {
        return getColorRoles(i, MaterialAttributes.resolveBoolean(context, C16310R.attr.isLightTheme, true));
    }

    @NonNull
    public static ColorStateList getColorStateList(@NonNull Context context, @AttrRes int i, @NonNull ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        TypedValue resolve = MaterialAttributes.resolve(context, i);
        if (resolve != null) {
            colorStateList2 = m71646c(context, resolve);
        } else {
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        return colorStateList;
    }

    @ColorInt
    public static int harmonize(@ColorInt int i, @ColorInt int i2) {
        return Blend.harmonize(i, i2);
    }

    @ColorInt
    public static int harmonizeWithPrimary(@NonNull Context context, @ColorInt int i) {
        return harmonize(i, getColor(context, C16310R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(@ColorInt int i) {
        if (i != 0 && androidx.core.graphics.ColorUtils.calculateLuminance(i) > 0.5d) {
            return true;
        }
        return false;
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i, @AttrRes int i2) {
        return layer(view, i, i2, 1.0f);
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i, @AttrRes int i2, @FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        return layer(getColor(view, i), getColor(view, i2), f);
    }

    @ColorInt
    public static int getColor(Context context, @AttrRes int i, String str) {
        return m71647b(context, MaterialAttributes.resolveTypedValueOrThrow(context, i, str));
    }

    @NonNull
    public static ColorRoles getColorRoles(@ColorInt int i, boolean z) {
        if (z) {
            return new ColorRoles(m71648a(i, 40), m71648a(i, 100), m71648a(i, 90), m71648a(i, 10));
        }
        return new ColorRoles(m71648a(i, 80), m71648a(i, 20), m71648a(i, 30), m71648a(i, 90));
    }

    @ColorInt
    public static int layer(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        return layer(i, androidx.core.graphics.ColorUtils.setAlphaComponent(i2, Math.round(Color.alpha(i2) * f)));
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i, @ColorInt int i2) {
        return getColor(view.getContext(), i, i2);
    }

    @ColorInt
    public static int getColor(@NonNull Context context, @AttrRes int i, @ColorInt int i2) {
        TypedValue resolve = MaterialAttributes.resolve(context, i);
        return resolve != null ? m71647b(context, resolve) : i2;
    }

    @ColorInt
    public static int layer(@ColorInt int i, @ColorInt int i2) {
        return androidx.core.graphics.ColorUtils.compositeColors(i2, i);
    }
}
