package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class kh2 implements i42 {
    @NotNull

    /* renamed from: a */
    private final C30163de f81423a;
    @Nullable

    /* renamed from: b */
    private final yp1 f81424b;

    public kh2(@NotNull C30163de appMetricaAdapter, @NotNull Context context, @Nullable yp1 yp1Var) {
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f81423a = appMetricaAdapter;
        this.f81424b = yp1Var;
    }

    @Override // com.yandex.mobile.ads.impl.i42
    public final void setExperiments(@NotNull String experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        yp1 yp1Var = this.f81424b;
        if (yp1Var != null && yp1Var.m26727v0()) {
            this.f81423a.m34955b(experiments);
        }
    }

    @Override // com.yandex.mobile.ads.impl.i42
    public final void setTriggeredTestIds(@NotNull Set<Long> testIds) {
        Intrinsics.checkNotNullParameter(testIds, "testIds");
        yp1 yp1Var = this.f81424b;
        if (yp1Var != null && yp1Var.m26727v0()) {
            this.f81423a.m34956a(testIds);
        }
    }
}
