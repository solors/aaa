package com.p551my.target;

import android.content.Context;
import android.util.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.g7 */
/* loaded from: classes7.dex */
public class C25774g7 {
    public C25774g7(C26073s c26073s, C25832j c25832j, Context context) {
    }

    /* renamed from: a */
    public static C25774g7 m43859a(C26073s c26073s, C25832j c25832j, Context context) {
        return new C25774g7(c26073s, c25832j, context);
    }

    /* renamed from: b */
    public final void m43857b(JSONObject jSONObject, C25752f7 c25752f7) {
        c25752f7.m43914h(jSONObject.optString("title", c25752f7.m43910l()));
        c25752f7.m43920e(jSONObject.optString("icon_hd", c25752f7.m43919f()));
        c25752f7.m43924c(jSONObject.optString("bubble_icon_hd", c25752f7.m43923d()));
        c25752f7.m43916g(jSONObject.optString("label_icon_hd", c25752f7.m43915h()));
        c25752f7.m43922d(jSONObject.optString("goto_app_icon_hd", c25752f7.m43921e()));
        c25752f7.m43918f(jSONObject.optString("item_highlight_icon", c25752f7.m43917g()));
        JSONArray optJSONArray = jSONObject.optJSONArray("icon_status");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    c25752f7.m43911k().add(new Pair(optJSONObject.optString("value"), optJSONObject.optString("icon_hd")));
                }
            }
        }
    }

    /* renamed from: a */
    public void m43858a(JSONObject jSONObject, C25752f7 c25752f7) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            m43857b(optJSONObject, c25752f7);
        }
    }
}
