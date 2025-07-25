package com.iab.omid.library.mobilefuse.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.mobilefuse.utils.h */
/* loaded from: classes6.dex */
public final class C18397h {
    /* renamed from: a */
    public static String m62857a(View view) {
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
    public static Activity m62856b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static View m62855c(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: d */
    public static float m62854d(View view) {
        return view.getZ();
    }

    /* renamed from: e */
    public static boolean m62853e(View view) {
        Activity m62856b = m62856b(view);
        if (m62856b != null) {
            return m62856b.isInPictureInPictureMode();
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m62852f(View view) {
        if (m62857a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m62851g(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m62855c(view);
        }
        return true;
    }
}
