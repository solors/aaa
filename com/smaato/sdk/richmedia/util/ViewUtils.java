package com.smaato.sdk.richmedia.util;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public final class ViewUtils {
    private ViewUtils() {
    }

    @Nullable
    public static ViewGroup getParent(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) parent;
    }

    @Nullable
    public static View getRootView(@NonNull View view) {
        View rootViewOfActivity = getRootViewOfActivity(view.getContext());
        if (rootViewOfActivity == null) {
            return getRootViewOfView(view);
        }
        return rootViewOfActivity;
    }

    @Nullable
    private static View getRootViewOfActivity(@NonNull Context context) {
        Window window;
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null) {
            return null;
        }
        return window.getDecorView().findViewById(16908290);
    }

    @Nullable
    private static View getRootViewOfView(@NonNull View view) {
        if (!isAttachedToWindow(view)) {
            Log.d("SmaatoSDK", "Attempting to call View#getRootView() on an unattached View.");
        }
        View rootView = view.getRootView();
        if (rootView == null) {
            return null;
        }
        View findViewById = rootView.findViewById(16908290);
        if (findViewById != null) {
            return findViewById;
        }
        return rootView;
    }

    private static boolean isAttachedToWindow(@NonNull View view) {
        return view.isAttachedToWindow();
    }

    public static void removeFromParent(@NonNull View view) {
        ViewGroup parent = getParent(view);
        if (parent != null) {
            parent.removeView(view);
        }
    }
}
