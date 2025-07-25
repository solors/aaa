package com.yandex.mobile.ads.impl;

import android.os.Process;
import com.yandex.mobile.ads.impl.InterfaceC31376sl;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: com.yandex.mobile.ads.impl.xl */
/* loaded from: classes8.dex */
public final class C31827xl extends Thread {

    /* renamed from: h */
    private static final boolean f87726h = zc2.f88824a;

    /* renamed from: b */
    private final BlockingQueue<ml1<?>> f87727b;

    /* renamed from: c */
    private final BlockingQueue<ml1<?>> f87728c;

    /* renamed from: d */
    private final InterfaceC31376sl f87729d;

    /* renamed from: e */
    private final wm1 f87730e;

    /* renamed from: f */
    private volatile boolean f87731f = false;

    /* renamed from: g */
    private final ld2 f87732g;

    public C31827xl(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, InterfaceC31376sl interfaceC31376sl, wm1 wm1Var) {
        this.f87727b = priorityBlockingQueue;
        this.f87728c = priorityBlockingQueue2;
        this.f87729d = interfaceC31376sl;
        this.f87730e = wm1Var;
        this.f87732g = new ld2(this, priorityBlockingQueue2, wm1Var);
    }

    /* renamed from: b */
    public final void m27467b() {
        this.f87731f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f87726h) {
            um0.m28724e(new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f87729d.mo29594a();
        while (true) {
            try {
                m27469a();
            } catch (InterruptedException unused) {
                if (this.f87731f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                um0.m28727b(new Object[0]);
            } catch (Throwable unused2) {
                um0.m28727b(new Object[0]);
                return;
            }
        }
    }

    /* renamed from: a */
    private void m27469a() throws InterruptedException {
        ml1<?> take = this.f87727b.take();
        take.m31958a("cache-queue-take");
        take.m31965a(1);
        try {
            if (take.m31941n()) {
                take.m31951c("cache-discard-canceled");
            } else {
                InterfaceC31376sl.C31377a c31377a = this.f87729d.get(take.m31950d());
                if (c31377a == null) {
                    take.m31958a("cache-miss");
                    if (!this.f87732g.m32288a(take)) {
                        this.f87728c.put(take);
                    }
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (c31377a.f85297e < currentTimeMillis) {
                        take.m31958a("cache-hit-expired");
                        take.m31961a(c31377a);
                        if (!this.f87732g.m32288a(take)) {
                            this.f87728c.put(take);
                        }
                    } else {
                        take.m31958a("cache-hit");
                        om1<?> mo27506a = take.mo27506a(new c91(200, c31377a.f85293a, c31377a.f85299g, false));
                        take.m31958a("cache-hit-parsed");
                        if (mo27506a.f83559c == null) {
                            if (c31377a.f85298f < currentTimeMillis) {
                                take.m31958a("cache-hit-refresh-needed");
                                take.m31961a(c31377a);
                                mo27506a.f83560d = true;
                                if (!this.f87732g.m32288a(take)) {
                                    ((w30) this.f87730e).m28058a(take, mo27506a, new RunnableC31756wl(this, take));
                                } else {
                                    ((w30) this.f87730e).m28058a(take, mo27506a, null);
                                }
                            } else {
                                ((w30) this.f87730e).m28058a(take, mo27506a, null);
                            }
                        } else {
                            take.m31958a("cache-parsing-failed");
                            this.f87729d.mo29593a(take.m31950d());
                            take.m31961a((InterfaceC31376sl.C31377a) null);
                            if (!this.f87732g.m32288a(take)) {
                                this.f87728c.put(take);
                            }
                        }
                    }
                }
            }
        } finally {
            take.m31965a(2);
        }
    }
}
