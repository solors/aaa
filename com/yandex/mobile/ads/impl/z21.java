package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class z21 implements y21 {
    @NotNull

    /* renamed from: a */
    private final a31 f88679a;
    @NotNull

    /* renamed from: b */
    private final v21 f88680b;

    public /* synthetic */ z21(Context context, pq1 pq1Var, j31 j31Var, a31 a31Var) {
        this(context, pq1Var, j31Var, a31Var, new C31952z4(), new C30359g3(EnumC30803lr.f81897g, pq1Var), new u21(), new w21());
    }

    @Override // com.yandex.mobile.ads.impl.y21
    /* renamed from: a */
    public final void mo26472a() {
        this.f88679a.mo27684a(this);
    }

    /* renamed from: b */
    public final void m26468b() {
        this.f88680b.m28552y();
    }

    /* renamed from: c */
    public final void m26467c() {
        this.f88680b.m28551z();
    }

    /* renamed from: a */
    public final void m26470a(@Nullable InterfaceC30879ms interfaceC30879ms) {
        this.f88680b.m28559a(interfaceC30879ms);
    }

    /* renamed from: a */
    public final void m26469a(@Nullable InterfaceC31394ss interfaceC31394ss) {
        this.f88680b.m28557a(interfaceC31394ss);
    }

    /* renamed from: a */
    public final void m26471a(@Nullable InterfaceC30045bt interfaceC30045bt) {
        this.f88680b.m28563a(interfaceC30045bt);
    }

    public z21(@NotNull Context context, @NotNull pq1 sdkEnvironmentModule, @NotNull j31 requestData, @NotNull a31 nativeAdLoadingItemFinishedListener, @NotNull C31952z4 adLoadingPhasesManager, @NotNull C30359g3 adConfiguration, @NotNull u21 nativeAdLoadListenerFactory, @NotNull w21 nativeAdLoadManagerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(nativeAdLoadingItemFinishedListener, "nativeAdLoadingItemFinishedListener");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdLoadListenerFactory, "nativeAdLoadListenerFactory");
        Intrinsics.checkNotNullParameter(nativeAdLoadManagerFactory, "nativeAdLoadManagerFactory");
        this.f88679a = nativeAdLoadingItemFinishedListener;
        nativeAdLoadListenerFactory.getClass();
        e31 m28900a = u21.m28900a(context, adConfiguration, adLoadingPhasesManager, this);
        nativeAdLoadManagerFactory.getClass();
        v21 m28061a = w21.m28061a(context, sdkEnvironmentModule, requestData, adConfiguration, m28900a, adLoadingPhasesManager);
        this.f88680b = m28061a;
        m28900a.m34683a(m28061a.m34533f());
    }
}
