package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.chartboost.sdk.impl.qd */
/* loaded from: classes3.dex */
public abstract class AbstractC10156qd {
    /* renamed from: a */
    public static String m80714a(View view) {
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
    public static Activity m80713b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static View m80712c(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: d */
    public static float m80711d(View view) {
        return view.getZ();
    }

    /* renamed from: e */
    public static boolean m80710e(View view) {
        Activity m80713b = m80713b(view);
        if (m80713b != null) {
            return m80713b.isInPictureInPictureMode();
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m80709f(View view) {
        if (m80714a(view) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m80708g(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m80712c(view);
        }
        return true;
    }
}
