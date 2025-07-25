package com.iab.omid.library.ironsrc.utils;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.ironsrc.utils.h */
/* loaded from: classes6.dex */
public final class C18265h {
    /* renamed from: a */
    public static String m63358a(View view) {
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
    public static View m63357b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: c */
    public static float m63356c(View view) {
        return view.getZ();
    }

    /* renamed from: d */
    public static boolean m63355d(View view) {
        if (m63358a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m63354e(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m63357b(view);
        }
        return true;
    }
}
