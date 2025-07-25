package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C20688qf;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.hm */
/* loaded from: classes6.dex */
public class C20056hm {

    /* renamed from: b */
    private final InterfaceC19697ce f50485b = C19821el.m58797N().mo57096f();

    /* renamed from: a */
    C19812ed f50484a = new C19812ed();

    /* renamed from: a */
    public void m58087a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f50484a.m58814a("debug", jSONObject);
        }
    }

    /* renamed from: b */
    public void m58080b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f50484a.m58816a(C19577ad.f49116i, new JSONObject(controllerConfig).opt(C21114v8.C21115a.f53892p));
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: c */
    public void m58078c() {
        this.f50484a.m58816a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    /* renamed from: d */
    public void m58077d() {
        this.f50484a.m58816a("sdkv", "8.4.0");
    }

    /* renamed from: e */
    public void m58076e() {
        HashMap hashMap = new HashMap();
        hashMap.put(C19577ad.f49148x, C21322zm.f54776f);
        hashMap.put(C19577ad.f49146w, "7");
        this.f50484a.m58813a(hashMap);
    }

    /* renamed from: a */
    public void m58086a(Context context) {
        if (context instanceof Activity) {
            this.f50484a.m58816a(C19577ad.f49128n, Boolean.valueOf(this.f50485b.mo57158a((Activity) context)));
        }
    }

    /* renamed from: b */
    public void m58079b(Context context) {
        this.f50484a.m58816a("gpi", Boolean.valueOf(C21085un.m54607d(context)));
    }

    /* renamed from: a */
    public void m58085a(C20688qf.EnumC20691c enumC20691c) {
        this.f50484a.m58816a(C19577ad.f49112g1, Integer.valueOf(enumC20691c.ordinal()));
    }

    /* renamed from: a */
    public void m58084a(List<String> list) {
        this.f50484a.m58816a(C19577ad.f49121j1, list);
    }

    /* renamed from: a */
    public void m58083a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.f50484a.m58816a(entry.getKey(), (Object) entry.getValue());
        }
    }

    /* renamed from: a */
    public void m58082a(JSONObject jSONObject) {
        this.f50484a.m58814a(C19577ad.f49124l, jSONObject);
    }

    /* renamed from: a */
    public void m58081a(boolean z) {
        this.f50484a.m58816a(C19577ad.f49041A0, Boolean.valueOf(z));
    }
}
