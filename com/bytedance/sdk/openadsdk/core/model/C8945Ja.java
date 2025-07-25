package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.Ja */
/* loaded from: classes3.dex */
public class C8945Ja {

    /* renamed from: IL */
    private String f19788IL;

    /* renamed from: bX */
    private String f19789bX;

    /* renamed from: bg */
    private String f19790bg;
    private String eqN;

    /* renamed from: zx */
    private JSONObject f19791zx;

    /* renamed from: IL */
    public String m84319IL() {
        return this.f19788IL;
    }

    /* renamed from: bX */
    public String m84318bX() {
        return this.f19789bX;
    }

    /* renamed from: bg */
    public String m84317bg() {
        return this.f19790bg;
    }

    public String eqN() {
        return this.eqN;
    }

    public JSONObject ldr() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f19790bg);
            jSONObject.put("md5", this.f19788IL);
            jSONObject.put("url", this.f19789bX);
            jSONObject.put("data", this.eqN);
            jSONObject.put("custom_components", this.f19791zx);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: zx */
    public JSONObject m84315zx() {
        return this.f19791zx;
    }

    /* renamed from: bg */
    public static C8945Ja m84316bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C8945Ja c8945Ja = new C8945Ja();
        c8945Ja.f19790bg = jSONObject.optString("id");
        c8945Ja.eqN = jSONObject.optString("data");
        c8945Ja.f19789bX = jSONObject.optString("url");
        c8945Ja.f19788IL = jSONObject.optString("md5");
        c8945Ja.f19791zx = jSONObject.optJSONObject("custom_components");
        return c8945Ja;
    }
}
