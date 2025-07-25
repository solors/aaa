package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ew */
/* loaded from: classes8.dex */
public final class C30276ew {
    @NotNull

    /* renamed from: a */
    private final List<oy0> f78814a;
    @NotNull

    /* renamed from: b */
    private final List<gy0> f78815b;

    public C30276ew(@NotNull List<oy0> sdkLogs, @NotNull List<gy0> networkLogs) {
        Intrinsics.checkNotNullParameter(sdkLogs, "sdkLogs");
        Intrinsics.checkNotNullParameter(networkLogs, "networkLogs");
        this.f78814a = sdkLogs;
        this.f78815b = networkLogs;
    }

    @NotNull
    /* renamed from: a */
    public final List<gy0> m34418a() {
        return this.f78815b;
    }

    @NotNull
    /* renamed from: b */
    public final List<oy0> m34417b() {
        return this.f78814a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30276ew)) {
            return false;
        }
        C30276ew c30276ew = (C30276ew) obj;
        if (Intrinsics.m17075f(this.f78814a, c30276ew.f78814a) && Intrinsics.m17075f(this.f78815b, c30276ew.f78815b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f78815b.hashCode() + (this.f78814a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        List<oy0> list = this.f78814a;
        List<gy0> list2 = this.f78815b;
        return "DebugPanelLogsData(sdkLogs=" + list + ", networkLogs=" + list2 + ")";
    }
}
