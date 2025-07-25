package com.p551my.tracker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.p551my.tracker.ads.AdEvent;
import com.p551my.tracker.miniapps.MiniAppEvent;
import com.p551my.tracker.obfuscated.C26290a1;
import com.p551my.tracker.obfuscated.C26300b1;
import com.p551my.tracker.obfuscated.C26333h0;
import com.p551my.tracker.obfuscated.C26468z0;
import com.p551my.tracker.plugins.MyTrackerPluginConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.MyTracker */
/* loaded from: classes7.dex */
public final class MyTracker {
    public static final String VERSION = "3.1.2";

    /* renamed from: a */
    private static final List<MyTrackerPluginConfig> f68433a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static volatile C26333h0 f68434b;

    /* renamed from: com.my.tracker.MyTracker$AttributionListener */
    /* loaded from: classes7.dex */
    public interface AttributionListener {
        void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution);
    }

    /* renamed from: com.my.tracker.MyTracker$FlushListener */
    /* loaded from: classes7.dex */
    public interface FlushListener {
        void onResult(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.MyTracker$a */
    /* loaded from: classes7.dex */
    public static final class C26282a {

        /* renamed from: a */
        static final C26290a1 f68435a;

        /* renamed from: b */
        static final MyTrackerParams f68436b;

        /* renamed from: c */
        static final MyTrackerConfig f68437c;

        static {
            C26290a1 m42161t = C26290a1.m42161t();
            f68435a = m42161t;
            f68437c = MyTrackerConfig.newConfig(m42161t);
            f68436b = m42161t.m42171j();
        }
    }

    private MyTracker() {
    }

    public static void applyPlugin(MyTrackerPluginConfig myTrackerPluginConfig) {
        f68433a.add(myTrackerPluginConfig);
    }

    public static void flush() {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42056a();
        }
    }

    public static String getInstanceId(Context context) {
        return C26300b1.m42125a(context);
    }

    public static MyTrackerConfig getTrackerConfig() {
        return C26282a.f68437c;
    }

    public static MyTrackerParams getTrackerParams() {
        return C26282a.f68436b;
    }

    public static String handleDeeplink(Intent intent) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
            return null;
        }
        return c26333h0.m42051a(intent);
    }

    public static void initTracker(String str, Application application) {
        if (TextUtils.isEmpty(str)) {
            C26468z0.m41525b("MyTracker initialization failed: id can't be empty");
        } else if (f68434b != null) {
            C26468z0.m41523c("MyTracker has already been initialized");
        } else {
            synchronized (MyTracker.class) {
                if (f68434b != null) {
                    C26468z0.m41523c("MyTracker has already been initialized");
                    return;
                }
                C26290a1 c26290a1 = C26282a.f68435a;
                ArrayList arrayList = new ArrayList(f68433a);
                C26333h0 m42046a = C26333h0.m42046a(str, c26290a1, application);
                m42046a.m42043a(arrayList);
                f68434b = m42046a;
            }
        }
    }

    public static boolean isDebugMode() {
        return C26468z0.m41529a();
    }

    public static void onActivityResult(int i, Intent intent) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42055a(i, intent);
        }
    }

    public static void onPurchasesUpdated(int i, List<Object> list) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42054a(i, list);
        }
    }

    public static void setAttributionListener(AttributionListener attributionListener) {
        setAttributionListener(attributionListener, null);
    }

    public static void setDebugMode(boolean z) {
        C26468z0.m41526a(z);
    }

    public static void trackAdEvent(AdEvent adEvent) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42049a(adEvent);
        }
    }

    public static void trackAppGalleryPurchaseEvent(Object obj, String str, String str2, String str3, Map<String, String> map) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42047a(obj, str, str2, str3, map);
        }
    }

    public static void trackEvent(String str) {
        trackEvent(str, null);
    }

    public static void trackInviteEvent() {
        trackInviteEvent(null);
    }

    public static void trackLaunchManually(Activity activity) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42052a(activity);
        }
    }

    public static void trackLevelEvent() {
        trackLevelEvent(null);
    }

    public static void trackLoginEvent(String str, String str2) {
        trackLoginEvent(str, str2, null);
    }

    public static void trackMiniAppEvent(MiniAppEvent miniAppEvent) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42048a(miniAppEvent);
        }
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        trackPurchaseEvent(jSONObject, jSONObject2, str, null);
    }

    public static void trackRegistrationEvent(String str, String str2) {
        trackRegistrationEvent(str, str2, null);
    }

    public static void flush(FlushListener flushListener) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42050a(flushListener);
        }
    }

    public static void setAttributionListener(AttributionListener attributionListener, Handler handler) {
        C26282a.f68435a.m42198a(attributionListener, handler);
    }

    public static void trackEvent(String str, Map<String, String> map) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42044a(str, map);
        }
    }

    public static void trackInviteEvent(Map<String, String> map) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42042a(map);
        }
    }

    public static void trackLevelEvent(int i, Map<String, String> map) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42053a(i, map);
        }
    }

    public static void trackLoginEvent(String str, String str2, Map<String, String> map) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42045a(str, str2, map);
        }
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42041a(jSONObject, jSONObject2, str, map);
        }
    }

    public static void trackRegistrationEvent(String str, String str2, Map<String, String> map) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42039b(str, str2, map);
        }
    }

    public static void trackLevelEvent(Map<String, String> map) {
        C26333h0 c26333h0 = f68434b;
        if (c26333h0 == null) {
            C26468z0.m41525b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c26333h0.m42038b(map);
        }
    }
}
