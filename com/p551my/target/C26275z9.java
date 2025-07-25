package com.p551my.target;

import org.json.JSONObject;

/* renamed from: com.my.target.z9 */
/* loaded from: classes7.dex */
public class C26275z9 {
    /* renamed from: a */
    public static C26275z9 m42238a() {
        return new C26275z9();
    }

    /* renamed from: b */
    public final void m42236b(JSONObject jSONObject, C26253y9 c26253y9) {
        c26253y9.m42294a(jSONObject.optBoolean("hasAdditionalAds", c26253y9.m42292d()));
    }

    /* renamed from: a */
    public void m42237a(JSONObject jSONObject, C26253y9 c26253y9) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            m42236b(optJSONObject, c26253y9);
        }
    }
}
