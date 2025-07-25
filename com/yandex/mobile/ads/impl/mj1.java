package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class mj1 {
    @NotNull

    /* renamed from: a */
    private final C31753wi f82234a = new C31753wi();

    @NotNull
    /* renamed from: a */
    public final lj1 m31977a(@NotNull String readyResponse) throws JSONException {
        Intrinsics.checkNotNullParameter(readyResponse, "readyResponse");
        this.f82234a.getClass();
        JSONObject jSONObject = new JSONObject(C31753wi.m27897a(readyResponse));
        HashMap hashMap = new HashMap();
        String string = jSONObject.getString("body");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string2 = jSONObject2.getString(next);
            Intrinsics.m17074g(next);
            Intrinsics.m17074g(string2);
            hashMap.put(next, string2);
        }
        Intrinsics.m17074g(string);
        return new lj1(string, hashMap);
    }
}
