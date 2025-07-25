package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApsMetricsPerfImpressionFiredEvent.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsPerfImpressionFiredEvent extends ApsMetricsPerfEventBase {
    @NotNull
    private final ApsMetricsResult result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsMetricsPerfImpressionFiredEvent(@NotNull ApsMetricsResult result) {
        super(result, 0L, 0L, 6, null);
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    public static /* synthetic */ ApsMetricsPerfImpressionFiredEvent copy$default(ApsMetricsPerfImpressionFiredEvent apsMetricsPerfImpressionFiredEvent, ApsMetricsResult apsMetricsResult, int i, Object obj) {
        if ((i & 1) != 0) {
            apsMetricsResult = apsMetricsPerfImpressionFiredEvent.getResult();
        }
        return apsMetricsPerfImpressionFiredEvent.copy(apsMetricsResult);
    }

    @NotNull
    public final ApsMetricsResult component1() {
        return getResult();
    }

    @NotNull
    public final ApsMetricsPerfImpressionFiredEvent copy(@NotNull ApsMetricsResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new ApsMetricsPerfImpressionFiredEvent(result);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ApsMetricsPerfImpressionFiredEvent) && getResult() == ((ApsMetricsPerfImpressionFiredEvent) obj).getResult()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    @NotNull
    public ApsMetricsResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return getResult().hashCode();
    }

    @NotNull
    public String toString() {
        return "ApsMetricsPerfImpressionFiredEvent(result=" + getResult() + ')';
    }
}
