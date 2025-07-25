package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.common.CustomParams;
import com.p551my.target.mediation.AdNetworkConfig;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.j */
/* loaded from: classes7.dex */
public final class C25832j {
    private int bannersCount;
    @Nullable
    private String bidId;
    @NonNull
    private volatile String format;
    private int slotId;
    @NonNull
    private final CustomParams customParams = new CustomParams();
    @NonNull
    private final Map<String, AdNetworkConfig> adNetworkConfigs = Collections.synchronizedMap(new HashMap());
    private long cachePeriod = 86400000;
    private boolean mediationEnabled = true;
    private boolean refreshAd = true;
    private int videoQuality = 360;
    private int cachePolicy = 0;

    private C25832j(int i, @NonNull String str) {
        this.slotId = i;
        this.format = str;
    }

    @NonNull
    public static C25832j newConfig(int i, @NonNull String str) {
        return new C25832j(i, str);
    }

    @Nullable
    public AdNetworkConfig getAdNetworkConfig(@NonNull String str) {
        return this.adNetworkConfigs.get(str.toLowerCase());
    }

    @NonNull
    public Collection<AdNetworkConfig> getAdNetworkConfigs() {
        return this.adNetworkConfigs.values();
    }

    public int getBannersCount() {
        return this.bannersCount;
    }

    @Nullable
    public String getBidId() {
        return this.bidId;
    }

    public long getCachePeriod() {
        return this.cachePeriod;
    }

    public int getCachePolicy() {
        return this.cachePolicy;
    }

    @NonNull
    public CustomParams getCustomParams() {
        return this.customParams;
    }

    @NonNull
    public String getFormat() {
        return this.format;
    }

    public int getSlotId() {
        return this.slotId;
    }

    public int getVideoQuality() {
        return this.videoQuality;
    }

    public boolean isMediationEnabled() {
        return this.mediationEnabled;
    }

    public boolean isRefreshAd() {
        return this.refreshAd;
    }

    public void setAdNetworkConfig(@NonNull String str, @NonNull AdNetworkConfig adNetworkConfig) {
        this.adNetworkConfigs.put(str.toLowerCase(), adNetworkConfig);
    }

    public void setBannersCount(int i) {
        this.bannersCount = i;
    }

    public void setBidId(@Nullable String str) {
        this.bidId = str;
    }

    public void setCachePeriod(long j) {
        if (j < 0) {
            this.cachePeriod = 0L;
        } else {
            this.cachePeriod = j;
        }
    }

    public void setCachePolicy(int i) {
        this.cachePolicy = i;
    }

    public void setFormat(@NonNull String str) {
        this.format = str;
    }

    public void setMediationEnabled(boolean z) {
        this.mediationEnabled = z;
    }

    public void setRefreshAd(boolean z) {
        this.refreshAd = z;
    }

    public void setSlotId(int i) {
        this.slotId = i;
    }

    public void setVideoQuality(int i) {
        this.videoQuality = i;
    }
}
