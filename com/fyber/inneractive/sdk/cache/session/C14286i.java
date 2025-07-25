package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC14282c;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.i */
/* loaded from: classes4.dex */
public final class C14286i {

    /* renamed from: a */
    public final C14285h f26997a = new C14285h();

    /* renamed from: a */
    public final JSONObject m78008a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : this.f26997a.entrySet()) {
                EnumC14282c enumC14282c = (EnumC14282c) entry.getKey();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", enumC14282c.m78013a().value());
                    if (enumC14282c.name().toLowerCase().contains("video")) {
                        str = "video";
                    } else {
                        str = "display";
                    }
                    jSONObject2.put("subType", str);
                    jSONObject2.put("session_data", ((C14284g) entry.getValue()).m78009a(true, true));
                    jSONArray.put(jSONObject2);
                } catch (Exception unused) {
                }
            }
            jSONObject.put("content", jSONArray);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }
}
