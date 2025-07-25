package com.bykv.p135vk.openvk.preload.geckox.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.geckox.utils.a */
/* loaded from: classes3.dex */
public final class AppUtils {

    /* renamed from: a */
    private static String f14125a;

    /* renamed from: a */
    public static String m91229a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            GeckoLogger.m91260w("gecko-debug-tag", "getVersion:", e);
            return "null";
        }
    }

    /* renamed from: b */
    public static String m91226b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            return applicationInfo == null ? "" : applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            GeckoLogger.m91260w("gecko-debug-tag", "getApplicationName:", th);
            return "";
        }
    }

    /* renamed from: c */
    public static String m91225c(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (!TextUtils.isEmpty(f14125a)) {
            return f14125a;
        }
        String m91230a = m91230a();
        f14125a = m91230a;
        if (!TextUtils.isEmpty(m91230a)) {
            return f14125a;
        }
        String m91227b = m91227b();
        f14125a = m91227b;
        if (!TextUtils.isEmpty(m91227b)) {
            return f14125a;
        }
        if (context != null) {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            }
        }
        str = null;
        f14125a = str;
        return str;
    }

    /* renamed from: a */
    private static String m91230a() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                processName = Application.getProcessName();
                return processName;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m91227b() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m91228a(Throwable th) {
        GeckoLogger.m91260w("gecko-debug-tag", "throwIfDebug:", th);
    }
}
