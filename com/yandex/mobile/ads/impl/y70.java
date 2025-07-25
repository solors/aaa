package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class y70 {
    @NotNull

    /* renamed from: a */
    private final String f88080a;

    public y70(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f88080a = value;
    }

    @NotNull
    /* renamed from: a */
    public final String m27006a() {
        return this.f88080a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y70) && Intrinsics.m17075f(this.f88080a, ((y70) obj).f88080a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f88080a.hashCode();
    }

    @NotNull
    public final String toString() {
        String str = this.f88080a;
        return "FeedSessionData(value=" + str + ")";
    }
}
