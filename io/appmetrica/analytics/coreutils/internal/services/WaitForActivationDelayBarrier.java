package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.RunnableC33724l;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes9.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* renamed from: a */
    private long f92451a;

    /* renamed from: b */
    private final SystemTimeProvider f92452b;

    /* loaded from: classes9.dex */
    public static class ActivationBarrierHelper {

        /* renamed from: a */
        private boolean f92453a = false;

        /* renamed from: b */
        private final C33727a f92454b;

        /* renamed from: c */
        private final WaitForActivationDelayBarrier f92455c;

        public ActivationBarrierHelper(@NonNull Runnable runnable, @NonNull WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f92454b = new C33727a(this, runnable);
            this.f92455c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j, @NonNull ICommonExecutor iCommonExecutor) {
            if (!this.f92453a) {
                this.f92455c.subscribe(j, iCommonExecutor, this.f92454b);
            } else {
                iCommonExecutor.execute(new RunnableC33728b(this));
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f92451a = this.f92452b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j, @NonNull ICommonExecutor iCommonExecutor, @NonNull ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new RunnableC33724l(activationBarrierCallback), Math.max(j - (this.f92452b.currentTimeMillis() - this.f92451a), 0L));
    }

    WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f92452b = systemTimeProvider;
    }
}
