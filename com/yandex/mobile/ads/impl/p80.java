package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class p80 implements InterfaceC31977zf<n80> {
    @NotNull

    /* renamed from: a */
    private final eh0 f83742a;

    public p80(@NotNull eh0 imageValueParser) {
        Intrinsics.checkNotNullParameter(imageValueParser, "imageValueParser");
        this.f83742a = imageValueParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31977zf
    /* renamed from: a */
    public final n80 mo26248a(JSONObject jsonAsset) {
        bh0 bh0Var;
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        if (jsonAsset.has("value")) {
            if (!jsonAsset.isNull("value")) {
                bh0Var = this.f83742a.mo26248a(jsonAsset);
            } else {
                bh0Var = null;
            }
            return new n80(bh0Var);
        }
        um0.m28727b(new Object[0]);
        throw new i31("Native Ad json has not required attributes");
    }
}
