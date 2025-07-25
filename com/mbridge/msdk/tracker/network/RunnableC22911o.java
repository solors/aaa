package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: NetworkDispatcher.java */
/* renamed from: com.mbridge.msdk.tracker.network.o */
/* loaded from: classes6.dex */
public final class RunnableC22911o implements Runnable {

    /* renamed from: a */
    private final BlockingQueue<AbstractC22930u<?>> f59765a;

    /* renamed from: b */
    private final InterfaceC22910n f59766b;

    /* renamed from: c */
    private final InterfaceC22902b f59767c;

    /* renamed from: d */
    private final InterfaceC22940x f59768d;

    /* renamed from: e */
    private volatile boolean f59769e = false;

    public RunnableC22911o(BlockingQueue<AbstractC22930u<?>> blockingQueue, InterfaceC22910n interfaceC22910n, InterfaceC22902b interfaceC22902b, InterfaceC22940x interfaceC22940x) {
        this.f59765a = blockingQueue;
        this.f59766b = interfaceC22910n;
        this.f59767c = interfaceC22902b;
        this.f59768d = interfaceC22940x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                AbstractC22930u<?> take = this.f59765a.take();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                take.m49417b(3);
                try {
                    if (take.m49400n()) {
                        take.m49413c("network-discard-cancelled");
                        take.m49389y();
                    } else {
                        TrafficStats.setThreadStatsTag(take.m49404j());
                        C22913r mo49452a = this.f59766b.mo49452a(take);
                        if (mo49452a.f59820e && take.m49390x()) {
                            take.m49413c("not-modified");
                            take.m49389y();
                        } else {
                            C22937w<?> mo49324a = take.mo49324a(mo49452a);
                            if (take.m49396r() && mo49324a.f59882b != null) {
                                this.f59767c.mo49429a(take.m49402l(), mo49324a.f59882b);
                            }
                            take.m49391w();
                            this.f59768d.mo49369a(take, mo49324a);
                            take.m49419a(mo49324a);
                        }
                    }
                } catch (AbstractC22898ad e) {
                    e.m49521a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f59768d.mo49370a(take, e);
                    take.m49389y();
                } catch (Exception e2) {
                    C22899ae.m49516a(e2, "Unhandled exception %s", e2.toString());
                    UnKnownError unKnownError = new UnKnownError(e2);
                    unKnownError.m49521a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f59768d.mo49370a(take, unKnownError);
                    take.m49389y();
                }
                take.m49417b(4);
            } catch (InterruptedException unused) {
                if (this.f59769e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C22899ae.m49514c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
