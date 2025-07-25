package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.fg */
/* loaded from: classes8.dex */
public final class C30311fg {
    @NotNull

    /* renamed from: a */
    private final EnumC30803lr f79070a;
    @Nullable

    /* renamed from: b */
    private final String f79071b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC31080p1 f79072c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC30449h8 f79073d;
    @Nullable

    /* renamed from: e */
    private m41 f79074e;

    public /* synthetic */ C30311fg(InterfaceC31256r4 interfaceC31256r4, EnumC30803lr enumC30803lr, String str) {
        this(interfaceC31256r4, enumC30803lr, str, interfaceC31256r4.mo28217a(), interfaceC31256r4.mo28216b());
    }

    @NotNull
    /* renamed from: a */
    public final gl1 m34157a() {
        gl1 mo32469a = this.f79073d.mo32469a();
        mo32469a.m33814b(this.f79070a.m32212a(), "ad_type");
        mo32469a.m33818a(this.f79071b, "ad_id");
        mo32469a.m33816a(this.f79072c.mo30857a());
        m41 m41Var = this.f79074e;
        return m41Var != null ? hl1.m33525a(mo32469a, m41Var.m32102a()) : mo32469a;
    }

    public C30311fg(@NotNull InterfaceC31256r4 adInfoReportDataProviderFactory, @NotNull EnumC30803lr adType, @Nullable String str, @NotNull InterfaceC31080p1 adAdapterReportDataProvider, @NotNull InterfaceC30449h8 adResponseReportDataProvider) {
        Intrinsics.checkNotNullParameter(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adAdapterReportDataProvider, "adAdapterReportDataProvider");
        Intrinsics.checkNotNullParameter(adResponseReportDataProvider, "adResponseReportDataProvider");
        this.f79070a = adType;
        this.f79071b = str;
        this.f79072c = adAdapterReportDataProvider;
        this.f79073d = adResponseReportDataProvider;
    }

    /* renamed from: a */
    public final void m34156a(@NotNull m41 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f79074e = reportParameterManager;
    }
}
