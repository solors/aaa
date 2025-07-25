package com.iab.omid.library.amazon.walking.async;

import com.iab.omid.library.amazon.walking.async.AbstractAsyncTaskC17785b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.amazon.walking.async.c */
/* loaded from: classes6.dex */
public class C17788c implements AbstractAsyncTaskC17785b.InterfaceC17786a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f44889a;

    /* renamed from: b */
    private final ThreadPoolExecutor f44890b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC17785b> f44891c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC17785b f44892d = null;

    public C17788c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f44889a = linkedBlockingQueue;
        this.f44890b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m65200a() {
        AbstractAsyncTaskC17785b poll = this.f44891c.poll();
        this.f44892d = poll;
        if (poll != null) {
            poll.m65201a(this.f44890b);
        }
    }

    /* renamed from: b */
    public void m65198b(AbstractAsyncTaskC17785b abstractAsyncTaskC17785b) {
        abstractAsyncTaskC17785b.m65202a(this);
        this.f44891c.add(abstractAsyncTaskC17785b);
        if (this.f44892d == null) {
            m65200a();
        }
    }

    @Override // com.iab.omid.library.amazon.walking.async.AbstractAsyncTaskC17785b.InterfaceC17786a
    /* renamed from: a */
    public void mo65199a(AbstractAsyncTaskC17785b abstractAsyncTaskC17785b) {
        this.f44892d = null;
        m65200a();
    }
}
