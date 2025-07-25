package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fl1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class zh0 {
    @NotNull

    /* renamed from: a */
    private final fl1.EnumC30324b f88859a;
    @NotNull

    /* renamed from: b */
    private final fl1.EnumC30324b f88860b;
    @NotNull

    /* renamed from: c */
    private final fl1.EnumC30324b f88861c;
    @NotNull

    /* renamed from: d */
    private final fl1.EnumC30324b f88862d;

    public zh0(@NotNull fl1.EnumC30324b impressionTrackingSuccessReportType, @NotNull fl1.EnumC30324b impressionTrackingStartReportType, @NotNull fl1.EnumC30324b impressionTrackingFailureReportType, @NotNull fl1.EnumC30324b forcedImpressionTrackingFailureReportType) {
        Intrinsics.checkNotNullParameter(impressionTrackingSuccessReportType, "impressionTrackingSuccessReportType");
        Intrinsics.checkNotNullParameter(impressionTrackingStartReportType, "impressionTrackingStartReportType");
        Intrinsics.checkNotNullParameter(impressionTrackingFailureReportType, "impressionTrackingFailureReportType");
        Intrinsics.checkNotNullParameter(forcedImpressionTrackingFailureReportType, "forcedImpressionTrackingFailureReportType");
        this.f88859a = impressionTrackingSuccessReportType;
        this.f88860b = impressionTrackingStartReportType;
        this.f88861c = impressionTrackingFailureReportType;
        this.f88862d = forcedImpressionTrackingFailureReportType;
    }

    @NotNull
    /* renamed from: a */
    public final fl1.EnumC30324b m26230a() {
        return this.f88862d;
    }

    @NotNull
    /* renamed from: b */
    public final fl1.EnumC30324b m26229b() {
        return this.f88861c;
    }

    @NotNull
    /* renamed from: c */
    public final fl1.EnumC30324b m26228c() {
        return this.f88860b;
    }

    @NotNull
    /* renamed from: d */
    public final fl1.EnumC30324b m26227d() {
        return this.f88859a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh0)) {
            return false;
        }
        zh0 zh0Var = (zh0) obj;
        if (this.f88859a == zh0Var.f88859a && this.f88860b == zh0Var.f88860b && this.f88861c == zh0Var.f88861c && this.f88862d == zh0Var.f88862d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f88860b.hashCode();
        int hashCode2 = this.f88861c.hashCode();
        return this.f88862d.hashCode() + ((hashCode2 + ((hashCode + (this.f88859a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        fl1.EnumC30324b enumC30324b = this.f88859a;
        fl1.EnumC30324b enumC30324b2 = this.f88860b;
        fl1.EnumC30324b enumC30324b3 = this.f88861c;
        fl1.EnumC30324b enumC30324b4 = this.f88862d;
        return "ImpressionTrackingReportTypes(impressionTrackingSuccessReportType=" + enumC30324b + ", impressionTrackingStartReportType=" + enumC30324b2 + ", impressionTrackingFailureReportType=" + enumC30324b3 + ", forcedImpressionTrackingFailureReportType=" + enumC30324b4 + ")";
    }
}
