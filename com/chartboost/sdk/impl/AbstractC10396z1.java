package com.chartboost.sdk.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.z1 */
/* loaded from: classes3.dex */
public abstract class AbstractC10396z1 {

    /* renamed from: com.chartboost.sdk.impl.z1$a */
    /* loaded from: classes3.dex */
    public static class C10397a {

        /* renamed from: a */
        public final String f23663a;

        /* renamed from: b */
        public final Object f23664b;

        public C10397a(String str, Object obj) {
            this.f23663a = str;
            this.f23664b = obj;
        }
    }

    /* renamed from: a */
    public static JSONObject m79814a(C10397a... c10397aArr) {
        JSONObject jSONObject = new JSONObject();
        for (C10397a c10397a : c10397aArr) {
            m79816a(jSONObject, c10397a.f23663a, c10397a.f23664b);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m79816a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C9763c7.m81920b("put (" + str + ")", e);
        }
    }

    /* renamed from: a */
    public static JSONObject m79815a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject == null) {
                break;
            }
            jSONObject = jSONObject.optJSONObject(str);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C10397a m79817a(String str, Object obj) {
        return new C10397a(str, obj);
    }
}
