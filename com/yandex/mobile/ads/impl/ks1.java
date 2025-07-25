package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ks1 implements InterfaceC30192dt {
    @NotNull

    /* renamed from: a */
    private final wh1 f81548a;
    @NotNull

    /* renamed from: b */
    private final xe1 f81549b;
    @NotNull

    /* renamed from: c */
    private final q92 f81550c;

    public ks1(@NotNull nh1 progressProvider, @NotNull xe1 playerVolumeController, @NotNull q92 eventsController) {
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        Intrinsics.checkNotNullParameter(playerVolumeController, "playerVolumeController");
        Intrinsics.checkNotNullParameter(eventsController, "eventsController");
        this.f81548a = progressProvider;
        this.f81549b = playerVolumeController;
        this.f81550c = eventsController;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    /* renamed from: a */
    public final void mo28307a(@Nullable r92 r92Var) {
        this.f81550c.m30438a(r92Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final long getVideoDuration() {
        return this.f81548a.mo26975a().m35242b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final long getVideoPosition() {
        return this.f81548a.mo26975a().m35241c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final float getVolume() {
        Float m27546a = this.f81549b.m27546a();
        if (m27546a != null) {
            return m27546a.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final void pauseVideo() {
        this.f81550c.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final void prepareVideo() {
        this.f81550c.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final void resumeVideo() {
        this.f81550c.onVideoResumed();
    }
}
