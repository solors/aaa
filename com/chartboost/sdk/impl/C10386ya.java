package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.ya */
/* loaded from: classes3.dex */
public final class C10386ya {
    /* renamed from: a */
    public final String m79862a(JSONObject jSONObject) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.optString("url", "");
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public final C10043m2 m79861b(JSONObject jSONObject) {
        return new C10043m2(m79862a(jSONObject), m79860c(jSONObject));
    }

    /* renamed from: c */
    public final Boolean m79860c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return AbstractC9668a2.m82144a(jSONObject, "shouldDismiss");
        }
        return null;
    }
}
