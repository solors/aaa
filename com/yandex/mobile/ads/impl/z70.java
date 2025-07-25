package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class z70 {
    @NotNull

    /* renamed from: a */
    private final s70 f88755a;
    @NotNull

    /* renamed from: b */
    private final List<b70> f88756b;

    public z70(@NotNull s70 state, @NotNull List<b70> items) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f88755a = state;
        this.f88756b = items;
    }

    @NotNull
    /* renamed from: a */
    public final s70 m26328a() {
        return this.f88755a;
    }

    @NotNull
    /* renamed from: b */
    public final List<b70> m26327b() {
        return this.f88756b;
    }

    @NotNull
    /* renamed from: c */
    public final s70 m26326c() {
        return this.f88755a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z70)) {
            return false;
        }
        z70 z70Var = (z70) obj;
        if (Intrinsics.m17075f(this.f88755a, z70Var.f88755a) && Intrinsics.m17075f(this.f88756b, z70Var.f88756b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f88756b.hashCode() + (this.f88755a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        s70 s70Var = this.f88755a;
        List<b70> list = this.f88756b;
        return "FeedState(state=" + s70Var + ", items=" + list + ")";
    }
}
