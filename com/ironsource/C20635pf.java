package com.ironsource;

import android.content.Context;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.pf */
/* loaded from: classes6.dex */
public class C20635pf implements InterfaceC21058u2 {

    /* renamed from: b */
    private static final String f52401b = "pf";

    /* renamed from: c */
    private static C20635pf f52402c;

    /* renamed from: a */
    private final Map<String, InterfaceC20048hg> f52403a = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.ironsource.pf$a */
    /* loaded from: classes6.dex */
    class RunnableC20636a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C20583of f52404a;

        /* renamed from: b */
        final /* synthetic */ Context f52405b;

        /* renamed from: c */
        final /* synthetic */ String f52406c;

        RunnableC20636a(C20583of c20583of, Context context, String str) {
            this.f52404a = c20583of;
            this.f52405b = context;
            this.f52406c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C20635pf.this.f52403a.put(this.f52406c, new C20149jf(this.f52404a, this.f52405b));
        }
    }

    /* renamed from: a */
    private C20047hf m55829a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(C21114v8.C21122h.f54042O));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new C20047hf(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return new C20047hf();
        }
    }

    /* renamed from: b */
    private C20047hf m55827b(JSONObject jSONObject) {
        C20047hf c20047hf = new C20047hf();
        try {
            return m55829a(jSONObject);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return c20047hf;
        }
    }

    /* renamed from: c */
    public String m55825c(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("adViewId")) {
            return (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId");
        }
        return jSONObject.getString("adViewId");
    }

    /* renamed from: d */
    public void m55822d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.m54970i(f52401b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        } else if (!this.f52403a.containsKey(string)) {
            Logger.m54970i(f52401b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        } else {
            InterfaceC20048hg interfaceC20048hg = this.f52403a.get(string);
            if (interfaceC20048hg != null) {
                interfaceC20048hg.mo55991c(jSONObject, str, str2);
            }
        }
    }

    /* renamed from: d */
    private boolean m55823d(JSONObject jSONObject) {
        return jSONObject.optBoolean(C21114v8.C21122h.f54090s0);
    }

    @Override // com.ironsource.InterfaceC21058u2
    @Nullable
    /* renamed from: a */
    public InterfaceC20048hg mo54697a(String str) {
        if (str.isEmpty() || !this.f52403a.containsKey(str)) {
            return null;
        }
        return this.f52403a.get(str);
    }

    /* renamed from: b */
    public void m55826b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.m54970i(f52401b, "performWebViewAction fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        } else if (!this.f52403a.containsKey(string)) {
            Logger.m54970i(f52401b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        } else {
            InterfaceC20048hg interfaceC20048hg = this.f52403a.get(string);
            String string2 = jSONObject.getString(C21114v8.C21122h.f54096v0);
            if (interfaceC20048hg != null) {
                interfaceC20048hg.mo56002a(string2, str, str2);
            }
        }
    }

    /* renamed from: c */
    public void m55824c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.m54970i(f52401b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        } else if (!this.f52403a.containsKey(string)) {
            Logger.m54970i(f52401b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        } else {
            InterfaceC20048hg interfaceC20048hg = this.f52403a.get(string);
            this.f52403a.remove(string);
            if (interfaceC20048hg != null) {
                interfaceC20048hg.mo56003a(str, str2);
            }
        }
    }

    /* renamed from: a */
    public static synchronized C20635pf m55832a() {
        C20635pf c20635pf;
        synchronized (C20635pf.class) {
            if (f52402c == null) {
                f52402c = new C20635pf();
            }
            c20635pf = f52402c;
        }
        return c20635pf;
    }

    /* renamed from: a */
    public void m55831a(InterfaceC20205kf interfaceC20205kf, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.m54970i(f52401b, "loadWithUrl fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        C20047hf m55827b = m55827b(jSONObject);
        if (this.f52403a.containsKey(string)) {
            Logger.m54970i(f52401b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        C20583of c20583of = new C20583of(interfaceC20205kf, context, string, m55827b);
        c20583of.m55986e(IronSourceStorageUtils.getNetworkStorageDir(context));
        c20583of.mo55995b(jSONObject, str, str2);
        if (m55823d(jSONObject)) {
            C21130ve.f54189a.m54467d(new RunnableC20636a(c20583of, context, string));
        } else {
            this.f52403a.put(string, c20583of);
        }
    }

    /* renamed from: a */
    public void m55828a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.m54970i(f52401b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        } else if (!this.f52403a.containsKey(string)) {
            Logger.m54970i(f52401b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        } else {
            InterfaceC20048hg interfaceC20048hg = this.f52403a.get(string);
            if (interfaceC20048hg != null) {
                interfaceC20048hg.mo56001a(jSONObject, str, str2);
            }
        }
    }
}
