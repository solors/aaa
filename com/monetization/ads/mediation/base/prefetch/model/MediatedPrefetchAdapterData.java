package com.monetization.ads.mediation.base.prefetch.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class MediatedPrefetchAdapterData {
    @NotNull

    /* renamed from: a */
    private final MediatedPrefetchNetworkWinner f66486a;
    @NotNull

    /* renamed from: b */
    private final MediatedPrefetchRevenue f66487b;
    @NotNull

    /* renamed from: c */
    private final String f66488c;

    public MediatedPrefetchAdapterData(@NotNull MediatedPrefetchNetworkWinner networkWinner, @NotNull MediatedPrefetchRevenue revenue, @NotNull String networkAdInfo) {
        Intrinsics.checkNotNullParameter(networkWinner, "networkWinner");
        Intrinsics.checkNotNullParameter(revenue, "revenue");
        Intrinsics.checkNotNullParameter(networkAdInfo, "networkAdInfo");
        this.f66486a = networkWinner;
        this.f66487b = revenue;
        this.f66488c = networkAdInfo;
    }

    public static /* synthetic */ MediatedPrefetchAdapterData copy$default(MediatedPrefetchAdapterData mediatedPrefetchAdapterData, MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner, MediatedPrefetchRevenue mediatedPrefetchRevenue, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            mediatedPrefetchNetworkWinner = mediatedPrefetchAdapterData.f66486a;
        }
        if ((i & 2) != 0) {
            mediatedPrefetchRevenue = mediatedPrefetchAdapterData.f66487b;
        }
        if ((i & 4) != 0) {
            str = mediatedPrefetchAdapterData.f66488c;
        }
        return mediatedPrefetchAdapterData.copy(mediatedPrefetchNetworkWinner, mediatedPrefetchRevenue, str);
    }

    @NotNull
    public final MediatedPrefetchNetworkWinner component1() {
        return this.f66486a;
    }

    @NotNull
    public final MediatedPrefetchRevenue component2() {
        return this.f66487b;
    }

    @NotNull
    public final String component3() {
        return this.f66488c;
    }

    @NotNull
    public final MediatedPrefetchAdapterData copy(@NotNull MediatedPrefetchNetworkWinner networkWinner, @NotNull MediatedPrefetchRevenue revenue, @NotNull String networkAdInfo) {
        Intrinsics.checkNotNullParameter(networkWinner, "networkWinner");
        Intrinsics.checkNotNullParameter(revenue, "revenue");
        Intrinsics.checkNotNullParameter(networkAdInfo, "networkAdInfo");
        return new MediatedPrefetchAdapterData(networkWinner, revenue, networkAdInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediatedPrefetchAdapterData)) {
            return false;
        }
        MediatedPrefetchAdapterData mediatedPrefetchAdapterData = (MediatedPrefetchAdapterData) obj;
        if (Intrinsics.m17075f(this.f66486a, mediatedPrefetchAdapterData.f66486a) && Intrinsics.m17075f(this.f66487b, mediatedPrefetchAdapterData.f66487b) && Intrinsics.m17075f(this.f66488c, mediatedPrefetchAdapterData.f66488c)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getNetworkAdInfo() {
        return this.f66488c;
    }

    @NotNull
    public final MediatedPrefetchNetworkWinner getNetworkWinner() {
        return this.f66486a;
    }

    @NotNull
    public final MediatedPrefetchRevenue getRevenue() {
        return this.f66487b;
    }

    public int hashCode() {
        int hashCode = this.f66487b.hashCode();
        return this.f66488c.hashCode() + ((hashCode + (this.f66486a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner = this.f66486a;
        MediatedPrefetchRevenue mediatedPrefetchRevenue = this.f66487b;
        String str = this.f66488c;
        return "MediatedPrefetchAdapterData(networkWinner=" + mediatedPrefetchNetworkWinner + ", revenue=" + mediatedPrefetchRevenue + ", networkAdInfo=" + str + ")";
    }
}
