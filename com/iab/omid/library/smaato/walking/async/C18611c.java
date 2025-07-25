package com.iab.omid.library.smaato.walking.async;

import com.iab.omid.library.smaato.walking.async.AbstractAsyncTaskC18608b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.smaato.walking.async.c */
/* loaded from: classes6.dex */
public class C18611c implements AbstractAsyncTaskC18608b.InterfaceC18609a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f46581a;

    /* renamed from: b */
    private final ThreadPoolExecutor f46582b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18608b> f46583c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18608b f46584d = null;

    public C18611c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f46581a = linkedBlockingQueue;
        this.f46582b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m62048a() {
        AbstractAsyncTaskC18608b poll = this.f46583c.poll();
        this.f46584d = poll;
        if (poll != null) {
            poll.m62049a(this.f46582b);
        }
    }

    /* renamed from: b */
    public void m62046b(AbstractAsyncTaskC18608b abstractAsyncTaskC18608b) {
        abstractAsyncTaskC18608b.m62050a(this);
        this.f46583c.add(abstractAsyncTaskC18608b);
        if (this.f46584d == null) {
            m62048a();
        }
    }

    @Override // com.iab.omid.library.smaato.walking.async.AbstractAsyncTaskC18608b.InterfaceC18609a
    /* renamed from: a */
    public void mo62047a(AbstractAsyncTaskC18608b abstractAsyncTaskC18608b) {
        this.f46584d = null;
        m62048a();
    }
}
