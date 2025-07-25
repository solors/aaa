package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC18272b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.ironsrc.walking.async.c */
/* loaded from: classes6.dex */
public class C18275c implements AbstractAsyncTaskC18272b.InterfaceC18273a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f45906a;

    /* renamed from: b */
    private final ThreadPoolExecutor f45907b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC18272b> f45908c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC18272b f45909d = null;

    public C18275c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f45906a = linkedBlockingQueue;
        this.f45907b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m63313a() {
        AbstractAsyncTaskC18272b poll = this.f45908c.poll();
        this.f45909d = poll;
        if (poll != null) {
            poll.m63314a(this.f45907b);
        }
    }

    /* renamed from: b */
    public void m63311b(AbstractAsyncTaskC18272b abstractAsyncTaskC18272b) {
        abstractAsyncTaskC18272b.m63315a(this);
        this.f45908c.add(abstractAsyncTaskC18272b);
        if (this.f45909d == null) {
            m63313a();
        }
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC18272b.InterfaceC18273a
    /* renamed from: a */
    public void mo63312a(AbstractAsyncTaskC18272b abstractAsyncTaskC18272b) {
        this.f45909d = null;
        m63313a();
    }
}
