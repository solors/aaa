package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ExecutorProvider {
    @NotNull
    IHandlerExecutor getDefaultExecutor();

    @NotNull
    InterruptionSafeThread getInterruptionThread(@NotNull String str, @NotNull String str2, @NotNull Runnable runnable);

    @NotNull
    IHandlerExecutor getModuleExecutor();

    @NotNull
    IHandlerExecutor getSupportIOExecutor();

    @NotNull
    Executor getUiExecutor();
}
