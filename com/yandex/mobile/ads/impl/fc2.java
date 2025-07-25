package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class fc2 {
    @NotNull

    /* renamed from: a */
    private final List<String> f79043a;

    public fc2(@NotNull ArrayList viewableUrls) {
        Intrinsics.checkNotNullParameter(viewableUrls, "viewableUrls");
        this.f79043a = viewableUrls;
    }

    @NotNull
    /* renamed from: a */
    public final List<String> m34177a() {
        return this.f79043a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fc2) && Intrinsics.m17075f(this.f79043a, ((fc2) obj).f79043a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f79043a.hashCode();
    }

    @NotNull
    public final String toString() {
        List<String> list = this.f79043a;
        return "ViewableImpression(viewableUrls=" + list + ")";
    }
}
