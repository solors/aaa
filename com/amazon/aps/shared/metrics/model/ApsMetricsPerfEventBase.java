package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApsMetricsPerfEventBase.kt */
@Metadata
/* loaded from: classes2.dex */
public class ApsMetricsPerfEventBase {
    private long endTime;
    @Nullable
    private final ApsMetricsResult result;
    private long startTime;

    public ApsMetricsPerfEventBase() {
        this(null, 0L, 0L, 7, null);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public ApsMetricsResult getResult() {
        return this.result;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    @NotNull
    public JSONObject toJsonObject() {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        ApsMetricsResult result = getResult();
        if (result != null) {
            if (result == ApsMetricsResult.Success) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("r", z);
        }
        if (getStartTime() != 0) {
            jSONObject.put("st", getStartTime());
        }
        if (getEndTime() != 0) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ENDTIME, getEndTime());
        }
        return jSONObject;
    }

    public ApsMetricsPerfEventBase(@Nullable ApsMetricsResult apsMetricsResult, long j, long j2) {
        this.result = apsMetricsResult;
        this.startTime = j;
        this.endTime = j2;
    }

    public /* synthetic */ ApsMetricsPerfEventBase(ApsMetricsResult apsMetricsResult, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apsMetricsResult, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2);
    }
}
