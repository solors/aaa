package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.fyber.inneractive.sdk.util.j */
/* loaded from: classes4.dex */
public abstract class AbstractC15453j extends AbstractC15459m {
    /* renamed from: j */
    public static String m76500j() {
        try {
            return ((TelephonyManager) AbstractC15459m.f30607a.getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static String m76499k() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    /* renamed from: l */
    public static int m76498l() {
        try {
            if (AbstractC15459m.m76485a("android.permission.READ_PHONE_STATE")) {
                return ((TelephonyManager) AbstractC15459m.f30607a.getSystemService("phone")).getDataNetworkType();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: m */
    public static String m76497m() {
        try {
            return AbstractC15459m.f30607a.getPackageManager().getPackageInfo(AbstractC15459m.f30607a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static boolean m76496n() {
        boolean z;
        if ((AbstractC15459m.f30607a.getResources().getConfiguration().screenLayout & 15) == 4) {
            z = true;
        } else {
            z = false;
        }
        IAlog.m76525e("This device has a tablet resolution? %s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: o */
    public static boolean m76495o() {
        TelephonyManager telephonyManager = (TelephonyManager) AbstractC15459m.f30607a.getSystemService("phone");
        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
            return true;
        }
        return false;
    }
}
