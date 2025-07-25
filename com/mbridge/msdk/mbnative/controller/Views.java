package com.mbridge.msdk.mbnative.controller;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: com.mbridge.msdk.mbnative.controller.f */
/* loaded from: classes6.dex */
public final class Views {
    /* renamed from: a */
    private static View m51211a(View view) {
        if (view == null) {
            return null;
        }
        try {
            ViewCompat.isAttachedToWindow(view);
        } catch (Throwable unused) {
        }
        try {
            View rootView = view.getRootView();
            if (rootView == null) {
                return null;
            }
            View findViewById = rootView.findViewById(16908290);
            return findViewById != null ? findViewById : rootView;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static View m51212a(Context context, View view) {
        View view2 = null;
        if (context != null && (context instanceof Activity)) {
            view2 = ((Activity) context).getWindow().getDecorView().findViewById(16908290);
        }
        return view2 != null ? view2 : m51211a(view);
    }
}
