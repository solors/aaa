package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class m41 {
    @NotNull

    /* renamed from: a */
    private final C30359g3 f82036a;
    @NotNull

    /* renamed from: b */
    private final String f82037b;
    @NotNull

    /* renamed from: c */
    private final C30149d8<?> f82038c;
    @NotNull

    /* renamed from: d */
    private final n31 f82039d;
    @NotNull

    /* renamed from: e */
    private final x41 f82040e;
    @Nullable

    /* renamed from: f */
    private u41 f82041f;

    public m41(@NotNull C30359g3 adConfiguration, @NotNull String responseNativeType, @NotNull C30149d8<?> adResponse, @NotNull n31 nativeAdResponse, @NotNull x41 nativeCommonReportDataProvider, @Nullable u41 u41Var) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        Intrinsics.checkNotNullParameter(nativeCommonReportDataProvider, "nativeCommonReportDataProvider");
        this.f82036a = adConfiguration;
        this.f82037b = responseNativeType;
        this.f82038c = adResponse;
        this.f82039d = nativeAdResponse;
        this.f82040e = nativeCommonReportDataProvider;
        this.f82041f = u41Var;
    }

    @NotNull
    /* renamed from: a */
    public final gl1 m32102a() {
        gl1 mo27664a = this.f82040e.mo27664a(this.f82038c, this.f82036a, this.f82039d);
        u41 u41Var = this.f82041f;
        if (u41Var != null) {
            mo27664a.m33814b(u41Var.m28888a(), "bind_type");
        }
        mo27664a.m33818a(this.f82037b, "native_ad_type");
        qu1 m33948r = this.f82036a.m33948r();
        if (m33948r != null) {
            mo27664a.m33814b(m33948r.mo29654a().m30213a(), "size_type");
            mo27664a.m33814b(Integer.valueOf(m33948r.getWidth()), "width");
            mo27664a.m33814b(Integer.valueOf(m33948r.getHeight()), "height");
        }
        mo27664a.m33819a(this.f82038c.m35068a());
        return mo27664a;
    }

    /* renamed from: a */
    public final void m32101a(@NotNull u41 bindType) {
        Intrinsics.checkNotNullParameter(bindType, "bindType");
        this.f82041f = bindType;
    }
}
