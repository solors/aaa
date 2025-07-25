package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class m92 implements ze1 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30192dt f82100a;
    @NotNull

    /* renamed from: b */
    private final ma2 f82101b;
    @NotNull

    /* renamed from: c */
    private final r92 f82102c;

    public /* synthetic */ m92(InterfaceC30192dt interfaceC30192dt) {
        this(interfaceC30192dt, new ma2(), new r92());
    }

    /* renamed from: a */
    public final void m32065a(@NotNull i92 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82102c.m30108a(listener);
    }

    /* renamed from: b */
    public final long m32064b() {
        return this.f82100a.getVideoDuration();
    }

    /* renamed from: c */
    public final long m32063c() {
        return this.f82100a.getVideoPosition();
    }

    /* renamed from: d */
    public final void m32062d() {
        this.f82100a.pauseVideo();
    }

    /* renamed from: e */
    public final void m32061e() {
        this.f82100a.prepareVideo();
    }

    /* renamed from: f */
    public final void m32060f() {
        this.f82100a.resumeVideo();
    }

    /* renamed from: g */
    public final void m32059g() {
        this.f82100a.mo28307a(this.f82102c);
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final float getVolume() {
        return this.f82100a.getVolume();
    }

    /* renamed from: h */
    public final void m32058h() {
        this.f82100a.mo28307a(null);
        this.f82102c.m30106b();
    }

    @NotNull
    /* renamed from: a */
    public final ma2 m32066a() {
        return this.f82101b;
    }

    public m92(@NotNull InterfaceC30192dt videoPlayer, @NotNull ma2 statusController, @NotNull r92 videoPlayerEventsController) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(statusController, "statusController");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoPlayerEventsController");
        this.f82100a = videoPlayer;
        this.f82101b = statusController;
        this.f82102c = videoPlayerEventsController;
    }
}
