package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.a2 */
/* loaded from: classes3.dex */
public abstract class AbstractC9668a2 {
    /* renamed from: a */
    public static final Boolean m82144a(JSONObject jSONObject, String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return Boolean.valueOf(jSONObject.getBoolean(name));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final JSONObject m82143a(JSONObject jSONObject, String name, Object obj) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            jSONObject.put(name, obj);
        } catch (JSONException e) {
            C9763c7.m81919b("put (" + name + ")" + e, null, 2, null);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static final byte[] m82145a(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        byte[] bytes = jSONArray2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }
}
