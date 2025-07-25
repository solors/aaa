package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class kw1 implements InterfaceC31977zf<jw1> {
    @NotNull

    /* renamed from: a */
    private final tg0 f81598a;

    public /* synthetic */ kw1() {
        this(new tg0());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31977zf
    @NotNull
    /* renamed from: b */
    public final jw1 mo26248a(@NotNull JSONObject jsonAsset) throws JSONException, i31 {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        String m27867a = wn0.m27867a(jsonAsset, "jsonAsset", "title", "jsonAttribute", "title");
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            JSONObject jSONObject = jsonAsset.getJSONObject("image");
            tg0 tg0Var = this.f81598a;
            Intrinsics.m17074g(jSONObject);
            return new jw1(tg0Var.m29173b(jSONObject), m27867a);
        }
        throw new i31("Native Ad json has not required attributes");
    }

    public kw1(@NotNull tg0 imageParser) {
        Intrinsics.checkNotNullParameter(imageParser, "imageParser");
        this.f81598a = imageParser;
    }
}
