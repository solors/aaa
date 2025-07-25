package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApsMetricsCustomModel.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsCustomModel extends ApsMetricsEventBase {
    @NotNull
    private final ApsMetricsCustomEventInfo event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsMetricsCustomModel(@NotNull ApsMetricsCustomEventInfo event) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(event, "event");
        this.event = event;
    }

    private final ApsMetricsCustomEventInfo component1() {
        return this.event;
    }

    public static /* synthetic */ ApsMetricsCustomModel copy$default(ApsMetricsCustomModel apsMetricsCustomModel, ApsMetricsCustomEventInfo apsMetricsCustomEventInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            apsMetricsCustomEventInfo = apsMetricsCustomModel.event;
        }
        return apsMetricsCustomModel.copy(apsMetricsCustomEventInfo);
    }

    @NotNull
    public final ApsMetricsCustomModel copy(@NotNull ApsMetricsCustomEventInfo event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new ApsMetricsCustomModel(event);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ApsMetricsCustomModel) && Intrinsics.m17075f(this.event, ((ApsMetricsCustomModel) obj).event)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    @NotNull
    public String getJsonKeyName() {
        return ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM;
    }

    public int hashCode() {
        return this.event.hashCode();
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    public boolean isToSendDeviceInfo() {
        return true;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    @NotNull
    public JSONObject toJsonObject() {
        return this.event.toJsonObject();
    }

    @NotNull
    public String toString() {
        return "ApsMetricsCustomModel(event=" + this.event + ')';
    }
}
