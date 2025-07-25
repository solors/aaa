package com.helpshift.unityproxy;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.helpshift.unityproxy.utils.InstallUtils;
import java.util.HashMap;
import java.util.Map;
import p680g3.HelpshiftProactiveAPIConfigCollector;
import p809o2.Helpshift;
import p809o2.UnsupportedOSVersionException;

/* loaded from: classes5.dex */
public class HelpshiftUnity {
    private static final String TAG = "HelpshiftUnity";
    private static final String UNITY_PLUGIN_VERSION = "10.3.1";

    public static void closeSession() {
        Helpshift.m13968m();
    }

    public static void handleProactiveLink(Context context, String str) {
        InstallUtils.installWithCachedValues(context);
        Helpshift.m13967n(str);
    }

    public static void handlePush(Context context, Map<String, String> map) {
        InstallUtils.installWithCachedValues(context);
        Helpshift.m13966o(map);
    }

    public static void install(Application application, String str, String str2, Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("sdkType", "unityx");
        map.put("pluginVersion", UNITY_PLUGIN_VERSION);
        try {
            Helpshift.m13965p(application, str, str2, map);
        } catch (UnsupportedOSVersionException unused) {
            Log.e(TAG, "install() called on the OS version: " + Build.VERSION.SDK_INT + " is not supported");
        }
    }

    public static void registerPushToken(String str) {
        Helpshift.m13961t(str);
    }

    public static void setHelpshiftProactiveConfigCollector(Context context, HelpshiftProactiveAPIConfigCollector helpshiftProactiveAPIConfigCollector) {
        InstallUtils.installWithCachedValues(context);
        Helpshift.m13956y(helpshiftProactiveAPIConfigCollector);
    }
}
