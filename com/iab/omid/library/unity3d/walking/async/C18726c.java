package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC18723b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.unity3d.walking.async.c */
/* loaded from: classes6.dex */
public class C18726c implements AbstractAsyncTaskC18723b.InterfaceC18724a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f46837a;

    /* renamed from: b */
    private final ThreadPoolExecutor f46838b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18723b> f46839c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18723b f46840d = null;

    public C18726c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f46837a = linkedBlockingQueue;
        this.f46838b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m61579a() {
        AbstractAsyncTaskC18723b poll = this.f46839c.poll();
        this.f46840d = poll;
        if (poll != null) {
            poll.m61580a(this.f46838b);
        }
    }

    /* renamed from: b */
    public void m61577b(AbstractAsyncTaskC18723b abstractAsyncTaskC18723b) {
        abstractAsyncTaskC18723b.m61581a(this);
        this.f46839c.add(abstractAsyncTaskC18723b);
        if (this.f46840d == null) {
            m61579a();
        }
    }

    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC18723b.InterfaceC18724a
    /* renamed from: a */
    public void mo61578a(AbstractAsyncTaskC18723b abstractAsyncTaskC18723b) {
        this.f46840d = null;
        m61579a();
    }
}
