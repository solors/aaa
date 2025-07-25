package com.unity3d.player;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.O */
/* loaded from: classes7.dex */
public class C28715O implements InterfaceC28710K {

    /* renamed from: a */
    final /* synthetic */ RunnableC28716P f74581a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C28715O(RunnableC28716P runnableC28716P) {
        this.f74581a = runnableC28716P;
    }

    /* renamed from: a */
    public void m37717a(int i) {
        Lock lock;
        Lock lock2;
        Semaphore semaphore;
        boolean z;
        lock = this.f74581a.f74591h.f74733e;
        lock.lock();
        C28738U c28738u = this.f74581a.f74591h;
        c28738u.f74735g = i;
        if (i == 3) {
            z = c28738u.f74737i;
            if (z) {
                c28738u.runOnUiThread(new RunnableC28713N(this));
            }
        }
        if (i != 0) {
            semaphore = this.f74581a.f74591h.f74732d;
            semaphore.release();
        }
        lock2 = this.f74581a.f74591h.f74733e;
        lock2.unlock();
    }
}
