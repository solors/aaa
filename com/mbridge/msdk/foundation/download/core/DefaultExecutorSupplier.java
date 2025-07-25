package com.mbridge.msdk.foundation.download.core;

import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.p411c.SettingManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class DefaultExecutorSupplier implements ExecutorSupplier {
    private int DEFAULT_MAX_NUM_THREADS;
    private final ThreadPoolExecutor backgroundExecutor;
    private final ThreadPoolExecutor downloadResultExecutor;
    private final DownloadExecutor networkExecutor;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultExecutorSupplier() {
        this.DEFAULT_MAX_NUM_THREADS = 10;
        Setting m53284a = SettingManager.m53286a().m53284a(MBSDKContext.m52746m().m52779k());
        if (m53284a != null) {
            int m53489S = m53284a.m53489S();
            this.DEFAULT_MAX_NUM_THREADS = m53489S;
            if (m53489S <= 0) {
                this.DEFAULT_MAX_NUM_THREADS = 10;
            }
        }
        DownloadExecutor downloadExecutor = new DownloadExecutor(this.DEFAULT_MAX_NUM_THREADS, new PriorityThreadFactory(10), new ThreadPoolExecutor.DiscardPolicy());
        this.networkExecutor = downloadExecutor;
        if (this.DEFAULT_MAX_NUM_THREADS > 0) {
            downloadExecutor.allowCoreThreadTimeOut(true);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new PriorityThreadFactory(10), new ThreadPoolExecutor.DiscardPolicy());
        this.backgroundExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new PriorityThreadFactory(10), new ThreadPoolExecutor.DiscardPolicy());
        this.downloadResultExecutor = threadPoolExecutor2;
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public ExecutorService getBackgroundTasks() {
        return this.backgroundExecutor;
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public ExecutorService getDownloadResultTasks() {
        return this.downloadResultExecutor;
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public DownloadExecutor getDownloadTasks() {
        return this.networkExecutor;
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public ExecutorService getLruCacheThreadTasks() {
        return this.backgroundExecutor;
    }
}
