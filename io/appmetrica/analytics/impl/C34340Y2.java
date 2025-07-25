package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Y2 */
/* loaded from: classes9.dex */
public final class C34340Y2 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ BatteryInfo f93793a;

    /* renamed from: b */
    public final /* synthetic */ C34364Z2 f93794b;

    public C34340Y2(C34364Z2 c34364z2, BatteryInfo batteryInfo) {
        this.f93794b = c34364z2;
        this.f93793a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C34389a3 c34389a3 = this.f93794b.f93859a;
        ChargeType chargeType = this.f93793a.chargeType;
        ChargeType chargeType2 = C34389a3.f93905d;
        synchronized (c34389a3) {
            Iterator it = c34389a3.f93908c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
