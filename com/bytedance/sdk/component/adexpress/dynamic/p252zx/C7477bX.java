package com.bytedance.sdk.component.adexpress.dynamic.p252zx;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7462eqN;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zx.bX */
/* loaded from: classes3.dex */
public class C7477bX {
    /* renamed from: bg */
    public JSONObject m88713bg(List<C7462eqN.C7463bg> list, int i, JSONObject jSONObject) {
        C7462eqN.C7463bg c7463bg;
        JSONObject jSONObject2;
        if (list == null || list.size() <= 0) {
            return null;
        }
        Iterator<C7462eqN.C7463bg> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                c7463bg = null;
                break;
            }
            c7463bg = it.next();
            if (c7463bg != null && c7463bg.f16179bg == i) {
                break;
            }
        }
        if (c7463bg == null || (jSONObject2 = c7463bg.f16178IL) == null) {
            return null;
        }
        return m88712bg(jSONObject2, jSONObject);
    }

    /* renamed from: bg */
    private static JSONObject m88712bg(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("customComponentDefaultValues");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("values");
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.put(next, optJSONObject2.opt(next));
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (!TextUtils.equals(next2, "customComponentDefaultValues")) {
                    if (TextUtils.equals(next2, "values")) {
                        jSONObject3.put(next2, optJSONObject);
                    } else {
                        jSONObject3.put(next2, jSONObject.opt(next2));
                    }
                }
            }
            jSONObject3.put("type", "vessel");
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("values");
            JSONObject optJSONObject4 = jSONObject3.optJSONObject("values");
            if (optJSONObject3 != null && optJSONObject4 != null) {
                Iterator<String> keys3 = optJSONObject3.keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    if (!"clickArea".equals(next3)) {
                        optJSONObject4.put(next3, optJSONObject3.opt(next3));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject3;
    }
}
