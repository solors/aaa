package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.m */
/* loaded from: classes4.dex */
public final class C14394m {

    /* renamed from: a */
    public final HashMap f27225a = new HashMap();

    public C14394m() {
    }

    public C14394m(JSONObject jSONObject) {
        JSONArray names;
        JSONArray names2 = jSONObject.names();
        for (int i = 0; i < names2.length(); i++) {
            String optString = names2.optString(i, null);
            JSONObject optJSONObject = jSONObject.optJSONObject(optString);
            C14393l c14393l = new C14393l();
            if (optJSONObject != null && (names = optJSONObject.names()) != null) {
                for (int i2 = 0; i2 < names.length(); i2++) {
                    String optString2 = names.optString(i2, null);
                    String optString3 = optJSONObject.optString(optString2, null);
                    if (optString2 != null && optString3 != null) {
                        c14393l.f27224a.put(optString2, optString3);
                    }
                }
            }
            this.f27225a.put(optString, c14393l);
        }
    }
}
