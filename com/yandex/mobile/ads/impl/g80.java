package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g80 {
    @NotNull

    /* renamed from: a */
    private final Set<String> f79570a;

    public g80(@NotNull C30578is nativeAdAssets, @NotNull C31211qh availableAssetsProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(availableAssetsProvider, "availableAssetsProvider");
        availableAssetsProvider.getClass();
        this.f79570a = C31211qh.m30362a(nativeAdAssets);
    }

    /* renamed from: a */
    public final boolean m33911a() {
        if (this.f79570a.size() == 2 && this.f79570a.contains("feedback") && this.f79570a.contains("media")) {
            return true;
        }
        return false;
    }
}
