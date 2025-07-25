package com.maticoo.sdk.mraid.utils;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes6.dex */
public class ContextHolder {
    private static Context globalAppContext;

    @Keep
    public static synchronized Context getGlobalAppContext() {
        synchronized (ContextHolder.class) {
            Context context = globalAppContext;
            if (context == null) {
                try {
                    Application application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                    if (application != null) {
                        globalAppContext = application;
                        return application;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    Application application2 = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, null);
                    if (application2 != null) {
                        globalAppContext = application2;
                        return application2;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                throw new IllegalStateException("ContextHolder is not initialed, it is recommend to initialize with application context.");
            }
            return context;
        }
    }

    public static synchronized void init(Context context) {
        synchronized (ContextHolder.class) {
            if (context != null) {
                if (context instanceof Application) {
                    globalAppContext = context;
                } else {
                    globalAppContext = context.getApplicationContext();
                }
            }
        }
    }
}
