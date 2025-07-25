package com.monetization.ads.quality.base.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class AdQualityVerificationBlockingReasons {
    @NotNull
    private final List<String> blockReasons;
    @NotNull
    private final List<String> reportReasons;

    public AdQualityVerificationBlockingReasons(@NotNull List<String> blockReasons, @NotNull List<String> reportReasons) {
        Intrinsics.checkNotNullParameter(blockReasons, "blockReasons");
        Intrinsics.checkNotNullParameter(reportReasons, "reportReasons");
        this.blockReasons = blockReasons;
        this.reportReasons = reportReasons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdQualityVerificationBlockingReasons copy$default(AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adQualityVerificationBlockingReasons.blockReasons;
        }
        if ((i & 2) != 0) {
            list2 = adQualityVerificationBlockingReasons.reportReasons;
        }
        return adQualityVerificationBlockingReasons.copy(list, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.blockReasons;
    }

    @NotNull
    public final List<String> component2() {
        return this.reportReasons;
    }

    @NotNull
    public final AdQualityVerificationBlockingReasons copy(@NotNull List<String> blockReasons, @NotNull List<String> reportReasons) {
        Intrinsics.checkNotNullParameter(blockReasons, "blockReasons");
        Intrinsics.checkNotNullParameter(reportReasons, "reportReasons");
        return new AdQualityVerificationBlockingReasons(blockReasons, reportReasons);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerificationBlockingReasons)) {
            return false;
        }
        AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons = (AdQualityVerificationBlockingReasons) obj;
        if (Intrinsics.m17075f(this.blockReasons, adQualityVerificationBlockingReasons.blockReasons) && Intrinsics.m17075f(this.reportReasons, adQualityVerificationBlockingReasons.reportReasons)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<String> getBlockReasons() {
        return this.blockReasons;
    }

    @NotNull
    public final List<String> getReportReasons() {
        return this.reportReasons;
    }

    public int hashCode() {
        return this.reportReasons.hashCode() + (this.blockReasons.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        List<String> list = this.blockReasons;
        List<String> list2 = this.reportReasons;
        return "AdQualityVerificationBlockingReasons(blockReasons=" + list + ", reportReasons=" + list2 + ")";
    }
}
