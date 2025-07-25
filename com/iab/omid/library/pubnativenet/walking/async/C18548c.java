package com.iab.omid.library.pubnativenet.walking.async;

import com.iab.omid.library.pubnativenet.walking.async.AbstractAsyncTaskC18545b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.pubnativenet.walking.async.c */
/* loaded from: classes6.dex */
public class C18548c implements AbstractAsyncTaskC18545b.InterfaceC18546a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f46446a;

    /* renamed from: b */
    private final ThreadPoolExecutor f46447b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18545b> f46448c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18545b f46449d = null;

    public C18548c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f46446a = linkedBlockingQueue;
        this.f46447b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m62301a() {
        AbstractAsyncTaskC18545b poll = this.f46448c.poll();
        this.f46449d = poll;
        if (poll != null) {
            poll.m62302a(this.f46447b);
        }
    }

    /* renamed from: b */
    public void m62299b(AbstractAsyncTaskC18545b abstractAsyncTaskC18545b) {
        abstractAsyncTaskC18545b.m62303a(this);
        this.f46448c.add(abstractAsyncTaskC18545b);
        if (this.f46449d == null) {
            m62301a();
        }
    }

    @Override // com.iab.omid.library.pubnativenet.walking.async.AbstractAsyncTaskC18545b.InterfaceC18546a
    /* renamed from: a */
    public void mo62300a(AbstractAsyncTaskC18545b abstractAsyncTaskC18545b) {
        this.f46449d = null;
        m62301a();
    }
}
