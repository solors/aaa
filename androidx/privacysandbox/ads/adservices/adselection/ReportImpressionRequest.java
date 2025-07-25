package androidx.privacysandbox.ads.adservices.adselection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReportImpressionRequest.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ReportImpressionRequest {
    @NotNull
    private final AdSelectionConfig adSelectionConfig;
    private final long adSelectionId;

    public ReportImpressionRequest(long j, @NotNull AdSelectionConfig adSelectionConfig) {
        Intrinsics.checkNotNullParameter(adSelectionConfig, "adSelectionConfig");
        this.adSelectionId = j;
        this.adSelectionConfig = adSelectionConfig;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportImpressionRequest)) {
            return false;
        }
        ReportImpressionRequest reportImpressionRequest = (ReportImpressionRequest) obj;
        if (this.adSelectionId == reportImpressionRequest.adSelectionId && Intrinsics.m17075f(this.adSelectionConfig, reportImpressionRequest.adSelectionConfig)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final AdSelectionConfig getAdSelectionConfig() {
        return this.adSelectionConfig;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public int hashCode() {
        return (Long.hashCode(this.adSelectionId) * 31) + this.adSelectionConfig.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.adSelectionId + ", adSelectionConfig=" + this.adSelectionConfig;
    }
}
