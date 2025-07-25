package com.iab.omid.library.corpmailru.walking.p397a;

import com.iab.omid.library.corpmailru.walking.p397a.AbstractAsyncTaskC18080b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.corpmailru.walking.a.c */
/* loaded from: classes6.dex */
public class C18083c implements AbstractAsyncTaskC18080b.InterfaceC18081a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f45516a;

    /* renamed from: b */
    private final ThreadPoolExecutor f45517b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18080b> f45518c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18080b f45519d = null;

    public C18083c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f45516a = linkedBlockingQueue;
        this.f45517b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m64042a() {
        AbstractAsyncTaskC18080b poll = this.f45518c.poll();
        this.f45519d = poll;
        if (poll != null) {
            poll.m64043a(this.f45517b);
        }
    }

    /* renamed from: b */
    public void m64040b(AbstractAsyncTaskC18080b abstractAsyncTaskC18080b) {
        abstractAsyncTaskC18080b.m64044a(this);
        this.f45518c.add(abstractAsyncTaskC18080b);
        if (this.f45519d == null) {
            m64042a();
        }
    }

    @Override // com.iab.omid.library.corpmailru.walking.p397a.AbstractAsyncTaskC18080b.InterfaceC18081a
    /* renamed from: a */
    public void mo64041a(AbstractAsyncTaskC18080b abstractAsyncTaskC18080b) {
        this.f45519d = null;
        m64042a();
    }
}
