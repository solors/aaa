package com.bytedance.sdk.component.adexpress.dynamic.p252zx;

import com.bytedance.sdk.component.adexpress.C7276IL;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zx.WR */
/* loaded from: classes3.dex */
public class C7476WR {
    /* renamed from: IL */
    public static String m88721IL(String str, String str2) {
        if (C7487eqN.m88685IL()) {
            if (str.indexOf(46) < 0) {
                str = str + ".png";
            }
            return str2 + "static/images/" + str;
        }
        return C7478bg.m88711bg(str);
    }

    /* renamed from: bg */
    public static void m88718bg(String str, JSONObject jSONObject) {
        JSONObject bOf = C7276IL.bOf(str);
        if (bOf == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = bOf.optJSONObject("values");
        if (optJSONObject == null) {
            return;
        }
        m88715bg(optJSONObject, jSONObject);
    }

    /* renamed from: bg */
    public static JSONObject m88717bg(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject bOf = C7276IL.bOf(str);
        if (bOf == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return m88714bg(jSONObject2, bOf.optJSONObject("themeValues"), jSONObject);
    }

    /* renamed from: bg */
    private static void m88715bg(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: bg */
    public static JSONObject m88714bg(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: bg */
    public static String m88720bg(String str) {
        JSONObject optJSONObject;
        JSONObject bOf = C7276IL.bOf(str);
        if (bOf == null || (optJSONObject = bOf.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString("data");
    }

    /* renamed from: bg */
    public static String m88719bg(String str, String str2) {
        JSONObject optJSONObject;
        JSONObject bOf = C7276IL.bOf(str);
        if (bOf == null || (optJSONObject = bOf.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString(str2);
    }

    /* renamed from: bg */
    public static JSONObject m88716bg(JSONArray jSONArray) {
        JSONObject optJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (optJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("values");
    }
}
