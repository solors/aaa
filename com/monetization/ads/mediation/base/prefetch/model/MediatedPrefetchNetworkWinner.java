package com.monetization.ads.mediation.base.prefetch.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class MediatedPrefetchNetworkWinner {
    @NotNull

    /* renamed from: a */
    private final String f66489a;
    @NotNull

    /* renamed from: b */
    private final String f66490b;

    public MediatedPrefetchNetworkWinner(@NotNull String networkName, @NotNull String networkAdUnit) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(networkAdUnit, "networkAdUnit");
        this.f66489a = networkName;
        this.f66490b = networkAdUnit;
    }

    public static /* synthetic */ MediatedPrefetchNetworkWinner copy$default(MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediatedPrefetchNetworkWinner.f66489a;
        }
        if ((i & 2) != 0) {
            str2 = mediatedPrefetchNetworkWinner.f66490b;
        }
        return mediatedPrefetchNetworkWinner.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f66489a;
    }

    @NotNull
    public final String component2() {
        return this.f66490b;
    }

    @NotNull
    public final MediatedPrefetchNetworkWinner copy(@NotNull String networkName, @NotNull String networkAdUnit) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(networkAdUnit, "networkAdUnit");
        return new MediatedPrefetchNetworkWinner(networkName, networkAdUnit);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediatedPrefetchNetworkWinner)) {
            return false;
        }
        MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner = (MediatedPrefetchNetworkWinner) obj;
        if (Intrinsics.m17075f(this.f66489a, mediatedPrefetchNetworkWinner.f66489a) && Intrinsics.m17075f(this.f66490b, mediatedPrefetchNetworkWinner.f66490b)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getNetworkAdUnit() {
        return this.f66490b;
    }

    @NotNull
    public final String getNetworkName() {
        return this.f66489a;
    }

    public int hashCode() {
        return this.f66490b.hashCode() + (this.f66489a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        String str = this.f66489a;
        String str2 = this.f66490b;
        return "MediatedPrefetchNetworkWinner(networkName=" + str + ", networkAdUnit=" + str2 + ")";
    }
}
