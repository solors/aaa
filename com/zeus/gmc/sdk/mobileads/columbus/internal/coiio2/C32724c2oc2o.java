package com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2.c2oc2o */
/* loaded from: classes8.dex */
public class C32724c2oc2o {
    private static final String coo2iico = "Views";

    private C32724c2oc2o() {
    }

    public static void coi222o222(@Nullable View view) {
        if (view != null && view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    @Nullable
    public static View coo2iico(@Nullable Context context, @Nullable View view) {
        View coo2iico2 = coo2iico(context);
        return coo2iico2 != null ? coo2iico2 : coo2iico(view);
    }

    @Nullable
    private static View coo2iico(@Nullable Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView().findViewById(16908290);
        }
        return null;
    }

    @Nullable
    private static View coo2iico(@Nullable View view) {
        if (view == null) {
            return null;
        }
        if (!ViewCompat.isAttachedToWindow(view)) {
            MLog.m25892d(coo2iico, "Attempting to call View#getRootView() on an unattached View.");
        }
        View rootView = view.getRootView();
        if (rootView == null) {
            return null;
        }
        View findViewById = rootView.findViewById(16908290);
        return findViewById != null ? findViewById : rootView;
    }
}
