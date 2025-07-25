package com.iab.omid.library.appodeal.walking.async;

import com.iab.omid.library.appodeal.walking.async.AbstractAsyncTaskC17916b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.appodeal.walking.async.c */
/* loaded from: classes6.dex */
public class C17919c implements AbstractAsyncTaskC17916b.InterfaceC17917a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f45153a;

    /* renamed from: b */
    private final ThreadPoolExecutor f45154b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC17916b> f45155c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC17916b f45156d = null;

    public C17919c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f45153a = linkedBlockingQueue;
        this.f45154b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m64706a() {
        AbstractAsyncTaskC17916b poll = this.f45155c.poll();
        this.f45156d = poll;
        if (poll != null) {
            poll.m64707a(this.f45154b);
        }
    }

    /* renamed from: b */
    public void m64704b(AbstractAsyncTaskC17916b abstractAsyncTaskC17916b) {
        abstractAsyncTaskC17916b.m64708a(this);
        this.f45155c.add(abstractAsyncTaskC17916b);
        if (this.f45156d == null) {
            m64706a();
        }
    }

    @Override // com.iab.omid.library.appodeal.walking.async.AbstractAsyncTaskC17916b.InterfaceC17917a
    /* renamed from: a */
    public void mo64705a(AbstractAsyncTaskC17916b abstractAsyncTaskC17916b) {
        this.f45156d = null;
        m64706a();
    }
}
