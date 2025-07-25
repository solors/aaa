package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionEvent.kt */
@Metadata
/* loaded from: classes4.dex */
public final class DataCollectionStatus {
    @NotNull

    /* renamed from: a */
    private final DataCollectionState f43685a;
    @NotNull

    /* renamed from: b */
    private final DataCollectionState f43686b;

    /* renamed from: c */
    private final double f43687c;

    public DataCollectionStatus() {
        this(null, null, 0.0d, 7, null);
    }

    public static /* synthetic */ DataCollectionStatus copy$default(DataCollectionStatus dataCollectionStatus, DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            dataCollectionState = dataCollectionStatus.f43685a;
        }
        if ((i & 2) != 0) {
            dataCollectionState2 = dataCollectionStatus.f43686b;
        }
        if ((i & 4) != 0) {
            d = dataCollectionStatus.f43687c;
        }
        return dataCollectionStatus.copy(dataCollectionState, dataCollectionState2, d);
    }

    @NotNull
    public final DataCollectionState component1() {
        return this.f43685a;
    }

    @NotNull
    public final DataCollectionState component2() {
        return this.f43686b;
    }

    public final double component3() {
        return this.f43687c;
    }

    @NotNull
    public final DataCollectionStatus copy(@NotNull DataCollectionState performance, @NotNull DataCollectionState crashlytics, double d) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        return new DataCollectionStatus(performance, crashlytics, d);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCollectionStatus)) {
            return false;
        }
        DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
        if (this.f43685a == dataCollectionStatus.f43685a && this.f43686b == dataCollectionStatus.f43686b && Double.compare(this.f43687c, dataCollectionStatus.f43687c) == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public final DataCollectionState getCrashlytics() {
        return this.f43686b;
    }

    @NotNull
    public final DataCollectionState getPerformance() {
        return this.f43685a;
    }

    public final double getSessionSamplingRate() {
        return this.f43687c;
    }

    public int hashCode() {
        return (((this.f43685a.hashCode() * 31) + this.f43686b.hashCode()) * 31) + Double.hashCode(this.f43687c);
    }

    @NotNull
    public String toString() {
        return "DataCollectionStatus(performance=" + this.f43685a + ", crashlytics=" + this.f43686b + ", sessionSamplingRate=" + this.f43687c + ')';
    }

    public DataCollectionStatus(@NotNull DataCollectionState performance, @NotNull DataCollectionState crashlytics, double d) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f43685a = performance;
        this.f43686b = crashlytics;
        this.f43687c = d;
    }

    public /* synthetic */ DataCollectionStatus(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState, (i & 2) != 0 ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState2, (i & 4) != 0 ? 1.0d : d);
    }
}
