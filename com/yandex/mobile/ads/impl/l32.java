package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class l32 {
    @NotNull
    /* renamed from: a */
    public static String m32360a(@NotNull String key, @NotNull JSONObject jsonObject) throws JSONException, i31 {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        String m27867a = wn0.m27867a(jsonObject, "jsonAsset", key, "jsonAttribute", key);
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            if (m27867a.length() != 0) {
                return m27867a;
            }
            throw new i31("Native Ad json has not required attributes");
        }
        throw new i31("Native Ad json has not required attributes");
    }
}
