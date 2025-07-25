package com.p551my.target;

import android.content.Context;
import android.os.Build;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.Map;

/* renamed from: com.my.target.d2 */
/* loaded from: classes7.dex */
public class C25701d2 extends AbstractC25653b2 {

    /* renamed from: a */
    public final C25674c2 f66729a = new C25674c2();

    /* renamed from: b */
    public int f66730b;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m44038a(java.lang.String r6, android.content.Context r7) {
        /*
            r5 = this;
            com.my.target.c2 r0 = r5.f66729a
            r0.f66681d = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HttpStatRequest: Send stat request - "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.p551my.target.AbstractC25846ja.m43680a(r0)
            com.my.target.b6 r0 = com.p551my.target.C25657b6.m44172a(r7)
            r1 = 0
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L90
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L90
            java.net.URLConnection r6 = r3.openConnection()     // Catch: java.lang.Throwable -> L90
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L90
            r3 = 10000(0x2710, float:1.4013E-41)
            r6.setReadTimeout(r3)     // Catch: java.lang.Throwable -> L8e
            r6.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = "GET"
            r6.setRequestMethod(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = "http.agent"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch: java.lang.Throwable -> L8e
            r6.addRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> L8e
            r6.setInstanceFollowRedirects(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = "connection"
            java.lang.String r4 = "close"
            r6.setRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> L8e
            com.p551my.target.AbstractC25881l1.m43564a(r6)     // Catch: java.lang.Throwable -> L8e
            r0.m44169b(r6)     // Catch: java.lang.Throwable -> L8e
            int r3 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L8e
            com.my.target.c2 r4 = r5.f66729a     // Catch: java.lang.Throwable -> L8e
            r4.f66680c = r3     // Catch: java.lang.Throwable -> L8e
            java.io.InputStream r4 = r6.getInputStream()     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L62
            r4.close()     // Catch: java.lang.Throwable -> L8e
        L62:
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == r4) goto L8a
            r4 = 204(0xcc, float:2.86E-43)
            if (r3 == r4) goto L8a
            r4 = 404(0x194, float:5.66E-43)
            if (r3 == r4) goto L8a
            r4 = 403(0x193, float:5.65E-43)
            if (r3 != r4) goto L73
            goto L8a
        L73:
            r0 = 302(0x12e, float:4.23E-43)
            if (r3 == r0) goto L7f
            r0 = 301(0x12d, float:4.22E-43)
            if (r3 == r0) goto L7f
            r0 = 303(0x12f, float:4.25E-43)
            if (r3 != r0) goto Lb4
        L7f:
            int r0 = r5.f66730b     // Catch: java.lang.Throwable -> L8e
            int r0 = r0 + 1
            r5.f66730b = r0     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r5.m44037a(r6)     // Catch: java.lang.Throwable -> L8e
            goto Lb4
        L8a:
            r0.m44171a(r6)     // Catch: java.lang.Throwable -> L8e
            goto Lb4
        L8e:
            r0 = move-exception
            goto L92
        L90:
            r0 = move-exception
            r6 = r2
        L92:
            com.my.target.c2 r3 = r5.f66729a
            r3.f66678a = r1
            java.lang.String r0 = r0.getMessage()
            r3.f66682e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HttpStatRequest: Stat request error - "
            r0.append(r1)
            com.my.target.c2 r1 = r5.f66729a
            java.lang.String r1 = r1.f66682e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p551my.target.AbstractC25846ja.m43680a(r0)
        Lb4:
            if (r6 == 0) goto Lb9
            r6.disconnect()
        Lb9:
            if (r2 == 0) goto Ld2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "HttpStatRequest: Redirected to - "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.p551my.target.AbstractC25846ja.m43680a(r6)
            r5.m44038a(r2, r7)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C25701d2.m44038a(java.lang.String, android.content.Context):void");
    }

    /* renamed from: a */
    public final String m44037a(HttpURLConnection httpURLConnection) {
        if (this.f66730b <= 10) {
            try {
                String uri = httpURLConnection.getURL().toURI().resolve(new URI(httpURLConnection.getHeaderField("Location"))).toString();
                boolean z = Build.VERSION.SDK_INT < 28 || C25895la.m43502c(uri);
                if (!C25895la.m43501d(uri) && z) {
                    return uri;
                }
                this.f66729a.f66681d = uri;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.p551my.target.AbstractC25653b2
    /* renamed from: a */
    public C25674c2 mo42271a(String str, String str2, Map map, Context context) {
        this.f66730b = 0;
        m44038a(str, context);
        return this.f66729a;
    }

    /* renamed from: a */
    public static C25701d2 m44039a() {
        return new C25701d2();
    }
}
