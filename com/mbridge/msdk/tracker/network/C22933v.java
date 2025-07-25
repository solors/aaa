package com.mbridge.msdk.tracker.network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestQueue.java */
/* renamed from: com.mbridge.msdk.tracker.network.v */
/* loaded from: classes6.dex */
public final class C22933v {

    /* renamed from: a */
    private volatile ThreadPoolExecutor f59870a;

    /* renamed from: e */
    private final int f59874e;

    /* renamed from: f */
    private final InterfaceC22902b f59875f;

    /* renamed from: g */
    private final InterfaceC22910n f59876g;

    /* renamed from: h */
    private final InterfaceC22940x f59877h;

    /* renamed from: b */
    private final AtomicInteger f59871b = new AtomicInteger();

    /* renamed from: c */
    private final Set<AbstractC22930u<?>> f59872c = new HashSet();

    /* renamed from: d */
    private final PriorityBlockingQueue<AbstractC22930u<?>> f59873d = new PriorityBlockingQueue<>();

    /* renamed from: i */
    private final List<InterfaceC22936a> f59878i = new ArrayList();

    /* compiled from: RequestQueue.java */
    /* renamed from: com.mbridge.msdk.tracker.network.v$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22936a {
        /* renamed from: a */
        void m49375a(AbstractC22930u<?> abstractC22930u, int i);
    }

    public C22933v(InterfaceC22910n interfaceC22910n, InterfaceC22940x interfaceC22940x, int i, InterfaceC22902b interfaceC22902b) {
        this.f59874e = i;
        this.f59875f = interfaceC22902b;
        this.f59876g = interfaceC22910n;
        this.f59877h = interfaceC22940x;
    }

    /* renamed from: a */
    private void m49384a(int i) {
        if (this.f59870a != null) {
            return;
        }
        try {
            m49380b(i);
            if (this.f59870a == null) {
                return;
            }
        } catch (Throwable unused) {
            try {
                m49380b(5);
            } catch (Exception unused2) {
            } catch (Throwable th) {
                if (this.f59870a != null) {
                    this.f59870a.allowCoreThreadTimeOut(true);
                }
                throw th;
            }
            if (this.f59870a == null) {
                return;
            }
        }
        this.f59870a.allowCoreThreadTimeOut(true);
    }

    /* renamed from: b */
    private void m49380b(int i) {
        this.f59870a = new ThreadPoolExecutor(i, i, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.tracker.network.v.1
            {
                C22933v.this = this;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "NetworkDispatcher");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    /* renamed from: b */
    public final <T> void m49379b(AbstractC22930u<T> abstractC22930u) {
        synchronized (this.f59872c) {
            this.f59872c.remove(abstractC22930u);
        }
        m49382a(abstractC22930u, 5);
    }

    /* renamed from: a */
    public final <T> AbstractC22930u<T> m49383a(AbstractC22930u<T> abstractC22930u) {
        abstractC22930u.m49421a(this);
        synchronized (this.f59872c) {
            this.f59872c.add(abstractC22930u);
        }
        abstractC22930u.m49414c(this.f59871b.incrementAndGet());
        m49382a(abstractC22930u, 0);
        this.f59873d.add(abstractC22930u);
        if (this.f59870a == null) {
            m49384a(this.f59874e);
        }
        this.f59870a.execute(new Runnable() { // from class: com.mbridge.msdk.tracker.network.v.2
            {
                C22933v.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    new RunnableC22911o(C22933v.this.f59873d, C22933v.this.f59876g, C22933v.this.f59875f, C22933v.this.f59877h).run();
                } catch (Throwable unused) {
                }
            }
        });
        return abstractC22930u;
    }

    /* renamed from: a */
    public final void m49382a(AbstractC22930u<?> abstractC22930u, int i) {
        synchronized (this.f59878i) {
            for (InterfaceC22936a interfaceC22936a : this.f59878i) {
                interfaceC22936a.m49375a(abstractC22930u, i);
            }
        }
    }

    /* renamed from: a */
    public final void m49385a() {
        this.f59870a = null;
        m49384a(this.f59874e);
    }
}
