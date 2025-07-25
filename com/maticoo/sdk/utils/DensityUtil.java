package com.maticoo.sdk.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes6.dex */
public class DensityUtil {
    private DensityUtil() {
    }

    public static int dip2px(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static float getDensity(Context context) {
        return getDisplay(context).density;
    }

    public static int getDensityDpi(Context context) {
        return getDisplay(context).densityDpi;
    }

    public static int getDimSize() {
        return Resources.getSystem().getConfiguration().screenLayout & 15;
    }

    public static int getDirection(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getConfiguration().orientation;
    }

    public static DisplayMetrics getDisplay(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static int getPhoneHeight(Context context) {
        return getDisplay(context).heightPixels;
    }

    public static int getPhoneWidth(Context context) {
        return getDisplay(context).widthPixels;
    }

    public static int getScreenDensity() {
        int i = Resources.getSystem().getDisplayMetrics().densityDpi;
        if (i == 0) {
            return 1;
        }
        if (i < 140) {
            return 0;
        }
        if (i <= 200) {
            return 1;
        }
        return 2;
    }

    public static int getScreenSize() {
        int i = Resources.getSystem().getConfiguration().screenLayout & 15;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public static int getXdpi(Context context) {
        return (int) getDisplay(context).xdpi;
    }

    public static int getYdpi(Context context) {
        return (int) getDisplay(context).ydpi;
    }

    public static int px2dip(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
