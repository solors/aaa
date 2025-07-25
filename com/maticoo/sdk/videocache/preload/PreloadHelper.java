package com.maticoo.sdk.videocache.preload;

import android.text.TextUtils;
import com.maticoo.sdk.videocache.HttpProxyCacheServer;
import com.maticoo.sdk.videocache.ILog;
import com.maticoo.sdk.videocache.file.FileCache;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes6.dex */
public class PreloadHelper {
    private static final long DEFAULT_PRELOAD_SIZE = 262144;
    private static final int DEFAULT_PRELOAD_THREAD_COUNT = 5;
    private long preloadSize;
    private final ExecutorService preloadThreadPool;
    private final Map<String, Future<?>> taskMap;

    /* loaded from: classes6.dex */
    private static class PreloadHelperHolder {
        private static final PreloadHelper INSTANCE = new PreloadHelper();

        private PreloadHelperHolder() {
        }
    }

    public static PreloadHelper getInstance() {
        return PreloadHelperHolder.INSTANCE;
    }

    public void load(HttpProxyCacheServer httpProxyCacheServer, String str, PreloadListener preloadListener) {
        stopPreload(str);
        String proxyUrl = httpProxyCacheServer.getProxyUrl(str);
        File cacheFile = httpProxyCacheServer.getCacheFile(str);
        File parentFile = cacheFile.getParentFile();
        File file = new File(parentFile, cacheFile.getName() + FileCache.TEMP_POSTFIX);
        if (!proxyUrl.startsWith("http")) {
            ILog.m53547i("PreloadHelper::load(proxyUrl) => proxyUrl is not httpUrl, if startsWith File://.. it has been cached " + proxyUrl);
        } else if (!cacheFile.exists() && (!file.exists() || file.length() <= this.preloadSize)) {
            this.taskMap.put(str, this.preloadThreadPool.submit(new PreloadTaskRunnable(proxyUrl, this.preloadSize, preloadListener)));
        } else {
            ILog.m53547i("PreloadHelper::load() =>  The file is preloaded." + proxyUrl);
        }
    }

    public void setPreloadSize(long j) {
        this.preloadSize = Math.max(this.preloadSize, j);
    }

    public void stopAllPreload() {
        this.preloadThreadPool.shutdown();
    }

    public void stopPreload(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Future<?> future = this.taskMap.get(str);
        this.taskMap.remove(str);
        if (future != null) {
            future.cancel(true);
        }
    }

    private PreloadHelper() {
        this.preloadThreadPool = Executors.newFixedThreadPool(5);
        this.preloadSize = DEFAULT_PRELOAD_SIZE;
        this.taskMap = new ConcurrentHashMap(5);
    }
}
