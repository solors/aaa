package com.iab.omid.library.unity3d.utils;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.unity3d.utils.h */
/* loaded from: classes6.dex */
public final class C18716h {
    /* renamed from: a */
    public static String m61624a(View view) {
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
    public static View m61623b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: c */
    public static float m61622c(View view) {
        return view.getZ();
    }

    /* renamed from: d */
    public static boolean m61621d(View view) {
        if (m61624a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m61620e(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m61623b(view);
        }
        return true;
    }
}
