package com.android.volley;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.volley.Cache;
import com.android.volley.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.volley.w */
/* loaded from: classes2.dex */
public class WaitingRequestManager implements Request.InterfaceC3749b {

    /* renamed from: b */
    private final ResponseDelivery f3561b;
    @Nullable

    /* renamed from: d */
    private final CacheDispatcher f3563d;
    @Nullable

    /* renamed from: e */
    private final BlockingQueue<Request<?>> f3564e;

    /* renamed from: a */
    private final Map<String, List<Request<?>>> f3560a = new HashMap();
    @Nullable

    /* renamed from: c */
    private final RequestQueue f3562c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WaitingRequestManager(@NonNull CacheDispatcher cacheDispatcher, @NonNull BlockingQueue<Request<?>> blockingQueue, ResponseDelivery responseDelivery) {
        this.f3561b = responseDelivery;
        this.f3563d = cacheDispatcher;
        this.f3564e = blockingQueue;
    }

    @Override // com.android.volley.Request.InterfaceC3749b
    /* renamed from: a */
    public synchronized void mo102189a(Request<?> request) {
        BlockingQueue<Request<?>> blockingQueue;
        String cacheKey = request.getCacheKey();
        List<Request<?>> remove = this.f3560a.remove(cacheKey);
        if (remove != null && !remove.isEmpty()) {
            if (VolleyLog.f3552b) {
                VolleyLog.m102194e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), cacheKey);
            }
            Request<?> remove2 = remove.remove(0);
            this.f3560a.put(cacheKey, remove);
            remove2.setNetworkRequestCompleteListener(this);
            RequestQueue requestQueue = this.f3562c;
            if (requestQueue != null) {
                requestQueue.sendRequestOverNetwork(remove2);
            } else if (this.f3563d != null && (blockingQueue = this.f3564e) != null) {
                try {
                    blockingQueue.put(remove2);
                } catch (InterruptedException e) {
                    VolleyLog.m102196c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.f3563d.m102297d();
                }
            }
        }
    }

    @Override // com.android.volley.Request.InterfaceC3749b
    /* renamed from: b */
    public void mo102188b(Request<?> request, Response<?> response) {
        List<Request<?>> remove;
        Cache.C3744a c3744a = response.f3496b;
        if (c3744a != null && !c3744a.m102303a()) {
            String cacheKey = request.getCacheKey();
            synchronized (this) {
                remove = this.f3560a.remove(cacheKey);
            }
            if (remove != null) {
                if (VolleyLog.f3552b) {
                    VolleyLog.m102194e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), cacheKey);
                }
                for (Request<?> request2 : remove) {
                    this.f3561b.mo102281a(request2, response);
                }
                return;
            }
            return;
        }
        mo102189a(request);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized boolean m102187c(Request<?> request) {
        String cacheKey = request.getCacheKey();
        if (this.f3560a.containsKey(cacheKey)) {
            List<Request<?>> list = this.f3560a.get(cacheKey);
            if (list == null) {
                list = new ArrayList<>();
            }
            request.addMarker("waiting-for-response");
            list.add(request);
            this.f3560a.put(cacheKey, list);
            if (VolleyLog.f3552b) {
                VolleyLog.m102197b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        }
        this.f3560a.put(cacheKey, null);
        request.setNetworkRequestCompleteListener(this);
        if (VolleyLog.f3552b) {
            VolleyLog.m102197b("new request, sending to network %s", cacheKey);
        }
        return false;
    }
}
