package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TelemetryDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public interface TelemetryActionType {
    @NotNull
    String getCategory();

    boolean getEnabledBreadcrumbSending();

    boolean getIncludeImplicitParamsInLogs();

    boolean getIncludeInLogsPrinting();

    @NotNull
    String getLogExtraMessage();

    @NotNull
    String getMessage();
}
