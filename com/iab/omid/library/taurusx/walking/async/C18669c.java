package com.iab.omid.library.taurusx.walking.async;

import com.iab.omid.library.taurusx.walking.async.AbstractAsyncTaskC18666b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.taurusx.walking.async.c */
/* loaded from: classes6.dex */
public class C18669c implements AbstractAsyncTaskC18666b.InterfaceC18667a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f46709a;

    /* renamed from: b */
    private final ThreadPoolExecutor f46710b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18666b> f46711c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18666b f46712d = null;

    public C18669c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f46709a = linkedBlockingQueue;
        this.f46710b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m61813a() {
        AbstractAsyncTaskC18666b poll = this.f46711c.poll();
        this.f46712d = poll;
        if (poll != null) {
            poll.m61814a(this.f46710b);
        }
    }

    /* renamed from: b */
    public void m61811b(AbstractAsyncTaskC18666b abstractAsyncTaskC18666b) {
        abstractAsyncTaskC18666b.m61815a(this);
        this.f46711c.add(abstractAsyncTaskC18666b);
        if (this.f46712d == null) {
            m61813a();
        }
    }

    @Override // com.iab.omid.library.taurusx.walking.async.AbstractAsyncTaskC18666b.InterfaceC18667a
    /* renamed from: a */
    public void mo61812a(AbstractAsyncTaskC18666b abstractAsyncTaskC18666b) {
        this.f46712d = null;
        m61813a();
    }
}
