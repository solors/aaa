package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class dt1 implements ct1 {
    @NotNull

    /* renamed from: b */
    private final sp0 f78242b;

    public dt1(@NotNull sp0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f78242b = localStorage;
    }

    @Override // com.yandex.mobile.ads.impl.ct1
    @Nullable
    /* renamed from: a */
    public final String mo34849a() {
        return this.f78242b.mo29082d("SessionData");
    }

    @Override // com.yandex.mobile.ads.impl.ct1
    /* renamed from: a */
    public final void mo34848a(@Nullable String str) {
        this.f78242b.mo29092a("SessionData", str);
    }
}
