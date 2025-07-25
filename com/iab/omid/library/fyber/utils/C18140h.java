package com.iab.omid.library.fyber.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.fyber.utils.h */
/* loaded from: classes6.dex */
public final class C18140h {
    /* renamed from: a */
    public static String m63839a(View view) {
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
    public static Activity m63838b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static View m63837c(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: d */
    public static float m63836d(View view) {
        return view.getZ();
    }

    /* renamed from: e */
    public static boolean m63835e(View view) {
        Activity m63838b = m63838b(view);
        if (m63838b != null) {
            return m63838b.isInPictureInPictureMode();
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m63834f(View view) {
        if (m63839a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m63833g(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m63837c(view);
        }
        return true;
    }
}
