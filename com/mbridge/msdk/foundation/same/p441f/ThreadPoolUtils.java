package com.mbridge.msdk.foundation.same.p441f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.f.a */
/* loaded from: classes6.dex */
public final class ThreadPoolUtils {

    /* renamed from: a */
    public static ThreadPoolExecutor f56566a;

    /* renamed from: b */
    private static ThreadPoolExecutor f56567b;

    /* renamed from: c */
    private static Handler f56568c;

    /* renamed from: d */
    private static ThreadPoolExecutor f56569d;

    /* renamed from: e */
    private static ThreadPoolExecutor f56570e;

    /* renamed from: f */
    private static ThreadPoolExecutor f56571f;

    /* compiled from: ThreadPoolUtils.java */
    /* renamed from: com.mbridge.msdk.foundation.same.f.a$a */
    /* loaded from: classes6.dex */
    private static class HandlerC21985a extends Handler {
        public HandlerC21985a() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m52228a() {
        if (f56567b == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(10), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.a.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(@NonNull Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("BitmapThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
            f56567b = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f56567b;
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m52227b() {
        if (f56566a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 25, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.a.2
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(@NonNull Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("CommonThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
            f56566a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f56566a;
    }

    /* renamed from: c */
    public static Handler m52226c() {
        if (f56568c == null) {
            f56568c = new HandlerC21985a();
        }
        return f56568c;
    }

    /* renamed from: d */
    public static ThreadPoolExecutor m52225d() {
        if (f56569d == null) {
            f56569d = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.a.3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(@NonNull Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("NwtThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f56569d;
    }

    /* renamed from: e */
    public static ThreadPoolExecutor m52224e() {
        if (f56570e == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.a.4
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(@NonNull Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("ReportThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
            f56570e = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f56570e;
    }

    /* renamed from: f */
    public static ThreadPoolExecutor m52223f() {
        if (f56571f == null) {
            ThreadFactory threadFactory = new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.a.5
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(@NonNull Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("rv-load-tread");
                    return thread;
                }
            };
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors * 2, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(30), threadFactory, new ThreadPoolExecutor.DiscardPolicy());
            f56571f = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f56571f;
    }
}
