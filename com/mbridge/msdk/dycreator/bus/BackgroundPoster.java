package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* loaded from: classes6.dex */
final class BackgroundPoster implements Runnable {

    /* renamed from: a */
    private final PendingPostQueue f55910a = new PendingPostQueue();

    /* renamed from: b */
    private volatile boolean f55911b;

    /* renamed from: c */
    private final EventBus f55912c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BackgroundPoster(EventBus eventBus) {
        this.f55912c = eventBus;
    }

    public final void enqueue(Subscription subscription, Object obj) {
        PendingPost m52963a = PendingPost.m52963a(subscription, obj);
        synchronized (this) {
            this.f55910a.m52960a(m52963a);
            if (!this.f55911b) {
                this.f55911b = true;
                EventBus.f55913a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                PendingPost m52961a = this.f55910a.m52961a(1000);
                if (m52961a == null) {
                    synchronized (this) {
                        m52961a = this.f55910a.m52962a();
                        if (m52961a == null) {
                            return;
                        }
                    }
                }
                this.f55912c.m52974a(m52961a);
            } catch (InterruptedException e) {
                Log.w("Event", Thread.currentThread().getName() + " was interruppted", e);
                return;
            } finally {
                this.f55911b = false;
            }
        }
    }
}
