package com.maticoo.sdk.video.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes6.dex */
public class Dips {
    public static float dipsToFloatPixels(float f) {
        return f * getDensity();
    }

    public static int dpTopx(float f) {
        return (int) (dipsToFloatPixels(f) + 0.5f);
    }

    private static float getDensity() {
        return getDisplayMetrics().density;
    }

    public static DisplayMetrics getDisplayMetrics() {
        return Resources.getSystem().getDisplayMetrics();
    }
}
