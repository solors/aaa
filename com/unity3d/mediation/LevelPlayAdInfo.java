package com.unity3d.mediation;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class LevelPlayAdInfo {
    @NotNull

    /* renamed from: a */
    private final String f74479a;
    @NotNull

    /* renamed from: b */
    private final String f74480b;
    @Nullable

    /* renamed from: c */
    private final ImpressionData f74481c;
    @Nullable

    /* renamed from: d */
    private final LevelPlayAdSize f74482d;

    public LevelPlayAdInfo(@NotNull String adUnitId, @NotNull String adFormat, @Nullable ImpressionData impressionData, @Nullable LevelPlayAdSize levelPlayAdSize) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f74479a = adUnitId;
        this.f74480b = adFormat;
        this.f74481c = impressionData;
        this.f74482d = levelPlayAdSize;
    }

    /* renamed from: a */
    private final String m37777a() {
        return this.f74479a;
    }

    /* renamed from: b */
    private final String m37776b() {
        return this.f74480b;
    }

    /* renamed from: c */
    private final ImpressionData m37775c() {
        return this.f74481c;
    }

    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, ImpressionData impressionData, LevelPlayAdSize levelPlayAdSize, int i, Object obj) {
        if ((i & 1) != 0) {
            str = levelPlayAdInfo.f74479a;
        }
        if ((i & 2) != 0) {
            str2 = levelPlayAdInfo.f74480b;
        }
        if ((i & 4) != 0) {
            impressionData = levelPlayAdInfo.f74481c;
        }
        if ((i & 8) != 0) {
            levelPlayAdSize = levelPlayAdInfo.f74482d;
        }
        return levelPlayAdInfo.copy(str, str2, impressionData, levelPlayAdSize);
    }

    /* renamed from: d */
    private final LevelPlayAdSize m37774d() {
        return this.f74482d;
    }

    @NotNull
    public final LevelPlayAdInfo copy(@NotNull String adUnitId, @NotNull String adFormat, @Nullable ImpressionData impressionData, @Nullable LevelPlayAdSize levelPlayAdSize) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return new LevelPlayAdInfo(adUnitId, adFormat, impressionData, levelPlayAdSize);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        if (Intrinsics.m17075f(this.f74479a, levelPlayAdInfo.f74479a) && Intrinsics.m17075f(this.f74480b, levelPlayAdInfo.f74480b) && Intrinsics.m17075f(this.f74481c, levelPlayAdInfo.f74481c) && Intrinsics.m17075f(this.f74482d, levelPlayAdInfo.f74482d)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAb() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getAb();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    public final String getAdFormat() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getAdFormat();
        } else {
            str = null;
        }
        if (str == null) {
            return this.f74480b;
        }
        return str;
    }

    @NotNull
    public final String getAdNetwork() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getAdNetwork();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Nullable
    public final LevelPlayAdSize getAdSize() {
        return this.f74482d;
    }

    @NotNull
    public final String getAdUnitId() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getMediationAdUnitId();
        } else {
            str = null;
        }
        if (str == null) {
            return this.f74479a;
        }
        return str;
    }

    @NotNull
    public final String getAdUnitName() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getMediationAdUnitName();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    public final String getAuctionId() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getAuctionId();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    public final String getCountry() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getCountry();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    public final String getEncryptedCPM() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getEncryptedCPM();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    public final String getInstanceId() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getInstanceId();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    public final String getInstanceName() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getInstanceName();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    public final String getPlacementName() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getPlacement();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    public final String getPrecision() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getPrecision();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final double getRevenue() {
        Double d;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            d = impressionData.getRevenue();
        } else {
            d = null;
        }
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    @NotNull
    public final String getSegmentName() {
        String str;
        ImpressionData impressionData = this.f74481c;
        if (impressionData != null) {
            str = impressionData.getSegmentName();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f74479a.hashCode() * 31) + this.f74480b.hashCode()) * 31;
        ImpressionData impressionData = this.f74481c;
        int i = 0;
        if (impressionData == null) {
            hashCode = 0;
        } else {
            hashCode = impressionData.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        LevelPlayAdSize levelPlayAdSize = this.f74482d;
        if (levelPlayAdSize != null) {
            i = levelPlayAdSize.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public String toString() {
        return "adUnitId: " + getAdUnitId() + ", adUnitName: " + getAdUnitName() + ", adSize: " + this.f74482d + ", adFormat: " + getAdFormat() + ", placementName: " + getPlacementName() + ", auctionId: " + getAuctionId() + ", country: " + getCountry() + ", ab: " + getAb() + ", segmentName: " + getSegmentName() + ", adNetwork: " + getAdNetwork() + ", instanceName: " + getInstanceName() + ", instanceId: " + getInstanceId() + ", revenue: " + getRevenue() + ", precision: " + getPrecision() + ", encryptedCPM: " + getEncryptedCPM();
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, ImpressionData impressionData, LevelPlayAdSize levelPlayAdSize, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : impressionData, (i & 8) != 0 ? null : levelPlayAdSize);
    }
}
