package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c52<T> implements l72 {
    @NotNull

    /* renamed from: a */
    private final sa2 f77512a;
    @NotNull

    /* renamed from: b */
    private final f72<T> f77513b;
    @NotNull

    /* renamed from: c */
    private final za2 f77514c;

    /* renamed from: d */
    private boolean f77515d;

    public /* synthetic */ c52(ya2 ya2Var, ta2 ta2Var, f72 f72Var) {
        this(ya2Var, ta2Var, f72Var, new za2(ya2Var));
    }

    @Override // com.yandex.mobile.ads.impl.l72
    /* renamed from: a */
    public final void mo26256a(long j, long j2) {
        if (!this.f77515d && j2 > 0 && this.f77514c.m26291a()) {
            this.f77515d = true;
            this.f77512a.mo29045a(this.f77513b.getVolume(), j);
        }
    }

    public c52(@NotNull ya2 videoViewProvider, @NotNull ta2 videoTracker, @NotNull f72 videoAdPlayer, @NotNull za2 singlePercentAreaValidator) {
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(singlePercentAreaValidator, "singlePercentAreaValidator");
        this.f77512a = videoTracker;
        this.f77513b = videoAdPlayer;
        this.f77514c = singlePercentAreaValidator;
    }
}
