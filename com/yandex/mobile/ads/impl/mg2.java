package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class mg2 implements uc2 {
    @NotNull

    /* renamed from: a */
    private final InstreamAdRequestConfiguration f82195a;

    public mg2(@NotNull InstreamAdRequestConfiguration adRequestConfiguration) {
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        this.f82195a = adRequestConfiguration;
    }

    @Override // com.yandex.mobile.ads.impl.uc2
    @NotNull
    /* renamed from: a */
    public final String mo28824a() {
        return this.f82195a.getPageId();
    }

    @Override // com.yandex.mobile.ads.impl.uc2
    @NotNull
    /* renamed from: b */
    public final String mo28823b() {
        return this.f82195a.getCategoryId();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mg2) && Intrinsics.m17075f(this.f82195a, ((mg2) obj).f82195a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.uc2
    @NotNull
    public final Map<String, String> getParameters() {
        Map<String, String> parameters = this.f82195a.getParameters();
        if (parameters == null) {
            Map<String, String> emptyMap = Collections.emptyMap();
            Intrinsics.checkNotNullExpressionValue(emptyMap, "emptyMap(...)");
            return emptyMap;
        }
        return parameters;
    }

    public final int hashCode() {
        return this.f82195a.hashCode();
    }

    @NotNull
    public final String toString() {
        InstreamAdRequestConfiguration instreamAdRequestConfiguration = this.f82195a;
        return "YandexInstreamAdRequestConfigurationAdapter(adRequestConfiguration=" + instreamAdRequestConfiguration + ")";
    }
}
