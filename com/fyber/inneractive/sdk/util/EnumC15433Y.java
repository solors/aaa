package com.fyber.inneractive.sdk.util;

import com.ironsource.C20747r8;

/* renamed from: com.fyber.inneractive.sdk.util.Y */
/* loaded from: classes4.dex */
public enum EnumC15433Y {
    UNKNOWN(""),
    ETHERNET(C20747r8.f52729a),
    WIFI(C20747r8.f52730b),
    MOBILE_3G(C20747r8.f52729a),
    MOBILE_4G("4g"),
    MOBILE_5G("5g"),
    CELLULAR("Cellular");
    
    final String key;

    EnumC15433Y(String str) {
        this.key = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0085  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.util.EnumC15433Y m76513a() {
        /*
            android.app.Application r0 = com.fyber.inneractive.sdk.util.AbstractC15459m.f30607a     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L1d
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.fyber.inneractive.sdk.util.AbstractC15459m.m76485a(r1)     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L1d
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L1d
            int r0 = r0.getType()     // Catch: java.lang.Exception -> L1d
            goto L1f
        L1d:
            r0 = 8
        L1f:
            r1 = 9
            if (r0 == r1) goto L85
            r1 = 5
            r2 = 3
            if (r0 == 0) goto L3a
            r3 = 1
            if (r0 == r3) goto L37
            r3 = 2
            if (r0 == r3) goto L3a
            if (r0 == r2) goto L3a
            r3 = 4
            if (r0 == r3) goto L3a
            if (r0 == r1) goto L3a
            com.fyber.inneractive.sdk.util.Y r0 = com.fyber.inneractive.sdk.util.EnumC15433Y.UNKNOWN
            return r0
        L37:
            com.fyber.inneractive.sdk.util.Y r0 = com.fyber.inneractive.sdk.util.EnumC15433Y.WIFI
            return r0
        L3a:
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f27060O
            com.fyber.inneractive.sdk.config.cellular.a r0 = r0.f27076N
            if (r0 == 0) goto L47
            com.fyber.inneractive.sdk.config.cellular.d r3 = r0.f27148a
            if (r3 == 0) goto L47
            com.fyber.inneractive.sdk.util.Y r0 = r0.f27149b
            goto L73
        L47:
            int r0 = com.fyber.inneractive.sdk.util.AbstractC15453j.m76498l()
            if (r0 == 0) goto L71
            if (r0 == r2) goto L6e
            r2 = 18
            if (r0 == r2) goto L6b
            r2 = 20
            if (r0 == r2) goto L68
            if (r0 == r1) goto L6e
            r1 = 6
            if (r0 == r1) goto L6e
            switch(r0) {
                case 8: goto L6e;
                case 9: goto L6e;
                case 10: goto L6e;
                default: goto L5f;
            }
        L5f:
            switch(r0) {
                case 12: goto L6e;
                case 13: goto L65;
                case 14: goto L6e;
                case 15: goto L6e;
                default: goto L62;
            }
        L62:
            com.fyber.inneractive.sdk.util.Y r0 = com.fyber.inneractive.sdk.util.EnumC15433Y.CELLULAR
            goto L73
        L65:
            com.fyber.inneractive.sdk.util.Y r0 = com.fyber.inneractive.sdk.util.EnumC15433Y.MOBILE_4G
            goto L73
        L68:
            com.fyber.inneractive.sdk.util.Y r0 = com.fyber.inneractive.sdk.util.EnumC15433Y.MOBILE_5G
            goto L73
        L6b:
            com.fyber.inneractive.sdk.util.Y r0 = com.fyber.inneractive.sdk.util.EnumC15433Y.WIFI
            goto L73
        L6e:
            com.fyber.inneractive.sdk.util.Y r0 = com.fyber.inneractive.sdk.util.EnumC15433Y.MOBILE_3G
            goto L73
        L71:
            com.fyber.inneractive.sdk.util.Y r0 = com.fyber.inneractive.sdk.util.EnumC15433Y.UNKNOWN
        L73:
            com.fyber.inneractive.sdk.util.Y r1 = com.fyber.inneractive.sdk.util.EnumC15433Y.UNKNOWN
            if (r0 != r1) goto L84
            int r0 = com.fyber.inneractive.sdk.util.AbstractC15453j.m76498l()
            r1 = 13
            if (r0 != r1) goto L82
            com.fyber.inneractive.sdk.util.Y r0 = com.fyber.inneractive.sdk.util.EnumC15433Y.MOBILE_4G
            goto L84
        L82:
            com.fyber.inneractive.sdk.util.Y r0 = com.fyber.inneractive.sdk.util.EnumC15433Y.MOBILE_3G
        L84:
            return r0
        L85:
            com.fyber.inneractive.sdk.util.Y r0 = com.fyber.inneractive.sdk.util.EnumC15433Y.ETHERNET
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.EnumC15433Y.m76513a():com.fyber.inneractive.sdk.util.Y");
    }

    /* renamed from: b */
    public final String m76512b() {
        return this.key;
    }
}
