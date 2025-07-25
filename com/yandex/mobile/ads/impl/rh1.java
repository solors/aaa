package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class rh1 {
    @NotNull

    /* renamed from: a */
    private final String f84762a;

    /* renamed from: b */
    private final long f84763b;

    public rh1(@NotNull String trackingUrl, long j) {
        Intrinsics.checkNotNullParameter(trackingUrl, "trackingUrl");
        this.f84762a = trackingUrl;
        this.f84763b = j;
    }

    /* renamed from: a */
    public final long m30049a() {
        return this.f84763b;
    }

    @NotNull
    /* renamed from: b */
    public final String m30048b() {
        return this.f84762a;
    }
}
