package com.bytedance.sdk.component.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.utils.VzQ */
/* loaded from: classes3.dex */
public class C7748VzQ {

    /* renamed from: bg */
    private static String f16925bg;

    /* renamed from: IL */
    public static String m87856IL(Context context) {
        if (!TextUtils.isEmpty(f16925bg)) {
            return f16925bg;
        }
        String m87854bg = m87854bg();
        f16925bg = m87854bg;
        if (!TextUtils.isEmpty(m87854bg)) {
            return f16925bg;
        }
        String m87857IL = m87857IL();
        f16925bg = m87857IL;
        if (!TextUtils.isEmpty(m87857IL)) {
            return f16925bg;
        }
        String m87855bX = m87855bX(context);
        f16925bg = m87855bX;
        return m87855bX;
    }

    /* renamed from: bX */
    private static String m87855bX(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    /* renamed from: bg */
    public static boolean m87853bg(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), m87856IL(context));
    }

    /* renamed from: bg */
    private static String m87854bg() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                processName = Application.getProcessName();
                return processName;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: IL */
    private static String m87857IL() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
