package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k31 implements zl1<n31> {
    @NotNull

    /* renamed from: a */
    private final zm1<n31> f81261a;

    public /* synthetic */ k31(Context context, jl1 jl1Var) {
        this(context, jl1Var, new r31(context, jl1Var));
    }

    @Override // com.yandex.mobile.ads.impl.zl1
    /* renamed from: a */
    public final boolean mo26143a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.zl1
    /* renamed from: a */
    public final n31 mo26142a(c91 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return this.f81261a.mo26085a(networkResponse);
    }

    public k31(@NotNull Context context, @NotNull jl1 reporter, @NotNull zm1<n31> nativeAdResponseParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdResponseParser, "nativeAdResponseParser");
        this.f81261a = nativeAdResponseParser;
    }
}
