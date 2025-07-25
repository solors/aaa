package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ze */
/* loaded from: classes8.dex */
public final class C31976ze {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30014be f88834a;

    public /* synthetic */ C31976ze() {
        this(C30087ce.m35245a());
    }

    @Nullable
    /* renamed from: a */
    public final String m26252a() {
        return this.f88834a.mo28357a();
    }

    public C31976ze(@NotNull InterfaceC30014be appMetricaAdapter) {
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        this.f88834a = appMetricaAdapter;
    }
}
