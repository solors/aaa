package io.bidmachine.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.bidmachine.core.b */
/* loaded from: classes9.dex */
class NetworkRequestExecutor implements Executor {
    @Nullable
    private static volatile NetworkRequestExecutor instance;
    @NonNull
    private final Executor executor;

    private NetworkRequestExecutor() {
        ExecutorConfigurator executorConfigurator = new ExecutorConfigurator();
        this.executor = new ThreadPoolExecutor(executorConfigurator.getCorePoolSize(), executorConfigurator.getMaximumPoolSize(), 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    @NonNull
    public static NetworkRequestExecutor get() {
        NetworkRequestExecutor networkRequestExecutor = instance;
        if (networkRequestExecutor == null) {
            synchronized (NetworkRequestExecutor.class) {
                networkRequestExecutor = instance;
                if (networkRequestExecutor == null) {
                    networkRequestExecutor = new NetworkRequestExecutor();
                    instance = networkRequestExecutor;
                }
            }
        }
        return networkRequestExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.executor.execute(runnable);
    }
}
