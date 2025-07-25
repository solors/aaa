package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class re1 {
    @NotNull

    /* renamed from: a */
    private final te1 f84735a;
    @NotNull

    /* renamed from: b */
    private final u82 f84736b;
    @NotNull

    /* renamed from: c */
    private final o40 f84737c;
    @NotNull

    /* renamed from: d */
    private final xe1 f84738d;
    @NotNull

    /* renamed from: e */
    private final he1 f84739e;

    public re1(@NotNull te1 stateHolder, @NotNull u82 durationHolder, @NotNull o40 playerProvider, @NotNull xe1 volumeController, @NotNull he1 playerPlaybackController) {
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(durationHolder, "durationHolder");
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        Intrinsics.checkNotNullParameter(volumeController, "volumeController");
        Intrinsics.checkNotNullParameter(playerPlaybackController, "playerPlaybackController");
        this.f84735a = stateHolder;
        this.f84736b = durationHolder;
        this.f84737c = playerProvider;
        this.f84738d = volumeController;
        this.f84739e = playerPlaybackController;
    }

    @NotNull
    /* renamed from: a */
    public final u82 m30063a() {
        return this.f84736b;
    }

    @NotNull
    /* renamed from: b */
    public final he1 m30062b() {
        return this.f84739e;
    }

    @NotNull
    /* renamed from: c */
    public final o40 m30061c() {
        return this.f84737c;
    }

    @NotNull
    /* renamed from: d */
    public final te1 m30060d() {
        return this.f84735a;
    }

    @NotNull
    /* renamed from: e */
    public final xe1 m30059e() {
        return this.f84738d;
    }
}
