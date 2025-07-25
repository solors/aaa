package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class lo1 {
    @NotNull

    /* renamed from: a */
    private final LinkedHashSet f81872a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m32221a(@NotNull ko1 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f81872a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m32220b(@NotNull ko1 failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f81872a.add(failedRoute);
    }

    /* renamed from: c */
    public final synchronized boolean m32219c(@NotNull ko1 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f81872a.contains(route);
    }
}
