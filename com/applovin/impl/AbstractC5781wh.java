package com.applovin.impl;

import android.adservices.AdServicesState;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.wh */
/* loaded from: classes2.dex */
public abstract class AbstractC5781wh {
    /* renamed from: a */
    public static boolean m93513a(Context context) {
        return AbstractC5947z3.m92543a("android.permission.ACCESS_ADSERVICES_AD_ID", context);
    }

    /* renamed from: b */
    public static boolean m93512b(Context context) {
        return AbstractC5947z3.m92543a("android.permission.ACCESS_ADSERVICES_ATTRIBUTION", context);
    }

    /* renamed from: c */
    public static boolean m93511c(Context context) {
        return AbstractC5947z3.m92543a("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE", context);
    }

    /* renamed from: d */
    public static boolean m93510d(Context context) {
        return AbstractC5947z3.m92543a("android.permission.ACCESS_ADSERVICES_TOPICS", context);
    }

    /* renamed from: e */
    public static boolean m93509e(Context context) {
        if (m93508f(context) && AdServicesState.isAdServicesStateEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m93508f(Context context) {
        if (AbstractC5947z3.m92540c() && !AppLovinSdkUtils.isFireOS(context)) {
            return true;
        }
        return false;
    }
}
