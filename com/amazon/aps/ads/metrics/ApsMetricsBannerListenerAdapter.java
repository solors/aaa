package com.amazon.aps.ads.metrics;

import com.amazon.device.ads.DTBAdBannerListener;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApsMetricsBannerListenerAdapter.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsBannerListenerAdapter extends ApsMetricsAdListenerAdapterBase implements DTBAdBannerListener {
    @Nullable
    private String bidId;
    @Nullable
    private final DTBAdBannerListener listener;

    public ApsMetricsBannerListenerAdapter(@Nullable String str, @Nullable DTBAdBannerListener dTBAdBannerListener) {
        super(str, dTBAdBannerListener);
        this.bidId = str;
        this.listener = dTBAdBannerListener;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    @Nullable
    public String getBidId() {
        return this.bidId;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    public void setBidId(@Nullable String str) {
        this.bidId = str;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    @Nullable
    public DTBAdBannerListener getListener() {
        return this.listener;
    }
}
