package sg.bigo.ads.core.player.p971a;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.core.player.a.g */
/* loaded from: classes10.dex */
public final class C44317g {

    /* renamed from: a */
    HttpURLConnection f116341a;

    /* renamed from: b */
    InputStream f116342b;

    /* renamed from: c */
    String f116343c;

    public C44317g(String str) {
        this.f116343c = str;
    }

    /* renamed from: a */
    public final int m3407a(byte[] bArr) {
        StringBuilder sb2;
        String str;
        InputStream inputStream = this.f116342b;
        if (inputStream == null) {
            C43782a.m5009a(0, "ProxyCache", "Error reading data from " + this.f116343c + ": connection is absent!");
            return 0;
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e) {
            e = e;
            sb2 = new StringBuilder("Reading source ");
            sb2.append(this.f116343c);
            str = " is interrupted, error message is : ";
            sb2.append(str);
            sb2.append(e.toString());
            C43782a.m5009a(0, "ProxyCache", sb2.toString());
            return 0;
        } catch (IOException e2) {
            e = e2;
            sb2 = new StringBuilder("Error reading data from ");
            sb2.append(this.f116343c);
            str = ", error message is : ";
            sb2.append(str);
            sb2.append(e.toString());
            C43782a.m5009a(0, "ProxyCache", sb2.toString());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[Catch: IOException -> 0x0066, TryCatch #1 {IOException -> 0x0066, blocks: (B:5:0x0030, B:15:0x0046, B:18:0x0054), top: B:29:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[Catch: IOException -> 0x0066, TRY_LEAVE, TryCatch #1 {IOException -> 0x0066, blocks: (B:5:0x0030, B:15:0x0046, B:18:0x0054), top: B:29:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[LOOP:0: B:27:0x0007->B:21:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection m3406b() {
        /*
            r8 = this;
            java.lang.String r0 = "ProxyCache"
            java.lang.String r1 = r8.f116343c
            r2 = 0
            r3 = 0
            r4 = r3
        L7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L69
            java.lang.String r6 = "Open connection "
            r5.<init>(r6)     // Catch: java.io.IOException -> L69
            java.lang.String r6 = ""
            r5.append(r6)     // Catch: java.io.IOException -> L69
            java.lang.String r6 = " to "
            r5.append(r6)     // Catch: java.io.IOException -> L69
            r5.append(r1)     // Catch: java.io.IOException -> L69
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L69
            r6 = 3
            sg.bigo.ads.common.p932t.C43782a.m5010a(r3, r6, r0, r5)     // Catch: java.io.IOException -> L69
            java.net.URL r5 = new java.net.URL     // Catch: java.io.IOException -> L69
            r5.<init>(r1)     // Catch: java.io.IOException -> L69
            java.net.URLConnection r5 = r5.openConnection()     // Catch: java.io.IOException -> L69
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.io.IOException -> L69
            if (r5 == 0) goto L80
            int r2 = r5.getResponseCode()     // Catch: java.io.IOException -> L66
            r6 = 301(0x12d, float:4.22E-43)
            if (r2 == r6) goto L43
            r6 = 302(0x12e, float:4.23E-43)
            if (r2 == r6) goto L43
            r6 = 303(0x12f, float:4.25E-43)
            if (r2 != r6) goto L41
            goto L43
        L41:
            r2 = r3
            goto L44
        L43:
            r2 = 1
        L44:
            if (r2 == 0) goto L51
            java.lang.String r1 = "Location"
            java.lang.String r1 = r5.getHeaderField(r1)     // Catch: java.io.IOException -> L66
            int r4 = r4 + 1
            r5.disconnect()     // Catch: java.io.IOException -> L66
        L51:
            r6 = 5
            if (r4 <= r6) goto L61
            java.lang.String r6 = "Too many redirects: "
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch: java.io.IOException -> L66
            java.lang.String r6 = r6.concat(r7)     // Catch: java.io.IOException -> L66
            sg.bigo.ads.common.p932t.C43782a.m5009a(r3, r0, r6)     // Catch: java.io.IOException -> L66
        L61:
            if (r2 != 0) goto L64
            goto L80
        L64:
            r2 = r5
            goto L7
        L66:
            r1 = move-exception
            r2 = r5
            goto L6a
        L69:
            r1 = move-exception
        L6a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "PingHttpUrlSource#openConnection, error message is : "
            r4.<init>(r5)
            java.lang.String r1 = r1.toString()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            sg.bigo.ads.common.p932t.C43782a.m5009a(r3, r0, r1)
            r5 = r2
        L80:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.player.p971a.C44317g.m3406b():java.net.HttpURLConnection");
    }

    /* renamed from: a */
    public final void m3408a() {
        HttpURLConnection httpURLConnection = this.f116341a;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e) {
                C43782a.m5009a(0, "ProxyCache", "Error closing connection correctly, the error message is : " + e.toString());
            } catch (IllegalArgumentException e2) {
                e = e2;
                C43782a.m5009a(0, "ProxyCache", "connection disconnect error..., the error message is : " + e.toString());
            } catch (NullPointerException e3) {
                e = e3;
                C43782a.m5009a(0, "ProxyCache", "connection disconnect error..., the error message is : " + e.toString());
            }
        }
    }
}
