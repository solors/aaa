package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC17846b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.applovin.walking.async.c */
/* loaded from: classes6.dex */
public class C17849c implements AbstractAsyncTaskC17846b.InterfaceC17847a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f45018a;

    /* renamed from: b */
    private final ThreadPoolExecutor f45019b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC17846b> f45020c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC17846b f45021d = null;

    public C17849c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f45018a = linkedBlockingQueue;
        this.f45019b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m64959a() {
        AbstractAsyncTaskC17846b poll = this.f45020c.poll();
        this.f45021d = poll;
        if (poll != null) {
            poll.m64960a(this.f45019b);
        }
    }

    /* renamed from: b */
    public void m64957b(AbstractAsyncTaskC17846b abstractAsyncTaskC17846b) {
        abstractAsyncTaskC17846b.m64961a(this);
        this.f45020c.add(abstractAsyncTaskC17846b);
        if (this.f45021d == null) {
            m64959a();
        }
    }

    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC17846b.InterfaceC17847a
    /* renamed from: a */
    public void mo64958a(AbstractAsyncTaskC17846b abstractAsyncTaskC17846b) {
        this.f45021d = null;
        m64959a();
    }
}
