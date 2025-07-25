package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class nl0 {
    @NotNull

    /* renamed from: a */
    private final ol0 f82817a;
    @NotNull

    /* renamed from: b */
    private final C30757ky f82818b;

    public nl0(@NotNull ol0 instreamVideoAdControlsStateStorage, @NotNull ze1 playerVolumeProvider) {
        Intrinsics.checkNotNullParameter(instreamVideoAdControlsStateStorage, "instreamVideoAdControlsStateStorage");
        Intrinsics.checkNotNullParameter(playerVolumeProvider, "playerVolumeProvider");
        this.f82817a = instreamVideoAdControlsStateStorage;
        this.f82818b = new C30757ky(playerVolumeProvider);
    }

    @NotNull
    /* renamed from: a */
    public final rk0 m31484a(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        rk0 m30963a = this.f82817a.m30963a(videoAdInfo);
        if (m30963a == null) {
            return this.f82818b.m32401a();
        }
        return m30963a;
    }
}
