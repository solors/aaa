package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.protobuf.ResponsePayload;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class AdRequestParameters {
    @NonNull
    private final AdsFormat adsFormat;
    @Nullable
    private ResponsePayload bidPayload;
    @Nullable
    private CustomParams customParams;
    @Nullable
    private List<NetworkConfig> networkConfigList;
    @Nullable
    private String placementId;
    @Nullable
    private PriceFloorParams priceFloorParams;
    @Nullable
    private SessionAdParams sessionAdParams;
    @Nullable
    private TargetingParams targetingParams;
    @Nullable
    private Integer timeOutMs;

    public AdRequestParameters(@NonNull AdsFormat adsFormat) {
        this.adsFormat = adsFormat;
    }

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    @NonNull
    public AdsType getAdsType() {
        return this.adsFormat.getAdsType();
    }

    @Nullable
    public ResponsePayload getBidPayload() {
        return this.bidPayload;
    }

    @Nullable
    public CustomParams getCustomParams() {
        return this.customParams;
    }

    @Nullable
    public List<NetworkConfig> getNetworkConfigList() {
        return this.networkConfigList;
    }

    @Nullable
    public String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public PriceFloorParams getPriceFloorParams() {
        return this.priceFloorParams;
    }

    @Nullable
    public SessionAdParams getSessionAdParams() {
        return this.sessionAdParams;
    }

    @Nullable
    public TargetingParams getTargetingParams() {
        return this.targetingParams;
    }

    @Nullable
    public Integer getTimeOutMs() {
        return this.timeOutMs;
    }

    public boolean isParametersMatched(@NonNull AdRequestParameters adRequestParameters) {
        if (getAdsType() == adRequestParameters.getAdsType()) {
            return true;
        }
        return false;
    }

    public abstract boolean isPlacementObjectValid(@NonNull Placement placement) throws Throwable;

    public boolean isPricePassedByPriceFloor(double d) {
        PriceFloorParams priceFloorParams = this.priceFloorParams;
        if (priceFloorParams == null) {
            return true;
        }
        Map<String, Double> priceFloors = priceFloorParams.getPriceFloors();
        if (priceFloors.isEmpty()) {
            return true;
        }
        Iterator<Double> it = priceFloors.values().iterator();
        while (it.hasNext()) {
            if (d > it.next().doubleValue()) {
                return true;
            }
        }
        return false;
    }

    public void setBidPayload(@Nullable ResponsePayload responsePayload) {
        this.bidPayload = responsePayload;
    }

    public void setCustomParams(@Nullable CustomParams customParams) {
        this.customParams = customParams;
    }

    public void setNetworkConfigList(@Nullable List<NetworkConfig> list) {
        this.networkConfigList = list;
    }

    public void setPlacementId(@Nullable String str) {
        this.placementId = str;
    }

    public void setPriceFloorParams(@Nullable PriceFloorParams priceFloorParams) {
        this.priceFloorParams = priceFloorParams;
    }

    public void setSessionAdParams(@Nullable SessionAdParams sessionAdParams) {
        this.sessionAdParams = sessionAdParams;
    }

    public void setTargetingParams(@Nullable TargetingParams targetingParams) {
        this.targetingParams = targetingParams;
    }

    public void setTimeOutMs(@Nullable Integer num) {
        this.timeOutMs = num;
    }
}
