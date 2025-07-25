package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class sq0 implements c32 {
    @NotNull

    /* renamed from: a */
    private final C31920yr f85337a;
    @NotNull

    /* renamed from: b */
    private final zq0 f85338b;
    @NotNull

    /* renamed from: c */
    private final a62 f85339c;
    @NotNull

    /* renamed from: d */
    private final vq0 f85340d;
    @NotNull

    /* renamed from: e */
    private final rj0 f85341e;
    @Nullable

    /* renamed from: f */
    private uq0 f85342f;
    @Nullable

    /* renamed from: g */
    private InterfaceC30043bs f85343g;

    public sq0(@NotNull Context context, @NotNull pq1 sdkEnvironmentModule, @NotNull C31920yr instreamAdBreak, @NotNull C31253r2 adBreakStatusController, @NotNull sj0 instreamAdPlayerReuseControllerFactory, @NotNull zq0 manualPlaybackEventListener, @NotNull a62 videoAdCreativePlaybackProxyListener, @NotNull vq0 presenterProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAdBreak, "instreamAdBreak");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        Intrinsics.checkNotNullParameter(instreamAdPlayerReuseControllerFactory, "instreamAdPlayerReuseControllerFactory");
        Intrinsics.checkNotNullParameter(manualPlaybackEventListener, "manualPlaybackEventListener");
        Intrinsics.checkNotNullParameter(videoAdCreativePlaybackProxyListener, "videoAdCreativePlaybackProxyListener");
        Intrinsics.checkNotNullParameter(presenterProvider, "presenterProvider");
        this.f85337a = instreamAdBreak;
        this.f85338b = manualPlaybackEventListener;
        this.f85339c = videoAdCreativePlaybackProxyListener;
        this.f85340d = presenterProvider;
        instreamAdPlayerReuseControllerFactory.getClass();
        this.f85341e = sj0.m29595a(this);
    }

    @NotNull
    /* renamed from: a */
    public final C31920yr m29568a() {
        return this.f85337a;
    }

    /* renamed from: b */
    public final void m29563b() {
        uq0 uq0Var = this.f85342f;
        if (uq0Var != null) {
            uq0Var.m28711a();
        }
        InterfaceC30043bs interfaceC30043bs = this.f85343g;
        if (interfaceC30043bs != null) {
            this.f85341e.m30034b(interfaceC30043bs);
        }
        this.f85342f = null;
        this.f85343g = null;
    }

    /* renamed from: c */
    public final void m29562c() {
        uq0 uq0Var = this.f85342f;
        if (uq0Var != null) {
            uq0Var.m28707b();
        }
    }

    /* renamed from: d */
    public final void m29561d() {
        uq0 uq0Var = this.f85342f;
        if (uq0Var != null) {
            uq0Var.m28705d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final void invalidateAdPlayer() {
        uq0 uq0Var = this.f85342f;
        if (uq0Var != null) {
            uq0Var.m28711a();
        }
        InterfaceC30043bs interfaceC30043bs = this.f85343g;
        if (interfaceC30043bs != null) {
            this.f85341e.m30034b(interfaceC30043bs);
        }
        this.f85342f = null;
        this.f85343g = null;
    }

    /* renamed from: a */
    public final void m29566a(@NotNull h50 instreamAdView) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        uq0 uq0Var = this.f85342f;
        if (uq0Var != null) {
            uq0Var.m28709a(instreamAdView);
        }
    }

    /* renamed from: a */
    public final void m29565a(@NotNull jg2 player) {
        Intrinsics.checkNotNullParameter(player, "player");
        uq0 uq0Var = this.f85342f;
        if (uq0Var != null) {
            uq0Var.m28711a();
        }
        InterfaceC30043bs interfaceC30043bs = this.f85343g;
        if (interfaceC30043bs != null) {
            this.f85341e.m30034b(interfaceC30043bs);
        }
        this.f85342f = null;
        this.f85343g = player;
        this.f85341e.m30035a(player);
        uq0 m28235a = this.f85340d.m28235a(player);
        m28235a.m28710a(this.f85339c);
        m28235a.m28706c();
        this.f85342f = m28235a;
    }

    /* renamed from: a */
    public final void m29564a(@Nullable pl0 pl0Var) {
        this.f85339c.m35947a(pl0Var);
    }

    /* renamed from: a */
    public final void m29567a(@Nullable eg2 eg2Var) {
        this.f85338b.m26024a(eg2Var);
    }
}
