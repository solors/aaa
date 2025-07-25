package com.zeus.gmc.sdk.mobileads.columbus.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.WindowManager;
import androidx.exifinterface.media.ExifInterface;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32464ciio2c;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.AdGlobalSdk;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.Base64Decoder;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.ConstantsUtil;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Locale;

/* loaded from: classes8.dex */
public class AndroidUtils {
    private static final int c2oc2i = -2;
    private static final String c2oc2o = "UNKNOWN";
    private static final String cco22 = "ro.product.mod_device";
    private static final String cii2c2 = ConstantsUtil.getSafeString("m", "iu", "i.os.Build");
    private static final String ciii2coi2 = "RU";
    private static final String cioccoiococ = "http.agent";
    private static final int coi222o222 = -1;
    private static DecimalFormat coiic = null;
    private static final String coo2iico = "AndroidUtils";

    private AndroidUtils() {
    }

    public static void avoidOnMainThread() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("do not run on main thread.");
    }

    public static boolean checkPreInstallApp(String str) {
        try {
            return ((Boolean) Class.forName(ConstantsUtil.SYS_GMC_INIT).getMethod("isPreinstalledPackage", String.class).invoke(null, str)).booleanValue();
        } catch (Exception e) {
            MLog.m25882w(coo2iico, "checkPreinstallApp failed:", e);
            return false;
        }
    }

    public static int dp2px(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static String formatFileSize(long j) {
        if (coiic == null) {
            coiic = new DecimalFormat(".00");
        }
        return coiic.format(j / 1048576.0d);
    }

    public static String getAgreeTime(Context context) {
        try {
            return String.valueOf(Settings.Global.getLong(context.getContentResolver(), "miui_terms_agreed_time", 0L));
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getAgreeTime", e);
            return null;
        }
    }

    public static Drawable getAppIcon(Context context, String str) {
        if (str != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                return packageManager.getApplicationInfo(str, 0).loadIcon(packageManager);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static int getAppVersion(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(coo2iico, "getAppVersion", e);
        }
        return -1;
    }

    public static String getAppVersionCode(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getAppVersionCode e : ", e);
            return "unknown";
        }
    }

    public static Context getApplicationContext(Context context) {
        if (context != null && context.getApplicationContext() != null) {
            return context.getApplicationContext();
        }
        return context;
    }

    public static String getApplicationName(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0));
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getApplicationName exception", e);
            return null;
        }
    }

    public static int getBatteryPower(Context context) {
        try {
            return context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("level", 0);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getBatteryPower", e);
            return 0;
        }
    }

    public static String getBatteryTemperature(Context context) {
        try {
            return String.valueOf(context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("temperature", 0) / 10.0d);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getBatteryTemperature", e);
            return null;
        }
    }

    public static String getCotaCarrier() {
        return C32464ciio2c.coo2iico(ConstantsUtil.SYS_COTA_CARRIER, "");
    }

    public static String getCustomizedRegion() {
        return C32464ciio2c.coo2iico(ConstantsUtil.SYS_CUSTOMIZAD_REGION, "");
    }

    public static float getDeviceDensity(Context context) {
        try {
            return context.getResources().getDisplayMetrics().density;
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getDeviceDensity exception", e);
            return -1.0f;
        }
    }

    public static String getFontScale(Context context) {
        try {
            Configuration configuration = new Configuration();
            configuration.updateFrom(context.getResources().getConfiguration());
            return String.valueOf(configuration.fontScale);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getFontScale", e);
            return null;
        }
    }

    public static String getIncremenatalVersion() {
        if (TextUtils.isEmpty(Build.VERSION.INCREMENTAL)) {
            return c2oc2o;
        }
        return Build.VERSION.INCREMENTAL;
    }

    public static String getInstallerPackage(Context context) {
        String str = "";
        if (context != null) {
            try {
                str = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            } catch (Exception e) {
                MLog.m25888e(coo2iico, "getInstallerPackage : ", e);
                return str;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return c2oc2o;
        }
        return str;
    }

    public static String getLanguage() {
        String coo2iico2 = C32464ciio2c.coo2iico("persist.sys.language", "");
        if (TextUtils.isEmpty(coo2iico2)) {
            return Locale.getDefault().getLanguage();
        }
        return coo2iico2;
    }

    public static String getLocale() {
        if (Locale.getDefault() != null) {
            return Locale.getDefault().toString();
        }
        return "";
    }

    public static String getMCCMNC(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        } catch (Exception e) {
            MLog.m25891d(coo2iico, "Get MCC/MNC exception", e);
            return null;
        }
    }

    public static PackageInfo getPackageInfo(Context context, String str, int i) {
        try {
            return context.getPackageManager().getPackageInfo(str, i);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getRegion(Context context) {
        String str = "";
        if (!TextUtils.isEmpty("ro.miui.region")) {
            String coo2iico2 = C32464ciio2c.coo2iico("ro.miui.region", "");
            if (TextUtils.isEmpty(coo2iico2)) {
                coo2iico2 = C32464ciio2c.coo2iico("ro.product.locale.region", "");
            }
            str = TextUtils.isEmpty(coo2iico2) ? C32464ciio2c.coo2iico("persist.sys.country", "") : coo2iico2;
        } else if (context != null) {
            try {
                str = ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso();
            } catch (Exception e) {
                MLog.m25888e(coo2iico, "getRegion had exception, ", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            return Locale.getDefault().getCountry();
        }
        return str;
    }

    public static int getScreenHeight(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getScreenWidth exception", e);
            return 0;
        }
    }

    public static int getScreenWidth(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getScreenWidth exception", e);
            return 0;
        }
    }

    public static String getSubscriberId(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            try {
                Method method = Class.forName(telephonyManager.getClass().getName()).getMethod("getNetworkOperatorForPhone", Integer.TYPE);
                Object invoke = method.invoke(telephonyManager, 0);
                Object invoke2 = method.invoke(telephonyManager, 1);
                if (!TextUtils.isEmpty(String.valueOf(invoke)) || !TextUtils.isEmpty(String.valueOf(invoke2))) {
                    return invoke + "," + invoke2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return telephonyManager.getNetworkOperator();
        } catch (Exception e2) {
            MLog.m25888e(coo2iico, "getBatteryPower", e2);
            return null;
        }
    }

    public static String getSystemAvailableMemorySize(Context context) {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return formatFileSize(memoryInfo.availMem);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getSystemAvailableMemorySize", e);
            return null;
        }
    }

    public static String getSystemBuild() {
        if (isAlphaBuild()) {
            return ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
        }
        if (isStableBuild()) {
            return ExifInterface.LATITUDE_SOUTH;
        }
        if (isDevBuild()) {
            return "D";
        }
        return c2oc2o;
    }

    public static String getUserAgent() {
        return System.getProperty(cioccoiococ);
    }

    public static int getVersionCode(Context context, String str) {
        PackageInfo packageInfo = getPackageInfo(context, str, 0);
        if (packageInfo == null) {
            return -1;
        }
        if (!packageInfo.applicationInfo.enabled) {
            return -2;
        }
        return packageInfo.versionCode;
    }

    public static int getVersionCodeMSA(Context context) {
        PackageInfo packageInfo = getPackageInfo(context, Base64Decoder.decode("Y29tLm1pdWkubXNhLmdsb2JhbA=="), 0);
        if (packageInfo == null) {
            return -1;
        }
        if (!packageInfo.applicationInfo.enabled) {
            return -2;
        }
        return packageInfo.versionCode;
    }

    public static boolean isAlphaBuild() {
        try {
            if (isInternationalBuild()) {
                return C32464ciio2c.coo2iico(cco22).contains("_alpha");
            }
            Object obj = Class.forName(cii2c2).getField("IS_ALPHA_BUILD").get(null);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return false;
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "isAlphaBuild():", e);
            return false;
        }
    }

    public static boolean isDark(Context context) {
        if (AdGlobalSdk.getDarkMode() != null) {
            return AdGlobalSdk.getDarkMode().booleanValue();
        }
        if (context == null || (context.getResources().getConfiguration().uiMode & 48) != 32) {
            return false;
        }
        return true;
    }

    public static boolean isDevBuild() {
        try {
        } catch (Exception e) {
            MLog.m25889e(coo2iico, e.getMessage());
        }
        if (isInternationalBuild()) {
            if (TextUtils.isEmpty(Build.VERSION.INCREMENTAL) || !Build.VERSION.INCREMENTAL.matches("\\d+.\\d+.\\d+(-internal)?")) {
                return false;
            }
            return true;
        }
        Object obj = Class.forName(cii2c2).getField("IS_DEVELOPMENT_VERSION").get(null);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public static boolean isInternationalBuild() {
        return C32464ciio2c.coo2iico(cco22, "").contains("_global");
    }

    public static boolean isMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static boolean isRTL(Context context) {
        boolean z;
        boolean z2;
        if ((context.getApplicationInfo().flags & 4194304) == 4194304) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static boolean isRegionRU(Context context) {
        String region = getRegion(context);
        if (context != null && !TextUtils.isEmpty(region)) {
            return "RU".equalsIgnoreCase(region);
        }
        return false;
    }

    public static boolean isStableBuild() {
        try {
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "isStableBuild()", e);
        }
        if (isInternationalBuild()) {
            if (!"user".equals(Build.TYPE) || isDevBuild()) {
                return false;
            }
            return true;
        }
        Object obj = Class.forName(cii2c2).getField("IS_STABLE_VERSION").get(null);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public static boolean isValidHttpUrl(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            URL url = new URL(str);
            if (!"http".equals(url.getProtocol())) {
                if (!"https".equals(url.getProtocol())) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
