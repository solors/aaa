package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC14282c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.b */
/* loaded from: classes4.dex */
public final class RunnableC14276b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ JSONObject f26981a;

    /* renamed from: b */
    public final /* synthetic */ RunnableC14277c f26982b;

    public RunnableC14276b(RunnableC14277c runnableC14277c, JSONObject jSONObject) {
        this.f26982b = runnableC14277c;
        this.f26981a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC14282c[] values;
        EnumC14282c[] values2;
        C14284g c14284g;
        C14279e c14279e = this.f26982b.f26983a;
        JSONObject jSONObject = this.f26981a;
        c14279e.getClass();
        for (EnumC14282c enumC14282c : EnumC14282c.values()) {
            if (enumC14282c != EnumC14282c.NONE) {
                String name = enumC14282c.name();
                JSONArray jSONArray = new JSONArray();
                try {
                    jSONArray = jSONObject.getJSONArray(name);
                } catch (JSONException unused) {
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    C14284g m78010a = C14284g.m78010a(jSONArray.optJSONObject(i));
                    if (m78010a != null && m78010a.f26993a != 0) {
                        c14279e.m78014a(enumC14282c, m78010a);
                    }
                }
            }
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("currentSession");
        if (optJSONObject != null) {
            C14285h c14285h = new C14285h();
            JSONArray jSONArray2 = new JSONArray();
            try {
                jSONArray2 = optJSONObject.getJSONArray("content");
            } catch (JSONException unused2) {
            }
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2 = jSONArray2.getJSONObject(i2);
                } catch (JSONException unused3) {
                }
                EnumC14282c m78012a = EnumC14282c.m78012a(jSONObject2.optString("type"), jSONObject2.optString("subType"));
                C14284g m78010a2 = C14284g.m78010a(jSONObject2.optJSONObject("session_data"));
                if (m78010a2 != null) {
                    c14285h.put(m78012a, m78010a2);
                }
            }
            for (EnumC14282c enumC14282c2 : EnumC14282c.values()) {
                if (enumC14282c2 != EnumC14282c.NONE && (c14284g = (C14284g) c14285h.get(enumC14282c2)) != null && c14284g.f26993a != 0) {
                    c14279e.m78014a(enumC14282c2, c14284g);
                }
            }
        }
        this.f26982b.f26983a.getClass();
    }
}
