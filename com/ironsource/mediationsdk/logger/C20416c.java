package com.ironsource.mediationsdk.logger;

import com.ironsource.C20086i9;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.logger.c */
/* loaded from: classes6.dex */
class C20416c {

    /* renamed from: a */
    private IronSourceLogger.IronSourceTag f51665a;

    /* renamed from: b */
    private String f51666b;

    /* renamed from: c */
    private String f51667c;

    /* renamed from: d */
    private int f51668d;

    public C20416c(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i) {
        this.f51665a = ironSourceTag;
        this.f51666b = str;
        this.f51667c = str2;
        this.f51668d = i;
    }

    /* renamed from: a */
    public int m56767a() {
        return this.f51668d;
    }

    /* renamed from: b */
    public JSONObject m56766b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.f51666b);
            jSONObject.put("tag", this.f51665a);
            jSONObject.put("level", this.f51668d);
            jSONObject.put("message", this.f51667c);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }
}
