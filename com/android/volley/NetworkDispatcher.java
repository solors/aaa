package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.i */
/* loaded from: classes2.dex */
public class NetworkDispatcher extends Thread {

    /* renamed from: b */
    private final BlockingQueue<Request<?>> f3474b;

    /* renamed from: c */
    private final Network f3475c;

    /* renamed from: d */
    private final Cache f3476d;

    /* renamed from: f */
    private final ResponseDelivery f3477f;

    /* renamed from: g */
    private volatile boolean f3478g = false;

    public NetworkDispatcher(BlockingQueue<Request<?>> blockingQueue, Network network, Cache cache, ResponseDelivery responseDelivery) {
        this.f3474b = blockingQueue;
        this.f3475c = network;
        this.f3476d = cache;
        this.f3477f = responseDelivery;
    }

    @TargetApi(14)
    /* renamed from: a */
    private void m102293a(Request<?> request) {
        TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
    }

    /* renamed from: b */
    private void m102292b(Request<?> request, VolleyError volleyError) {
        this.f3477f.mo102279c(request, request.parseNetworkError(volleyError));
    }

    /* renamed from: c */
    private void m102291c() throws InterruptedException {
        m102290d(this.f3474b.take());
    }

    @VisibleForTesting
    /* renamed from: d */
    void m102290d(Request<?> request) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        request.sendEvent(3);
        try {
            try {
                request.addMarker("network-queue-take");
            } catch (VolleyError e) {
                e.m102199b(SystemClock.elapsedRealtime() - elapsedRealtime);
                m102292b(request, e);
                request.notifyListenerResponseNotUsable();
            } catch (Exception e2) {
                VolleyLog.m102195d(e2, "Unhandled exception %s", e2.toString());
                VolleyError volleyError = new VolleyError(e2);
                volleyError.m102199b(SystemClock.elapsedRealtime() - elapsedRealtime);
                this.f3477f.mo102279c(request, volleyError);
                request.notifyListenerResponseNotUsable();
            }
            if (request.isCanceled()) {
                request.finish("network-discard-cancelled");
                request.notifyListenerResponseNotUsable();
                return;
            }
            m102293a(request);
            NetworkResponse mo102270a = this.f3475c.mo102270a(request);
            request.addMarker("network-http-complete");
            if (mo102270a.f3483e && request.hasHadResponseDelivered()) {
                request.finish("not-modified");
                request.notifyListenerResponseNotUsable();
                return;
            }
            Response<?> parseNetworkResponse = request.parseNetworkResponse(mo102270a);
            request.addMarker("network-parse-complete");
            if (request.shouldCache() && parseNetworkResponse.f3496b != null) {
                this.f3476d.mo102264b(request.getCacheKey(), parseNetworkResponse.f3496b);
                request.addMarker("network-cache-written");
            }
            request.markDelivered();
            this.f3477f.mo102281a(request, parseNetworkResponse);
            request.notifyListenerResponseReceived(parseNetworkResponse);
        } finally {
            request.sendEvent(4);
        }
    }

    /* renamed from: e */
    public void m102289e() {
        this.f3478g = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m102291c();
            } catch (InterruptedException unused) {
                if (this.f3478g) {
                    Thread.currentThread().interrupt();
                    return;
                }
                VolleyLog.m102196c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
