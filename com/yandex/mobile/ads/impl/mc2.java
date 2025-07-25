package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class mc2 implements l72 {
    @NotNull

    /* renamed from: a */
    private final f72<?> f82142a;
    @NotNull

    /* renamed from: b */
    private final c82 f82143b;

    public /* synthetic */ mc2(g71 g71Var, m81 m81Var) {
        this(g71Var, m81Var, new yz0(), yz0.m26512a(m81Var));
    }

    @Override // com.yandex.mobile.ads.impl.l72
    /* renamed from: a */
    public final void mo26256a(long j, long j2) {
        if (this.f82143b.mo35339a()) {
            if (!this.f82142a.isPlayingAd()) {
                this.f82142a.resumeAd();
            }
        } else if (this.f82142a.isPlayingAd()) {
            this.f82142a.pauseAd();
        }
    }

    public mc2(@NotNull g71 videoAdPlayer, @NotNull m81 videoViewProvider, @NotNull yz0 mrcVideoAdViewValidatorFactory, @NotNull c82 videoAdVisibilityValidator) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(mrcVideoAdViewValidatorFactory, "mrcVideoAdViewValidatorFactory");
        Intrinsics.checkNotNullParameter(videoAdVisibilityValidator, "videoAdVisibilityValidator");
        this.f82142a = videoAdPlayer;
        this.f82143b = videoAdVisibilityValidator;
    }
}
