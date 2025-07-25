package com.moloco.sdk.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes7.dex */
public final class MolocoAd {
    public static final int $stable = 0;
    @NotNull
    private final String adUnitId;
    @NotNull
    private final String networkName;
    @Nullable
    private final Float revenue;

    public MolocoAd(@NotNull String networkName, @NotNull String adUnitId, @Nullable Float f) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.networkName = networkName;
        this.adUnitId = adUnitId;
        this.revenue = f;
    }

    public static /* synthetic */ MolocoAd copy$default(MolocoAd molocoAd, String str, String str2, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = molocoAd.networkName;
        }
        if ((i & 2) != 0) {
            str2 = molocoAd.adUnitId;
        }
        if ((i & 4) != 0) {
            f = molocoAd.revenue;
        }
        return molocoAd.copy(str, str2, f);
    }

    @NotNull
    public final String component1() {
        return this.networkName;
    }

    @NotNull
    public final String component2() {
        return this.adUnitId;
    }

    @Nullable
    public final Float component3() {
        return this.revenue;
    }

    @NotNull
    public final MolocoAd copy(@NotNull String networkName, @NotNull String adUnitId, @Nullable Float f) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new MolocoAd(networkName, adUnitId, f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MolocoAd)) {
            return false;
        }
        MolocoAd molocoAd = (MolocoAd) obj;
        if (Intrinsics.m17075f(this.networkName, molocoAd.networkName) && Intrinsics.m17075f(this.adUnitId, molocoAd.adUnitId) && Intrinsics.m17075f(this.revenue, molocoAd.revenue)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    public final String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public final Float getRevenue() {
        return this.revenue;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.networkName.hashCode() * 31) + this.adUnitId.hashCode()) * 31;
        Float f = this.revenue;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "MolocoAd(networkName=" + this.networkName + ", adUnitId=" + this.adUnitId + ", revenue=" + this.revenue + ')';
    }

    public /* synthetic */ MolocoAd(String str, String str2, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : f);
    }
}
