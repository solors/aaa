package com.iab.omid.library.mmadbridge.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.mmadbridge.utils.h */
/* loaded from: classes6.dex */
public final class C18327h {
    /* renamed from: a */
    public static String m63110a(View view) {
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
    public static Activity m63109b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static View m63108c(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: d */
    public static float m63107d(View view) {
        return view.getZ();
    }

    /* renamed from: e */
    public static boolean m63106e(View view) {
        Activity m63109b = m63109b(view);
        if (m63109b != null) {
            return m63109b.isInPictureInPictureMode();
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m63105f(View view) {
        if (m63110a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m63104g(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m63108c(view);
        }
        return true;
    }
}
