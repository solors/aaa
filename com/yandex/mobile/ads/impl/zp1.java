package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class zp1 {
    @NotNull

    /* renamed from: a */
    private final aq1 f89069a;
    @NotNull

    /* renamed from: b */
    private final eq1 f89070b;

    public zp1(@NotNull ll1 reporterPolicyConfigurator, @NotNull aq1 sdkConfigurationChangeListener, @NotNull eq1 sdkConfigurationProvider) {
        Intrinsics.checkNotNullParameter(reporterPolicyConfigurator, "reporterPolicyConfigurator");
        Intrinsics.checkNotNullParameter(sdkConfigurationChangeListener, "sdkConfigurationChangeListener");
        Intrinsics.checkNotNullParameter(sdkConfigurationProvider, "sdkConfigurationProvider");
        this.f89069a = sdkConfigurationChangeListener;
        this.f89070b = sdkConfigurationProvider;
    }

    /* renamed from: a */
    public final void m26026a() {
        this.f89070b.m34467a(this.f89069a);
    }
}
