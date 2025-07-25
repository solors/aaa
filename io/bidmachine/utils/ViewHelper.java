package io.bidmachine.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;

/* loaded from: classes9.dex */
public class ViewHelper {
    public static boolean belongTo(@NonNull ViewGroup viewGroup, @NonNull View view) {
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        if (!viewGroup2.equals(viewGroup) && !belongTo(viewGroup, viewGroup2)) {
            return false;
        }
        return true;
    }

    public static <T extends View> T findViewByClassName(@NonNull ViewGroup viewGroup, @NonNull Class<T> cls) {
        T t;
        try {
            if (viewGroup.getClass() == cls) {
                return viewGroup;
            }
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof ViewGroup) && (t = (T) findViewByClassName((ViewGroup) childAt, cls)) != null) {
                    return t;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void removeViewFromParent(@Nullable View view) {
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public static void safeAddSingleView(@NonNull ViewGroup viewGroup, @NonNull View view) {
        safeAddSingleView(viewGroup, view, null);
    }

    public static void safeAddView(@NonNull ViewGroup viewGroup, @NonNull View view) {
        safeAddView(viewGroup, view, null);
    }

    public static void safeAddSingleView(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        try {
            viewGroup.removeAllViews();
        } catch (Exception e) {
            Logger.m20086w(e);
        }
        safeAddView(viewGroup, view, layoutParams);
    }

    public static void safeAddView(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        try {
            removeViewFromParent(view);
            if (layoutParams != null) {
                viewGroup.addView(view, layoutParams);
            } else {
                viewGroup.addView(view);
            }
        } catch (Exception e) {
            Logger.m20086w(e);
        }
    }
}
