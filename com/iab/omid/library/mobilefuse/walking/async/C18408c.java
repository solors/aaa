package com.iab.omid.library.mobilefuse.walking.async;

import com.iab.omid.library.mobilefuse.walking.async.AbstractAsyncTaskC18405b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.mobilefuse.walking.async.c */
/* loaded from: classes6.dex */
public class C18408c implements AbstractAsyncTaskC18405b.InterfaceC18406a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f46176a;

    /* renamed from: b */
    private final ThreadPoolExecutor f46177b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18405b> f46178c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18405b f46179d = null;

    public C18408c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f46176a = linkedBlockingQueue;
        this.f46177b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m62807a() {
        AbstractAsyncTaskC18405b poll = this.f46178c.poll();
        this.f46179d = poll;
        if (poll != null) {
            poll.m62808a(this.f46177b);
        }
    }

    /* renamed from: b */
    public void m62805b(AbstractAsyncTaskC18405b abstractAsyncTaskC18405b) {
        abstractAsyncTaskC18405b.m62809a(this);
        this.f46178c.add(abstractAsyncTaskC18405b);
        if (this.f46179d == null) {
            m62807a();
        }
    }

    @Override // com.iab.omid.library.mobilefuse.walking.async.AbstractAsyncTaskC18405b.InterfaceC18406a
    /* renamed from: a */
    public void mo62806a(AbstractAsyncTaskC18405b abstractAsyncTaskC18405b) {
        this.f46179d = null;
        m62807a();
    }
}
