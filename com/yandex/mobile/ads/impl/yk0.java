package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class yk0 {
    @NotNull

    /* renamed from: a */
    private final og0 f88243a;
    @NotNull

    /* renamed from: b */
    private final C31952z4 f88244b;
    @NotNull

    /* renamed from: c */
    private final C30390gg f88245c;
    @NotNull

    /* renamed from: d */
    private final gh0 f88246d;
    @NotNull

    /* renamed from: e */
    private final C30808lt f88247e;
    @NotNull

    /* renamed from: f */
    private final ih0 f88248f;

    /* renamed from: com.yandex.mobile.ads.impl.yk0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31904a {
        /* renamed from: h */
        void mo26866h(@NotNull m62<kl0> m62Var);
    }

    public yk0(@NotNull og0 imageLoadManager, @NotNull C31952z4 adLoadingPhasesManager) {
        Intrinsics.checkNotNullParameter(imageLoadManager, "imageLoadManager");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f88243a = imageLoadManager;
        this.f88244b = adLoadingPhasesManager;
        this.f88245c = new C30390gg();
        this.f88246d = new gh0();
        this.f88247e = new C30808lt();
        this.f88248f = new ih0();
    }

    /* renamed from: a */
    public final void m26870a(@NotNull m62 videoAdInfo, @NotNull wg0 imageProvider, @NotNull jl0 loadListener) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        C30808lt c30808lt = this.f88247e;
        C30746kt m32087b = videoAdInfo.m32087b();
        c30808lt.getClass();
        List<? extends C31034of<?>> m32197a = C30808lt.m32197a(m32087b);
        Set<bh0> m33274a = this.f88248f.m33274a(m32197a, null);
        C31952z4 c31952z4 = this.f88244b;
        EnumC31868y4 enumC31868y4 = EnumC31868y4.f88039q;
        C30030bj.m35463a(c31952z4, enumC31868y4, "adLoadingPhaseType", enumC31868y4, null);
        this.f88243a.m31025a(m33274a, new zk0(this, m32197a, imageProvider, loadListener, videoAdInfo));
    }
}
