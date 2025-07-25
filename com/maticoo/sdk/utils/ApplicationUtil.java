package com.maticoo.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.lang.ref.SoftReference;
import java.util.List;

/* loaded from: classes6.dex */
public class ApplicationUtil {
    private static final String KEY_MAIN_PROCESS_NAME = "com.maticoo.sdk.MainProcessName";
    private SoftReference<Application> mContext;
    private String mainProcessName;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Holder {
        private static final ApplicationUtil INSTANCE = new ApplicationUtil();

        private Holder() {
        }
    }

    private Application currentApplication() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            DeveloperLog.LogE("RuntimeUtil:currentApplication:", th);
            CrashUtil.getSingleton().reportSDKException(th);
            return null;
        }
    }

    private String getCurrentProcessName(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo != null && runningAppProcessInfo.pid == myPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Application getInitialApplication() {
        try {
            return (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            DeveloperLog.LogE("RuntimeUtil:getInitialApplication:", th);
            CrashUtil.getSingleton().reportSDKException(th);
            return null;
        }
    }

    public static ApplicationUtil getInstance() {
        return Holder.INSTANCE;
    }

    private static boolean isAppForegroundWithRunningAppProcess(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Exception unused) {
        }
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    private boolean isAppForegroundWithRunningTask(Context context) {
        ComponentName componentName;
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
            if (!runningTasks.isEmpty()) {
                componentName = runningTasks.get(0).topActivity;
                if (componentName.getPackageName().equals(context.getPackageName())) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public Application getApplicationContext() {
        SoftReference<Application> softReference = this.mContext;
        if (softReference == null || softReference.get() == null) {
            Application currentApplication = currentApplication();
            if (currentApplication == null) {
                currentApplication = getInitialApplication();
            }
            this.mContext = new SoftReference<>(currentApplication);
        }
        return this.mContext.get();
    }

    public String getMainProcessName() {
        return this.mainProcessName;
    }

    public void hideStatusBarAndNavigationBar(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public boolean isAppForeground(Context context) {
        if (context == null) {
            return false;
        }
        if (!isAppForegroundWithRunningTask(context) && !isAppForegroundWithRunningAppProcess(context)) {
            return false;
        }
        return true;
    }

    public boolean isMainProcess(Context context) {
        if (TextUtils.isEmpty(this.mainProcessName) || context == null) {
            return true;
        }
        String currentProcessName = getCurrentProcessName(context.getApplicationContext());
        if (TextUtils.isEmpty(currentProcessName) || this.mainProcessName.equals(currentProcessName)) {
            return true;
        }
        return false;
    }

    private ApplicationUtil() {
        Bundle bundle = null;
        this.mContext = null;
        Application applicationContext = getApplicationContext();
        try {
            bundle = applicationContext.getApplicationContext().getPackageManager().getApplicationInfo(applicationContext.getApplicationContext().getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        this.mainProcessName = (bundle == null ? new Bundle() : bundle).getString(KEY_MAIN_PROCESS_NAME);
    }
}
