package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ni2;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class ri2 implements ni2.InterfaceC30949a {

    /* renamed from: b */
    private final ArrayDeque<ni2> f84770b = new ArrayDeque<>();

    /* renamed from: c */
    private ni2 f84771c = null;

    /* renamed from: a */
    private final ThreadPoolExecutor f84769a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b */
    private void m30040b() {
        ni2 poll = this.f84770b.poll();
        this.f84771c = poll;
        if (poll != null) {
            poll.m31497a(this.f84769a);
        }
    }

    /* renamed from: a */
    public final void m30042a() {
        this.f84771c = null;
        m30040b();
    }

    /* renamed from: a */
    public final void m30041a(ni2 ni2Var) {
        ni2Var.m31499a(this);
        this.f84770b.add(ni2Var);
        if (this.f84771c == null) {
            m30040b();
        }
    }
}
