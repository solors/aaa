package com.vungle.ads.internal.executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.internal.executor.d */
/* loaded from: classes7.dex */
public final class SDKExecutors implements Executors {
    @NotNull
    public static final C29194a Companion = new C29194a(null);
    private static final int IO_KEEP_ALIVE_TIME_SECONDS = 5;
    private static final int JOBS_KEEP_ALIVE_TIME_SECONDS = 1;
    private static final int SINGLE_CORE_POOL_SIZE = 1;
    private static final int VUNGLE_KEEP_ALIVE_TIME_SECONDS = 10;
    @NotNull
    private VungleThreadPoolExecutor API_EXECUTOR;
    @NotNull
    private VungleThreadPoolExecutor BACKGROUND_EXECUTOR;
    @NotNull
    private VungleThreadPoolExecutor DOWNLOADER_EXECUTOR;
    @NotNull
    private VungleThreadPoolExecutor IO_EXECUTOR;
    @NotNull
    private VungleThreadPoolExecutor JOB_EXECUTOR;
    @NotNull
    private VungleThreadPoolExecutor LOGGER_EXECUTOR;
    private final int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
    @NotNull
    private VungleThreadPoolExecutor OFFLOAD_EXECUTOR;
    @NotNull
    private VungleThreadPoolExecutor UA_EXECUTOR;

    /* compiled from: SDKExecutors.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.executor.d$a */
    /* loaded from: classes7.dex */
    public static final class C29194a {
        private C29194a() {
        }

        public /* synthetic */ C29194a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SDKExecutors() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.JOB_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 1L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_jr"));
        this.IO_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_io"));
        this.API_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_api"));
        this.LOGGER_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_logger"));
        this.BACKGROUND_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_background"));
        this.UA_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_ua"));
        this.DOWNLOADER_EXECUTOR = new VungleThreadPoolExecutor(4, 4, 1L, timeUnit, new PriorityBlockingQueue(), new NamedThreadFactory("vng_down"));
        this.OFFLOAD_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_ol"));
    }

    @Override // com.vungle.ads.internal.executor.Executors
    @NotNull
    public VungleThreadPoolExecutor getApiExecutor() {
        return this.API_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    @NotNull
    public VungleThreadPoolExecutor getBackgroundExecutor() {
        return this.BACKGROUND_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    @NotNull
    public VungleThreadPoolExecutor getDownloaderExecutor() {
        return this.DOWNLOADER_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    @NotNull
    public VungleThreadPoolExecutor getIoExecutor() {
        return this.IO_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    @NotNull
    public VungleThreadPoolExecutor getJobExecutor() {
        return this.JOB_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    @NotNull
    public VungleThreadPoolExecutor getLoggerExecutor() {
        return this.LOGGER_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    @NotNull
    public VungleThreadPoolExecutor getOffloadExecutor() {
        return this.OFFLOAD_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    @NotNull
    public VungleThreadPoolExecutor getUaExecutor() {
        return this.UA_EXECUTOR;
    }
}
