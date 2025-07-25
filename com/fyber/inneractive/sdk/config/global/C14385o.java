package com.fyber.inneractive.sdk.config.global;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.o */
/* loaded from: classes4.dex */
public final class C14385o implements InterfaceC14384n {

    /* renamed from: a */
    public final JSONObject f27213a;

    public C14385o(JSONObject jSONObject) {
        this.f27213a = jSONObject;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: a */
    public final Integer mo77934a(String str) {
        if (this.f27213a.has(str)) {
            try {
                return Integer.valueOf(this.f27213a.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: b */
    public final String mo77931b(String str) {
        if (this.f27213a.has(str)) {
            try {
                return this.f27213a.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: c */
    public final Boolean mo77930c(String str) {
        if (this.f27213a.has(str)) {
            try {
                return Boolean.valueOf(this.f27213a.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String toString() {
        JSONObject jSONObject = this.f27213a;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return "no params";
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: a */
    public final Double mo77935a() {
        return Double.valueOf(this.f27213a.optDouble("scale_up_to", 0.0d));
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: b */
    public final Map mo77932b() {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = this.f27213a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, this.f27213a.get(next));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: a */
    public final String mo77933a(String str, String str2) {
        return this.f27213a.optString(str, str2);
    }
}
