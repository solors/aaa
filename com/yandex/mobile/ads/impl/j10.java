package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class j10 {
    @NotNull

    /* renamed from: a */
    private static final List<String> f80702a;

    static {
        List<String> m17163p;
        m17163p = C37563v.m17163p("native_ad_view", "timer_container", "timer_value", "skip_button", "linear_progress_view", "video_progress", "mute_button");
        f80702a = m17163p;
    }

    @NotNull
    /* renamed from: a */
    public final Set<c10> m33081a(@NotNull JSONObject designCard) {
        Set<c10> m17547e1;
        Intrinsics.checkNotNullParameter(designCard, "designCard");
        ArrayList arrayList = new ArrayList();
        m33080a(designCard, d10.f77831b, new i10(this, arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!f80702a.contains(((c10) next).m35384a())) {
                arrayList2.add(next);
            }
        }
        m17547e1 = _Collections.m17547e1(arrayList2);
        return m17547e1;
    }

    /* renamed from: a */
    private static void m33082a(JSONArray jSONArray, d10 d10Var, Function2 function2) {
        Object obj;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Intrinsics.checkNotNullParameter(jSONArray, "<this>");
            try {
                obj = jSONArray.get(i);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                m33080a((JSONObject) obj, d10Var, function2);
            } else if (obj instanceof JSONArray) {
                m33082a((JSONArray) obj, d10Var, function2);
            }
        }
    }

    /* renamed from: a */
    private static void m33080a(JSONObject jSONObject, d10 d10Var, Function2 function2) {
        Object obj;
        JSONObject optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("extensions");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (Intrinsics.m17075f((optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("params")) == null) ? null : optJSONObject.optString("view_name"), "native_ad_view")) {
                    d10Var = d10.f77832c;
                    break;
                }
                i++;
            }
        }
        ((i10) function2).mo105910invoke(jSONObject, d10Var);
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String key = keys.next();
            Intrinsics.m17074g(key);
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                obj = jSONObject.get(key);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                m33080a((JSONObject) obj, d10Var, function2);
            } else if (obj instanceof JSONArray) {
                m33082a((JSONArray) obj, d10Var, function2);
            }
        }
    }
}
