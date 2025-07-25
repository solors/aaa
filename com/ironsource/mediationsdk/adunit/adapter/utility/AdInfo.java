package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C20086i9;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AdInfo {
    private final ImpressionData mImpressionData;

    public AdInfo() {
        this.mImpressionData = null;
    }

    public String getAb() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null && impressionData.getAb() != null) {
            return this.mImpressionData.getAb();
        }
        return "";
    }

    public String getAdNetwork() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null && impressionData.getAdNetwork() != null) {
            return this.mImpressionData.getAdNetwork();
        }
        return "";
    }

    public String getAdUnit() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null && impressionData.getAdUnit() != null) {
            return this.mImpressionData.getAdUnit();
        }
        return "";
    }

    public String getAuctionId() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null && impressionData.getAuctionId() != null) {
            return this.mImpressionData.getAuctionId();
        }
        return "";
    }

    public String getCountry() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null && impressionData.getCountry() != null) {
            return this.mImpressionData.getCountry();
        }
        return "";
    }

    public String getEncryptedCPM() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null && impressionData.getEncryptedCPM() != null) {
            return this.mImpressionData.getEncryptedCPM();
        }
        return "";
    }

    public String getInstanceId() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null && impressionData.getInstanceId() != null) {
            return this.mImpressionData.getInstanceId();
        }
        return "";
    }

    public String getInstanceName() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null && impressionData.getInstanceName() != null) {
            return this.mImpressionData.getInstanceName();
        }
        return "";
    }

    public Double getLifetimeRevenue() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null && impressionData.getLifetimeRevenue() != null) {
            return this.mImpressionData.getLifetimeRevenue();
        }
        return Double.valueOf(0.0d);
    }

    public String getPrecision() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null && impressionData.getPrecision() != null) {
            return this.mImpressionData.getPrecision();
        }
        return "";
    }

    public Double getRevenue() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null && impressionData.getRevenue() != null) {
            return this.mImpressionData.getRevenue();
        }
        return Double.valueOf(0.0d);
    }

    public String getSegmentName() {
        ImpressionData impressionData = this.mImpressionData;
        if (impressionData != null && impressionData.getSegmentName() != null) {
            return this.mImpressionData.getSegmentName();
        }
        return "";
    }

    @NotNull
    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("adUnit", getAdUnit());
            jSONObject.put("country", getCountry());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_ABTEST, getAb());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_SEGMENT_NAME, getSegmentName());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_AD_NETWORK, getAdNetwork());
            jSONObject.put("instanceName", getInstanceName());
            jSONObject.put("instanceId", getInstanceId());
            jSONObject.put("revenue", getRevenue());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_PRECISION, getPrecision());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_LIFETIME_REVENUE, getLifetimeRevenue());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_ENCRYPTED_CPM, getEncryptedCPM());
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("error while parsing ad info " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public AdInfo(@NotNull ImpressionData impressionData) {
        this.mImpressionData = impressionData;
    }
}
