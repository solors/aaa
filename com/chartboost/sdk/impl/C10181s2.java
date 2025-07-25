package com.chartboost.sdk.impl;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;

/* renamed from: com.chartboost.sdk.impl.s2 */
/* loaded from: classes3.dex */
public class C10181s2 {
    /* renamed from: a */
    public C10160r2 m80635a(Context context) {
        String str;
        String str2;
        if (m80632c(context)) {
            C9763c7.m81923a("Permission READ_PHONE_STATE not granted", null);
            return null;
        }
        TelephonyManager m80633b = m80633b(context);
        if (m80634a(m80633b)) {
            String simOperator = m80633b.getSimOperator();
            if (TextUtils.isEmpty(simOperator)) {
                str = null;
                str2 = null;
            } else {
                str = simOperator.substring(0, 3);
                str2 = simOperator.substring(3);
            }
            return new C10160r2(simOperator, str, str2, m80633b.getNetworkOperatorName(), m80633b.getNetworkCountryIso(), m80633b.getPhoneType());
        }
        return null;
    }

    /* renamed from: b */
    public final TelephonyManager m80633b(Context context) {
        if (context != null) {
            try {
                return (TelephonyManager) context.getSystemService("phone");
            } catch (Exception e) {
                C9763c7.m81920b("Unable to retrieve TELEPHONY_SERVICE", e);
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m80632c(Context context) {
        if (context == null || ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m80634a(TelephonyManager telephonyManager) {
        return (telephonyManager == null || telephonyManager.getPhoneType() == 0 || telephonyManager.getSimState() != 5) ? false : true;
    }
}
