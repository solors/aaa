package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ym0 extends ua0<wm0> {
    @NotNull

    /* renamed from: E */
    private final li1 f88298E;

    /* renamed from: com.yandex.mobile.ads.impl.ym0$a */
    /* loaded from: classes8.dex */
    public static final class C31910a implements InterfaceC31722w4 {
        @NotNull

        /* renamed from: a */
        private final InterfaceC31551u4<ym0> f88299a;
        @NotNull

        /* renamed from: b */
        private final ym0 f88300b;

        public C31910a(@NotNull InterfaceC31551u4<ym0> itemsFinishListener, @NotNull ym0 loadController) {
            Intrinsics.checkNotNullParameter(itemsFinishListener, "itemsFinishListener");
            Intrinsics.checkNotNullParameter(loadController, "loadController");
            this.f88299a = itemsFinishListener;
            this.f88300b = loadController;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC31722w4
        /* renamed from: a */
        public final void mo26833a() {
            this.f88299a.mo28758a(this.f88300b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym0(@NotNull Context context, @NotNull pq1 sdkEnvironmentModule, @NotNull InterfaceC31551u4 itemsLoadFinishListener, @NotNull C30705k7 adRequestData, @NotNull C31952z4 adLoadingPhasesManager, @NotNull ae0 htmlAdResponseReportManager, @NotNull xm0 contentControllerFactory, @NotNull dn0 adApiControllerFactory, @NotNull C30359g3 adConfiguration, @NotNull li1 proxyInterstitialAdLoadListener) {
        super(context, adConfiguration, sdkEnvironmentModule, proxyInterstitialAdLoadListener, adLoadingPhasesManager, contentControllerFactory, htmlAdResponseReportManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(itemsLoadFinishListener, "itemsLoadFinishListener");
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.checkNotNullParameter(contentControllerFactory, "contentControllerFactory");
        Intrinsics.checkNotNullParameter(adApiControllerFactory, "adApiControllerFactory");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(proxyInterstitialAdLoadListener, "proxyInterstitialAdLoadListener");
        this.f88298E = proxyInterstitialAdLoadListener;
        adConfiguration.m33976a(adRequestData);
        proxyInterstitialAdLoadListener.m32254a(new C31910a(itemsLoadFinishListener, this));
        proxyInterstitialAdLoadListener.m32258a(adConfiguration);
        proxyInterstitialAdLoadListener.m32259a(htmlAdResponseReportManager);
    }

    @Override // com.yandex.mobile.ads.impl.ua0
    @NotNull
    /* renamed from: a */
    protected final na0<wm0> mo26835a(@NotNull oa0 controllerFactory) {
        Intrinsics.checkNotNullParameter(controllerFactory, "controllerFactory");
        return controllerFactory.mo26015a(this);
    }

    /* renamed from: a */
    public final void m26836a(@Nullable InterfaceC30411gs interfaceC30411gs) {
        this.f88298E.m32257a(interfaceC30411gs);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30251ej
    /* renamed from: a */
    public final void mo26834a(@Nullable String str) {
        super.mo26834a(str);
        this.f88298E.m32252a(str);
    }
}
