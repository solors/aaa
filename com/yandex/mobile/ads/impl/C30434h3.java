package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.h3 */
/* loaded from: classes8.dex */
public final class C30434h3 {
    @NotNull

    /* renamed from: a */
    private final ek0 f79861a;
    @NotNull

    /* renamed from: b */
    private final pl0 f79862b;
    @NotNull

    /* renamed from: c */
    private final fj0 f79863c;

    public /* synthetic */ C30434h3(ek0 ek0Var, a62 a62Var) {
        this(ek0Var, a62Var, new fj0());
    }

    /* renamed from: a */
    public final void m33714a(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f79862b.mo26035f(videoAd);
    }

    /* renamed from: b */
    public final void m33712b(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f79862b.mo26034g(videoAd);
    }

    /* renamed from: c */
    public final void m33711c(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f79862b.mo26039b(videoAd);
    }

    /* renamed from: d */
    public final void m33710d(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        fj0 fj0Var = this.f79863c;
        ek0 instreamAdUiElementsManager = this.f79861a;
        fj0Var.getClass();
        Intrinsics.checkNotNullParameter(instreamAdUiElementsManager, "instreamAdUiElementsManager");
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f79862b.mo26042a(new ej0(instreamAdUiElementsManager, videoAd));
    }

    /* renamed from: e */
    public final void m33709e(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f79862b.mo26037d(videoAd);
    }

    /* renamed from: f */
    public final void m33708f(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f79862b.mo26041a(videoAd);
    }

    /* renamed from: g */
    public final void m33707g(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f79862b.mo26038c(videoAd);
    }

    /* renamed from: h */
    public final void m33706h(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f79862b.mo26036e(videoAd);
    }

    /* renamed from: i */
    public final void m33705i(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f79862b.mo26032i(videoAd);
    }

    public C30434h3(@NotNull ek0 instreamAdUiElementsManager, @NotNull a62 adCreativePlaybackListener, @NotNull fj0 creativePlaybackFactory) {
        Intrinsics.checkNotNullParameter(instreamAdUiElementsManager, "instreamAdUiElementsManager");
        Intrinsics.checkNotNullParameter(adCreativePlaybackListener, "adCreativePlaybackListener");
        Intrinsics.checkNotNullParameter(creativePlaybackFactory, "creativePlaybackFactory");
        this.f79861a = instreamAdUiElementsManager;
        this.f79862b = adCreativePlaybackListener;
        this.f79863c = creativePlaybackFactory;
    }

    /* renamed from: a */
    public final void m33715a() {
        this.f79861a.m34503b();
    }

    /* renamed from: a */
    public final void m33713a(@NotNull kl0 videoAd, float f) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f79862b.mo26040a(videoAd, f);
    }
}
