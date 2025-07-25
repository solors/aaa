package p753k4;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PackageUtils.java */
/* renamed from: k4.d */
/* loaded from: classes6.dex */
public class C37387d {
    /* renamed from: a */
    public static String m18214a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String simCountryIso = telephonyManager.getSimCountryIso();
                if (!TextUtils.isEmpty(simCountryIso)) {
                    return simCountryIso;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return Locale.getDefault().getCountry();
    }

    /* renamed from: b */
    public static boolean m18213b(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
