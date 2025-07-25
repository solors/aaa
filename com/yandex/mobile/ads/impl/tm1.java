package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class tm1<T> implements sm1<T> {
    @NotNull

    /* renamed from: a */
    private final gd2<T> f85759a;
    @NotNull

    /* renamed from: b */
    private final ad2 f85760b;

    public /* synthetic */ tm1(gd2 gd2Var) {
        this(gd2Var, new ad2());
    }

    @Override // com.yandex.mobile.ads.impl.sm1
    @Nullable
    /* renamed from: a */
    public final T mo29105a(@NotNull nm1 response) {
        Intrinsics.checkNotNullParameter(response, "networkResponse");
        this.f85760b.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        return this.f85759a.mo31188a(new c91(response.m31463c(), response.m31465a().m29983a(), response.m31464b(), true));
    }

    public tm1(@NotNull gd2<T> responseBodyParser, @NotNull ad2 volleyMapper) {
        Intrinsics.checkNotNullParameter(responseBodyParser, "responseBodyParser");
        Intrinsics.checkNotNullParameter(volleyMapper, "volleyMapper");
        this.f85759a = responseBodyParser;
        this.f85760b = volleyMapper;
    }
}
