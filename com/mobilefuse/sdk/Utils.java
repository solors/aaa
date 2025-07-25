package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.C8955a;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes7.dex */
public class Utils {
    public static int convertDpToPx(Context context, int i) throws Throwable {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static void convertFromDpToPixels(Activity activity, int[] iArr) throws Throwable {
        float f = activity.getResources().getDisplayMetrics().density;
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = (int) ((iArr[i] * f) + 0.5f);
        }
    }

    public static void convertFromPixelsToDp(Activity activity, int[] iArr) throws Throwable {
        float f = activity.getResources().getDisplayMetrics().density;
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = (int) ((iArr[i] / f) + 0.5f);
        }
    }

    public static int convertPxToDp(Context context, int i) throws Throwable {
        return (int) ((i / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Activity getActivityForView(View view) throws Throwable {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static String getApplicationName(Context context) throws Throwable {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            return applicationInfo.nonLocalizedLabel.toString();
        }
        return context.getString(i);
    }

    public static String getAssetContent(Context context, String str) throws Throwable {
        InputStream open = context.getAssets().open(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine + "\n");
            }
        } finally {
            try {
                open.close();
                return sb2.toString();
            } catch (Throwable th) {
            }
        }
        open.close();
        return sb2.toString();
    }

    public static int getCurrentYear() {
        return Calendar.getInstance().get(1);
    }

    public static int[] getDeviceScreenSize() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    @NonNull
    public static Handler getHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public static PackageInfo getPackageInfo(Context context) throws Throwable {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
    }

    public static int[] getScreenSizeAsDp(Activity activity) throws Throwable {
        int[] screenSizeAsPixels = getScreenSizeAsPixels(activity);
        convertFromPixelsToDp(activity, screenSizeAsPixels);
        return screenSizeAsPixels;
    }

    public static int[] getScreenSizeAsPixels(Context context) throws Throwable {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static boolean hasIntent(Context context, Intent intent) throws Throwable {
        if (context.getPackageManager().queryIntentActivities(intent, 0).size() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean hasManifestPermission(Context context, String str) throws Throwable {
        if (context == null || context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            return false;
        }
        return true;
    }

    public static boolean isAttachedToWindow(@NonNull View view) {
        return view.isAttachedToWindow();
    }

    public static boolean isDeviceTypeTablet() throws Throwable {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        float f = displayMetrics.density;
        if (Math.min(min / f, max / f) >= 600.0f) {
            return true;
        }
        return false;
    }

    public static boolean isJavaVersionSupported() {
        try {
            C8955a.m84270a(" ", new CharSequence[]{"java", Constants.KEY_TEST});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void lockOrientationFromExpand(Activity activity, boolean z, String str) throws Throwable {
        if (str == null) {
            return;
        }
        if (!str.equals("none")) {
            lockToMraidOrientation(activity, str);
        }
        if (z) {
            unlockOrientation(activity);
        } else if (str.equals("none")) {
            lockToCurrentOrientation(activity);
        }
    }

    protected static void lockToCurrentOrientation(Activity activity) throws Throwable {
        setActivityOrientation(activity, activity.getResources().getConfiguration().orientation);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void lockToMraidOrientation(Activity activity, String str) throws Throwable {
        boolean z;
        int i = activity.getResources().getConfiguration().orientation;
        str.hashCode();
        switch (str.hashCode()) {
            case 3387192:
                if (str.equals("none")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1430647483:
                if (str.equals("landscape")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        switch (z) {
            case false:
                activity.setRequestedOrientation(-1);
                return;
            case true:
                i = 1;
                break;
            case true:
                i = 2;
                break;
        }
        setActivityOrientation(activity, i);
    }

    public static void setActivityOrientation(Activity activity, int i) throws Throwable {
        boolean z;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        if (Build.MANUFACTURER.toUpperCase(locale).equals("AMAZON") && (upperCase.equals("KFTT") || upperCase.equals("KFJWI") || upperCase.equals("KFJWA"))) {
            z = true;
        } else {
            z = false;
        }
        if (activity != null && !activity.isFinishing()) {
            int rotation = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation();
            if (i == 1) {
                if (rotation == 2) {
                    activity.setRequestedOrientation(9);
                } else {
                    activity.setRequestedOrientation(1);
                }
            } else if (i == 2) {
                if (z) {
                    if (rotation != 0 && rotation != 1) {
                        activity.setRequestedOrientation(0);
                    } else {
                        activity.setRequestedOrientation(8);
                    }
                } else if (rotation != 0 && rotation != 1) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
        }
    }

    public static void unlockOrientation(Activity activity) throws Throwable {
        activity.setRequestedOrientation(-1);
    }
}
