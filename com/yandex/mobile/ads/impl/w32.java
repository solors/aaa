package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class w32 implements v32 {
    @NotNull

    /* renamed from: a */
    private final u32 f87106a;

    public w32(@NotNull u32 userAgentCreator) {
        Intrinsics.checkNotNullParameter(userAgentCreator, "userAgentCreator");
        this.f87106a = userAgentCreator;
    }

    @Override // com.yandex.mobile.ads.impl.v32
    @NotNull
    /* renamed from: a */
    public final String mo28049a() {
        return this.f87106a.mo28890a();
    }
}
