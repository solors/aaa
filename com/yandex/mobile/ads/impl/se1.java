package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class se1 {
    @NotNull

    /* renamed from: a */
    private final ue1 f85207a;
    @NotNull

    /* renamed from: b */
    private final v82 f85208b;
    @NotNull

    /* renamed from: c */
    private final p40 f85209c;
    @NotNull

    /* renamed from: d */
    private final ye1 f85210d;
    @NotNull

    /* renamed from: e */
    private final ie1 f85211e;

    public se1(@NotNull ue1 stateHolder, @NotNull v82 durationHolder, @NotNull p40 playerProvider, @NotNull ye1 volumeController, @NotNull ie1 playerPlaybackController) {
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(durationHolder, "durationHolder");
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        Intrinsics.checkNotNullParameter(volumeController, "volumeController");
        Intrinsics.checkNotNullParameter(playerPlaybackController, "playerPlaybackController");
        this.f85207a = stateHolder;
        this.f85208b = durationHolder;
        this.f85209c = playerProvider;
        this.f85210d = volumeController;
        this.f85211e = playerPlaybackController;
    }

    @NotNull
    /* renamed from: a */
    public final v82 m29639a() {
        return this.f85208b;
    }

    @NotNull
    /* renamed from: b */
    public final ie1 m29638b() {
        return this.f85211e;
    }

    @NotNull
    /* renamed from: c */
    public final p40 m29637c() {
        return this.f85209c;
    }

    @NotNull
    /* renamed from: d */
    public final ue1 m29636d() {
        return this.f85207a;
    }

    @NotNull
    /* renamed from: e */
    public final ye1 m29635e() {
        return this.f85210d;
    }
}
