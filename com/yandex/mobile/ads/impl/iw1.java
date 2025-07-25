package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class iw1 {
    @NotNull

    /* renamed from: a */
    private final yo0 f80656a;
    @NotNull

    /* renamed from: b */
    private final kw1 f80657b;

    public /* synthetic */ iw1(yo0 yo0Var) {
        this(yo0Var, new kw1());
    }

    @NotNull
    /* renamed from: a */
    public final hw1 m33109a(@NotNull JSONObject jsonObject) throws JSONException, i31 {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String m27867a = wn0.m27867a(jsonObject, "jsonAsset", "name", "jsonAttribute", "name");
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            JSONObject jSONObject = jsonObject.getJSONObject("link");
            yo0 yo0Var = this.f80656a;
            Intrinsics.m17074g(jSONObject);
            xo0 m26822a = yo0Var.m26822a(jSONObject);
            JSONObject jSONObject2 = jsonObject.getJSONObject("value");
            kw1 kw1Var = this.f80657b;
            Intrinsics.m17074g(jSONObject2);
            return new hw1(m26822a, m27867a, kw1Var.mo26248a(jSONObject2));
        }
        throw new i31("Native Ad json has not required attributes");
    }

    public iw1(@NotNull yo0 linkJsonParser, @NotNull kw1 valueParser) {
        Intrinsics.checkNotNullParameter(linkJsonParser, "linkJsonParser");
        Intrinsics.checkNotNullParameter(valueParser, "valueParser");
        this.f80656a = linkJsonParser;
        this.f80657b = valueParser;
    }
}
