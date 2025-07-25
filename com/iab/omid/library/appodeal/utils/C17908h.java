package com.iab.omid.library.appodeal.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.appodeal.utils.h */
/* loaded from: classes6.dex */
public final class C17908h {
    /* renamed from: a */
    public static String m64756a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    /* renamed from: b */
    public static Activity m64755b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static View m64754c(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: d */
    public static float m64753d(View view) {
        return view.getZ();
    }

    /* renamed from: e */
    public static boolean m64752e(View view) {
        Activity m64755b = m64755b(view);
        if (m64755b != null) {
            return m64755b.isInPictureInPictureMode();
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m64751f(View view) {
        if (m64756a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m64750g(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m64754c(view);
        }
        return true;
    }
}
