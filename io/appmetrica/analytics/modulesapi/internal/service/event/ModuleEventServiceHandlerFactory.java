package io.appmetrica.analytics.modulesapi.internal.service.event;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public abstract class ModuleEventServiceHandlerFactory {
    @NotNull
    public abstract ModuleServiceEventHandler createEventHandler(@NotNull String str);
}
