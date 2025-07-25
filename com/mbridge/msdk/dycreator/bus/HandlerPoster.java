package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes6.dex */
final class HandlerPoster extends Handler {

    /* renamed from: a */
    private final PendingPostQueue f55933a;

    /* renamed from: b */
    private final int f55934b;

    /* renamed from: c */
    private final EventBus f55935c;

    /* renamed from: d */
    private boolean f55936d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerPoster(EventBus eventBus, Looper looper, int i) {
        super(looper);
        this.f55935c = eventBus;
        this.f55934b = i;
        this.f55933a = new PendingPostQueue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m52965a(Subscription subscription, Object obj) {
        PendingPost m52963a = PendingPost.m52963a(subscription, obj);
        synchronized (this) {
            this.f55933a.m52960a(m52963a);
            if (!this.f55936d) {
                this.f55936d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost m52962a = this.f55933a.m52962a();
                if (m52962a == null) {
                    synchronized (this) {
                        m52962a = this.f55933a.m52962a();
                        if (m52962a == null) {
                            return;
                        }
                    }
                }
                this.f55935c.m52974a(m52962a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f55934b);
            if (sendMessage(obtainMessage())) {
                this.f55936d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } finally {
            this.f55936d = false;
        }
    }
}
