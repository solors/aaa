package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApsMetricsPerfAaxBidEvent.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsPerfAaxBidEvent extends ApsMetricsPerfEventBase {
    @NotNull
    private final String hostname;
    @Nullable
    private Boolean refreshFlag;
    @NotNull
    private final ApsMetricsResult result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsMetricsPerfAaxBidEvent(@NotNull ApsMetricsResult result, @NotNull String hostname) {
        super(result, 0L, 0L, 6, null);
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        this.result = result;
        this.hostname = hostname;
    }

    public static /* synthetic */ ApsMetricsPerfAaxBidEvent copy$default(ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent, ApsMetricsResult apsMetricsResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            apsMetricsResult = apsMetricsPerfAaxBidEvent.getResult();
        }
        if ((i & 2) != 0) {
            str = apsMetricsPerfAaxBidEvent.hostname;
        }
        return apsMetricsPerfAaxBidEvent.copy(apsMetricsResult, str);
    }

    @NotNull
    public final ApsMetricsResult component1() {
        return getResult();
    }

    @NotNull
    public final String component2() {
        return this.hostname;
    }

    @NotNull
    public final ApsMetricsPerfAaxBidEvent copy(@NotNull ApsMetricsResult result, @NotNull String hostname) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return new ApsMetricsPerfAaxBidEvent(result, hostname);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApsMetricsPerfAaxBidEvent)) {
            return false;
        }
        ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent = (ApsMetricsPerfAaxBidEvent) obj;
        if (getResult() == apsMetricsPerfAaxBidEvent.getResult() && Intrinsics.m17075f(this.hostname, apsMetricsPerfAaxBidEvent.hostname)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getHostname() {
        return this.hostname;
    }

    @Nullable
    public final Boolean getRefreshFlag() {
        return this.refreshFlag;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    @NotNull
    public ApsMetricsResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return (getResult().hashCode() * 31) + this.hostname.hashCode();
    }

    public final void setRefreshFlag(@Nullable Boolean bool) {
        this.refreshFlag = bool;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    @NotNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put("h", getHostname());
        Boolean refreshFlag = getRefreshFlag();
        if (refreshFlag != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_REFRESHFLAG, refreshFlag.booleanValue());
        }
        return jsonObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsPerfAaxBidEvent(result=" + getResult() + ", hostname=" + this.hostname + ')';
    }
}
