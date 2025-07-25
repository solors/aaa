package com.p551my.target;

import android.content.Context;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.my.target.z1 */
/* loaded from: classes7.dex */
public final class C26263z1 extends AbstractC25653b2 {

    /* renamed from: a */
    public final C25674c2 f68408a = new C25674c2();

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m42273a(com.p551my.target.C25904m1 r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = "HttpImageRequest: Send image request - "
            r2.append(r3)     // Catch: java.lang.Throwable -> L85
            r2.append(r7)     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L85
            com.p551my.target.AbstractC25846ja.m43680a(r2)     // Catch: java.lang.Throwable -> L85
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L85
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L85
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L85
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L85
            r1 = 10000(0x2710, float:1.4013E-41)
            r2.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L82
            r2.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L82
            r1 = 1
            r2.setInstanceFollowRedirects(r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "connection"
            java.lang.String r3 = "close"
            r2.setRequestProperty(r1, r3)     // Catch: java.lang.Throwable -> L82
            com.p551my.target.AbstractC25881l1.m43564a(r2)     // Catch: java.lang.Throwable -> L82
            r2.connect()     // Catch: java.lang.Throwable -> L82
            int r1 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L82
            com.my.target.c2 r3 = r5.f68408a     // Catch: java.lang.Throwable -> L82
            r3.f66680c = r1     // Catch: java.lang.Throwable -> L82
            r4 = 200(0xc8, float:2.8E-43)
            if (r1 != r4) goto L54
            java.io.InputStream r1 = r2.getInputStream()     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L50
            r5.m42274a(r6, r1, r7)     // Catch: java.lang.Throwable -> L82
            goto La9
        L50:
            r5.m42272a(r1)     // Catch: java.lang.Throwable -> L82
            goto La9
        L54:
            r3.f66678a = r0     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r6.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = "Image request error - response code "
            r6.append(r7)     // Catch: java.lang.Throwable -> L82
            r6.append(r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L82
            r3.f66682e = r6     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r6.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = "HttpImageRequest: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L82
            com.my.target.c2 r7 = r5.f68408a     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = r7.f66682e     // Catch: java.lang.Throwable -> L82
            r6.append(r7)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L82
            com.p551my.target.AbstractC25846ja.m43680a(r6)     // Catch: java.lang.Throwable -> L82
            goto La9
        L82:
            r6 = move-exception
            r1 = r2
            goto L86
        L85:
            r6 = move-exception
        L86:
            com.my.target.c2 r7 = r5.f68408a
            r7.f66678a = r0
            java.lang.String r6 = r6.getMessage()
            r7.f66682e = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "HttpImageRequest: Image request error - "
            r6.append(r7)
            com.my.target.c2 r7 = r5.f68408a
            java.lang.String r7 = r7.f66682e
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p551my.target.AbstractC25846ja.m43680a(r6)
            r2 = r1
        La9:
            if (r2 == 0) goto Lae
            r2.disconnect()
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C26263z1.m42273a(com.my.target.m1, java.lang.String):void");
    }

    /* renamed from: a */
    public final void m42274a(C25904m1 c25904m1, InputStream inputStream, String str) {
        File m43483a = c25904m1.m43483a(inputStream, str);
        if (m43483a != null) {
            this.f68408a.f66681d = BitmapFactory.decodeFile(m43483a.getAbsolutePath());
            return;
        }
        C25674c2 c25674c2 = this.f68408a;
        c25674c2.f66678a = false;
        c25674c2.f66682e = "Image request error - can't save image to disk cache";
        AbstractC25846ja.m43680a("HttpImageRequest: Load in cache error - " + this.f68408a.f66682e);
    }

    /* renamed from: a */
    public final void m42272a(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        this.f68408a.f66681d = BitmapFactory.decodeStream(bufferedInputStream);
        try {
            bufferedInputStream.close();
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("HttpImageRequest: Load in memory error - " + th.getMessage());
        }
    }

    @Override // com.p551my.target.AbstractC25653b2
    /* renamed from: a */
    public C25674c2 mo42271a(String str, String str2, Map map, Context context) {
        C25904m1 m43479b = C25904m1.m43479b(context);
        if (m43479b != null) {
            this.f68408a.f66681d = m43479b.m43482a(str);
            C25674c2 c25674c2 = this.f68408a;
            if (c25674c2.f66681d != null) {
                c25674c2.f66679b = true;
                return c25674c2;
            }
        } else {
            AbstractC25846ja.m43680a("HttpImageRequest: Unable to open disk cache and get image - " + str);
        }
        m42273a(m43479b, str);
        return this.f68408a;
    }

    /* renamed from: a */
    public static C26263z1 m42275a() {
        return new C26263z1();
    }
}
