package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class aq1 implements nq1 {
    @Nullable

    /* renamed from: a */
    private final jl1 f76873a;
    @NotNull

    /* renamed from: b */
    private final ll1 f76874b;

    public aq1(@Nullable nx0 nx0Var, @NotNull ll1 reporterPolicyConfigurator) {
        Intrinsics.checkNotNullParameter(reporterPolicyConfigurator, "reporterPolicyConfigurator");
        this.f76873a = nx0Var;
        this.f76874b = reporterPolicyConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.nq1
    /* renamed from: a */
    public final void mo31437a(@NotNull Context context, @NotNull yp1 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        jl1 jl1Var = this.f76873a;
        if (jl1Var != null) {
            jl1Var.mo27966a(this.f76874b.m32236a(context));
        }
    }
}
