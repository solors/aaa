package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface AskForPermissionStrategyModuleProvider {
    @NotNull
    PermissionStrategy getAskForPermissionStrategy();
}
