package io.appmetrica.analytics.modulesapi.internal.service.event;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ModuleEventServiceHandlerReporter {
    void report(@NotNull CounterReportApi counterReportApi);
}
