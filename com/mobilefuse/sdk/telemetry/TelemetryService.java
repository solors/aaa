package com.mobilefuse.sdk.telemetry;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TelemetryService.kt */
@Metadata
/* loaded from: classes7.dex */
public interface TelemetryService {
    void captureException(@NotNull Throwable th, @NotNull String str, @NotNull List<TelemetryBreadcrumb> list, @NotNull Map<String, String> map, @NotNull Map<String, String> map2);
}
