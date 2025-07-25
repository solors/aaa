package com.iab.omid.library.amazon.utils;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.amazon.utils.h */
/* loaded from: classes6.dex */
public final class C17777h {
    /* renamed from: a */
    public static String m65247a(View view) {
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
    public static View m65246b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: c */
    public static float m65245c(View view) {
        return view.getZ();
    }

    /* renamed from: d */
    public static boolean m65244d(View view) {
        if (m65247a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m65243e(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m65246b(view);
        }
        return true;
    }
}
