package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.crashlytics.internal.Logger;

/* loaded from: classes4.dex */
class BatteryState {

    /* renamed from: a */
    private final Float f42292a;

    /* renamed from: b */
    private final boolean f42293b;

    private BatteryState(Float f, boolean z) {
        this.f42293b = z;
        this.f42292a = f;
    }

    /* renamed from: a */
    private static Float m67201a(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra != -1 && intExtra2 != -1) {
            return Float.valueOf(intExtra / intExtra2);
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m67200b(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    public static BatteryState get(Context context) {
        boolean z = false;
        Float f = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m67200b(registerReceiver);
                f = m67201a(registerReceiver);
            }
        } catch (IllegalStateException e) {
            Logger.getLogger().m67213e("An error occurred getting battery state.", e);
        }
        return new BatteryState(f, z);
    }

    public Float getBatteryLevel() {
        return this.f42292a;
    }

    public int getBatteryVelocity() {
        Float f;
        if (this.f42293b && (f = this.f42292a) != null) {
            if (f.floatValue() < 0.99d) {
                return 2;
            }
            return 3;
        }
        return 1;
    }
}
