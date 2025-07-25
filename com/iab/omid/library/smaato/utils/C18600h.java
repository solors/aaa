package com.iab.omid.library.smaato.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.smaato.utils.h */
/* loaded from: classes6.dex */
public final class C18600h {
    /* renamed from: a */
    public static String m62098a(View view) {
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
    public static Activity m62097b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static View m62096c(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: d */
    public static float m62095d(View view) {
        return view.getZ();
    }

    /* renamed from: e */
    public static boolean m62094e(View view) {
        Activity m62097b = m62097b(view);
        if (m62097b != null) {
            return m62097b.isInPictureInPictureMode();
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m62093f(View view) {
        if (m62098a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m62092g(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m62096c(view);
        }
        return true;
    }
}
