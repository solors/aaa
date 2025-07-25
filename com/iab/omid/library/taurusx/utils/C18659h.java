package com.iab.omid.library.taurusx.utils;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.taurusx.utils.h */
/* loaded from: classes6.dex */
public final class C18659h {
    /* renamed from: a */
    public static String m61858a(View view) {
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
    public static View m61857b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: c */
    public static float m61856c(View view) {
        return view.getZ();
    }

    /* renamed from: d */
    public static boolean m61855d(View view) {
        if (m61858a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m61854e(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m61857b(view);
        }
        return true;
    }
}
