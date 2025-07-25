package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.SetsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.h7 */
/* loaded from: classes8.dex */
public final class C30446h7 implements ed1 {
    @NotNull

    /* renamed from: a */
    private final dd1 f79970a;

    public /* synthetic */ C30446h7(C31952z4 c31952z4) {
        this(c31952z4, new dd1(c31952z4));
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    @NotNull
    /* renamed from: a */
    public final LinkedHashMap mo29261a() {
        Set m17127d;
        dd1 dd1Var = this.f79970a;
        m17127d = SetsJVM.m17127d(EnumC31868y4.f88028f);
        return dd1Var.m34959a(m17127d);
    }

    public C30446h7(@NotNull C31952z4 adLoadingPhasesManager, @NotNull dd1 phasesParametersExtractor) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(phasesParametersExtractor, "phasesParametersExtractor");
        this.f79970a = phasesParametersExtractor;
    }
}
