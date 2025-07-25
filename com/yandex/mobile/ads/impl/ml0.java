package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rk0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ml0 {
    @NotNull

    /* renamed from: a */
    private final ol0 f82247a;
    @NotNull

    /* renamed from: b */
    private final gk0 f82248b;
    @NotNull

    /* renamed from: c */
    private final dj0 f82249c;

    public /* synthetic */ ml0(ol0 ol0Var, hl0 hl0Var) {
        this(ol0Var, hl0Var, new gk0(), new dj0(hl0Var));
    }

    /* renamed from: a */
    public final void m31967a(@NotNull m62<kl0> videoAdInfo, @NotNull h50 instreamAdView, @NotNull rk0 initialControlsState) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(initialControlsState, "initialControlsState");
        this.f82248b.getClass();
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        b62 adUiElements = instreamAdView.getAdUiElements();
        if (adUiElements != null) {
            this.f82247a.m30962a(videoAdInfo, new rk0(new rk0.C31295a().m29991b(this.f82249c.m34898a(adUiElements, initialControlsState).m29997d()).m29995a(initialControlsState.m30000a())));
        }
    }

    /* renamed from: b */
    public final void m31966b(@NotNull m62<kl0> videoAdInfo, @NotNull h50 instreamAdView, @NotNull rk0 initialControlsState) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(initialControlsState, "initialControlsState");
        this.f82248b.getClass();
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        b62 adUiElements = instreamAdView.getAdUiElements();
        if (adUiElements != null) {
            this.f82247a.m30962a(videoAdInfo, this.f82249c.m34898a(adUiElements, initialControlsState));
        }
    }

    public ml0(@NotNull ol0 videoAdControlsStateStorage, @NotNull hl0 instreamVastAdPlayer, @NotNull gk0 instreamAdViewUiElementsManager, @NotNull dj0 videoAdControlsStateProvider) {
        Intrinsics.checkNotNullParameter(videoAdControlsStateStorage, "videoAdControlsStateStorage");
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(instreamAdViewUiElementsManager, "instreamAdViewUiElementsManager");
        Intrinsics.checkNotNullParameter(videoAdControlsStateProvider, "videoAdControlsStateProvider");
        this.f82247a = videoAdControlsStateStorage;
        this.f82248b = instreamAdViewUiElementsManager;
        this.f82249c = videoAdControlsStateProvider;
    }
}
