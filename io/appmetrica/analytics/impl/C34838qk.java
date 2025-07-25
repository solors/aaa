package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.qk */
/* loaded from: classes9.dex */
public final class C34838qk implements FunctionWithThrowable {

    /* renamed from: a */
    public final /* synthetic */ C34864rk f95241a;

    public C34838qk(C34864rk c34864rk) {
        this.f95241a = c34864rk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C34864rk c34864rk = this.f95241a;
        if (c34864rk.f95302b.hasPermission(c34864rk.f95301a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
