package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.cf */
/* loaded from: classes8.dex */
public final class C30090cf extends ua0<C29931af> {
    @NotNull

    /* renamed from: E */
    private final ji1 f77615E;

    /* renamed from: com.yandex.mobile.ads.impl.cf$a */
    /* loaded from: classes8.dex */
    public static final class C30091a implements InterfaceC31722w4 {
        @NotNull

        /* renamed from: a */
        private final InterfaceC31551u4<C30090cf> f77616a;
        @NotNull

        /* renamed from: b */
        private final C30090cf f77617b;

        public C30091a(@NotNull InterfaceC31551u4<C30090cf> itemsFinishListener, @NotNull C30090cf loadController) {
            Intrinsics.checkNotNullParameter(itemsFinishListener, "itemsFinishListener");
            Intrinsics.checkNotNullParameter(loadController, "loadController");
            this.f77616a = itemsFinishListener;
            this.f77617b = loadController;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC31722w4
        /* renamed from: a */
        public final void mo26833a() {
            this.f77616a.mo28758a(this.f77617b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30090cf(@NotNull Context context, @NotNull pq1 sdkEnvironmentModule, @NotNull InterfaceC31551u4 itemsLoadFinishListener, @NotNull C30705k7 adRequestData, @NotNull C31952z4 adLoadingPhasesManager, @NotNull ae0 htmlAdResponseReportManager, @NotNull C30016bf adContentControllerFactory, @NotNull C30359g3 adConfiguration, @NotNull ji1 proxyAppOpenAdLoadListener) {
        super(context, adConfiguration, sdkEnvironmentModule, proxyAppOpenAdLoadListener, adLoadingPhasesManager, adContentControllerFactory, htmlAdResponseReportManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(itemsLoadFinishListener, "itemsLoadFinishListener");
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.checkNotNullParameter(adContentControllerFactory, "adContentControllerFactory");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(proxyAppOpenAdLoadListener, "proxyAppOpenAdLoadListener");
        this.f77615E = proxyAppOpenAdLoadListener;
        adConfiguration.m33976a(adRequestData);
        proxyAppOpenAdLoadListener.m32912a(new C30091a(itemsLoadFinishListener, this));
        proxyAppOpenAdLoadListener.m32918a(htmlAdResponseReportManager);
        proxyAppOpenAdLoadListener.m32916a(adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.ua0
    @NotNull
    /* renamed from: a */
    protected final na0<C29931af> mo26835a(@NotNull oa0 controllerFactory) {
        Intrinsics.checkNotNullParameter(controllerFactory, "controllerFactory");
        return controllerFactory.mo26013c(this);
    }

    /* renamed from: a */
    public final void m35238a(@Nullable InterfaceC31060or interfaceC31060or) {
        this.f77615E.m32913a(interfaceC31060or);
    }
}
