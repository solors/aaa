package com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2.coi222o222 */
/* loaded from: classes8.dex */
public class C32726coi222o222 {
    private C32726coi222o222() {
    }

    public static float c2oc2i(float f, Context context) {
        return f * coo2iico(context);
    }

    public static float c2oc2o(float f, Context context) {
        return f / coo2iico(context);
    }

    public static int cco22(float f, Context context) {
        return (int) (c2oc2o(f, context) + 0.5f);
    }

    public static int cioccoiococ(float f, Context context) {
        return (int) c2oc2i(f, context);
    }

    public static int coi222o222(float f, Context context) {
        return (int) (coo2iico(f, context) + 0.5f);
    }

    private static float coo2iico(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int c2oc2i(@NonNull Context context) {
        if (context == null) {
            MLog.m25892d("Dips", "Context cannot be null");
            return 0;
        }
        return cco22(context.getResources().getDisplayMetrics().widthPixels, context);
    }

    public static int coi222o222(@NonNull Context context) {
        if (context == null) {
            MLog.m25892d("Dips", "Context cannot be null");
            return 0;
        }
        return cco22(context.getResources().getDisplayMetrics().heightPixels, context);
    }

    public static float coo2iico(float f, Context context) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}
