package com.iab.omid.library.corpmailru.p395d;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.corpmailru.d.f */
/* loaded from: classes6.dex */
public final class C18067f {
    /* renamed from: a */
    public static float m64110a(View view) {
        return view.getZ();
    }

    /* renamed from: b */
    public static View m64109b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m64108c(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m64109b(view);
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m64107d(View view) {
        if (m64106e(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m64106e(View view) {
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
