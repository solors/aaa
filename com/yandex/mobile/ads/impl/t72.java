package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class t72 implements ed1 {
    @NotNull

    /* renamed from: a */
    private final dd1 f85544a;

    public /* synthetic */ t72(C31952z4 c31952z4) {
        this(c31952z4, new dd1(c31952z4));
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    @NotNull
    /* renamed from: a */
    public final LinkedHashMap mo29261a() {
        Set m17119j;
        dd1 dd1Var = this.f85544a;
        m17119j = C37572z0.m17119j(EnumC31868y4.f88045w, EnumC31868y4.f88046x);
        return dd1Var.m34959a(m17119j);
    }

    public t72(@NotNull C31952z4 adLoadingPhasesManager, @NotNull dd1 phasesParametersExtractor) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(phasesParametersExtractor, "phasesParametersExtractor");
        this.f85544a = phasesParametersExtractor;
    }
}
