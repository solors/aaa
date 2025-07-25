package com.applovin.impl;

import android.os.Handler;
import android.os.Message;
import com.applovin.impl.InterfaceC4576ia;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.wl */
/* loaded from: classes2.dex */
public final class C5789wl implements InterfaceC4576ia {

    /* renamed from: b */
    private static final List f11767b = new ArrayList(50);

    /* renamed from: a */
    private final Handler f11768a;

    public C5789wl(Handler handler) {
        this.f11768a = handler;
    }

    @Override // com.applovin.impl.InterfaceC4576ia
    /* renamed from: b */
    public void mo93475b(int i) {
        this.f11768a.removeMessages(i);
    }

    @Override // com.applovin.impl.InterfaceC4576ia
    /* renamed from: c */
    public boolean mo93473c(int i) {
        return this.f11768a.sendEmptyMessage(i);
    }

    @Override // com.applovin.impl.InterfaceC4576ia
    /* renamed from: d */
    public InterfaceC4576ia.InterfaceC4577a mo93472d(int i) {
        return m93485a().m93469a(this.f11768a.obtainMessage(i), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.wl$b */
    /* loaded from: classes2.dex */
    public static final class C5791b implements InterfaceC4576ia.InterfaceC4577a {

        /* renamed from: a */
        private Message f11769a;

        /* renamed from: b */
        private C5789wl f11770b;

        private C5791b() {
        }

        /* renamed from: b */
        private void m93468b() {
            this.f11769a = null;
            this.f11770b = null;
            C5789wl.m93474b(this);
        }

        /* renamed from: a */
        public boolean m93470a(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) AbstractC4100b1.m100583a(this.f11769a));
            m93468b();
            return sendMessageAtFrontOfQueue;
        }

        @Override // com.applovin.impl.InterfaceC4576ia.InterfaceC4577a
        /* renamed from: a */
        public void mo93471a() {
            ((Message) AbstractC4100b1.m100583a(this.f11769a)).sendToTarget();
            m93468b();
        }

        /* renamed from: a */
        public C5791b m93469a(Message message, C5789wl c5789wl) {
            this.f11769a = message;
            this.f11770b = c5789wl;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m93474b(C5791b c5791b) {
        List list = f11767b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(c5791b);
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC4576ia
    /* renamed from: a */
    public boolean mo93484a(int i) {
        return this.f11768a.hasMessages(i);
    }

    @Override // com.applovin.impl.InterfaceC4576ia
    /* renamed from: a */
    public boolean mo93476a(Runnable runnable) {
        return this.f11768a.post(runnable);
    }

    @Override // com.applovin.impl.InterfaceC4576ia
    /* renamed from: a */
    public void mo93477a(Object obj) {
        this.f11768a.removeCallbacksAndMessages(obj);
    }

    @Override // com.applovin.impl.InterfaceC4576ia
    /* renamed from: a */
    public boolean mo93481a(int i, long j) {
        return this.f11768a.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.applovin.impl.InterfaceC4576ia
    /* renamed from: a */
    public boolean mo93479a(InterfaceC4576ia.InterfaceC4577a interfaceC4577a) {
        return ((C5791b) interfaceC4577a).m93470a(this.f11768a);
    }

    @Override // com.applovin.impl.InterfaceC4576ia
    /* renamed from: a */
    public InterfaceC4576ia.InterfaceC4577a mo93480a(int i, Object obj) {
        return m93485a().m93469a(this.f11768a.obtainMessage(i, obj), this);
    }

    @Override // com.applovin.impl.InterfaceC4576ia
    /* renamed from: a */
    public InterfaceC4576ia.InterfaceC4577a mo93483a(int i, int i2, int i3) {
        return m93485a().m93469a(this.f11768a.obtainMessage(i, i2, i3), this);
    }

    @Override // com.applovin.impl.InterfaceC4576ia
    /* renamed from: a */
    public InterfaceC4576ia.InterfaceC4577a mo93482a(int i, int i2, int i3, Object obj) {
        return m93485a().m93469a(this.f11768a.obtainMessage(i, i2, i3, obj), this);
    }

    /* renamed from: a */
    private static C5791b m93485a() {
        C5791b c5791b;
        List list = f11767b;
        synchronized (list) {
            if (list.isEmpty()) {
                c5791b = new C5791b();
            } else {
                c5791b = (C5791b) list.remove(list.size() - 1);
            }
        }
        return c5791b;
    }
}
