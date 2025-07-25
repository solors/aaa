package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class o31 implements gd2<n31> {
    @NotNull

    /* renamed from: a */
    private final zl1<n31> f83292a;

    public o31(@NotNull zl1<n31> requestPolicy) {
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        this.f83292a = requestPolicy;
    }

    @Override // com.yandex.mobile.ads.impl.gd2
    /* renamed from: a */
    public final n31 mo31188a(c91 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return this.f83292a.mo26142a(networkResponse);
    }
}
