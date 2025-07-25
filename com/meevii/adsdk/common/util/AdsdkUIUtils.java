package com.meevii.adsdk.common.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public class AdsdkUIUtils {
    public static final int VIVO_FILLET = 8;
    public static final int VIVO_NOTCH = 32;

    public static float getHeight(Activity activity) {
        int px2dip;
        hideBottomUIMenu(activity);
        int realHeight = getRealHeight(activity);
        if (hasNotchScreen(activity)) {
            px2dip = px2dip(activity, realHeight - getStatusBarHeight(activity));
        } else {
            px2dip = px2dip(activity, realHeight);
        }
        return px2dip;
    }

    public static int getInt(String str, Activity activity) {
        if (!isMiui()) {
            return 0;
        }
        try {
            Class<?> loadClass = activity.getClassLoader().loadClass(KiwiConstants.f2713ar);
            return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String(str), new Integer(0))).intValue();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return 0;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return 0;
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
            return 0;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return 0;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int getRealHeight(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static float getScreenWidthDp(Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = context.getResources().getDisplayMetrics().widthPixels;
        if (f <= 0.0f) {
            f = 1.0f;
        }
        return (f2 / f) + 0.5f;
    }

    public static float getStatusBarHeight(Context context) {
        int identifier = context.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0.0f;
    }

    public static boolean hasNotchAtHuawei(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean hasNotchAtOPPO(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean hasNotchAtVivo(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean hasNotchScreen(Activity activity) {
        if (getInt("ro.miui.notch", activity) == 1 || hasNotchAtHuawei(activity) || hasNotchAtOPPO(activity) || hasNotchAtVivo(activity) || isAndroidPHasNotch(activity)) {
            return true;
        }
        return false;
    }

    public static void hideBottomUIMenu(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3842);
            activity.getWindow().addFlags(134217728);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isAndroidPHasNotch(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.view.WindowInsets");
            if (cls.getMethod("getDisplayCutout", new Class[0]).invoke(cls, new Object[0]) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isMiui() {
        try {
            Class.forName("miui.os.Build");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int px2dip(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public static View removeViewFromSuper(View view) {
        ViewGroup viewGroup;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            viewGroup = (ViewGroup) view.getParent();
        } else {
            viewGroup = null;
        }
        if (viewGroup != null && view != null) {
            if (viewGroup.isInLayout()) {
                viewGroup.removeViewInLayout(view);
            } else {
                viewGroup.removeView(view);
            }
        }
        return view;
    }
}
