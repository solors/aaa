package com.amazon.aps.ads;

import android.os.Bundle;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.util.adview.ApsAdViewImpl;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.amazon.device.ads.SDKUtilities;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class ApsAd extends DTBAdResponse {
    private static final String INSTREAM_VIDEO_INVENTORY_TYPE = "MOBILE_VIDEO";
    private static final String INTERSTITIAL_VIDEO_INVENTORY_TYPE = "MOBILE_INTERSTITIAL";
    private static final String REWARDED_INVENTORY_TYPE = "MOBILE_APP_REWARDED";
    private WeakReference<ApsAdViewImpl> adViewWeakReference;
    private ApsAdFormat apsAdFormatFromRequest;
    private ApsAdRequest apsAdRequest;
    int height;
    private String slotUuid;
    int width;

    public ApsAd(DTBAdResponse dTBAdResponse) {
        super(dTBAdResponse);
        this.height = -1;
        this.width = -1;
        setApsAdFormatAndSlotUuid(dTBAdResponse);
        setSlotUuid(dTBAdResponse);
    }

    private void setApsAdFormat(ApsAdFormat apsAdFormat) {
        if (apsAdFormat != null) {
            this.apsAdFormatFromRequest = apsAdFormat;
            this.height = ApsAdFormatUtils.getHeight(apsAdFormat);
            this.width = ApsAdFormatUtils.getWidth(apsAdFormat);
        }
    }

    public ApsAdViewImpl getAdView() {
        WeakReference<ApsAdViewImpl> weakReference = this.adViewWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public ApsAdFormat getApsAdFormat() {
        if (DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.FEATURE_AD_FORMAT_FROM_AAX)) {
            try {
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error in parsing the ad format in ApsAd - getApsAdFormat", e);
            }
            if (isVideo()) {
                if (REWARDED_INVENTORY_TYPE.equalsIgnoreCase(this.videoInventoryType)) {
                    return ApsAdFormat.REWARDED_VIDEO;
                }
                if (INSTREAM_VIDEO_INVENTORY_TYPE.equalsIgnoreCase(this.videoInventoryType)) {
                    return ApsAdFormat.INSTREAM_VIDEO;
                }
                return ApsAdFormat.INTERSTITIAL;
            }
            int i = this.width;
            if (i == -1) {
                i = getWidthFromAax();
            }
            this.width = i;
            int i2 = this.height;
            if (i2 == -1) {
                i2 = getHeightFromAax();
            }
            this.height = i2;
            if (i2 == 50 && this.width == 320) {
                return ApsAdFormat.BANNER;
            }
            if (i2 == 250 && this.width == 300) {
                return ApsAdFormat.MREC;
            }
            if (i2 == 90 && this.width == 728) {
                return ApsAdFormat.LEADERBOARD;
            }
            if (i2 == 9999 && this.width == 9999) {
                return ApsAdFormat.INTERSTITIAL;
            }
            APSEventSeverity aPSEventSeverity = APSEventSeverity.FATAL;
            APSEventType aPSEventType = APSEventType.LOG;
            APSAnalytics.logEvent(aPSEventSeverity, aPSEventType, "Invalid ad format received from the AAX in ApsAd - getApsAdFormat:" + this.width + ":" + this.height);
        }
        return this.apsAdFormatFromRequest;
    }

    public ApsAdRequest getApsAdRequest() {
        if (this.apsAdRequest == null) {
            DTBAdRequest dTBAdRequest = this.refreshLoader;
            if (dTBAdRequest instanceof ApsAdRequest) {
                this.apsAdRequest = (ApsAdRequest) dTBAdRequest;
            } else if (dTBAdRequest != null) {
                setApsAdRequest(new ApsAdRequest(this.refreshLoader));
            }
        }
        return this.apsAdRequest;
    }

    public String getBidInfo() {
        return SDKUtilities.getBidInfo(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getHeightFromAax() {
        try {
            return getDTBAds().get(0).getHeight();
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error getting the height from ApsAd", e);
            return -1;
        }
    }

    public String getPricePoint() {
        try {
            return SDKUtilities.getPricePoint(this);
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error getting the price point from ApsAd", e);
            return null;
        }
    }

    public String getSlotUuid() {
        return this.slotUuid;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getWidthFromAax() {
        try {
            return getDTBAds().get(0).getWidth();
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error getting the width from ApsAd", e);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAdView(ApsAdViewImpl apsAdViewImpl) {
        this.adViewWeakReference = new WeakReference<>(apsAdViewImpl);
    }

    void setApsAdFormatAndSlotUuid(DTBAdResponse dTBAdResponse) {
        DTBAdSize dTBAdSize;
        if (dTBAdResponse != null && dTBAdResponse.getDTBAds() != null && dTBAdResponse.getDTBAds().size() > 0 && (dTBAdSize = dTBAdResponse.getDTBAds().get(0)) != null) {
            String slotUUID = dTBAdSize.getSlotUUID();
            ApsAdFormat adFormat = ApsAdFormatUtils.getAdFormat(dTBAdSize.getDTBAdType(), dTBAdSize.getHeight(), dTBAdSize.getWidth());
            this.slotUuid = slotUUID;
            setApsAdFormat(adFormat);
        }
    }

    void setApsAdRequest(ApsAdRequest apsAdRequest) {
        this.apsAdRequest = apsAdRequest;
    }

    void setSlotUuid(DTBAdResponse dTBAdResponse) {
        try {
            this.slotUuid = dTBAdResponse.getDTBAds().get(0).getSlotUUID();
        } catch (Exception e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error in setting up slot id in ApsAd", e);
        }
    }

    @Override // com.amazon.device.ads.DTBAdResponse
    public ApsAdRequest getAdLoader() {
        return getApsAdRequest();
    }

    public void setSlotUuid(String str) {
        this.slotUuid = str;
    }

    public ApsAd(DTBAdResponse dTBAdResponse, ApsAdFormat apsAdFormat) {
        super(dTBAdResponse);
        this.height = -1;
        this.width = -1;
        setApsAdFormat(apsAdFormat);
        setSlotUuid(dTBAdResponse);
    }

    public ApsAd(Bundle bundle, ApsAdFormat apsAdFormat) {
        super(bundle);
        this.height = -1;
        this.width = -1;
        setApsAdFormat(apsAdFormat);
    }

    public ApsAd(String str, ApsAdFormat apsAdFormat) {
        super(str);
        this.height = -1;
        this.width = -1;
        setApsAdFormat(apsAdFormat);
    }
}
