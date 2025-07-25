package com.iab.omid.library.inmobi.walking.async;

import com.iab.omid.library.inmobi.walking.async.AbstractAsyncTaskC18216b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.inmobi.walking.async.c */
/* loaded from: classes6.dex */
public class C18219c implements AbstractAsyncTaskC18216b.InterfaceC18217a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f45781a;

    /* renamed from: b */
    private final ThreadPoolExecutor f45782b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18216b> f45783c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18216b f45784d = null;

    public C18219c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f45781a = linkedBlockingQueue;
        this.f45782b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m63548a() {
        AbstractAsyncTaskC18216b poll = this.f45783c.poll();
        this.f45784d = poll;
        if (poll != null) {
            poll.m63549a(this.f45782b);
        }
    }

    /* renamed from: b */
    public void m63546b(AbstractAsyncTaskC18216b abstractAsyncTaskC18216b) {
        abstractAsyncTaskC18216b.m63550a(this);
        this.f45783c.add(abstractAsyncTaskC18216b);
        if (this.f45784d == null) {
            m63548a();
        }
    }

    @Override // com.iab.omid.library.inmobi.walking.async.AbstractAsyncTaskC18216b.InterfaceC18217a
    /* renamed from: a */
    public void mo63547a(AbstractAsyncTaskC18216b abstractAsyncTaskC18216b) {
        this.f45784d = null;
        m63548a();
    }
}
