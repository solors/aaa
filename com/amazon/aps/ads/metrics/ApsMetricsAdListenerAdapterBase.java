package com.amazon.aps.ads.metrics;

import android.view.View;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.metrics.ApsMetricsPerfEventModelBuilder;
import com.amazon.aps.shared.metrics.model.ApsMetricsResult;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBMetricsConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApsMetricsAdListenerAdapterBase.kt */
@Metadata
/* loaded from: classes2.dex */
public class ApsMetricsAdListenerAdapterBase implements DTBAdListener {
    @Nullable
    private String bidId;
    @Nullable
    private final DTBAdListener listener;

    public ApsMetricsAdListenerAdapterBase(@Nullable String str, @Nullable DTBAdListener dTBAdListener) {
        this.bidId = str;
        this.listener = dTBAdListener;
    }

    @Nullable
    public String getBidId() {
        return this.bidId;
    }

    @Nullable
    public DTBAdListener getListener() {
        return this.listener;
    }

    public final boolean isAllowedToCaptureExtendedMetrics() {
        return DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.FEATURE_APSMETRICS_EXTENDED_METRICS, false);
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClicked(@Nullable View view) {
        long currentTimeMillis = System.currentTimeMillis();
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdClicked(view);
        }
        if (isAllowedToCaptureExtendedMetrics()) {
            ApsMetrics.Companion.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdClickEvent(currentTimeMillis));
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClosed(@Nullable View view) {
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdClosed(view);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdError(@Nullable View view) {
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdError(view);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdFailed(@Nullable View view) {
        long currentTimeMillis = System.currentTimeMillis();
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdFailed(view);
        }
        ApsMetrics.Companion.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdFetchEndTime(ApsMetricsResult.Failure, currentTimeMillis));
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdLeftApplication(@Nullable View view) {
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdLeftApplication(view);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdLoaded(@Nullable View view) {
        long currentTimeMillis = System.currentTimeMillis();
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdLoaded(view);
        }
        ApsMetrics.Companion.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdFetchEndTime(ApsMetricsResult.Success, currentTimeMillis));
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdOpen(@Nullable View view) {
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdOpen(view);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onImpressionFired(@Nullable View view) {
        long currentTimeMillis = System.currentTimeMillis();
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onImpressionFired(view);
        }
        ApsMetrics.Companion.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdImpressionEndTime(ApsMetricsResult.Success, currentTimeMillis));
    }

    public void setBidId(@Nullable String str) {
        this.bidId = str;
    }
}
