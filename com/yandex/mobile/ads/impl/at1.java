package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
final class at1 implements zs1 {
    @NotNull

    /* renamed from: b */
    private final sp0 f76910b;

    public at1(@NotNull sp0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f76910b = localStorage;
    }

    @Override // com.yandex.mobile.ads.impl.zs1
    @Nullable
    /* renamed from: a */
    public final String mo26007a() {
        return this.f76910b.mo29082d("ServerSideClientIP");
    }

    @Override // com.yandex.mobile.ads.impl.zs1
    /* renamed from: a */
    public final void mo26006a(@Nullable String str) {
        this.f76910b.mo29092a("ServerSideClientIP", str);
    }
}
