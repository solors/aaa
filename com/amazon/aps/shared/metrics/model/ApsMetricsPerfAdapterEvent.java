package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApsMetricsPerfAdapterEvent.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsPerfAdapterEvent extends ApsMetricsPerfEventBase {
    @Nullable
    private ApsMetricsResult result;

    public ApsMetricsPerfAdapterEvent() {
        this(null, 1, null);
    }

    public static /* synthetic */ ApsMetricsPerfAdapterEvent copy$default(ApsMetricsPerfAdapterEvent apsMetricsPerfAdapterEvent, ApsMetricsResult apsMetricsResult, int i, Object obj) {
        if ((i & 1) != 0) {
            apsMetricsResult = apsMetricsPerfAdapterEvent.getResult();
        }
        return apsMetricsPerfAdapterEvent.copy(apsMetricsResult);
    }

    @Nullable
    public final ApsMetricsResult component1() {
        return getResult();
    }

    @NotNull
    public final ApsMetricsPerfAdapterEvent copy(@Nullable ApsMetricsResult apsMetricsResult) {
        return new ApsMetricsPerfAdapterEvent(apsMetricsResult);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ApsMetricsPerfAdapterEvent) && getResult() == ((ApsMetricsPerfAdapterEvent) obj).getResult()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    @Nullable
    public ApsMetricsResult getResult() {
        return this.result;
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

    @NotNull
    public String toString() {
        return "ApsMetricsPerfAdapterEvent(result=" + getResult() + ')';
    }

    public /* synthetic */ ApsMetricsPerfAdapterEvent(ApsMetricsResult apsMetricsResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apsMetricsResult);
    }

    public ApsMetricsPerfAdapterEvent(@Nullable ApsMetricsResult apsMetricsResult) {
        super(apsMetricsResult, 0L, 0L, 6, null);
        this.result = apsMetricsResult;
    }
}
