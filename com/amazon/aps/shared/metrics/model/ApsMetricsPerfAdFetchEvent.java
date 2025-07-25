package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApsMetricsPerfAdFetchEvent.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsPerfAdFetchEvent extends ApsMetricsPerfEventBase {
    @Nullable
    private ApsMetricsResult result;
    @Nullable
    private String url;

    public ApsMetricsPerfAdFetchEvent() {
        this(null, 1, null);
    }

    public static /* synthetic */ ApsMetricsPerfAdFetchEvent copy$default(ApsMetricsPerfAdFetchEvent apsMetricsPerfAdFetchEvent, ApsMetricsResult apsMetricsResult, int i, Object obj) {
        if ((i & 1) != 0) {
            apsMetricsResult = apsMetricsPerfAdFetchEvent.getResult();
        }
        return apsMetricsPerfAdFetchEvent.copy(apsMetricsResult);
    }

    @Nullable
    public final ApsMetricsResult component1() {
        return getResult();
    }

    @NotNull
    public final ApsMetricsPerfAdFetchEvent copy(@Nullable ApsMetricsResult apsMetricsResult) {
        return new ApsMetricsPerfAdFetchEvent(apsMetricsResult);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ApsMetricsPerfAdFetchEvent) && getResult() == ((ApsMetricsPerfAdFetchEvent) obj).getResult()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    @Nullable
    public ApsMetricsResult getResult() {
        return this.result;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        if (getResult() == null) {
            return 0;
        }
        return getResult().hashCode();
    }

    public void setResult(@Nullable ApsMetricsResult apsMetricsResult) {
        this.result = apsMetricsResult;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    @NotNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        String url = getUrl();
        if (url != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_URL, url);
        }
        return jsonObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsPerfAdFetchEvent(result=" + getResult() + ')';
    }

    public /* synthetic */ ApsMetricsPerfAdFetchEvent(ApsMetricsResult apsMetricsResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apsMetricsResult);
    }

    public ApsMetricsPerfAdFetchEvent(@Nullable ApsMetricsResult apsMetricsResult) {
        super(apsMetricsResult, 0L, 0L, 6, null);
        this.result = apsMetricsResult;
    }
}
