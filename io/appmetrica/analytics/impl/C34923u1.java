package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.u1 */
/* loaded from: classes9.dex */
public final class C34923u1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C33832D1 f95442a;

    public C34923u1(C33832D1 c33832d1) {
        this.f95442a = c33832d1;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.f95442a) {
            C33832D1 c33832d1 = this.f95442a;
            if (!c33832d1.f92687c) {
                return;
            }
            c33832d1.f92686b.onCreate();
        }
    }
}
