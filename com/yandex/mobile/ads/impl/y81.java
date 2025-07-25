package com.yandex.mobile.ads.impl;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class y81 extends Thread {

    /* renamed from: b */
    private final BlockingQueue<ml1<?>> f88113b;

    /* renamed from: c */
    private final x81 f88114c;

    /* renamed from: d */
    private final InterfaceC31376sl f88115d;

    /* renamed from: e */
    private final wm1 f88116e;

    /* renamed from: f */
    private volatile boolean f88117f = false;

    public y81(PriorityBlockingQueue priorityBlockingQueue, x81 x81Var, InterfaceC31376sl interfaceC31376sl, wm1 wm1Var) {
        this.f88113b = priorityBlockingQueue;
        this.f88114c = x81Var;
        this.f88115d = interfaceC31376sl;
        this.f88116e = wm1Var;
    }

    /* renamed from: a */
    private void m26986a() throws InterruptedException {
        ml1<?> take = this.f88113b.take();
        SystemClock.elapsedRealtime();
        take.m31965a(3);
        try {
            try {
                take.m31958a("network-queue-take");
                if (take.m31941n()) {
                    take.m31951c("network-discard-cancelled");
                    take.m31939p();
                } else {
                    TrafficStats.setThreadStatsTag(take.m31944k());
                    c91 mo26879a = this.f88114c.mo26879a(take);
                    take.m31958a("network-http-complete");
                    if (mo26879a.f77560e && take.m31942m()) {
                        take.m31951c("not-modified");
                        take.m31939p();
                    } else {
                        om1<?> mo27506a = take.mo27506a(mo26879a);
                        take.m31958a("network-parse-complete");
                        if (take.m31935t() && mo27506a.f83558b != null) {
                            this.f88115d.mo29592a(take.m31950d(), mo27506a.f83558b);
                            take.m31958a("network-cache-written");
                        }
                        take.m31940o();
                        ((w30) this.f88116e).m28058a(take, mo27506a, null);
                        take.m31962a(mo27506a);
                    }
                }
            } catch (yc2 e) {
                SystemClock.elapsedRealtime();
                ((w30) this.f88116e).m28057a(take, take.mo30037b(e));
                take.m31939p();
            } catch (Exception e2) {
                Object[] args = {e2.toString()};
                boolean z = zc2.f88824a;
                int i = um0.f86330b;
                Intrinsics.checkNotNullParameter(args, "args");
                yc2 yc2Var = new yc2((Throwable) e2);
                SystemClock.elapsedRealtime();
                ((w30) this.f88116e).m28057a(take, yc2Var);
                take.m31939p();
            }
        } finally {
            take.m31965a(4);
        }
    }

    /* renamed from: b */
    public final void m26985b() {
        this.f88117f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m26986a();
            } catch (InterruptedException unused) {
                if (this.f88117f) {
                    Thread.currentThread().interrupt();
                    return;
                } else {
                    boolean z = zc2.f88824a;
                    um0.m28727b(new Object[0]);
                }
            } catch (Throwable unused2) {
                boolean z2 = zc2.f88824a;
                um0.m28727b(new Object[0]);
                return;
            }
        }
    }
}
