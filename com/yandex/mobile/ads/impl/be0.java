package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class be0 implements gd2<String> {
    @NotNull

    /* renamed from: a */
    private final bd2 f77274a;

    public /* synthetic */ be0() {
        this(b91.m35565a());
    }

    @Override // com.yandex.mobile.ads.impl.gd2
    /* renamed from: a */
    public final String mo31188a(c91 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return this.f77274a.mo35246a(networkResponse);
    }

    public be0(@NotNull bd2 volleyNetworkResponseDecoder) {
        Intrinsics.checkNotNullParameter(volleyNetworkResponseDecoder, "volleyNetworkResponseDecoder");
        this.f77274a = volleyNetworkResponseDecoder;
    }
}
