package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC18786b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.vungle.walking.async.c */
/* loaded from: classes6.dex */
public class C18789c implements AbstractAsyncTaskC18786b.InterfaceC18787a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f46972a;

    /* renamed from: b */
    private final ThreadPoolExecutor f46973b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18786b> f46974c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18786b f46975d = null;

    public C18789c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f46972a = linkedBlockingQueue;
        this.f46973b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m61326a() {
        AbstractAsyncTaskC18786b poll = this.f46974c.poll();
        this.f46975d = poll;
        if (poll != null) {
            poll.m61327a(this.f46973b);
        }
    }

    /* renamed from: b */
    public void m61324b(AbstractAsyncTaskC18786b abstractAsyncTaskC18786b) {
        abstractAsyncTaskC18786b.m61328a(this);
        this.f46974c.add(abstractAsyncTaskC18786b);
        if (this.f46975d == null) {
            m61326a();
        }
    }

    @Override // com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC18786b.InterfaceC18787a
    /* renamed from: a */
    public void mo61325a(AbstractAsyncTaskC18786b abstractAsyncTaskC18786b) {
        this.f46975d = null;
        m61326a();
    }
}
