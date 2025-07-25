package io.appmetrica.analytics.modulesapi.internal.service;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ModuleServiceLifecycleController {
    void registerObserver(@NotNull ModuleServiceLifecycleObserver moduleServiceLifecycleObserver);
}
