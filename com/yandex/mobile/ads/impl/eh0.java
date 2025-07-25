package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class eh0 implements InterfaceC31977zf<bh0> {
    @NotNull

    /* renamed from: a */
    private final tg0 f78601a;

    public /* synthetic */ eh0() {
        this(new tg0());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31977zf
    @NotNull
    /* renamed from: b */
    public final bh0 mo26248a(@NotNull JSONObject jsonAsset) throws JSONException, i31 {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        if (jsonAsset.has("value") && !jsonAsset.isNull("value")) {
            JSONObject jSONObject = jsonAsset.getJSONObject("value");
            tg0 tg0Var = this.f78601a;
            Intrinsics.m17074g(jSONObject);
            return tg0Var.m29173b(jSONObject);
        }
        um0.m28727b(new Object[0]);
        throw new i31("Native Ad json has not required attributes");
    }

    public eh0(@NotNull tg0 imageParser) {
        Intrinsics.checkNotNullParameter(imageParser, "imageParser");
        this.f78601a = imageParser;
    }
}
