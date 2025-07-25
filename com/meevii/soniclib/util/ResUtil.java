package com.meevii.soniclib.util;

import android.app.Activity;

/* loaded from: classes5.dex */
public class ResUtil {
    public static float GetDensity(Activity activity) {
        try {
            return activity.getResources().getDisplayMetrics().density;
        } catch (Error | Exception e) {
            e.printStackTrace();
            return 3.0f;
        }
    }
}
