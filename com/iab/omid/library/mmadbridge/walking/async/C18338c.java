package com.iab.omid.library.mmadbridge.walking.async;

import com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC18335b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.mmadbridge.walking.async.c */
/* loaded from: classes6.dex */
public class C18338c implements AbstractAsyncTaskC18335b.InterfaceC18336a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f46041a;

    /* renamed from: b */
    private final ThreadPoolExecutor f46042b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18335b> f46043c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18335b f46044d = null;

    public C18338c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f46041a = linkedBlockingQueue;
        this.f46042b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m63060a() {
        AbstractAsyncTaskC18335b poll = this.f46043c.poll();
        this.f46044d = poll;
        if (poll != null) {
            poll.m63061a(this.f46042b);
        }
    }

    /* renamed from: b */
    public void m63058b(AbstractAsyncTaskC18335b abstractAsyncTaskC18335b) {
        abstractAsyncTaskC18335b.m63062a(this);
        this.f46043c.add(abstractAsyncTaskC18335b);
        if (this.f46044d == null) {
            m63060a();
        }
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC18335b.InterfaceC18336a
    /* renamed from: a */
    public void mo63059a(AbstractAsyncTaskC18335b abstractAsyncTaskC18335b) {
        this.f46044d = null;
        m63060a();
    }
}
