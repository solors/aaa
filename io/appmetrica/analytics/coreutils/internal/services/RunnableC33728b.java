package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* renamed from: io.appmetrica.analytics.coreutils.internal.services.b */
/* loaded from: classes9.dex */
public final class RunnableC33728b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f92458a;

    public RunnableC33728b(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper) {
        this.f92458a = activationBarrierHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C33727a c33727a;
        c33727a = this.f92458a.f92454b;
        c33727a.f92457b.f92453a = true;
        c33727a.f92456a.run();
    }
}
