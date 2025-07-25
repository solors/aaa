package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.qc0;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class bz1 implements qc0 {
    @GuardedBy("messagePool")

    /* renamed from: b */
    private static final ArrayList f77453b = new ArrayList(50);

    /* renamed from: a */
    private final Handler f77454a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.bz1$a */
    /* loaded from: classes8.dex */
    public static final class C30062a implements qc0.InterfaceC31194a {
        @Nullable

        /* renamed from: a */
        private Message f77455a;

        private C30062a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m35397b() {
            this.f77455a = null;
            ArrayList arrayList = bz1.f77453b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.qc0.InterfaceC31194a
        /* renamed from: a */
        public final void mo30408a() {
            Message message = this.f77455a;
            message.getClass();
            message.sendToTarget();
            m35397b();
        }
    }

    public bz1(Handler handler) {
        this.f77454a = handler;
    }

    /* renamed from: d */
    private static C30062a m35400d() {
        C30062a c30062a;
        ArrayList arrayList = f77453b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                c30062a = new C30062a();
            } else {
                c30062a = (C30062a) arrayList.remove(arrayList.size() - 1);
            }
        }
        return c30062a;
    }

    @Override // com.yandex.mobile.ads.impl.qc0
    /* renamed from: a */
    public final boolean mo30412a(Runnable runnable) {
        return this.f77454a.post(runnable);
    }

    @Override // com.yandex.mobile.ads.impl.qc0
    /* renamed from: b */
    public final boolean mo30411b() {
        return this.f77454a.hasMessages(0);
    }

    @Override // com.yandex.mobile.ads.impl.qc0
    /* renamed from: c */
    public final void mo30409c() {
        this.f77454a.removeMessages(2);
    }

    @Override // com.yandex.mobile.ads.impl.qc0
    /* renamed from: a */
    public final void mo30418a() {
        this.f77454a.removeCallbacksAndMessages(null);
    }

    @Override // com.yandex.mobile.ads.impl.qc0
    /* renamed from: b */
    public final qc0.InterfaceC31194a mo30410b(int i) {
        C30062a m35400d = m35400d();
        m35400d.f77455a = this.f77454a.obtainMessage(i);
        return m35400d;
    }

    @Override // com.yandex.mobile.ads.impl.qc0
    /* renamed from: a */
    public final boolean mo30417a(int i) {
        return this.f77454a.sendEmptyMessage(i);
    }

    @Override // com.yandex.mobile.ads.impl.qc0
    /* renamed from: a */
    public final boolean mo30414a(long j) {
        return this.f77454a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.yandex.mobile.ads.impl.qc0
    /* renamed from: a */
    public final boolean mo30413a(qc0.InterfaceC31194a interfaceC31194a) {
        C30062a c30062a = (C30062a) interfaceC31194a;
        Handler handler = this.f77454a;
        Message message = c30062a.f77455a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        c30062a.m35397b();
        return sendMessageAtFrontOfQueue;
    }

    @Override // com.yandex.mobile.ads.impl.qc0
    /* renamed from: a */
    public final qc0.InterfaceC31194a mo30415a(int i, @Nullable Object obj) {
        C30062a m35400d = m35400d();
        m35400d.f77455a = this.f77454a.obtainMessage(i, obj);
        return m35400d;
    }

    @Override // com.yandex.mobile.ads.impl.qc0
    /* renamed from: a */
    public final qc0.InterfaceC31194a mo30416a(int i, int i2) {
        C30062a m35400d = m35400d();
        m35400d.f77455a = this.f77454a.obtainMessage(1, i, i2);
        return m35400d;
    }
}
