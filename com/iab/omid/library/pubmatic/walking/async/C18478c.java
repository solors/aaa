package com.iab.omid.library.pubmatic.walking.async;

import com.iab.omid.library.pubmatic.walking.async.AbstractAsyncTaskC18475b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.pubmatic.walking.async.c */
/* loaded from: classes6.dex */
public class C18478c implements AbstractAsyncTaskC18475b.InterfaceC18476a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f46311a;

    /* renamed from: b */
    private final ThreadPoolExecutor f46312b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18475b> f46313c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18475b f46314d = null;

    public C18478c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f46311a = linkedBlockingQueue;
        this.f46312b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m62554a() {
        AbstractAsyncTaskC18475b poll = this.f46313c.poll();
        this.f46314d = poll;
        if (poll != null) {
            poll.m62555a(this.f46312b);
        }
    }

    /* renamed from: b */
    public void m62552b(AbstractAsyncTaskC18475b abstractAsyncTaskC18475b) {
        abstractAsyncTaskC18475b.m62556a(this);
        this.f46313c.add(abstractAsyncTaskC18475b);
        if (this.f46314d == null) {
            m62554a();
        }
    }

    @Override // com.iab.omid.library.pubmatic.walking.async.AbstractAsyncTaskC18475b.InterfaceC18476a
    /* renamed from: a */
    public void mo62553a(AbstractAsyncTaskC18475b abstractAsyncTaskC18475b) {
        this.f46314d = null;
        m62554a();
    }
}
