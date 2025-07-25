package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class f71 {
    @NotNull

    /* renamed from: a */
    private final e71 f79001a;
    @NotNull

    /* renamed from: b */
    private final i71 f79002b;

    public /* synthetic */ f71(e71 e71Var) {
        this(e71Var, new i71(e71Var));
    }

    /* renamed from: a */
    public final void m34203a(@NotNull d92 options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f79002b.m33356a(options.m34988a());
        this.f79001a.mo28046a(options.m34986c());
    }

    public f71(@NotNull e71 nativeVideoAdPlayer, @NotNull i71 playerVolumeManager) {
        Intrinsics.checkNotNullParameter(nativeVideoAdPlayer, "nativeVideoAdPlayer");
        Intrinsics.checkNotNullParameter(playerVolumeManager, "playerVolumeManager");
        this.f79001a = nativeVideoAdPlayer;
        this.f79002b = playerVolumeManager;
    }
}
