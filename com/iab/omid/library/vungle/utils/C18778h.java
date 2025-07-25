package com.iab.omid.library.vungle.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.vungle.utils.h */
/* loaded from: classes6.dex */
public final class C18778h {
    /* renamed from: a */
    public static String m61376a(View view) {
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
    public static Activity m61375b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static View m61374c(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: d */
    public static float m61373d(View view) {
        return view.getZ();
    }

    /* renamed from: e */
    public static boolean m61372e(View view) {
        Activity m61375b = m61375b(view);
        if (m61375b != null) {
            return m61375b.isInPictureInPictureMode();
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m61371f(View view) {
        if (m61376a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m61370g(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m61374c(view);
        }
        return true;
    }
}
