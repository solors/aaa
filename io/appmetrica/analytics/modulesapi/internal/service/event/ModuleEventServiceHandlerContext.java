package io.appmetrica.analytics.modulesapi.internal.service.event;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ModuleEventServiceHandlerContext {
    @NotNull
    ModuleEventServiceHandlerReporter getEventReporter();

    @NotNull
    ModulePreferences getLegacyModulePreferences();

    @NotNull
    ModulePreferences getModulePreferences();
}
