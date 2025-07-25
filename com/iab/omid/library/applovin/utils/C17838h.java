package com.iab.omid.library.applovin.utils;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.applovin.utils.h */
/* loaded from: classes6.dex */
public final class C17838h {
    /* renamed from: a */
    public static String m65006a(View view) {
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
    public static View m65005b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: c */
    public static float m65004c(View view) {
        return view.getZ();
    }

    /* renamed from: d */
    public static boolean m65003d(View view) {
        if (m65006a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m65002e(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m65005b(view);
        }
        return true;
    }
}
