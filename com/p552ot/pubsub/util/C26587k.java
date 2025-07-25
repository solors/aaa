package com.p552ot.pubsub.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.p552ot.pubsub.PubSubTrack;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;

/* renamed from: com.ot.pubsub.util.k */
/* loaded from: classes7.dex */
public class C26587k {

    /* renamed from: a */
    private static final String f69748a = "NetworkUtil";

    /* renamed from: b */
    private static final int f69749b = 16;

    /* renamed from: c */
    private static final int f69750c = 17;

    /* renamed from: d */
    private static final int f69751d = 18;

    /* renamed from: e */
    private static final int f69752e = 19;

    /* renamed from: f */
    private static final int f69753f = 20;

    /* renamed from: g */
    private static final int f69754g = 20;

    /* renamed from: com.ot.pubsub.util.k$a */
    /* loaded from: classes7.dex */
    public enum EnumC26588a {
        WIFI,
        MN2G,
        MN3G,
        MN4G,
        NONE
    }

    /* renamed from: com.ot.pubsub.util.k$b */
    /* loaded from: classes7.dex */
    public enum EnumC26589b {
        NOT_CONNECTED(InterfaceC32663coo2iico.cco22),
        MOBILE_2G("2G"),
        MOBILE_3G("3G"),
        MOBILE_4G("4G"),
        MOBILE_5G("5G"),
        WIFI(InterfaceC32663coo2iico.coo2iico),
        ETHERNET("ETHERNET"),
        UNKNOWN("UNKNOWN");
        

        /* renamed from: i */
        private String f69770i;

        EnumC26589b(String str) {
            this.f69770i = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f69770i;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static boolean m41063a() {
        Context m41116b = C26577b.m41116b();
        if (m41116b != null) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) m41116b.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnectedOrConnecting();
                }
                return false;
            } catch (Exception e) {
                C26586j.m41080a(f69748a, "isNetworkConnected exception: " + e.getMessage());
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static PubSubTrack.NetType m41059b(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            C26586j.m41073b(f69748a, "getNetworkState error", e);
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return PubSubTrack.NetType.WIFI;
            }
            if (activeNetworkInfo.getType() == 0) {
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return PubSubTrack.NetType.MOBILE_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return PubSubTrack.NetType.MOBILE_3G;
                    case 13:
                    case 18:
                    case 19:
                        return PubSubTrack.NetType.MOBILE_4G;
                    case 20:
                        return PubSubTrack.NetType.MOBILE_5G;
                    default:
                        return PubSubTrack.NetType.UNKNOWN;
                }
            }
            if (activeNetworkInfo.getType() == 9) {
                return PubSubTrack.NetType.ETHERNET;
            }
            return PubSubTrack.NetType.UNKNOWN;
        }
        return PubSubTrack.NetType.NOT_CONNECTED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        com.p552ot.pubsub.util.C26586j.m41080a(com.p552ot.pubsub.util.C26587k.f69748a, "networkInfo == null");
     */
    @android.annotation.SuppressLint({"MissingPermission"})
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.p552ot.pubsub.util.C26587k.EnumC26588a m41061a(android.content.Context r4) {
        /*
            java.lang.String r0 = "NetworkUtil"
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.p552ot.pubsub.util.C26595p.m41018a(r4, r1)     // Catch: java.lang.Exception -> L74
            if (r1 == 0) goto L4f
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r4.getSystemService(r1)     // Catch: java.lang.Exception -> L74
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Exception -> L74
            android.net.NetworkInfo r2 = r1.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L74
            if (r2 == 0) goto L28
            boolean r3 = r2.isConnectedOrConnecting()     // Catch: java.lang.Exception -> L74
            if (r3 != 0) goto L1f
            goto L28
        L1f:
            boolean r1 = r1.isActiveNetworkMetered()     // Catch: java.lang.Exception -> L74
            if (r1 != 0) goto L4f
            com.ot.pubsub.util.k$a r4 = com.p552ot.pubsub.util.C26587k.EnumC26588a.WIFI     // Catch: java.lang.Exception -> L74
            return r4
        L28:
            if (r2 != 0) goto L30
            java.lang.String r4 = "networkInfo == null"
            com.p552ot.pubsub.util.C26586j.m41080a(r0, r4)     // Catch: java.lang.Exception -> L74
            goto L4c
        L30:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L74
            r4.<init>()     // Catch: java.lang.Exception -> L74
            java.lang.String r1 = "!networkInfo.isConnectedOrConnecting():"
            r4.append(r1)     // Catch: java.lang.Exception -> L74
            android.net.NetworkInfo$State r1 = r2.getState()     // Catch: java.lang.Exception -> L74
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L74
            r4.append(r1)     // Catch: java.lang.Exception -> L74
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L74
            com.p552ot.pubsub.util.C26586j.m41080a(r0, r4)     // Catch: java.lang.Exception -> L74
        L4c:
            com.ot.pubsub.util.k$a r4 = com.p552ot.pubsub.util.C26587k.EnumC26588a.NONE     // Catch: java.lang.Exception -> L74
            return r4
        L4f:
            java.lang.String r1 = "phone"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch: java.lang.Exception -> L74
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch: java.lang.Exception -> L74
            int r4 = r4.getNetworkType()     // Catch: java.lang.Exception -> L74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L74
            r1.<init>()     // Catch: java.lang.Exception -> L74
            java.lang.String r2 = "getNetState networkType: "
            r1.append(r2)     // Catch: java.lang.Exception -> L74
            r1.append(r4)     // Catch: java.lang.Exception -> L74
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L74
            com.p552ot.pubsub.util.C26586j.m41080a(r0, r1)     // Catch: java.lang.Exception -> L74
            com.ot.pubsub.util.k$a r4 = m41062a(r4)     // Catch: java.lang.Exception -> L74
            return r4
        L74:
            r4 = move-exception
            java.lang.String r1 = "getNetState"
            com.p552ot.pubsub.util.C26586j.m41073b(r0, r1, r4)
            com.ot.pubsub.util.k$a r4 = com.p552ot.pubsub.util.C26587k.EnumC26588a.NONE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p552ot.pubsub.util.C26587k.m41061a(android.content.Context):com.ot.pubsub.util.k$a");
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    private static int m41060a(Context context, TelephonyManager telephonyManager) {
        try {
            Object invoke = Class.forName("android.telephony.SubscriptionManager").getMethod("getDefaultDataSubId", new Class[0]).invoke(null, new Object[0]);
            return ((Integer) Class.forName("android.telephony.TelephonyManager").getMethod("getNetworkType", Integer.TYPE).invoke(telephonyManager, Integer.valueOf(((Integer) invoke).intValue()))).intValue();
        } catch (Exception e) {
            C26586j.m41073b(f69748a, "getNetworkTypeAndroidMandL exception: ", e);
            return telephonyManager.getNetworkType();
        }
    }

    /* renamed from: a */
    private static EnumC26588a m41062a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return EnumC26588a.MN2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
            case 20:
                return EnumC26588a.MN3G;
            case 13:
            case 18:
            case 19:
                return EnumC26588a.MN4G;
            default:
                return EnumC26588a.NONE;
        }
    }
}
