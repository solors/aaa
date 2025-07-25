package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.o */
/* loaded from: classes4.dex */
public final class C14396o {

    /* renamed from: a */
    public final HashMap f27226a = new HashMap();

    /* renamed from: b */
    public final HashMap f27227b = new HashMap();

    /* renamed from: a */
    public final String m77918a(String str, String str2) {
        return this.f27226a.containsKey(str) ? (String) this.f27226a.get(str) : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14396o.class != obj.getClass()) {
            return false;
        }
        C14396o c14396o = (C14396o) obj;
        if (this.f27226a.equals(c14396o.f27226a) && this.f27227b.equals(c14396o.f27227b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27226a.hashCode();
    }

    /* renamed from: a */
    public static C14396o m77917a(JSONObject jSONObject) {
        C14396o c14396o = new C14396o();
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("overrides");
        JSONArray names = optJSONObject.names();
        for (int i = 0; i < names.length(); i++) {
            String optString = names.optString(i, null);
            String optString2 = optJSONObject.optString(optString, null);
            if (optString != null && optString2 != null) {
                c14396o.f27226a.put(optString, optString2);
            }
        }
        if (optJSONObject2 != null) {
            JSONArray names2 = optJSONObject2.names();
            for (int i2 = 0; i2 < names2.length(); i2++) {
                String optString3 = names2.optString(i2, null);
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(optString3);
                if (optString3 != null && optJSONObject3 != null) {
                    c14396o.f27227b.put(optString3, new C14394m(optJSONObject3));
                }
            }
        }
        return c14396o;
    }

    /* renamed from: a */
    public final int m77919a(String str, int i, int i2) {
        try {
            i = Integer.parseInt(m77918a(str, Integer.toString(i)));
        } catch (Throwable unused) {
        }
        return Math.max(i, i2);
    }

    /* renamed from: a */
    public final boolean m77916a(boolean z, String str) {
        try {
            return Boolean.parseBoolean(m77918a(str, Boolean.toString(z)));
        } catch (Throwable unused) {
            return z;
        }
    }

    /* renamed from: a */
    public final C14393l m77920a(String str) {
        C14394m c14394m;
        String str2 = IAConfigManager.f27060O.f27080d;
        if (this.f27227b.containsKey(str2)) {
            c14394m = (C14394m) this.f27227b.get(str2);
        } else {
            c14394m = new C14394m();
        }
        c14394m.getClass();
        return c14394m.f27225a.containsKey(str) ? (C14393l) c14394m.f27225a.get(str) : new C14393l();
    }
}
