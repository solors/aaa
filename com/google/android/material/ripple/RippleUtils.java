package com.google.android.material.ripple;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.InterfaceC0152Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.C16310R;
import com.google.android.material.color.MaterialColors;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public class RippleUtils {
    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean USE_FRAMEWORK_RIPPLE = true;

    /* renamed from: a */
    private static final int[] f38110a = {16842919};

    /* renamed from: b */
    private static final int[] f38111b = {16843623, 16842908};

    /* renamed from: c */
    private static final int[] f38112c = {16842908};

    /* renamed from: d */
    private static final int[] f38113d = {16843623};

    /* renamed from: e */
    private static final int[] f38114e = {16842913, 16842919};

    /* renamed from: f */
    private static final int[] f38115f = {16842913, 16843623, 16842908};

    /* renamed from: g */
    private static final int[] f38116g = {16842913, 16842908};

    /* renamed from: h */
    private static final int[] f38117h = {16842913, 16843623};

    /* renamed from: i */
    private static final int[] f38118i = {16842913};

    /* renamed from: j */
    private static final int[] f38119j = {16842910, 16842919};
    @VisibleForTesting

    /* renamed from: k */
    static final String f38120k = RippleUtils.class.getSimpleName();

    @RequiresApi(21)
    /* loaded from: classes5.dex */
    private static class RippleUtilsLollipop {
        private RippleUtilsLollipop() {
        }

        @DoNotInline
        /* renamed from: b */
        public static Drawable m71114b(@NonNull Context context, @InterfaceC0152Px int i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(MaterialColors.getColorStateList(context, C16310R.attr.colorControlHighlight, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i, i, i, i));
        }
    }

    private RippleUtils() {
    }

    @ColorInt
    @TargetApi(21)
    /* renamed from: a */
    private static int m71117a(@ColorInt int i) {
        return ColorUtils.setAlphaComponent(i, Math.min(Color.alpha(i) * 2, 255));
    }

    @ColorInt
    /* renamed from: b */
    private static int m71116b(@Nullable ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        if (USE_FRAMEWORK_RIPPLE) {
            return m71117a(i);
        }
        return i;
    }

    @NonNull
    public static ColorStateList convertToRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        if (USE_FRAMEWORK_RIPPLE) {
            int[] iArr = f38112c;
            return new ColorStateList(new int[][]{f38118i, iArr, StateSet.NOTHING}, new int[]{m71116b(colorStateList, f38114e), m71116b(colorStateList, iArr), m71116b(colorStateList, f38110a)});
        }
        int[] iArr2 = f38114e;
        int[] iArr3 = f38115f;
        int[] iArr4 = f38116g;
        int[] iArr5 = f38117h;
        int[] iArr6 = f38110a;
        int[] iArr7 = f38111b;
        int[] iArr8 = f38112c;
        int[] iArr9 = f38113d;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f38118i, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{m71116b(colorStateList, iArr2), m71116b(colorStateList, iArr3), m71116b(colorStateList, iArr4), m71116b(colorStateList, iArr5), 0, m71116b(colorStateList, iArr6), m71116b(colorStateList, iArr7), m71116b(colorStateList, iArr8), m71116b(colorStateList, iArr9), 0});
    }

    @NonNull
    @RequiresApi(21)
    public static Drawable createOvalRippleLollipop(@NonNull Context context, @InterfaceC0152Px int i) {
        return RippleUtilsLollipop.m71114b(context, i);
    }

    @NonNull
    public static ColorStateList sanitizeRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f38119j, 0)) != 0) {
                Log.w(f38120k, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean shouldDrawRippleCompat(@NonNull int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
