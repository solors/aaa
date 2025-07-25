package com.maticoo.sdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;

/* loaded from: classes6.dex */
public class DisplayUtils {
    public static int getActionBarHeight() {
        TypedValue typedValue = new TypedValue();
        if (ApplicationUtil.getInstance().getApplicationContext().getTheme().resolveAttribute(16843499, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, ApplicationUtil.getInstance().getApplicationContext().getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static int getAppScreenHeight() {
        WindowManager windowManager = (WindowManager) ApplicationUtil.getInstance().getApplicationContext().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.y;
    }

    public static int getAppScreenWidth() {
        WindowManager windowManager = (WindowManager) ApplicationUtil.getInstance().getApplicationContext().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }

    public static int getContentViewHeight(Activity activity) {
        return activity.findViewById(16908290).getHeight();
    }

    public static int getContentViewWidth(Activity activity) {
        return activity.findViewById(16908290).getWidth();
    }

    public static int getNavBarHeight(Activity activity) {
        View findViewById = activity.findViewById(16908336);
        if (findViewById != null) {
            return findViewById.getHeight();
        }
        return 0;
    }

    public static int getScreenHeight() {
        WindowManager windowManager = (WindowManager) ApplicationUtil.getInstance().getApplicationContext().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static int getScreenWidth() {
        WindowManager windowManager = (WindowManager) ApplicationUtil.getInstance().getApplicationContext().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static int getStatusBarHeight() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }
}
