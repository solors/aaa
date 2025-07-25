package com.helpshift.unityproxy;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.util.Log;
import com.helpshift.log.HSLogger;
import com.helpshift.unityproxy.storage.HelpshiftUnityStorage;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import p680g3.HelpshiftProactiveAPIConfigCollector;
import p752k3.C37382g;
import p752k3.C37383m;
import p809o2.HSPluginEventBridge;
import p809o2.Helpshift;
import p809o2.HelpshiftAuthenticationFailureReason;
import p809o2.HelpshiftEventsListener;
import p809o2.UnsupportedOSVersionException;

/* loaded from: classes5.dex */
public class HelpshiftUnityAPI {
    public static String TAG = "Helpshift_UnityAPI";
    private static HelpshiftEventDelegate helpshiftEventDelegate;
    private static HelpshiftProactiveConfigEventDelegate helpshiftProactiveConfigEventDelegate;
    private static Map<String, Object> proactiveLocalConfigMap = new HashMap();
    private static HelpshiftProactiveAPIConfigCollector helpshiftProactiveAPIConfigCollectorCallback = new C17733a();

    /* renamed from: com.helpshift.unityproxy.HelpshiftUnityAPI$a */
    /* loaded from: classes5.dex */
    class C17733a implements HelpshiftProactiveAPIConfigCollector {
        C17733a() {
        }

        @Override // p680g3.HelpshiftProactiveAPIConfigCollector
        /* renamed from: a */
        public Map<String, Object> mo24478a() {
            if (HelpshiftUnityAPI.helpshiftProactiveConfigEventDelegate != null) {
                Map unused = HelpshiftUnityAPI.proactiveLocalConfigMap = HelpshiftUnityAPI.getSanitisedApiConfig(HelpshiftUnityAPI.helpshiftProactiveConfigEventDelegate.getApiConfigString());
            }
            return HelpshiftUnityAPI.proactiveLocalConfigMap;
        }
    }

    /* renamed from: com.helpshift.unityproxy.HelpshiftUnityAPI$b */
    /* loaded from: classes5.dex */
    class C17734b implements HelpshiftEventsListener {
        C17734b() {
        }

        @Override // p809o2.HelpshiftEventsListener
        /* renamed from: a */
        public void mo13954a(String str, Map<String, Object> map) {
            if (HelpshiftUnityAPI.helpshiftEventDelegate != null) {
                HelpshiftUnityAPI.helpshiftEventDelegate.onEventOccurred(str, C37382g.m18250h(map));
            }
        }

        @Override // p809o2.HelpshiftEventsListener
        /* renamed from: b */
        public void mo13953b(HelpshiftAuthenticationFailureReason helpshiftAuthenticationFailureReason) {
            if (HelpshiftUnityAPI.helpshiftEventDelegate != null) {
                HelpshiftUnityAPI.helpshiftEventDelegate.onUserAuthenticationFailure(helpshiftAuthenticationFailureReason.ordinal());
            }
        }
    }

    public static void addUserTrail(String str) {
        Helpshift.m13972i(str);
    }

    @Deprecated
    public static void clearAnonymousUserOnLogin() {
        Helpshift.m13971j();
    }

    public static void clearBreadCrumbs() {
        Helpshift.m13969l();
    }

    public static void closeSession() {
        Helpshift.m13968m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> getSanitisedApiConfig(String str) {
        if (C37383m.m18236d(str)) {
            return new HashMap();
        }
        try {
            return C37382g.m18249i(str);
        } catch (JSONException e) {
            Log.e(TAG, "Error in parsing the Config from Unity", e);
            return new HashMap();
        }
    }

    public static void handleProactiveLink(String str) {
        Helpshift.m13967n(str);
    }

    public static void handlePush(String str) {
        if (!C37383m.m18236d(str) && C37382g.m18254d(str)) {
            Helpshift.m13966o(C37382g.m18252f(str));
        }
    }

    public static void install(Application application, String str, String str2, Map<String, Object> map) {
        install(application, str, str2, C37382g.m18250h(map));
    }

    public static void installWithCachedValues(Application application, String str, String str2, Map<String, Object> map) {
        try {
            Helpshift.m13965p(application, str, str2, map);
        } catch (UnsupportedOSVersionException unused) {
            String str3 = TAG;
            Log.e(str3, "install() called on the OS version: " + Build.VERSION.SDK_INT + " is not supported");
        }
    }

    public static void leaveBreadCrumb(String str) {
        Helpshift.m13964q(str);
    }

    public static boolean login(String str) {
        if (!C37382g.m18254d(str)) {
            return false;
        }
        return Helpshift.m13963r(C37382g.m18252f(str));
    }

    public static void logout() {
        Helpshift.m13962s();
    }

    public static void registerPushToken(String str) {
        if (C37383m.m18233g(str)) {
            Helpshift.m13961t(str);
        }
    }

    public static void requestUnreadMessageCountUnity(boolean z) {
        Helpshift.m13960u(z);
    }

    public static void setHelpshiftEventsListener(HelpshiftEventDelegate helpshiftEventDelegate2) {
        if (helpshiftEventDelegate2 == null) {
            return;
        }
        helpshiftEventDelegate = helpshiftEventDelegate2;
        Helpshift.m13957x(new C17734b());
    }

    public static void setHelpshiftProactiveEventsListener(HelpshiftProactiveConfigEventDelegate helpshiftProactiveConfigEventDelegate2) {
        HSLogger.m65441d(TAG, "Event delegate registered for proactive config");
        helpshiftProactiveConfigEventDelegate = helpshiftProactiveConfigEventDelegate2;
    }

    public static void setLanguage(String str) {
        Helpshift.m13955z(str);
    }

    public static void showConversationUnity(Activity activity, String str) {
        Helpshift.m13988A(activity, getSanitisedApiConfig(str));
    }

    public static void showFAQSectionUnity(Activity activity, String str, String str2) {
        Helpshift.m13986C(activity, str, getSanitisedApiConfig(str2));
    }

    public static void showFAQsUnity(Activity activity, String str) {
        Helpshift.m13984E(activity, getSanitisedApiConfig(str));
    }

    public static void showSingleFAQUnity(Activity activity, String str, String str2) {
        Helpshift.m13982G(activity, str, getSanitisedApiConfig(str2));
    }

    public static void clearAnonymousUserOnLogin(boolean z) {
        Helpshift.m13970k(z);
    }

    public static void install(Application application, String str, String str2, String str3) {
        HSPluginEventBridge.m13990b(new UnityPluginAPIEventsBridge());
        HelpshiftUnityStorage helpshiftUnityStorage = HelpshiftUnityStorage.getInstance(application);
        helpshiftUnityStorage.putJsonStringOfMap(HelpshiftUnityStorage.INSTALL_CONFIG, str3);
        helpshiftUnityStorage.put(HelpshiftUnityStorage.DOMAIN_NAME, str2);
        helpshiftUnityStorage.put(HelpshiftUnityStorage.PLATFORM_ID, str);
        try {
            Helpshift.m13965p(application, str, str2, C37382g.m18253e(str3));
            Helpshift.m13956y(helpshiftProactiveAPIConfigCollectorCallback);
        } catch (UnsupportedOSVersionException unused) {
            String str4 = TAG;
            Log.e(str4, "install() called on the OS version: " + Build.VERSION.SDK_INT + " is not supported");
        }
    }
}
