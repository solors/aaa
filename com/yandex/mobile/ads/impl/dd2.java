package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class dd2<T> {
    @NotNull

    /* renamed from: a */
    private final ad2 f78048a;
    @NotNull

    /* renamed from: b */
    private final g91<T> f78049b;

    public dd2(@NotNull C30359g3 adConfiguration, @NotNull gd2<T> volleyResponseBodyParser, @NotNull sm1<T> responseBodyParser, @NotNull ad2 volleyMapper, @NotNull g91<T> responseParser) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(volleyResponseBodyParser, "volleyResponseBodyParser");
        Intrinsics.checkNotNullParameter(responseBodyParser, "responseBodyParser");
        Intrinsics.checkNotNullParameter(volleyMapper, "volleyMapper");
        Intrinsics.checkNotNullParameter(responseParser, "responseParser");
        this.f78048a = volleyMapper;
        this.f78049b = responseParser;
    }

    @NotNull
    /* renamed from: a */
    public final C30149d8<T> m34958a(@NotNull c91 networkResponse, @NotNull Map<String, String> headers, @NotNull EnumC30803lr responseAdType) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(responseAdType, "responseAdType");
        this.f78048a.getClass();
        return this.f78049b.mo33342a(ad2.m35916a(networkResponse), headers, responseAdType);
    }
}
