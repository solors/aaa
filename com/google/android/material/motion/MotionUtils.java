package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.core.graphics.PathParser;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.resources.MaterialAttributes;

/* loaded from: classes5.dex */
public class MotionUtils {
    private MotionUtils() {
    }

    /* renamed from: a */
    private static float m71280a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    private static String m71279b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    private static TimeInterpolator m71278c(String str) {
        if (m71276e(str, "cubic-bezier")) {
            String[] split = m71279b(str, "cubic-bezier").split(",");
            if (split.length == 4) {
                return PathInterpolatorCompat.create(m71280a(split, 0), m71280a(split, 1), m71280a(split, 2), m71280a(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        } else if (m71276e(str, "path")) {
            return PathInterpolatorCompat.create(PathParser.createPathFromPathData(m71279b(str, "path")));
        } else {
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
    }

    /* renamed from: d */
    private static boolean m71277d(String str) {
        if (!m71276e(str, "cubic-bezier") && !m71276e(str, "path")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m71276e(String str, String str2) {
        if (str.startsWith(str2 + "(") && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static int resolveThemeDuration(@NonNull Context context, @AttrRes int i, int i2) {
        return MaterialAttributes.resolveInteger(context, i, i2);
    }

    @NonNull
    public static TimeInterpolator resolveThemeInterpolator(@NonNull Context context, @AttrRes int i, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (m71277d(valueOf)) {
                return m71278c(valueOf);
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }
}
