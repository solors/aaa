package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.AbstractAsyncTaskC10174rc;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.chartboost.sdk.impl.zc */
/* loaded from: classes3.dex */
public class C10414zc implements AbstractAsyncTaskC10174rc.InterfaceC10175a {

    /* renamed from: a */
    public final BlockingQueue f23681a;

    /* renamed from: b */
    public final ThreadPoolExecutor f23682b;

    /* renamed from: c */
    public final ArrayDeque f23683c = new ArrayDeque();

    /* renamed from: d */
    public AbstractAsyncTaskC10174rc f23684d = null;

    public C10414zc() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f23681a = linkedBlockingQueue;
        this.f23682b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    public final void m79784a() {
        AbstractAsyncTaskC10174rc abstractAsyncTaskC10174rc = (AbstractAsyncTaskC10174rc) this.f23683c.poll();
        this.f23684d = abstractAsyncTaskC10174rc;
        if (abstractAsyncTaskC10174rc != null) {
            abstractAsyncTaskC10174rc.m80649a(this.f23682b);
        }
    }

    /* renamed from: b */
    public void m79782b(AbstractAsyncTaskC10174rc abstractAsyncTaskC10174rc) {
        abstractAsyncTaskC10174rc.m80651a(this);
        this.f23683c.add(abstractAsyncTaskC10174rc);
        if (this.f23684d == null) {
            m79784a();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractAsyncTaskC10174rc.InterfaceC10175a
    /* renamed from: a */
    public void mo79783a(AbstractAsyncTaskC10174rc abstractAsyncTaskC10174rc) {
        this.f23684d = null;
        m79784a();
    }
}
