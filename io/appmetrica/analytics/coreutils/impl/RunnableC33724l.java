package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* renamed from: io.appmetrica.analytics.coreutils.impl.l */
/* loaded from: classes9.dex */
public final class RunnableC33724l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ActivationBarrierCallback f92406a;

    public RunnableC33724l(ActivationBarrierCallback activationBarrierCallback) {
        this.f92406a = activationBarrierCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f92406a.onWaitFinished();
    }
}
