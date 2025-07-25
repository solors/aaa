package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class bx0 {
    @NotNull

    /* renamed from: a */
    private final String f77427a;
    @NotNull

    /* renamed from: b */
    private final List<MediationPrefetchNetwork> f77428b;

    /* renamed from: c */
    private final long f77429c;

    public bx0(long j, @NotNull String adUnitId, @NotNull List networks) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(networks, "networks");
        this.f77427a = adUnitId;
        this.f77428b = networks;
        this.f77429c = j;
    }

    /* renamed from: a */
    public final long m35424a() {
        return this.f77429c;
    }

    @NotNull
    /* renamed from: b */
    public final List<MediationPrefetchNetwork> m35423b() {
        return this.f77428b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx0)) {
            return false;
        }
        bx0 bx0Var = (bx0) obj;
        if (Intrinsics.m17075f(this.f77427a, bx0Var.f77427a) && Intrinsics.m17075f(this.f77428b, bx0Var.f77428b) && this.f77429c == bx0Var.f77429c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f77429c) + C31097p9.m30807a(this.f77428b, this.f77427a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f77427a;
        List<MediationPrefetchNetwork> list = this.f77428b;
        long j = this.f77429c;
        return "MediationPrefetchAdUnitSettings(adUnitId=" + str + ", networks=" + list + ", loadTimeoutMillis=" + j + ")";
    }
}
