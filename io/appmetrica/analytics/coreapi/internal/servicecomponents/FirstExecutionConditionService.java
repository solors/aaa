package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface FirstExecutionConditionService {
    @NotNull
    FirstExecutionDelayedTask createDelayedTask(@NotNull String str, @NotNull ICommonExecutor iCommonExecutor, @NotNull Runnable runnable);
}
