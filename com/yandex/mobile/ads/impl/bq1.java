package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class bq1 {
    @NotNull

    /* renamed from: a */
    private final az1 f77385a;

    public /* synthetic */ bq1() {
        this(new az1());
    }

    /* renamed from: a */
    public final boolean m35450a(@NotNull yp1 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f77385a.getClass();
        if (System.currentTimeMillis() >= sdkConfiguration.m26726w()) {
            return true;
        }
        return false;
    }

    public bq1(@NotNull az1 systemCurrentTimeProvider) {
        Intrinsics.checkNotNullParameter(systemCurrentTimeProvider, "systemCurrentTimeProvider");
        this.f77385a = systemCurrentTimeProvider;
    }
}
