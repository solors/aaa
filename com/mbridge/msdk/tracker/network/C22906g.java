package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: ExecutorDelivery.java */
/* renamed from: com.mbridge.msdk.tracker.network.g */
/* loaded from: classes6.dex */
public final class C22906g implements InterfaceC22940x {

    /* renamed from: a */
    private final Executor f59746a;

    /* compiled from: ExecutorDelivery.java */
    /* renamed from: com.mbridge.msdk.tracker.network.g$a */
    /* loaded from: classes6.dex */
    private static class RunnableC22908a implements Runnable {

        /* renamed from: a */
        private final AbstractC22930u f59749a;

        /* renamed from: b */
        private final C22937w f59750b;

        /* renamed from: c */
        private final Runnable f59751c;

        public RunnableC22908a(AbstractC22930u abstractC22930u, C22937w c22937w, Runnable runnable) {
            this.f59749a = abstractC22930u;
            this.f59750b = c22937w;
            this.f59751c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            if (this.f59749a.m49400n()) {
                this.f59749a.m49413c("canceled-at-delivery");
                return;
            }
            C22937w c22937w = this.f59750b;
            AbstractC22898ad abstractC22898ad = c22937w.f59883c;
            if (abstractC22898ad == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f59749a.mo49320a((AbstractC22930u) c22937w.f59881a);
            } else {
                this.f59749a.m49416b(abstractC22898ad);
            }
            if (!this.f59750b.f59884d) {
                this.f59749a.m49413c("done");
            }
            Runnable runnable = this.f59751c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C22906g(final Handler handler) {
        this.f59746a = new Executor() { // from class: com.mbridge.msdk.tracker.network.g.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC22940x
    /* renamed from: a */
    public final void mo49370a(AbstractC22930u<?> abstractC22930u, AbstractC22898ad abstractC22898ad) {
        this.f59746a.execute(new RunnableC22908a(abstractC22930u, C22937w.m49374a(abstractC22898ad), null));
    }

    public C22906g(Executor executor) {
        this.f59746a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC22940x
    /* renamed from: a */
    public final void mo49369a(AbstractC22930u<?> abstractC22930u, C22937w<?> c22937w) {
        abstractC22930u.m49391w();
        this.f59746a.execute(new RunnableC22908a(abstractC22930u, c22937w, null));
    }
}
