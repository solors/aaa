package com.apm.insight.p130l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.apm.insight.p129k.CrashUploader;
import com.ironsource.C20747r8;

/* renamed from: com.apm.insight.l.k */
/* loaded from: classes2.dex */
public final class Net {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Net.java */
    /* renamed from: com.apm.insight.l.k$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C38261 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3938a;

        static {
            int[] iArr = new int[CrashUploader.EnumC3812b.values().length];
            f3938a = iArr;
            try {
                iArr[CrashUploader.EnumC3812b.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3938a[CrashUploader.EnumC3812b.MOBILE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3938a[CrashUploader.EnumC3812b.MOBILE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3938a[CrashUploader.EnumC3812b.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3938a[CrashUploader.EnumC3812b.MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3938a[CrashUploader.EnumC3812b.MOBILE_5G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: a */
    public static String m101643a(Context context) {
        return m101642a(m101640c(context));
    }

    /* renamed from: b */
    public static boolean m101641b(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                if (activeNetworkInfo.isAvailable()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: c */
    private static CrashUploader.EnumC3812b m101640c(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return CrashUploader.EnumC3812b.NONE;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return CrashUploader.EnumC3812b.WIFI;
                }
                if (type == 0) {
                    int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                    if (networkType != 3) {
                        if (networkType != 20) {
                            if (networkType != 5 && networkType != 6) {
                                switch (networkType) {
                                    case 8:
                                    case 9:
                                    case 10:
                                        break;
                                    default:
                                        switch (networkType) {
                                            case 12:
                                            case 14:
                                            case 15:
                                                break;
                                            case 13:
                                                return CrashUploader.EnumC3812b.MOBILE_4G;
                                            default:
                                                return CrashUploader.EnumC3812b.MOBILE;
                                        }
                                }
                            }
                        } else {
                            return CrashUploader.EnumC3812b.MOBILE_5G;
                        }
                    }
                    return CrashUploader.EnumC3812b.MOBILE_3G;
                }
                return CrashUploader.EnumC3812b.MOBILE;
            }
            return CrashUploader.EnumC3812b.NONE;
        } catch (Throwable unused) {
            return CrashUploader.EnumC3812b.MOBILE;
        }
    }

    /* renamed from: a */
    private static String m101642a(CrashUploader.EnumC3812b enumC3812b) {
        try {
            switch (C38261.f3938a[enumC3812b.ordinal()]) {
                case 1:
                    return C20747r8.f52730b;
                case 2:
                    return "2g";
                case 3:
                    return C20747r8.f52729a;
                case 4:
                    return "4g";
                case 5:
                    return DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY;
                case 6:
                    return "5g";
                default:
                    return "";
            }
        } catch (Exception unused) {
            return "";
        }
    }
}
