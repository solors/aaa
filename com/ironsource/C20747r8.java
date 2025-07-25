package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.r8 */
/* loaded from: classes6.dex */
public class C20747r8 {

    /* renamed from: a */
    public static final String f52729a = "3g";

    /* renamed from: b */
    public static final String f52730b = "wifi";

    /* renamed from: c */
    public static final String f52731c = "none";

    /* renamed from: d */
    public static final String f52732d = "bluetooth";

    /* renamed from: e */
    public static final String f52733e = "ethernet";

    /* renamed from: f */
    public static final String f52734f = "vpn";

    /* renamed from: g */
    public static final String f52735g = "cellular";

    /* renamed from: h */
    public static final String f52736h = "wifiAware";

    /* renamed from: i */
    public static final String f52737i = "lowpan";

    /* renamed from: a */
    public static String m55543a(Context context) {
        ConnectivityManager connectivityManager;
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    String typeName = activeNetworkInfo.getTypeName();
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        str = f52729a;
                    } else if (type == 1) {
                        str = f52730b;
                    } else {
                        sb2.append(typeName);
                    }
                    sb2.append(str);
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static int m55542b(Context context) {
        if (context != null) {
            try {
                return context.getResources().getConfiguration().mcc;
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static int m55541c(Context context) {
        if (context != null) {
            try {
                return context.getResources().getConfiguration().mnc;
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static String m55540d(Context context) {
        if (context != null) {
            try {
                return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
                return "";
            }
        }
        return "";
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: e */
    public static int m55539e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (packageManager.checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0 || packageManager.checkPermission("android.permission.READ_BASIC_PHONE_STATE", context.getPackageName()) == 0) {
                return telephonyManager.getDataNetworkType();
            }
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return -1;
    }

    /* renamed from: f */
    public static int m55538f(Context context) {
        if (context != null) {
            try {
                return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static String m55537g(Context context) {
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    return telephonyManager.getSimOperator();
                }
                return "";
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
                return "";
            }
        }
        return "";
    }

    /* renamed from: h */
    public static boolean m55536h(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (!activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m55535i(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (networkInfo = connectivityManager.getNetworkInfo(0)) == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m55534j(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}
