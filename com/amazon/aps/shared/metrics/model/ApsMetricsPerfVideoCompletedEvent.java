package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApsMetricsPerfVideoCompletedEvent.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsPerfVideoCompletedEvent extends ApsMetricsPerfEventBase {
    private final long timestamp;

    public ApsMetricsPerfVideoCompletedEvent(long j) {
        super(null, j, 0L, 5, null);
        this.timestamp = j;
    }

    private final long component1() {
        return this.timestamp;
    }

    public static /* synthetic */ ApsMetricsPerfVideoCompletedEvent copy$default(ApsMetricsPerfVideoCompletedEvent apsMetricsPerfVideoCompletedEvent, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = apsMetricsPerfVideoCompletedEvent.timestamp;
        }
        return apsMetricsPerfVideoCompletedEvent.copy(j);
    }

    @NotNull
    public final ApsMetricsPerfVideoCompletedEvent copy(long j) {
        return new ApsMetricsPerfVideoCompletedEvent(j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ApsMetricsPerfVideoCompletedEvent) && this.timestamp == ((ApsMetricsPerfVideoCompletedEvent) obj).timestamp) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "ApsMetricsPerfVideoCompletedEvent(timestamp=" + this.timestamp + ')';
    }
}
