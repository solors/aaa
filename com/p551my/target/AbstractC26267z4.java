package com.p551my.target;

import android.graphics.Color;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.target.z4 */
/* loaded from: classes7.dex */
public abstract class AbstractC26267z4 {
    /* renamed from: a */
    public static int m42255a(JSONObject jSONObject, String str, int i) {
        String optString = jSONObject.optString(str);
        if (!TextUtils.isEmpty(optString)) {
            try {
                return Color.parseColor(optString);
            } catch (Throwable unused) {
                AbstractC25846ja.m43678b("JsonParser: Error parsing color " + optString);
                return i;
            }
        }
        return i;
    }
}
