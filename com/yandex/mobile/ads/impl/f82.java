package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class f82 {
    @NotNull

    /* renamed from: a */
    private final List<z52> f79011a;
    @NotNull

    /* renamed from: b */
    private final List<z52> f79012b;

    public f82(@NotNull List<z52> inLineAds, @NotNull List<z52> wrapperAds) {
        Intrinsics.checkNotNullParameter(inLineAds, "inLineAds");
        Intrinsics.checkNotNullParameter(wrapperAds, "wrapperAds");
        this.f79011a = inLineAds;
        this.f79012b = wrapperAds;
    }

    @NotNull
    /* renamed from: a */
    public final List<z52> m34200a() {
        return this.f79011a;
    }

    @NotNull
    /* renamed from: b */
    public final List<z52> m34199b() {
        return this.f79012b;
    }
}
