package com.zeus.gmc.sdk.mobileads.columbus.common;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.zeus.gmc.sdk.mobileads.columbus.util.AndroidUtils;

/* loaded from: classes8.dex */
public class GlobalHolder {
    private static volatile Handler c2oc2i;
    private static volatile Context coo2iico;
    private static volatile Handler coi222o222 = new Handler(Looper.getMainLooper());
    private static volatile HandlerThread cioccoiococ = new HandlerThread("background_task");

    private GlobalHolder() {
    }

    public static Context getApplicationContext() {
        return AndroidUtils.getApplicationContext(coo2iico);
    }

    public static synchronized Handler getBackgroundHandler() {
        Handler handler;
        synchronized (GlobalHolder.class) {
            if (c2oc2i == null) {
                synchronized (GlobalHolder.class) {
                    if (c2oc2i == null) {
                        if (!cioccoiococ.isAlive()) {
                            cioccoiococ.start();
                        }
                        c2oc2i = new Handler(cioccoiococ.getLooper());
                    }
                }
            }
            handler = c2oc2i;
        }
        return handler;
    }

    public static Handler getUIHandler() {
        return coi222o222;
    }

    public static void setApplicationContext(Context context) {
        coo2iico = context;
    }
}
