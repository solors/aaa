package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.jr */
/* loaded from: classes6.dex */
public final class C20165jr {
    @NotNull

    /* renamed from: a */
    private EnumC20218kr f50751a;

    public C20165jr(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f50751a = EnumC20218kr.f50869b.m57617a(config.optInt("mode", EnumC20218kr.CurrentlyLoadedAds.m57618b()));
    }

    @NotNull
    /* renamed from: a */
    public final EnumC20218kr m57790a() {
        return this.f50751a;
    }
}
