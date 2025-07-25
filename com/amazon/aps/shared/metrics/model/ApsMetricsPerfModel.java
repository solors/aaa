package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApsMetricsPerfModel.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsPerfModel extends ApsMetricsEventBase {
    @Nullable
    private ApsMetricsPerfAdClickEvent adClickEvent;
    @Nullable
    private String adFormat;
    @Nullable
    private ApsMetricsPerfAdapterEvent adapterEvent;
    @Nullable
    private ApsMetricsPerfAaxBidEvent bidEvent;
    @Nullable
    private String bidId;
    @Nullable
    private String correlationId;
    @Nullable
    private ApsMetricsPerfAdFetchEvent fetchEvent;
    @Nullable
    private ApsMetricsPerfImpressionFiredEvent impressionEvent;
    @Nullable
    private String networkName;
    @Nullable
    private ApsMetricsPerfVideoCompletedEvent videoCompletedEvent;
    @Nullable
    private Boolean videoFlag;

    public ApsMetricsPerfModel() {
        this(null, 1, null);
    }

    public static /* synthetic */ ApsMetricsPerfModel copy$default(ApsMetricsPerfModel apsMetricsPerfModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apsMetricsPerfModel.networkName;
        }
        return apsMetricsPerfModel.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.networkName;
    }

    @NotNull
    public final ApsMetricsPerfModel copy(@Nullable String str) {
        return new ApsMetricsPerfModel(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ApsMetricsPerfModel) && Intrinsics.m17075f(this.networkName, ((ApsMetricsPerfModel) obj).networkName)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final ApsMetricsPerfAdClickEvent getAdClickEvent() {
        return this.adClickEvent;
    }

    @Nullable
    public final String getAdFormat() {
        return this.adFormat;
    }

    @Nullable
    public final ApsMetricsPerfAdapterEvent getAdapterEvent() {
        return this.adapterEvent;
    }

    @Nullable
    public final ApsMetricsPerfAaxBidEvent getBidEvent() {
        return this.bidEvent;
    }

    @Nullable
    public final String getBidId() {
        return this.bidId;
    }

    @Nullable
    public final String getCorrelationId() {
        return this.correlationId;
    }

    @Nullable
    public final ApsMetricsPerfAdFetchEvent getFetchEvent() {
        return this.fetchEvent;
    }

    @Nullable
    public final ApsMetricsPerfImpressionFiredEvent getImpressionEvent() {
        return this.impressionEvent;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    @NotNull
    public String getJsonKeyName() {
        return "p";
    }

    @Nullable
    public final String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public final ApsMetricsPerfVideoCompletedEvent getVideoCompletedEvent() {
        return this.videoCompletedEvent;
    }

    @Nullable
    public final Boolean getVideoFlag() {
        return this.videoFlag;
    }

    public int hashCode() {
        String str = this.networkName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    public boolean isToSendDeviceInfo() {
        if (this.bidEvent == null && this.adapterEvent == null) {
            return false;
        }
        return true;
    }

    public final void setAdClickEvent(@Nullable ApsMetricsPerfAdClickEvent apsMetricsPerfAdClickEvent) {
        this.adClickEvent = apsMetricsPerfAdClickEvent;
    }

    public final void setAdFormat(@Nullable String str) {
        this.adFormat = str;
    }

    public final void setAdapterEvent(@Nullable ApsMetricsPerfAdapterEvent apsMetricsPerfAdapterEvent) {
        this.adapterEvent = apsMetricsPerfAdapterEvent;
    }

    public final void setBidEvent(@Nullable ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent) {
        this.bidEvent = apsMetricsPerfAaxBidEvent;
    }

    public final void setBidId(@Nullable String str) {
        this.bidId = str;
    }

    public final void setCorrelationId(@Nullable String str) {
        this.correlationId = str;
    }

    public final void setFetchEvent(@Nullable ApsMetricsPerfAdFetchEvent apsMetricsPerfAdFetchEvent) {
        this.fetchEvent = apsMetricsPerfAdFetchEvent;
    }

    public final void setImpressionEvent(@Nullable ApsMetricsPerfImpressionFiredEvent apsMetricsPerfImpressionFiredEvent) {
        this.impressionEvent = apsMetricsPerfImpressionFiredEvent;
    }

    public final void setNetworkName(@Nullable String str) {
        this.networkName = str;
    }

    public final void setVideoCompletedEvent(@Nullable ApsMetricsPerfVideoCompletedEvent apsMetricsPerfVideoCompletedEvent) {
        this.videoCompletedEvent = apsMetricsPerfVideoCompletedEvent;
    }

    public final void setVideoFlag(@Nullable Boolean bool) {
        this.videoFlag = bool;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    @NotNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        String networkName = getNetworkName();
        if (networkName != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_NETWORK, networkName);
        }
        if (getBidId() != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_BIDID, getBidId());
        }
        String correlationId = getCorrelationId();
        if (correlationId != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CORRELATIONID, correlationId);
        }
        Boolean videoFlag = getVideoFlag();
        if (videoFlag != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, videoFlag.booleanValue());
        }
        String adFormat = getAdFormat();
        if (adFormat != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, adFormat);
        }
        ApsMetricsPerfAaxBidEvent bidEvent = getBidEvent();
        if (bidEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_BIDEVENT, bidEvent.toJsonObject());
        }
        ApsMetricsPerfAdapterEvent adapterEvent = getAdapterEvent();
        if (adapterEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT, adapterEvent.toJsonObject());
        }
        ApsMetricsPerfAdFetchEvent fetchEvent = getFetchEvent();
        if (fetchEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_FETCHEVENT, fetchEvent.toJsonObject());
        }
        ApsMetricsPerfImpressionFiredEvent impressionEvent = getImpressionEvent();
        if (impressionEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, impressionEvent.toJsonObject());
        }
        ApsMetricsPerfAdClickEvent adClickEvent = getAdClickEvent();
        if (adClickEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADCLICKEVENT, adClickEvent.toJsonObject());
        }
        ApsMetricsPerfVideoCompletedEvent videoCompletedEvent = getVideoCompletedEvent();
        if (videoCompletedEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOCOMPLETEDEVENT, videoCompletedEvent.toJsonObject());
        }
        return jsonObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsPerfModel(networkName=" + ((Object) this.networkName) + ')';
    }

    public /* synthetic */ ApsMetricsPerfModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public ApsMetricsPerfModel(@Nullable String str) {
        super(0L, 1, null);
        this.networkName = str;
    }
}
