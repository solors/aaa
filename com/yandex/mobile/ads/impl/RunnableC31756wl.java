package com.yandex.mobile.ads.impl;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.yandex.mobile.ads.impl.wl */
/* loaded from: classes8.dex */
public final class RunnableC31756wl implements Runnable {

    /* renamed from: b */
    final /* synthetic */ ml1 f87299b;

    /* renamed from: c */
    final /* synthetic */ C31827xl f87300c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC31756wl(C31827xl c31827xl, ml1 ml1Var) {
        this.f87300c = c31827xl;
        this.f87299b = ml1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.f87300c.f87728c;
            blockingQueue.put(this.f87299b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
