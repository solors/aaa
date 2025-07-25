package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class va1 {
    @NotNull

    /* renamed from: a */
    private final sp0 f86679a;

    public va1(@NotNull sp0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f86679a = localStorage;
    }

    @Nullable
    /* renamed from: a */
    public final String m28380a() {
        return this.f86679a.mo29082d("YmadOmSdkJs");
    }

    @Nullable
    /* renamed from: b */
    public final String m28378b() {
        return this.f86679a.mo29082d("YmadOmSdkJsUrl");
    }

    /* renamed from: a */
    public final void m28379a(@Nullable String str) {
        this.f86679a.mo29092a("YmadOmSdkJs", str);
    }

    /* renamed from: b */
    public final void m28377b(@Nullable String str) {
        this.f86679a.mo29092a("YmadOmSdkJsUrl", str);
    }
}
