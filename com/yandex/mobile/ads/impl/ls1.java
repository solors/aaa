package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ls1 implements InterfaceC30192dt {
    @NotNull

    /* renamed from: a */
    private final xh1 f81927a;
    @NotNull

    /* renamed from: b */
    private final ye1 f81928b;
    @NotNull

    /* renamed from: c */
    private final p92 f81929c;

    public ls1(@NotNull oh1 progressProvider, @NotNull ye1 playerVolumeController, @NotNull p92 eventsController) {
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        Intrinsics.checkNotNullParameter(playerVolumeController, "playerVolumeController");
        Intrinsics.checkNotNullParameter(eventsController, "eventsController");
        this.f81927a = progressProvider;
        this.f81928b = playerVolumeController;
        this.f81929c = eventsController;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    /* renamed from: a */
    public final void mo28307a(@Nullable r92 r92Var) {
        this.f81929c.m30797a(r92Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final long getVideoDuration() {
        return this.f81927a.mo26294a().m35487b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final long getVideoPosition() {
        return this.f81927a.mo26294a().m35486c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final float getVolume() {
        Float m26938a = this.f81928b.m26938a();
        if (m26938a != null) {
            return m26938a.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final void pauseVideo() {
        this.f81929c.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final void prepareVideo() {
        this.f81929c.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final void resumeVideo() {
        this.f81929c.onVideoResumed();
    }
}
