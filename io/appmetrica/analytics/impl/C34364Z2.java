package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* renamed from: io.appmetrica.analytics.impl.Z2 */
/* loaded from: classes9.dex */
public final class C34364Z2 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C34389a3 f93859a;

    public C34364Z2(C34389a3 c34389a3) {
        this.f93859a = c34389a3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ChargeType chargeType;
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f93859a.f93907b;
        if (batteryInfo == null) {
            chargeType = null;
        } else {
            chargeType = batteryInfo.chargeType;
        }
        this.f93859a.getClass();
        BatteryInfo m22023a = C34389a3.m22023a(intent);
        this.f93859a.f93907b = m22023a;
        if (chargeType != m22023a.chargeType) {
            this.f93859a.f93906a.execute(new C34340Y2(this, m22023a));
        }
    }
}
