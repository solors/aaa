package com.android.volley;

import android.os.Process;
import androidx.annotation.VisibleForTesting;
import com.android.volley.Cache;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.c */
/* loaded from: classes2.dex */
public class CacheDispatcher extends Thread {

    /* renamed from: i */
    private static final boolean f3453i = VolleyLog.f3552b;

    /* renamed from: b */
    private final BlockingQueue<Request<?>> f3454b;

    /* renamed from: c */
    private final BlockingQueue<Request<?>> f3455c;

    /* renamed from: d */
    private final Cache f3456d;

    /* renamed from: f */
    private final ResponseDelivery f3457f;

    /* renamed from: g */
    private volatile boolean f3458g = false;

    /* renamed from: h */
    private final WaitingRequestManager f3459h;

    /* compiled from: CacheDispatcher.java */
    /* renamed from: com.android.volley.c$a */
    /* loaded from: classes2.dex */
    public class RunnableC3745a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Request f3460b;

        RunnableC3745a(Request request) {
            CacheDispatcher.this = r1;
            this.f3460b = request;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                CacheDispatcher.this.f3455c.put(this.f3460b);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public CacheDispatcher(BlockingQueue<Request<?>> blockingQueue, BlockingQueue<Request<?>> blockingQueue2, Cache cache, ResponseDelivery responseDelivery) {
        this.f3454b = blockingQueue;
        this.f3455c = blockingQueue2;
        this.f3456d = cache;
        this.f3457f = responseDelivery;
        this.f3459h = new WaitingRequestManager(this, blockingQueue2, responseDelivery);
    }

    /* renamed from: b */
    private void m102299b() throws InterruptedException {
        m102298c(this.f3454b.take());
    }

    @VisibleForTesting
    /* renamed from: c */
    void m102298c(Request<?> request) throws InterruptedException {
        request.addMarker("cache-queue-take");
        request.sendEvent(1);
        try {
            if (request.isCanceled()) {
                request.finish("cache-discard-canceled");
                return;
            }
            Cache.C3744a c3744a = this.f3456d.get(request.getCacheKey());
            if (c3744a == null) {
                request.addMarker("cache-miss");
                if (!this.f3459h.m102187c(request)) {
                    this.f3455c.put(request);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (c3744a.m102302b(currentTimeMillis)) {
                request.addMarker("cache-hit-expired");
                request.setCacheEntry(c3744a);
                if (!this.f3459h.m102187c(request)) {
                    this.f3455c.put(request);
                }
                return;
            }
            request.addMarker("cache-hit");
            Response<?> parseNetworkResponse = request.parseNetworkResponse(new NetworkResponse(c3744a.f3445a, c3744a.f3451g));
            request.addMarker("cache-hit-parsed");
            if (!parseNetworkResponse.m102283b()) {
                request.addMarker("cache-parsing-failed");
                this.f3456d.mo102265a(request.getCacheKey(), true);
                request.setCacheEntry(null);
                if (!this.f3459h.m102187c(request)) {
                    this.f3455c.put(request);
                }
                return;
            }
            if (!c3744a.m102301c(currentTimeMillis)) {
                this.f3457f.mo102281a(request, parseNetworkResponse);
            } else {
                request.addMarker("cache-hit-refresh-needed");
                request.setCacheEntry(c3744a);
                parseNetworkResponse.f3498d = true;
                if (!this.f3459h.m102187c(request)) {
                    this.f3457f.mo102280b(request, parseNetworkResponse, new RunnableC3745a(request));
                } else {
                    this.f3457f.mo102281a(request, parseNetworkResponse);
                }
            }
        } finally {
            request.sendEvent(2);
        }
    }

    /* renamed from: d */
    public void m102297d() {
        this.f3458g = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f3453i) {
            VolleyLog.m102194e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f3456d.initialize();
        while (true) {
            try {
                m102299b();
            } catch (InterruptedException unused) {
                if (this.f3458g) {
                    Thread.currentThread().interrupt();
                    return;
                }
                VolleyLog.m102196c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
