package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AFLogger;

/* loaded from: classes2.dex */
public final class AFg1fSDK {
    public static boolean AFKeystoreWrapper(Context context) {
        boolean isInstantApp;
        if (Build.VERSION.SDK_INT >= 26) {
            isInstantApp = context.getPackageManager().isInstantApp();
            return isInstantApp;
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", e, true);
            return false;
        }
    }
}
