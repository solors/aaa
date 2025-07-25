package com.monetization.ads.mediation.base.prefetch.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class MediatedPrefetchRevenue {

    /* renamed from: a */
    private final double f66491a;

    public MediatedPrefetchRevenue(double d) {
        this.f66491a = d;
    }

    public static /* synthetic */ MediatedPrefetchRevenue copy$default(MediatedPrefetchRevenue mediatedPrefetchRevenue, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = mediatedPrefetchRevenue.f66491a;
        }
        return mediatedPrefetchRevenue.copy(d);
    }

    public final double component1() {
        return this.f66491a;
    }

    @NotNull
    public final MediatedPrefetchRevenue copy(double d) {
        return new MediatedPrefetchRevenue(d);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MediatedPrefetchRevenue) && Double.compare(this.f66491a, ((MediatedPrefetchRevenue) obj).f66491a) == 0) {
            return true;
        }
        return false;
    }

    public final double getValue() {
        return this.f66491a;
    }

    public int hashCode() {
        return Double.hashCode(this.f66491a);
    }

    @NotNull
    public String toString() {
        double d = this.f66491a;
        return "MediatedPrefetchRevenue(value=" + d + ")";
    }
}
