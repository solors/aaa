package com.mobilefuse.sdk.telemetry.implementations.sentry;

import com.mobilefuse.sdk.telemetry.TelemetryBreadcrumb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.sdk.telemetry.implementations.sentry.SentryBreadcrumbs */
/* loaded from: classes7.dex */
public final class SentryDataModel {
    @NotNull
    private final List<TelemetryBreadcrumb> values;

    public SentryDataModel(@NotNull List<TelemetryBreadcrumb> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SentryDataModel copy$default(SentryDataModel sentryDataModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sentryDataModel.values;
        }
        return sentryDataModel.copy(list);
    }

    @NotNull
    public final List<TelemetryBreadcrumb> component1() {
        return this.values;
    }

    @NotNull
    public final SentryDataModel copy(@NotNull List<TelemetryBreadcrumb> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return new SentryDataModel(values);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof SentryDataModel) || !Intrinsics.m17075f(this.values, ((SentryDataModel) obj).values)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @NotNull
    public final List<TelemetryBreadcrumb> getValues() {
        return this.values;
    }

    public int hashCode() {
        List<TelemetryBreadcrumb> list = this.values;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "SentryBreadcrumbs(values=" + this.values + ")";
    }
}
