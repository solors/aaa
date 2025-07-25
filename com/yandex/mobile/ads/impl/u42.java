package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class u42<T> implements l72 {
    @NotNull

    /* renamed from: a */
    private final m62<T> f86106a;
    @NotNull

    /* renamed from: b */
    private final sa2 f86107b;
    @NotNull

    /* renamed from: c */
    private final y62<T> f86108c;
    @NotNull

    /* renamed from: d */
    private final za2 f86109d;

    /* renamed from: e */
    private boolean f86110e;

    public /* synthetic */ u42(m62 m62Var, ya2 ya2Var, ta2 ta2Var, y62 y62Var) {
        this(m62Var, ya2Var, ta2Var, y62Var, new za2(ya2Var));
    }

    @Override // com.yandex.mobile.ads.impl.l72
    /* renamed from: a */
    public final void mo26256a(long j, long j2) {
        if (!this.f86110e && j2 > 0 && this.f86109d.m26291a()) {
            this.f86110e = true;
            this.f86107b.mo29034h();
            this.f86108c.mo27011i(this.f86106a);
        }
    }

    public u42(@NotNull m62 videoAdInfo, @NotNull ya2 videoViewProvider, @NotNull ta2 videoTracker, @NotNull y62 playbackEventsListener, @NotNull za2 videoVisibleAreaValidator) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackEventsListener, "playbackEventsListener");
        Intrinsics.checkNotNullParameter(videoVisibleAreaValidator, "videoVisibleAreaValidator");
        this.f86106a = videoAdInfo;
        this.f86107b = videoTracker;
        this.f86108c = playbackEventsListener;
        this.f86109d = videoVisibleAreaValidator;
    }
}
