package com.p551my.target;

import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.my.target.v2 */
/* loaded from: classes7.dex */
public class C26160v2 {
    /* renamed from: a */
    public static C26160v2 m42725a() {
        return new C26160v2();
    }

    /* renamed from: a */
    public void m42723a(JSONObject jSONObject, C26132u2 c26132u2) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            Iterator it = c26132u2.m42795c().iterator();
            while (it.hasNext()) {
                C25837j3 c25837j3 = (C25837j3) it.next();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(c25837j3.m43719h());
                if (optJSONObject2 != null) {
                    m42724a(optJSONObject2, c25837j3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m42724a(JSONObject jSONObject, C25837j3 c25837j3) {
        c25837j3.m43732a(jSONObject.optInt("connectionTimeout", c25837j3.m43722e()));
        int optInt = jSONObject.optInt("maxBannersShow", c25837j3.m43721f());
        if (optInt == 0) {
            optInt = -1;
        }
        c25837j3.m43726b(optInt);
    }
}
