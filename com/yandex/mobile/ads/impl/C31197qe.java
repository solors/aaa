package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.qe */
/* loaded from: classes8.dex */
public final class C31197qe {
    @NotNull

    /* renamed from: a */
    private final ll1 f84310a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC31106pd f84311b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC30014be f84312c;

    public C31197qe(@NotNull ll1 reporterPolicyConfigurator, @NotNull InterfaceC31106pd appAdAnalyticsActivator, @NotNull InterfaceC30014be appMetricaAdapter) {
        Intrinsics.checkNotNullParameter(reporterPolicyConfigurator, "reporterPolicyConfigurator");
        Intrinsics.checkNotNullParameter(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        this.f84310a = reporterPolicyConfigurator;
        this.f84311b = appAdAnalyticsActivator;
        this.f84312c = appMetricaAdapter;
    }

    @Nullable
    /* renamed from: a */
    public final jl1 m30392a(@NotNull Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        if (C30155da.m34982a(context)) {
            str = "322a737a-a0ca-44e0-bc85-649b1c7c1db6";
        } else {
            str = "478cb909-6ad1-4e12-84cc-b3629a789f93";
        }
        return this.f84312c.mo28354a(context, str, this.f84310a, this.f84311b);
    }
}
