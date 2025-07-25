package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class cd2 implements bd2 {
    @NotNull

    /* renamed from: a */
    private final ad2 f77606a;
    @NotNull

    /* renamed from: b */
    private final e91 f77607b;

    public cd2(@NotNull ad2 volleyMapper, @NotNull e91 networkResponseDecoder) {
        Intrinsics.checkNotNullParameter(volleyMapper, "volleyMapper");
        Intrinsics.checkNotNullParameter(networkResponseDecoder, "networkResponseDecoder");
        this.f77606a = volleyMapper;
        this.f77607b = networkResponseDecoder;
    }

    @Override // com.yandex.mobile.ads.impl.bd2
    @Nullable
    /* renamed from: a */
    public final String mo35246a(@NotNull c91 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        this.f77606a.getClass();
        return this.f77607b.mo34192a(ad2.m35916a(networkResponse));
    }
}
