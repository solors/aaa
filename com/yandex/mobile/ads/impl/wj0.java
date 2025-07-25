package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class wj0 {
    @NotNull

    /* renamed from: a */
    private final C31763wr f87283a;
    @NotNull

    /* renamed from: b */
    private final vj0 f87284b;
    @Nullable

    /* renamed from: c */
    private uj0 f87285c;

    public /* synthetic */ wj0(C31763wr c31763wr, m92 m92Var) {
        this(c31763wr, m92Var, new vj0(m92Var));
    }

    @NotNull
    /* renamed from: a */
    public final uj0 m27881a() {
        uj0 uj0Var = this.f87285c;
        if (uj0Var == null) {
            uj0 m28298a = this.f87284b.m28298a(this.f87283a.m27849a());
            this.f87285c = m28298a;
            return m28298a;
        }
        return uj0Var;
    }

    public wj0(@NotNull C31763wr instreamVideoAd, @NotNull m92 videoPlayerController, @NotNull vj0 instreamAdPlaylistCreator) {
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(instreamAdPlaylistCreator, "instreamAdPlaylistCreator");
        this.f87283a = instreamVideoAd;
        this.f87284b = instreamAdPlaylistCreator;
    }
}
