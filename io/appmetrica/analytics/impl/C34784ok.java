package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.ok */
/* loaded from: classes9.dex */
public final class C34784ok implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        String str;
        String simOperator = ((TelephonyManager) obj).getSimOperator();
        if (!TextUtils.isEmpty(simOperator)) {
            str = simOperator.substring(3);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }
}
