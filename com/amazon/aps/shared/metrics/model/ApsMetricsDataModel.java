package com.amazon.aps.shared.metrics.model;

import com.amazon.aps.shared.ApsMetrics;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ApsMetricsDataModel.kt */
@Metadata
/* loaded from: classes2.dex */
public class ApsMetricsDataModel {
    @NotNull
    private final ApsMetricsEvent metrics;

    public ApsMetricsDataModel(@NotNull ApsMetricsEvent metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.metrics = metrics;
    }

    @NotNull
    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", 1);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("t", System.currentTimeMillis());
        jSONObject2.put("id", UUID.randomUUID().toString());
        if (this.metrics.isToSendDeviceInfo()) {
            ApsMetrics.Companion companion = ApsMetrics.Companion;
            jSONObject2.put(ApsMetricsDataMap.APSMETRICS_FIELD_DEVICEINFO, companion.getApsMetricsDeviceInfo().toJsonObject());
            jSONObject2.put("s", companion.getApsMetricsSdkInfo().toJsonObject());
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.metrics.toJsonObject());
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_APS, jSONObject2.put("m", jSONArray));
        return jSONObject;
    }
}
