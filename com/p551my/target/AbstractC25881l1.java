package com.p551my.target;

import android.content.Context;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import p1044xb.CertData;
import p1044xb.CertManager;

/* renamed from: com.my.target.l1 */
/* loaded from: classes7.dex */
public abstract class AbstractC25881l1 {

    /* renamed from: a */
    public static CertData f67161a;

    /* renamed from: b */
    public static boolean f67162b;

    /* renamed from: a */
    public static CertData m43566a() {
        return f67161a;
    }

    /* renamed from: a */
    public static void m43565a(Context context) {
        if (f67162b) {
            return;
        }
        CertData m1233a = new CertManager().m1233a(context);
        f67161a = m1233a;
        if (m1233a == null) {
            AbstractC25846ja.m43678b("DigitalGovCertsUtils: can't init digital gov certs – certData is null");
        }
        f67162b = true;
    }

    /* renamed from: a */
    public static void m43564a(HttpURLConnection httpURLConnection) {
        CertData certData = f67161a;
        if (certData != null && (httpURLConnection instanceof HttpsURLConnection)) {
            try {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(certData.f118300b.getSocketFactory());
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("DigitalGovCertsUtils: can't setSSLSocketFactory to httpsURLConnection" + th.getMessage());
            }
        }
    }
}
