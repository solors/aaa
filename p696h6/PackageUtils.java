package p696h6;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
import p041c6.AdDebugManager;

/* renamed from: h6.g */
/* loaded from: classes6.dex */
public class PackageUtils {
    /* renamed from: a */
    public static double m23668a(Context context) {
        if (AdDebugManager.m103603a().m103602b() > 0) {
            return AdDebugManager.m103603a().m103602b();
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return -1.0d;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return ((float) memoryInfo.totalMem) / 1000000.0f;
    }

    /* renamed from: b */
    public static String m23667b(Context context) {
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
    public static boolean m23666c(Application application) {
        try {
            if ((application.getApplicationInfo().flags & 2) != 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
