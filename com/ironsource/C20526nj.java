package com.ironsource;

import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.nj */
/* loaded from: classes6.dex */
public class C20526nj {

    /* renamed from: a */
    private String f52215a;

    /* renamed from: b */
    private JSONObject f52216b;

    /* renamed from: c */
    private String f52217c;

    /* renamed from: d */
    private String f52218d;

    public C20526nj(JSONObject jSONObject) {
        this.f52215a = jSONObject.optString(C21114v8.C21120f.f53955b);
        this.f52216b = jSONObject.optJSONObject(C21114v8.C21120f.f53956c);
        this.f52217c = jSONObject.optString("success");
        this.f52218d = jSONObject.optString(C21114v8.C21120f.f53958e);
    }

    /* renamed from: a */
    public String m56150a() {
        return this.f52218d;
    }

    /* renamed from: b */
    public String m56149b() {
        return this.f52215a;
    }

    /* renamed from: c */
    public JSONObject m56148c() {
        return this.f52216b;
    }

    /* renamed from: d */
    public String m56147d() {
        return this.f52217c;
    }

    /* renamed from: e */
    public JSONObject m56146e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C21114v8.C21120f.f53955b, this.f52215a);
            jSONObject.put(C21114v8.C21120f.f53956c, this.f52216b);
            jSONObject.put("success", this.f52217c);
            jSONObject.put(C21114v8.C21120f.f53958e, this.f52218d);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }
}
