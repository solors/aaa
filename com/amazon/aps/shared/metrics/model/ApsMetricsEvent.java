package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApsMetricsEvent.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsEvent {
    @NotNull
    private final ApsMetricsEventBase metricsEvent;

    public ApsMetricsEvent(@NotNull ApsMetricsEventBase metricsEvent) {
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        this.metricsEvent = metricsEvent;
    }

    private final ApsMetricsEventBase component1() {
        return this.metricsEvent;
    }

    public static /* synthetic */ ApsMetricsEvent copy$default(ApsMetricsEvent apsMetricsEvent, ApsMetricsEventBase apsMetricsEventBase, int i, Object obj) {
        if ((i & 1) != 0) {
            apsMetricsEventBase = apsMetricsEvent.metricsEvent;
        }
        return apsMetricsEvent.copy(apsMetricsEventBase);
    }

    @NotNull
    public final ApsMetricsEvent copy(@NotNull ApsMetricsEventBase metricsEvent) {
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        return new ApsMetricsEvent(metricsEvent);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ApsMetricsEvent) && Intrinsics.m17075f(this.metricsEvent, ((ApsMetricsEvent) obj).metricsEvent)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.metricsEvent.hashCode();
    }

    public final boolean isToSendDeviceInfo() {
        return this.metricsEvent.isToSendDeviceInfo();
    }

    @NotNull
    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        ApsMetricsEventBase apsMetricsEventBase = this.metricsEvent;
        jSONObject.put(apsMetricsEventBase.getJsonKeyName(), apsMetricsEventBase.toJsonObject());
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsEvent(metricsEvent=" + this.metricsEvent + ')';
    }
}
