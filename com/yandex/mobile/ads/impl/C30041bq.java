package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.bq */
/* loaded from: classes8.dex */
public final class C30041bq {
    @NotNull

    /* renamed from: a */
    private final ui0 f77384a;

    public /* synthetic */ C30041bq() {
        this(new ui0());
    }

    @NotNull
    /* renamed from: a */
    public final v80 m35452a(@NotNull String conditionKey, @NotNull JSONObject jsonNativeAd) throws JSONException, i31 {
        Intrinsics.checkNotNullParameter(jsonNativeAd, "jsonNativeAd");
        Intrinsics.checkNotNullParameter(conditionKey, "conditionKey");
        JSONObject jSONObject = jsonNativeAd.getJSONObject(conditionKey);
        ui0 ui0Var = this.f77384a;
        Intrinsics.m17074g(jSONObject);
        return new v80(ui0Var.m28767a(jSONObject));
    }

    public C30041bq(@NotNull ui0 installedPackagesJsonParser) {
        Intrinsics.checkNotNullParameter(installedPackagesJsonParser, "installedPackagesJsonParser");
        this.f77384a = installedPackagesJsonParser;
    }
}
