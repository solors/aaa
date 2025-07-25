package com.vungle.ads.internal.executor;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.internal.executor.a */
/* loaded from: classes7.dex */
public interface Executors {
    @NotNull
    VungleThreadPoolExecutor getApiExecutor();

    @NotNull
    VungleThreadPoolExecutor getBackgroundExecutor();

    @NotNull
    VungleThreadPoolExecutor getDownloaderExecutor();

    @NotNull
    VungleThreadPoolExecutor getIoExecutor();

    @NotNull
    VungleThreadPoolExecutor getJobExecutor();

    @NotNull
    VungleThreadPoolExecutor getLoggerExecutor();

    @NotNull
    VungleThreadPoolExecutor getOffloadExecutor();

    @NotNull
    VungleThreadPoolExecutor getUaExecutor();
}
