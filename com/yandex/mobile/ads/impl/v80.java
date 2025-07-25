package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class v80 {
    @NotNull

    /* renamed from: a */
    private final List<si0> f86599a;

    public v80(@NotNull ArrayList installedPackages) {
        Intrinsics.checkNotNullParameter(installedPackages, "installedPackages");
        this.f86599a = installedPackages;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v80) && Intrinsics.m17075f(this.f86599a, ((v80) obj).f86599a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f86599a.hashCode();
    }

    @NotNull
    public final String toString() {
        List<si0> list = this.f86599a;
        return "FilteringRule(installedPackages=" + list + ")";
    }
}
