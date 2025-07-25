package com.mobilefuse.sdk.telemetry;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TelemetryDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public interface TelemetryActionReceiver {
    @NotNull
    List<TelemetryDataModel> getActions();
}
