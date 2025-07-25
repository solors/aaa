package com.meevii.soniclib;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Process;
import com.beatles.unity.delegate.IAppDelegate;
import com.meevii.soniclib.largepush.LargePushManager;

/* loaded from: classes5.dex */
public class AppDelegate implements IAppDelegate {
    private String getCurrentProcessName(Context context) {
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager.getRunningAppProcesses() == null) {
            return context.getPackageName();
        }
        String str = "";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                str = runningAppProcessInfo.processName;
            }
        }
        return str;
    }

    private boolean isMainProcess(Context context) {
        return context.getPackageName().equals(getCurrentProcessName(context));
    }

    @Override // com.beatles.unity.delegate.IAppDelegate
    public void onCreate(Application application) {
        if (!isMainProcess(application.getApplicationContext())) {
            return;
        }
        ExceptionIntercept.initHookHandler(application);
        LargePushManager.init();
    }

    @Override // com.beatles.unity.delegate.IAppDelegate
    public void onAttachBaseContext(Context context) {
    }

    @Override // com.beatles.unity.delegate.IAppDelegate
    public void onLowMemory(Application application) {
    }

    @Override // com.beatles.unity.delegate.IAppDelegate
    public void onTerminate(Application application) {
    }

    @Override // com.beatles.unity.delegate.IAppDelegate
    public void onConfigurationChanged(Application application, Configuration configuration) {
    }

    @Override // com.beatles.unity.delegate.IAppDelegate
    public void onTrimMemory(Application application, int i) {
    }
}
