package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class fb1 implements ed1 {
    @NotNull

    /* renamed from: a */
    private final dd1 f79039a;

    public /* synthetic */ fb1(C31952z4 c31952z4) {
        this(c31952z4, new dd1(c31952z4));
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    @NotNull
    /* renamed from: a */
    public final LinkedHashMap mo29261a() {
        Set m17119j;
        dd1 dd1Var = this.f79039a;
        m17119j = C37572z0.m17119j(EnumC31868y4.f88032j, EnumC31868y4.f88033k, EnumC31868y4.f88035m, EnumC31868y4.f88034l, EnumC31868y4.f88036n, EnumC31868y4.f88037o, EnumC31868y4.f88048z, EnumC31868y4.f88023A);
        return dd1Var.m34959a(m17119j);
    }

    public fb1(@NotNull C31952z4 adLoadingPhasesManager, @NotNull dd1 phasesParametersExtractor) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(phasesParametersExtractor, "phasesParametersExtractor");
        this.f79039a = phasesParametersExtractor;
    }
}
