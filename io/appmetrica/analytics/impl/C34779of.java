package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.of */
/* loaded from: classes9.dex */
public final class C34779of implements InterfaceC34725mf {

    /* renamed from: a */
    public final /* synthetic */ C34937uf f95128a;

    public C34779of(C34937uf c34937uf) {
        this.f95128a = c34937uf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34725mf
    @WorkerThread
    /* renamed from: a */
    public final void mo21079a() {
        C34937uf c34937uf = this.f95128a;
        C35010xa c35010xa = c34937uf.f95467b;
        C34752nf c34752nf = new C34752nf(c34937uf);
        c35010xa.getClass();
        try {
            FutureTask futureTask = new FutureTask(new CallableC34984wa(c35010xa));
            C34693la.f94825C.f94831d.f95608a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + ThreadFactoryC34480dd.f94200a.incrementAndGet()).start();
            C33896Ff c33896Ff = (C33896Ff) futureTask.get(5L, TimeUnit.SECONDS);
            AbstractC34679kn.m21474a(c35010xa.f95595b);
            C34937uf.m20911a(c34937uf, c33896Ff, C34937uf.m20912a(c34937uf));
        } catch (Throwable th) {
            try {
                c34752nf.mo20973a(th);
            } finally {
                AbstractC34679kn.m21474a(c35010xa.f95595b);
            }
        }
    }
}
