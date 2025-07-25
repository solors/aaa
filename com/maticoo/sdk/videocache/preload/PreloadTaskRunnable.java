package com.maticoo.sdk.videocache.preload;

import com.maticoo.sdk.utils.HandlerUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.videocache.HttpUrlSource;
import com.maticoo.sdk.videocache.ILog;
import com.maticoo.sdk.videocache.ProxyCacheException;

/* loaded from: classes6.dex */
public class PreloadTaskRunnable implements Runnable {
    private PreloadListener listener;
    private final long preloadSize;
    private final String proxyUrl;

    public PreloadTaskRunnable(String str, long j, PreloadListener preloadListener) {
        this.proxyUrl = str;
        this.preloadSize = j;
        this.listener = preloadListener;
    }

    /* renamed from: a */
    public static /* synthetic */ void m53542a(PreloadTaskRunnable preloadTaskRunnable, ProxyCacheException proxyCacheException) {
        preloadTaskRunnable.lambda$run$0(proxyCacheException);
    }

    public /* synthetic */ void lambda$run$0(ProxyCacheException proxyCacheException) {
        PreloadListener preloadListener = this.listener;
        if (preloadListener != null) {
            preloadListener.failed("proxyUrl=" + this.proxyUrl + ", e=" + proxyCacheException.getMessage());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int read;
        ILog.m53551d("PreloadTaskRunnable run():" + this.proxyUrl);
        HttpUrlSource httpUrlSource = new HttpUrlSource(this.proxyUrl);
        try {
            try {
                try {
                    httpUrlSource.open(0L);
                    byte[] bArr = new byte[8192];
                    int i = 0;
                    while (i + 8192 <= this.preloadSize && (read = httpUrlSource.read(bArr)) != -1 && !Thread.currentThread().isInterrupted()) {
                        i += read;
                    }
                    ILog.m53551d("PreloadTaskRunnable is finished!!! ");
                    httpUrlSource.close();
                } catch (ProxyCacheException e) {
                    DeveloperLog.LogE("preload", e);
                    HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.videocache.preload.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            PreloadTaskRunnable.m53542a(PreloadTaskRunnable.this, e);
                        }
                    });
                    ILog.m53551d("PreloadTaskRunnable is finished!!! ");
                    httpUrlSource.close();
                }
            } catch (ProxyCacheException e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            ILog.m53551d("PreloadTaskRunnable is finished!!! ");
            try {
                httpUrlSource.close();
            } catch (ProxyCacheException e3) {
                e3.printStackTrace();
            }
            throw th;
        }
    }
}
