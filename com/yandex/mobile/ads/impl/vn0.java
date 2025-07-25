package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class vn0 {
    @NotNull
    /* renamed from: a */
    public static HashMap m28251a(@NotNull JSONObject jsonObject) {
        Object obj;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        Intrinsics.m17074g(keys);
        while (keys.hasNext()) {
            String key = keys.next();
            Intrinsics.m17074g(key);
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                obj = jsonObject.get(key);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    hashMap.put(key, m28251a((JSONObject) obj));
                } else {
                    hashMap.put(key, obj);
                }
            }
        }
        return hashMap;
    }
}
