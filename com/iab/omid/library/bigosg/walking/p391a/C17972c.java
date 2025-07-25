package com.iab.omid.library.bigosg.walking.p391a;

import com.iab.omid.library.bigosg.walking.p391a.AbstractAsyncTaskC17969b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.bigosg.walking.a.c */
/* loaded from: classes6.dex */
public class C17972c implements AbstractAsyncTaskC17969b.InterfaceC17970a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f45274a;

    /* renamed from: b */
    private final ThreadPoolExecutor f45275b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC17969b> f45276c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC17969b f45277d = null;

    public C17972c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f45274a = linkedBlockingQueue;
        this.f45275b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m64492a() {
        AbstractAsyncTaskC17969b poll = this.f45276c.poll();
        this.f45277d = poll;
        if (poll != null) {
            poll.m64493a(this.f45275b);
        }
    }

    /* renamed from: b */
    public void m64490b(AbstractAsyncTaskC17969b abstractAsyncTaskC17969b) {
        abstractAsyncTaskC17969b.m64494a(this);
        this.f45276c.add(abstractAsyncTaskC17969b);
        if (this.f45277d == null) {
            m64492a();
        }
    }

    @Override // com.iab.omid.library.bigosg.walking.p391a.AbstractAsyncTaskC17969b.InterfaceC17970a
    /* renamed from: a */
    public void mo64491a(AbstractAsyncTaskC17969b abstractAsyncTaskC17969b) {
        this.f45277d = null;
        m64492a();
    }
}
