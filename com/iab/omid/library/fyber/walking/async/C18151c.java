package com.iab.omid.library.fyber.walking.async;

import com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC18148b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.fyber.walking.async.c */
/* loaded from: classes6.dex */
public class C18151c implements AbstractAsyncTaskC18148b.InterfaceC18149a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f45652a;

    /* renamed from: b */
    private final ThreadPoolExecutor f45653b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18148b> f45654c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18148b f45655d = null;

    public C18151c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f45652a = linkedBlockingQueue;
        this.f45653b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m63789a() {
        AbstractAsyncTaskC18148b poll = this.f45654c.poll();
        this.f45655d = poll;
        if (poll != null) {
            poll.m63790a(this.f45653b);
        }
    }

    /* renamed from: b */
    public void m63787b(AbstractAsyncTaskC18148b abstractAsyncTaskC18148b) {
        abstractAsyncTaskC18148b.m63791a(this);
        this.f45654c.add(abstractAsyncTaskC18148b);
        if (this.f45655d == null) {
            m63789a();
        }
    }

    @Override // com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC18148b.InterfaceC18149a
    /* renamed from: a */
    public void mo63788a(AbstractAsyncTaskC18148b abstractAsyncTaskC18148b) {
        this.f45655d = null;
        m63789a();
    }
}
