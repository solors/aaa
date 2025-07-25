package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* renamed from: io.appmetrica.analytics.coreutils.internal.services.a */
/* loaded from: classes9.dex */
public final class C33727a implements ActivationBarrierCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f92456a;

    /* renamed from: b */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f92457b;

    public C33727a(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, Runnable runnable) {
        this.f92457b = activationBarrierHelper;
        this.f92456a = runnable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f92457b.f92453a = true;
        this.f92456a.run();
    }
}
