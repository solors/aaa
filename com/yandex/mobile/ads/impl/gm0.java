package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class gm0 implements zl1<C30508hw> {
    @NotNull

    /* renamed from: a */
    private final gd2<C30508hw> f79703a;

    public gm0(@NotNull gd2<C30508hw> responseParser) {
        Intrinsics.checkNotNullParameter(responseParser, "responseParser");
        this.f79703a = responseParser;
    }

    @Override // com.yandex.mobile.ads.impl.zl1
    /* renamed from: a */
    public final boolean mo26143a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.zl1
    /* renamed from: a */
    public final C30508hw mo26142a(c91 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return this.f79703a.mo31188a(networkResponse);
    }
}
