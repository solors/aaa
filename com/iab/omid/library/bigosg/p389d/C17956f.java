package com.iab.omid.library.bigosg.p389d;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.bigosg.d.f */
/* loaded from: classes6.dex */
public final class C17956f {
    /* renamed from: a */
    public static float m64560a(View view) {
        return view.getZ();
    }

    /* renamed from: b */
    public static View m64559b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m64558c(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m64559b(view);
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m64557d(View view) {
        if (m64556e(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m64556e(View view) {
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
