package com.p551my.target;

import org.json.JSONObject;

/* renamed from: com.my.target.a5 */
/* loaded from: classes7.dex */
public abstract class AbstractC25631a5 {
    /* renamed from: a */
    public static String m44232a(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }
}
