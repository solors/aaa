package com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.ciii2coi2 */
/* loaded from: classes8.dex */
public final class C32611ciii2coi2 {
    public static View c2oc2i(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static boolean c2oc2o(View view) {
        Activity coi222o222 = coi222o222(view);
        if (coi222o222 != null) {
            return coi222o222.isInPictureInPictureMode();
        }
        return false;
    }

    public static boolean cco22(View view) {
        if (coo2iico(view) == null) {
            return true;
        }
        return false;
    }

    public static boolean cii2c2(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = c2oc2i(view);
        }
        return true;
    }

    public static float cioccoiococ(View view) {
        return view.getZ();
    }

    public static Activity coi222o222(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static String coo2iico(View view) {
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
}
