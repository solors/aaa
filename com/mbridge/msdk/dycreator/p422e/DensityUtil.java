package com.mbridge.msdk.dycreator.p422e;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.mbridge.msdk.dycreator.e.e */
/* loaded from: classes6.dex */
public final class DensityUtil {
    /* renamed from: a */
    public static int m52942a(Context context, float f) {
        return (int) ((f / m52943a(context).density) + 0.5f);
    }

    /* renamed from: a */
    public static DisplayMetrics m52943a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }
}
