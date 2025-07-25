package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;

/* renamed from: io.appmetrica.analytics.impl.i3 */
/* loaded from: classes9.dex */
public final class C34605i3 implements ApplicationStateObserver {

    /* renamed from: a */
    public final /* synthetic */ C34632j3 f94596a;

    public C34605i3(C34632j3 c34632j3) {
        this.f94596a = c34632j3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
    public final void onApplicationStateChanged(ApplicationState applicationState) {
        C34632j3 c34632j3 = this.f94596a;
        c34632j3.getClass();
        if (applicationState == ApplicationState.VISIBLE) {
            try {
                BillingMonitor billingMonitor = c34632j3.f94661a;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
