package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class wc2 implements vl1<qc2> {
    @NotNull

    /* renamed from: a */
    private final C31952z4 f87206a;
    @NotNull

    /* renamed from: b */
    private final vl1<qc2> f87207b;

    public wc2(@NotNull C31952z4 adLoadingPhasesManager, @NotNull vl1<qc2> requestListener) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.f87206a = adLoadingPhasesManager;
        this.f87207b = requestListener;
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    /* renamed from: a */
    public final void mo26878a(@NotNull f62 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f87206a.m26392a(EnumC31868y4.f88047y);
        this.f87207b.mo26878a(error);
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    /* renamed from: a */
    public final void mo26877a(qc2 qc2Var) {
        qc2 vmap = qc2Var;
        Intrinsics.checkNotNullParameter(vmap, "vmap");
        this.f87206a.m26392a(EnumC31868y4.f88047y);
        this.f87207b.mo26877a((vl1<qc2>) vmap);
    }
}
