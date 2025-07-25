package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C20086i9;
import com.ironsource.C20473mi;
import com.ironsource.C20630pb;
import com.ironsource.C20696qi;
import com.ironsource.C20757rf;
import com.ironsource.C21223xf;
import com.ironsource.C21265yf;
import com.ironsource.C21317zi;
import com.ironsource.InterfaceC19928fn;
import com.ironsource.InterfaceC21182wi;
import com.ironsource.sdk.controller.C20823e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IronSourceNetwork {

    /* renamed from: a */
    static final String f52885a = "IronSourceNetwork";

    /* renamed from: b */
    private static InterfaceC21182wi f52886b;

    /* renamed from: c */
    private static List<InterfaceC19928fn> f52887c = new ArrayList();

    /* renamed from: d */
    private static C21317zi f52888d;

    /* renamed from: a */
    private static synchronized void m55358a() throws Exception {
        synchronized (IronSourceNetwork.class) {
            if (f52886b == null) {
                throw new NullPointerException("Call initSDK first");
            }
        }
    }

    public static synchronized void addInitListener(InterfaceC19928fn interfaceC19928fn) {
        synchronized (IronSourceNetwork.class) {
            C21317zi c21317zi = f52888d;
            if (c21317zi == null) {
                f52887c.add(interfaceC19928fn);
            } else if (c21317zi.m53844b()) {
                interfaceC19928fn.onSuccess();
            } else {
                interfaceC19928fn.onFail(f52888d.m53845a());
            }
        }
    }

    public static synchronized void destroyAd(C20473mi c20473mi) throws Exception {
        synchronized (IronSourceNetwork.class) {
            m55358a();
            f52886b.mo53966b(c20473mi);
        }
    }

    public static synchronized C20823e getControllerManager() {
        C20823e mo54338a;
        synchronized (IronSourceNetwork.class) {
            mo54338a = f52886b.mo54338a();
        }
        return mo54338a;
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            if (TextUtils.isEmpty(str)) {
                Logger.m54972e(f52885a, "applicationKey is NULL");
                return;
            }
            if (f52886b == null) {
                SDKUtils.setInitSDKParams(map);
                try {
                    m55357a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
                } catch (Exception e) {
                    C20086i9.m57997d().m58003a(e);
                    Logger.m54972e(f52885a, "Failed to init event tracker: " + e.getMessage());
                }
                f52886b = C20696qi.m55647a(context, str, str2);
            }
        }
    }

    public static synchronized boolean isAdAvailableForInstance(C20473mi c20473mi) {
        synchronized (IronSourceNetwork.class) {
            InterfaceC21182wi interfaceC21182wi = f52886b;
            if (interfaceC21182wi == null) {
                return false;
            }
            return interfaceC21182wi.mo53969a(c20473mi);
        }
    }

    public static synchronized void loadAd(C20473mi c20473mi, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            m55358a();
            f52886b.mo53968a(c20473mi, map);
        }
    }

    public static synchronized void loadAdView(Activity activity, C20473mi c20473mi, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            m55358a();
            f52886b.mo53967b(activity, c20473mi, map);
        }
    }

    public static void onPause(Activity activity) {
        InterfaceC21182wi interfaceC21182wi = f52886b;
        if (interfaceC21182wi == null) {
            return;
        }
        interfaceC21182wi.onPause(activity);
    }

    public static void onResume(Activity activity) {
        InterfaceC21182wi interfaceC21182wi = f52886b;
        if (interfaceC21182wi == null) {
            return;
        }
        interfaceC21182wi.onResume(activity);
    }

    public static synchronized void release(Activity activity) {
        synchronized (IronSourceNetwork.class) {
            InterfaceC21182wi interfaceC21182wi = f52886b;
            if (interfaceC21182wi == null) {
                return;
            }
            interfaceC21182wi.mo54106a(activity);
        }
    }

    public static synchronized void showAd(Activity activity, C20473mi c20473mi, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            m55358a();
            f52886b.mo53970a(activity, c20473mi, map);
        }
    }

    public static synchronized void updateInitFailed(C20757rf c20757rf) {
        synchronized (IronSourceNetwork.class) {
            f52888d = new C21317zi(c20757rf);
            for (InterfaceC19928fn interfaceC19928fn : f52887c) {
                interfaceC19928fn.onFail(c20757rf);
            }
            f52887c.clear();
        }
    }

    public static synchronized void updateInitSucceeded() {
        synchronized (IronSourceNetwork.class) {
            f52888d = new C21317zi();
            for (InterfaceC19928fn interfaceC19928fn : f52887c) {
                interfaceC19928fn.onSuccess();
            }
            f52887c.clear();
        }
    }

    /* renamed from: a */
    private static void m55357a(Context context, JSONObject jSONObject, String str, String str2, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            C20630pb m53980a = C21265yf.m53980a(jSONObject);
            if (m53980a.m55852a()) {
                C21223xf.m54139a(m53980a, C21265yf.m53983a(context, str, str2, map));
            }
        }
    }
}
