package com.zeus.gmc.sdk.mobileads.columbus.internal.coiic;

import com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AbstractAsyncTaskC32719coi222o222;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.c2oc2i */
/* loaded from: classes8.dex */
public class C32715c2oc2i implements AbstractAsyncTaskC32719coi222o222.InterfaceC32721coo2iico {
    private final ArrayDeque<AbstractAsyncTaskC32719coi222o222> c2oc2i = new ArrayDeque<>();
    private AbstractAsyncTaskC32719coi222o222 cioccoiococ = null;
    private final ThreadPoolExecutor coi222o222;
    private final BlockingQueue<Runnable> coo2iico;

    public C32715c2oc2i() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.coo2iico = linkedBlockingQueue;
        this.coi222o222 = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void coo2iico() {
        AbstractAsyncTaskC32719coi222o222 poll = this.c2oc2i.poll();
        this.cioccoiococ = poll;
        if (poll != null) {
            poll.coo2iico(this.coi222o222);
        }
    }

    public void coi222o222(AbstractAsyncTaskC32719coi222o222 abstractAsyncTaskC32719coi222o222) {
        abstractAsyncTaskC32719coi222o222.coo2iico(this);
        this.c2oc2i.add(abstractAsyncTaskC32719coi222o222);
        if (this.cioccoiococ == null) {
            coo2iico();
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AbstractAsyncTaskC32719coi222o222.InterfaceC32721coo2iico
    public void coo2iico(AbstractAsyncTaskC32719coi222o222 abstractAsyncTaskC32719coi222o222) {
        this.cioccoiococ = null;
        coo2iico();
    }
}
