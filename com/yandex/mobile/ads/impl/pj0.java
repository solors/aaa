package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class pj0 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30043bs f83998a;
    @NotNull

    /* renamed from: b */
    private final qj0 f83999b;

    public /* synthetic */ pj0(InterfaceC30043bs interfaceC30043bs) {
        this(interfaceC30043bs, new qj0());
    }

    /* renamed from: a */
    public final void m30638a(@NotNull kl0 videoAd, @NotNull InterfaceC30117cs listener) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83999b.m30341a(videoAd, listener);
    }

    /* renamed from: b */
    public final long m30636b(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f83998a.mo27106b(videoAd);
    }

    /* renamed from: c */
    public final float m30634c(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f83998a.mo27097k(videoAd);
    }

    /* renamed from: d */
    public final boolean m30633d(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f83998a.mo27098j(videoAd);
    }

    /* renamed from: e */
    public final void m30632e(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f83998a.mo27102f(videoAd);
    }

    /* renamed from: f */
    public final void m30631f(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f83998a.mo27105c(videoAd);
    }

    /* renamed from: g */
    public final void m30630g(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f83998a.mo27104d(videoAd);
    }

    /* renamed from: h */
    public final void m30629h(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f83998a.mo27103e(videoAd);
    }

    /* renamed from: i */
    public final void m30628i(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f83998a.mo27101g(videoAd);
    }

    /* renamed from: j */
    public final void m30627j(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f83998a.mo27100h(videoAd);
    }

    /* renamed from: k */
    public final void m30626k(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f83998a.mo27099i(videoAd);
    }

    public pj0(@NotNull InterfaceC30043bs instreamAdPlayer, @NotNull qj0 instreamAdPlayerEventsObservable) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        Intrinsics.checkNotNullParameter(instreamAdPlayerEventsObservable, "instreamAdPlayerEventsObservable");
        this.f83998a = instreamAdPlayer;
        this.f83999b = instreamAdPlayerEventsObservable;
    }

    /* renamed from: a */
    public final long m30640a(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f83998a.mo27109a(videoAd);
    }

    /* renamed from: b */
    public final void m30635b(@NotNull kl0 videoAd, @NotNull InterfaceC30117cs listener) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83999b.m30337b(videoAd, listener);
    }

    /* renamed from: a */
    public final void m30639a(@NotNull kl0 videoAd, float f) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f83998a.mo27108a(videoAd, f);
    }

    /* renamed from: b */
    public final void m30637b() {
        this.f83998a.mo27107a((qj0) null);
        this.f83999b.m30342a();
    }

    /* renamed from: a */
    public final void m30641a() {
        this.f83998a.mo27107a(this.f83999b);
    }
}
