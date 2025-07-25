package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.mobile.ads.impl.c80;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class e80 implements InterfaceC29979b0<c80> {
    @NotNull

    /* renamed from: a */
    private final l32 f78480a;

    public e80(@NotNull l32 urlJsonParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        this.f78480a = urlJsonParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC29979b0
    /* renamed from: a */
    public final c80 mo26293a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String m27867a = wn0.m27867a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            JSONArray jSONArray = jsonObject.getJSONArray(FirebaseAnalytics.Param.ITEMS);
            Intrinsics.m17074g(jSONArray);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jsonAsset = jSONArray.getJSONObject(i);
                Intrinsics.m17074g(jsonAsset);
                Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
                Intrinsics.checkNotNullParameter("title", "jsonAttribute");
                String string = jsonAsset.getString("title");
                if (string != null && string.length() != 0 && !Intrinsics.m17075f(string, "null")) {
                    Intrinsics.m17074g(string);
                    this.f78480a.getClass();
                    arrayList.add(new c80.C30076a(string, l32.m32360a("url", jsonAsset)));
                } else {
                    throw new i31("Native Ad json has not required attributes");
                }
            }
            if (!arrayList.isEmpty()) {
                return new c80(m27867a, arrayList);
            }
            throw new i31("Native Ad json has not required attributes");
        }
        throw new i31("Native Ad json has not required attributes");
    }
}
