package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* loaded from: classes6.dex */
public class AdapterUtils {
    public static final int MIN_TABLET_DP_SIZE = 600;

    public static int dpToPixels(Context context, int i) {
        if (context == null) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils dpToPixels - context is null, returning dpSize", 3);
            return i;
        }
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static String getScreenSizeParams(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        float min = Math.min(displayMetrics.widthPixels / f, displayMetrics.heightPixels / f);
        float f2 = displayMetrics.xdpi;
        float f3 = displayMetrics.ydpi;
        float f4 = displayMetrics.widthPixels / f2;
        float f5 = displayMetrics.heightPixels / f3;
        double sqrt = Math.sqrt((f4 * f4) + (f5 * f5));
        int i = context.getResources().getConfiguration().smallestScreenWidthDp;
        return "smallestWidth = " + min + " diagonalInches = " + sqrt + " smallScreenDpApi =  " + i;
    }

    public static boolean isLargeScreen(Context context) {
        if (context == null) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils isLargeScreen - context is null", 3);
            return false;
        } else if (context.getResources().getConfiguration().smallestScreenWidthDp < 600) {
            return false;
        } else {
            return true;
        }
    }
}
