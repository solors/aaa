package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class g71 implements f72<u71> {
    @NotNull

    /* renamed from: a */
    private final e71 f79534a;

    public g71(@NotNull e71 videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        this.f79534a = videoPlayer;
    }

    @Override // com.yandex.mobile.ads.impl.f72
    /* renamed from: a */
    public final void mo33531a(@NotNull m62<u71> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f79534a.mo28043a(videoAdInfo.m32085d());
    }

    @Override // com.yandex.mobile.ads.impl.f72
    /* renamed from: b */
    public final long mo33529b() {
        return this.f79534a.mo28041b();
    }

    @Override // com.yandex.mobile.ads.impl.f72
    /* renamed from: c */
    public final void mo33528c() {
        this.f79534a.mo28039c();
    }

    @Override // com.yandex.mobile.ads.impl.f72
    public final long getAdPosition() {
        return this.f79534a.getAdPosition();
    }

    @Override // com.yandex.mobile.ads.impl.f72
    public final float getVolume() {
        return this.f79534a.getVolume();
    }

    @Override // com.yandex.mobile.ads.impl.f72
    public final boolean isPlayingAd() {
        return this.f79534a.isPlayingAd();
    }

    @Override // com.yandex.mobile.ads.impl.f72
    public final void pauseAd() {
        this.f79534a.pauseAd();
    }

    @Override // com.yandex.mobile.ads.impl.f72
    public final void resumeAd() {
        this.f79534a.resumeAd();
    }

    @Override // com.yandex.mobile.ads.impl.f72
    /* renamed from: a */
    public final void mo33530a(@Nullable x62 x62Var) {
        this.f79534a.mo28044a(x62Var);
    }

    @Override // com.yandex.mobile.ads.impl.f72
    /* renamed from: a */
    public final void mo33533a() {
        this.f79534a.mo28048a();
    }
}
