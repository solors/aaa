package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.a5 */
/* loaded from: classes8.dex */
public final class C29919a5 implements ed1 {
    @NotNull

    /* renamed from: a */
    private final dd1 f76713a;

    public /* synthetic */ C29919a5(C31952z4 c31952z4) {
        this(c31952z4, new dd1(c31952z4));
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    @NotNull
    /* renamed from: a */
    public final LinkedHashMap mo29261a() {
        Set m17119j;
        dd1 dd1Var = this.f76713a;
        m17119j = C37572z0.m17119j(EnumC31868y4.f88025c, EnumC31868y4.f88026d, EnumC31868y4.f88027e, EnumC31868y4.f88029g, EnumC31868y4.f88030h, EnumC31868y4.f88031i, EnumC31868y4.f88032j, EnumC31868y4.f88033k, EnumC31868y4.f88035m, EnumC31868y4.f88034l, EnumC31868y4.f88036n, EnumC31868y4.f88037o, EnumC31868y4.f88038p, EnumC31868y4.f88039q, EnumC31868y4.f88040r, EnumC31868y4.f88041s, EnumC31868y4.f88042t, EnumC31868y4.f88043u, EnumC31868y4.f88044v, EnumC31868y4.f88047y);
        return dd1Var.m34959a(m17119j);
    }

    public C29919a5(@NotNull C31952z4 adLoadingPhasesManager, @NotNull dd1 phasesParametersExtractor) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(phasesParametersExtractor, "phasesParametersExtractor");
        this.f76713a = phasesParametersExtractor;
    }
}
