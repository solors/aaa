package com.unity3d.ironsourceads.banner;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class BannerAdInfo {
    @NotNull

    /* renamed from: a */
    private final String f74432a;
    @NotNull

    /* renamed from: b */
    private final String f74433b;

    public BannerAdInfo(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f74432a = instanceId;
        this.f74433b = adId;
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerAdInfo.f74432a;
        }
        if ((i & 2) != 0) {
            str2 = bannerAdInfo.f74433b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f74432a;
    }

    @NotNull
    public final String component2() {
        return this.f74433b;
    }

    @NotNull
    public final BannerAdInfo copy(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return new BannerAdInfo(instanceId, adId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        if (Intrinsics.m17075f(this.f74432a, bannerAdInfo.f74432a) && Intrinsics.m17075f(this.f74433b, bannerAdInfo.f74433b)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAdId() {
        return this.f74433b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f74432a;
    }

    public int hashCode() {
        return (this.f74432a.hashCode() * 31) + this.f74433b.hashCode();
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.f74432a + "', adId: '" + this.f74433b + "']";
    }
}
