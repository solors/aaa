package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApsMetricsPerfAdClickEvent.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsPerfAdClickEvent extends ApsMetricsPerfEventBase {
    private final long timestamp;

    public ApsMetricsPerfAdClickEvent(long j) {
        super(null, j, 0L, 5, null);
        this.timestamp = j;
    }

    private final long component1() {
        return this.timestamp;
    }

    public static /* synthetic */ ApsMetricsPerfAdClickEvent copy$default(ApsMetricsPerfAdClickEvent apsMetricsPerfAdClickEvent, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = apsMetricsPerfAdClickEvent.timestamp;
        }
        return apsMetricsPerfAdClickEvent.copy(j);
    }

    @NotNull
    public final ApsMetricsPerfAdClickEvent copy(long j) {
        return new ApsMetricsPerfAdClickEvent(j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ApsMetricsPerfAdClickEvent) && this.timestamp == ((ApsMetricsPerfAdClickEvent) obj).timestamp) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "ApsMetricsPerfAdClickEvent(timestamp=" + this.timestamp + ')';
    }
}
