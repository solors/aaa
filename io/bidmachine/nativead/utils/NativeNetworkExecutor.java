package io.bidmachine.nativead.utils;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class NativeNetworkExecutor implements Executor {
    private static NativeNetworkExecutor executor;
    private final ThreadPoolExecutor loaderExecutor;

    private NativeNetworkExecutor() {
        int availableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        this.loaderExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
    }

    public static NativeNetworkExecutor getInstance() {
        if (executor == null) {
            executor = new NativeNetworkExecutor();
        }
        return executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.loaderExecutor.execute(runnable);
    }
}
