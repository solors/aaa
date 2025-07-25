package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TelemetryDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public interface TelemetryParamType {
    boolean getPrintInLogs();

    @NotNull
    String getValue();
}
