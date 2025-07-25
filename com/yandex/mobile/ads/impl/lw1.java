package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class lw1 implements InterfaceC29979b0<ew1> {
    @NotNull

    /* renamed from: a */
    private final iw1 f81958a;

    public lw1(@NotNull jl1 reporter, @NotNull iw1 itemParser) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(itemParser, "itemParser");
        this.f81958a = itemParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC29979b0
    /* renamed from: a */
    public final ew1 mo26293a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String m27867a = wn0.m27867a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            JSONArray jSONArray = jsonObject.getJSONArray(FirebaseAnalytics.Param.ITEMS);
            Intrinsics.m17074g(jSONArray);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                iw1 iw1Var = this.f81958a;
                Intrinsics.m17074g(jSONObject);
                arrayList.add(iw1Var.m33109a(jSONObject));
            }
            if (!arrayList.isEmpty()) {
                return new ew1(m27867a, arrayList);
            }
            throw new i31("Native Ad json has not required attributes");
        }
        throw new i31("Native Ad json has not required attributes");
    }
}
