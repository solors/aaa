package com.p551my.target;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: com.my.target.y1 */
/* loaded from: classes7.dex */
public final class C26239y1 extends AbstractC25653b2 {

    /* renamed from: a */
    public static final Charset f68314a = StandardCharsets.UTF_8;

    /* renamed from: a */
    public static boolean m42396a(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0)) {
                if (!networkCapabilities.hasTransport(3)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("HttpAdRequest: can't check network state " + th.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0161  */
    @Override // com.p551my.target.AbstractC25653b2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.p551my.target.C25674c2 mo42271a(java.lang.String r6, java.lang.String r7, java.util.Map r8, android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C26239y1.mo42271a(java.lang.String, java.lang.String, java.util.Map, android.content.Context):com.my.target.c2");
    }

    /* renamed from: a */
    public static C26239y1 m42397a() {
        return new C26239y1();
    }
}
