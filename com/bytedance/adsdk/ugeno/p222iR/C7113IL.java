package com.bytedance.adsdk.ugeno.p222iR;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.iR.IL */
/* loaded from: classes3.dex */
public class C7113IL {
    /* renamed from: bg */
    public static void m90012bg(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: bg */
    public static JSONObject m90014bg(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    /* renamed from: bg */
    public static JSONArray m90015bg(String str, JSONArray jSONArray) {
        if (TextUtils.isEmpty(str)) {
            return jSONArray;
        }
        try {
            return new JSONArray(str);
        } catch (JSONException unused) {
            return jSONArray;
        }
    }

    /* renamed from: bg */
    public static void m90013bg(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray2 == null || jSONArray2.length() <= 0) {
            return;
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        for (int i = 0; i < jSONArray2.length(); i++) {
            Object opt = jSONArray2.opt(i);
            if (opt != null) {
                jSONArray.put(opt);
            }
        }
    }
}
