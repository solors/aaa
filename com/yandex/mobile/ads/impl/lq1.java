package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class lq1 implements zm1<yp1> {
    @NotNull

    /* renamed from: a */
    private final ym1<yp1> f81889a;
    @NotNull

    /* renamed from: b */
    private final ad2 f81890b;

    public /* synthetic */ lq1(jl1 jl1Var) {
        this(jl1Var, a91.m35935a(jl1Var), new ad2());
    }

    @Override // com.yandex.mobile.ads.impl.zm1
    /* renamed from: a */
    public final yp1 mo26085a(c91 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        this.f81890b.getClass();
        return this.f81889a.mo26832a(ad2.m35916a(networkResponse));
    }

    public lq1(@NotNull jl1 reporter, @NotNull ym1<yp1> sdkConfigurationResponseParser, @NotNull ad2 volleyMapper) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(sdkConfigurationResponseParser, "sdkConfigurationResponseParser");
        Intrinsics.checkNotNullParameter(volleyMapper, "volleyMapper");
        this.f81889a = sdkConfigurationResponseParser;
        this.f81890b = volleyMapper;
    }
}
