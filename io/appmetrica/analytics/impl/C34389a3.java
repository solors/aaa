package io.appmetrica.analytics.impl;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.a3 */
/* loaded from: classes9.dex */
public final class C34389a3 implements ChargeTypeProvider {

    /* renamed from: d */
    public static final ChargeType f93905d = ChargeType.UNKNOWN;

    /* renamed from: a */
    public final ICommonExecutor f93906a;

    /* renamed from: b */
    public volatile BatteryInfo f93907b;

    /* renamed from: c */
    public final ArrayList f93908c = new ArrayList();

    public C34389a3(@NonNull ICommonExecutor iCommonExecutor, @NonNull C34316X2 c34316x2) {
        C34364Z2 c34364z2 = new C34364Z2(this);
        this.f93906a = iCommonExecutor;
        this.f93907b = m22023a(c34316x2.m22120a(c34364z2));
    }

    /* renamed from: a */
    public static BatteryInfo m22023a(Intent intent) {
        ChargeType chargeType = f93905d;
        Integer num = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                num = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            chargeType = ChargeType.NONE;
            if (intExtra3 != 1) {
                if (intExtra3 != 2) {
                    if (intExtra3 == 4) {
                        chargeType = ChargeType.WIRELESS;
                    }
                } else {
                    chargeType = ChargeType.USB;
                }
            } else {
                chargeType = ChargeType.AC;
            }
        }
        return new BatteryInfo(num, chargeType);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    @Nullable
    public final Integer getBatteryLevel() {
        BatteryInfo batteryInfo = this.f93907b;
        if (batteryInfo == null) {
            return null;
        }
        return batteryInfo.batteryLevel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    @NonNull
    public final ChargeType getChargeType() {
        BatteryInfo batteryInfo = this.f93907b;
        if (batteryInfo == null) {
            return ChargeType.UNKNOWN;
        }
        return batteryInfo.chargeType;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final synchronized void registerChargeTypeListener(@NonNull ChargeTypeChangeListener chargeTypeChangeListener) {
        this.f93908c.add(chargeTypeChangeListener);
        chargeTypeChangeListener.onChargeTypeChanged(getChargeType());
    }
}
