package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes8.dex */
public final class cj2 {
    /* renamed from: a */
    public static float m35226a(View view) {
        return view.getZ();
    }

    /* renamed from: b */
    public static boolean m35225b(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static String m35224c(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility != 4) {
                if (visibility != 8) {
                    return "viewNotVisible";
                }
                return "viewGone";
            }
            return "viewInvisible";
        } else if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        } else {
            return null;
        }
    }
}
