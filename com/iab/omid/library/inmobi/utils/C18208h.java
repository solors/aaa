package com.iab.omid.library.inmobi.utils;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.inmobi.utils.h */
/* loaded from: classes6.dex */
public final class C18208h {
    /* renamed from: a */
    public static String m63595a(View view) {
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
    public static View m63594b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: c */
    public static float m63593c(View view) {
        return view.getZ();
    }

    /* renamed from: d */
    public static boolean m63592d(View view) {
        if (m63595a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m63591e(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m63594b(view);
        }
        return true;
    }
}
