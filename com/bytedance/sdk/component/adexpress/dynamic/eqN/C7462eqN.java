package com.bytedance.sdk.component.adexpress.dynamic.eqN;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN */
/* loaded from: classes3.dex */
public class C7462eqN {

    /* renamed from: IL */
    public String f16175IL;

    /* renamed from: bX */
    public String f16176bX;

    /* renamed from: bg */
    public List<C7463bg> f16177bg;
    public String eqN;

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN$bg */
    /* loaded from: classes3.dex */
    public static class C7463bg {

        /* renamed from: IL */
        public JSONObject f16178IL;

        /* renamed from: bg */
        public int f16179bg;
    }

    /* renamed from: bg */
    public static C7462eqN m88922bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C7462eqN c7462eqN = new C7462eqN();
        String optString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C7463bg c7463bg = new C7463bg();
                    c7463bg.f16179bg = optJSONObject.optInt("id");
                    c7463bg.f16178IL = new JSONObject(optJSONObject.optString("componentLayout"));
                    arrayList.add(c7463bg);
                }
            }
        } catch (JSONException unused) {
        }
        c7462eqN.f16177bg = arrayList;
        c7462eqN.f16175IL = jSONObject.optString("diff_data");
        c7462eqN.f16176bX = jSONObject.optString("style_diff");
        c7462eqN.eqN = jSONObject.optString("tag_diff");
        return c7462eqN;
    }
}
