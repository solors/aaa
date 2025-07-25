package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.android.volley.o */
/* loaded from: classes2.dex */
public class RequestQueue {
    private static final int DEFAULT_NETWORK_THREAD_POOL_SIZE = 4;
    private final Cache mCache;
    private CacheDispatcher mCacheDispatcher;
    private final PriorityBlockingQueue<Request<?>> mCacheQueue;
    private final Set<Request<?>> mCurrentRequests;
    private final ResponseDelivery mDelivery;
    private final NetworkDispatcher[] mDispatchers;
    private final List<InterfaceC3752b> mEventListeners;
    private final List<InterfaceC3754d> mFinishedListeners;
    private final Network mNetwork;
    private final PriorityBlockingQueue<Request<?>> mNetworkQueue;
    private final AtomicInteger mSequenceGenerator;

    /* compiled from: RequestQueue.java */
    /* renamed from: com.android.volley.o$a */
    /* loaded from: classes2.dex */
    class C3751a implements InterfaceC3753c {

        /* renamed from: a */
        final /* synthetic */ Object f3493a;

        C3751a(Object obj) {
            this.f3493a = obj;
        }

        @Override // com.android.volley.RequestQueue.InterfaceC3753c
        public boolean apply(Request<?> request) {
            if (request.getTag() == this.f3493a) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: RequestQueue.java */
    /* renamed from: com.android.volley.o$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3752b {
        /* renamed from: a */
        void m102286a(Request<?> request, int i);
    }

    /* compiled from: RequestQueue.java */
    /* renamed from: com.android.volley.o$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC3753c {
        boolean apply(Request<?> request);
    }

    /* compiled from: RequestQueue.java */
    @Deprecated
    /* renamed from: com.android.volley.o$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC3754d<T> {
        /* renamed from: a */
        void m102285a(Request<T> request);
    }

    public RequestQueue(Cache cache, Network network, int i, ResponseDelivery responseDelivery) {
        this.mSequenceGenerator = new AtomicInteger();
        this.mCurrentRequests = new HashSet();
        this.mCacheQueue = new PriorityBlockingQueue<>();
        this.mNetworkQueue = new PriorityBlockingQueue<>();
        this.mFinishedListeners = new ArrayList();
        this.mEventListeners = new ArrayList();
        this.mCache = cache;
        this.mNetwork = network;
        this.mDispatchers = new NetworkDispatcher[i];
        this.mDelivery = responseDelivery;
    }

    public <T> Request<T> add(Request<T> request) {
        request.setRequestQueue(this);
        synchronized (this.mCurrentRequests) {
            this.mCurrentRequests.add(request);
        }
        request.setSequence(getSequenceNumber());
        request.addMarker("add-to-queue");
        sendRequestEvent(request, 0);
        beginRequest(request);
        return request;
    }

    public void addRequestEventListener(InterfaceC3752b interfaceC3752b) {
        synchronized (this.mEventListeners) {
            this.mEventListeners.add(interfaceC3752b);
        }
    }

    @Deprecated
    public <T> void addRequestFinishedListener(InterfaceC3754d<T> interfaceC3754d) {
        synchronized (this.mFinishedListeners) {
            this.mFinishedListeners.add(interfaceC3754d);
        }
    }

    <T> void beginRequest(Request<T> request) {
        if (!request.shouldCache()) {
            sendRequestOverNetwork(request);
        } else {
            this.mCacheQueue.add(request);
        }
    }

    public void cancelAll(InterfaceC3753c interfaceC3753c) {
        synchronized (this.mCurrentRequests) {
            for (Request<?> request : this.mCurrentRequests) {
                if (interfaceC3753c.apply(request)) {
                    request.cancel();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void finish(Request<T> request) {
        synchronized (this.mCurrentRequests) {
            this.mCurrentRequests.remove(request);
        }
        synchronized (this.mFinishedListeners) {
            for (InterfaceC3754d interfaceC3754d : this.mFinishedListeners) {
                interfaceC3754d.m102285a(request);
            }
        }
        sendRequestEvent(request, 5);
    }

    public Cache getCache() {
        return this.mCache;
    }

    public ResponseDelivery getResponseDelivery() {
        return this.mDelivery;
    }

    public int getSequenceNumber() {
        return this.mSequenceGenerator.incrementAndGet();
    }

    public void removeRequestEventListener(InterfaceC3752b interfaceC3752b) {
        synchronized (this.mEventListeners) {
            this.mEventListeners.remove(interfaceC3752b);
        }
    }

    @Deprecated
    public <T> void removeRequestFinishedListener(InterfaceC3754d<T> interfaceC3754d) {
        synchronized (this.mFinishedListeners) {
            this.mFinishedListeners.remove(interfaceC3754d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendRequestEvent(Request<?> request, int i) {
        synchronized (this.mEventListeners) {
            for (InterfaceC3752b interfaceC3752b : this.mEventListeners) {
                interfaceC3752b.m102286a(request, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void sendRequestOverNetwork(Request<T> request) {
        this.mNetworkQueue.add(request);
    }

    public void start() {
        stop();
        CacheDispatcher cacheDispatcher = new CacheDispatcher(this.mCacheQueue, this.mNetworkQueue, this.mCache, this.mDelivery);
        this.mCacheDispatcher = cacheDispatcher;
        cacheDispatcher.start();
        for (int i = 0; i < this.mDispatchers.length; i++) {
            NetworkDispatcher networkDispatcher = new NetworkDispatcher(this.mNetworkQueue, this.mNetwork, this.mCache, this.mDelivery);
            this.mDispatchers[i] = networkDispatcher;
            networkDispatcher.start();
        }
    }

    public void stop() {
        NetworkDispatcher[] networkDispatcherArr;
        CacheDispatcher cacheDispatcher = this.mCacheDispatcher;
        if (cacheDispatcher != null) {
            cacheDispatcher.m102297d();
        }
        for (NetworkDispatcher networkDispatcher : this.mDispatchers) {
            if (networkDispatcher != null) {
                networkDispatcher.m102289e();
            }
        }
    }

    public void cancelAll(Object obj) {
        if (obj != null) {
            cancelAll((InterfaceC3753c) new C3751a(obj));
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public RequestQueue(Cache cache, Network network, int i) {
        this(cache, network, i, new ExecutorDelivery(new Handler(Looper.getMainLooper())));
    }

    public RequestQueue(Cache cache, Network network) {
        this(cache, network, 4);
    }
}
