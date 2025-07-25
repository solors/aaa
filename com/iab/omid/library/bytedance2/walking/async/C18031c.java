package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC18028b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.bytedance2.walking.async.c */
/* loaded from: classes6.dex */
public class C18031c implements AbstractAsyncTaskC18028b.InterfaceC18029a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f45403a;

    /* renamed from: b */
    private final ThreadPoolExecutor f45404b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18028b> f45405c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18028b f45406d = null;

    public C18031c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f45403a = linkedBlockingQueue;
        this.f45404b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m64251a() {
        AbstractAsyncTaskC18028b poll = this.f45405c.poll();
        this.f45406d = poll;
        if (poll != null) {
            poll.m64252a(this.f45404b);
        }
    }

    /* renamed from: b */
    public void m64249b(AbstractAsyncTaskC18028b abstractAsyncTaskC18028b) {
        abstractAsyncTaskC18028b.m64253a(this);
        this.f45405c.add(abstractAsyncTaskC18028b);
        if (this.f45406d == null) {
            m64251a();
        }
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC18028b.InterfaceC18029a
    /* renamed from: a */
    public void mo64250a(AbstractAsyncTaskC18028b abstractAsyncTaskC18028b) {
        this.f45406d = null;
        m64251a();
    }
}
