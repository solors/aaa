package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class vx0 {
    @NotNull

    /* renamed from: a */
    private final wx0 f87016a;

    public vx0(@NotNull wx0 mobileAdsExecutorProvider) {
        Intrinsics.checkNotNullParameter(mobileAdsExecutorProvider, "mobileAdsExecutorProvider");
        this.f87016a = mobileAdsExecutorProvider;
    }

    /* renamed from: a */
    public final void m28128a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f87016a.m27731a().execute(runnable);
    }

    /* renamed from: b */
    public final void m28127b(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f87016a.m27729b().execute(runnable);
    }
}
