package p738j5;

import android.app.ActivityManager;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.webkit.ProxyConfig;
import com.meevii.abtest.util.Constant;
import java.io.File;
import java.util.Locale;

/* compiled from: PackageUtils.java */
/* renamed from: j5.f */
/* loaded from: classes6.dex */
public class C37294f {
    /* renamed from: a */
    public static String m18535a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public static String m18534b(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String simCountryIso = telephonyManager.getSimCountryIso();
                if (!TextUtils.isEmpty(simCountryIso)) {
                    return simCountryIso;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return Locale.getDefault().getCountry();
    }

    /* renamed from: c */
    public static double m18533c(Context context) {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return (memoryInfo.totalMem / 1024.0d) / 1024.0d;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1.0d;
        }
    }

    /* renamed from: d */
    public static String m18532d() {
        return Locale.getDefault().getLanguage().toLowerCase() + "-" + Locale.getDefault().getCountry().toLowerCase();
    }

    /* renamed from: e */
    public static int m18531e(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    /* renamed from: f */
    public static String m18530f(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
                return displayMetrics.heightPixels + ProxyConfig.MATCH_ALL_SCHEMES + displayMetrics.widthPixels;
            }
            return displayMetrics.widthPixels + ProxyConfig.MATCH_ALL_SCHEMES + displayMetrics.heightPixels;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: g */
    public static boolean m18529g(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m18528h(Context context) {
        try {
            return !new File(context.getFilesDir(), Constant.DISK_CACHE_FILE_NAME_PARAM_SET).exists();
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    /* renamed from: i */
    public static boolean m18527i(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            if (Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d)) < 7.0d) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
