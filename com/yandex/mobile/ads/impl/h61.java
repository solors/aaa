package com.yandex.mobile.ads.impl;

import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class h61 {
    @NotNull

    /* renamed from: a */
    private final m41 f79964a;
    @NotNull

    /* renamed from: b */
    private C30725kg f79965b;

    public h61(@NotNull m41 reportManager, @NotNull C30725kg assetsRenderedReportParameterProvider) {
        Intrinsics.checkNotNullParameter(reportManager, "reportManager");
        Intrinsics.checkNotNullParameter(assetsRenderedReportParameterProvider, "assetsRenderedReportParameterProvider");
        this.f79964a = reportManager;
        this.f79965b = assetsRenderedReportParameterProvider;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, Object> m33607a() {
        Map m17291g;
        Map m17291g2;
        Map<String, Object> m17276r;
        Map<String, Object> m33815b = this.f79964a.m32102a().m33815b();
        m17291g = MapsJVM.m17291g(C38513v.m14532a("rendered", this.f79965b.m32565a()));
        m17291g2 = MapsJVM.m17291g(C38513v.m14532a(POBNativeConstants.NATIVE_ASSETS, m17291g));
        m17276r = C37559r0.m17276r(m33815b, m17291g2);
        return m17276r;
    }
}
