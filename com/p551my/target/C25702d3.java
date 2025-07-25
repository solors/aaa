package com.p551my.target;

import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.my.target.d3 */
/* loaded from: classes7.dex */
public class C25702d3 {
    /* renamed from: a */
    public static C25702d3 m44036a() {
        return new C25702d3();
    }

    /* renamed from: a */
    public void m44035a(JSONObject jSONObject, C25675c3 c25675c3) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            Iterator it = c25675c3.m44109c().iterator();
            while (it.hasNext()) {
                C25771g5 c25771g5 = (C25771g5) it.next();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(c25771g5.m43863h());
                if (optJSONObject2 != null) {
                    m44034a(optJSONObject2, c25771g5);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m44034a(JSONObject jSONObject, C25771g5 c25771g5) {
        c25771g5.m43876a(jSONObject.optInt("connectionTimeout", c25771g5.m43866e()));
        int optInt = jSONObject.optInt("maxBannersShow", c25771g5.m43865f());
        if (optInt == 0) {
            optInt = -1;
        }
        c25771g5.m43870b(optInt);
    }
}
