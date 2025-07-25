package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: ApsMetricsEventBase.kt */
@Metadata
/* loaded from: classes2.dex */
public abstract class ApsMetricsEventBase {
    private final long timestamp;

    public ApsMetricsEventBase() {
        this(0L, 1, null);
    }

    @NotNull
    public abstract String getJsonKeyName();

    public boolean isToSendDeviceInfo() {
        return false;
    }

    @NotNull
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", this.timestamp);
        return jSONObject;
    }

    public ApsMetricsEventBase(long j) {
        this.timestamp = j;
    }

    public /* synthetic */ ApsMetricsEventBase(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? System.currentTimeMillis() : j);
    }
}
