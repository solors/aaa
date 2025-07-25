package com.taurusx.tax.p597g.p599b;

import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p597g.p598a.C28392b;
import com.taurusx.tax.p597g.p598a.C28393c;
import com.taurusx.tax.p597g.p599b.p601s.C28425a;
import com.taurusx.tax.p597g.p599b.p601s.InterfaceC28426b;
import com.taurusx.tax.p597g.p599b.p602t.InterfaceC28429c;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: com.taurusx.tax.g.b.h */
/* loaded from: classes7.dex */
public class C28404h implements InterfaceC28413o {

    /* renamed from: f */
    public static final C28392b f73810f = C28393c.m38142a("HttpUrlSource");

    /* renamed from: a */
    public final InterfaceC28429c f73811a;

    /* renamed from: b */
    public final InterfaceC28426b f73812b;

    /* renamed from: c */
    public C28414p f73813c;

    /* renamed from: d */
    public HttpURLConnection f73814d;

    /* renamed from: e */
    public InputStream f73815e;

    public C28404h(String str, InterfaceC28429c interfaceC28429c) {
        this(str, interfaceC28429c, new C28425a());
    }

    @Override // com.taurusx.tax.p597g.p599b.InterfaceC28413o
    /* renamed from: a */
    public synchronized long mo38112a() throws C28411m {
        if (this.f73813c.f73837b == -2147483648L) {
            m38127b();
        }
        return this.f73813c.f73837b;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38127b() throws com.taurusx.tax.p597g.p599b.C28411m {
        /*
            r9 = this;
            com.taurusx.tax.g.a.b r0 = com.taurusx.tax.p597g.p599b.C28404h.f73810f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Read content info from "
            r1.append(r2)
            com.taurusx.tax.g.b.p r2 = r9.f73813c
            java.lang.String r2 = r2.f73836a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.m38146a(r1)
            r1 = 0
            r3 = 10000(0x2710, float:1.4013E-41)
            r4 = 0
            java.net.HttpURLConnection r1 = r9.m38128a(r1, r3)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
            java.lang.String r2 = "Content-Length"
            java.lang.String r2 = r1.getHeaderField(r2)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            if (r2 != 0) goto L2e
            r2 = -1
            goto L32
        L2e:
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
        L32:
            java.lang.String r5 = r1.getContentType()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            com.taurusx.tax.g.b.p r6 = new com.taurusx.tax.g.b.p     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            com.taurusx.tax.g.b.p r7 = r9.f73813c     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            java.lang.String r7 = r7.f73836a     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            r6.<init>(r7, r2, r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            r9.f73813c = r6     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            com.taurusx.tax.g.b.t.c r2 = r9.f73811a     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            java.lang.String r3 = r6.f73836a     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            r2.mo38096a(r3, r6)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            r2.<init>()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            java.lang.String r3 = "Source info fetched: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            com.taurusx.tax.g.b.p r3 = r9.f73813c     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            r2.append(r3)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            r0.m38146a(r2)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            com.taurusx.tax.p597g.p599b.C28412n.m38118a(r4)
            r1.disconnect()
            goto L9b
        L69:
            r0 = move-exception
            r8 = r4
            r4 = r1
            r1 = r8
            goto L9d
        L6e:
            r0 = move-exception
            r8 = r4
            r4 = r1
            r1 = r8
            goto L78
        L73:
            r0 = move-exception
            r1 = r4
            goto L9d
        L76:
            r0 = move-exception
            r1 = r4
        L78:
            com.taurusx.tax.g.a.b r2 = com.taurusx.tax.p597g.p599b.C28404h.f73810f     // Catch: java.lang.Throwable -> L9c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9c
            r3.<init>()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r5 = "Error fetching info from "
            r3.append(r5)     // Catch: java.lang.Throwable -> L9c
            com.taurusx.tax.g.b.p r5 = r9.f73813c     // Catch: java.lang.Throwable -> L9c
            java.lang.String r5 = r5.f73836a     // Catch: java.lang.Throwable -> L9c
            r3.append(r5)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9c
            r5 = 6
            r2.m38148a(r5, r3, r0)     // Catch: java.lang.Throwable -> L9c
            com.taurusx.tax.p597g.p599b.C28412n.m38118a(r1)
            if (r4 == 0) goto L9b
            r4.disconnect()
        L9b:
            return
        L9c:
            r0 = move-exception
        L9d:
            com.taurusx.tax.p597g.p599b.C28412n.m38118a(r1)
            if (r4 == 0) goto La5
            r4.disconnect()
        La5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p597g.p599b.C28404h.m38127b():void");
    }

    @Override // com.taurusx.tax.p597g.p599b.InterfaceC28413o
    public void close() throws C28411m {
        HttpURLConnection httpURLConnection = this.f73814d;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e) {
                f73810f.m38148a(6, "Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue :(", e);
            } catch (IllegalArgumentException e2) {
                e = e2;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            } catch (NullPointerException e3) {
                e = e3;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            }
        }
    }

    public String toString() {
        return "HttpUrlSource{sourceInfo='" + this.f73813c + "}";
    }

    public C28404h(String str, InterfaceC28429c interfaceC28429c, InterfaceC28426b interfaceC28426b) {
        this.f73811a = (InterfaceC28429c) C28207b.m38455a(interfaceC28429c);
        this.f73812b = (InterfaceC28426b) C28207b.m38455a(interfaceC28426b);
        C28414p mo38097a = interfaceC28429c.mo38097a(str);
        this.f73813c = mo38097a == null ? new C28414p(str, -2147483648L, C28412n.m38113d(str)) : mo38097a;
    }

    @Override // com.taurusx.tax.p597g.p599b.InterfaceC28413o
    /* renamed from: a */
    public void mo38111a(long j) throws C28411m {
        try {
            HttpURLConnection m38128a = m38128a(j, -1);
            this.f73814d = m38128a;
            String contentType = m38128a.getContentType();
            this.f73815e = new BufferedInputStream(this.f73814d.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.f73814d;
            int responseCode = httpURLConnection.getResponseCode();
            String headerField = httpURLConnection.getHeaderField("Content-Length");
            long parseLong = headerField == null ? -1L : Long.parseLong(headerField);
            if (responseCode != 200) {
                parseLong = responseCode == 206 ? parseLong + j : this.f73813c.f73837b;
            }
            C28414p c28414p = new C28414p(this.f73813c.f73836a, parseLong, contentType);
            this.f73813c = c28414p;
            this.f73811a.mo38096a(c28414p.f73836a, c28414p);
        } catch (IOException e) {
            throw new C28411m("Error opening connection for " + this.f73813c.f73836a + " with offset " + j, e);
        }
    }

    public C28404h(C28404h c28404h) {
        this.f73813c = c28404h.f73813c;
        this.f73811a = c28404h.f73811a;
        this.f73812b = c28404h.f73812b;
    }

    @Override // com.taurusx.tax.p597g.p599b.InterfaceC28413o
    /* renamed from: a */
    public int mo38110a(byte[] bArr) throws C28411m {
        InputStream inputStream = this.f73815e;
        if (inputStream != null) {
            try {
                return inputStream.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e) {
                throw new C28406j("Reading source " + this.f73813c.f73836a + " is interrupted", e);
            } catch (IOException e2) {
                throw new C28411m("Error reading data from " + this.f73813c.f73836a, e2);
            }
        }
        throw new C28411m("Error reading data from " + this.f73813c.f73836a + ": connection is absent!");
    }

    /* renamed from: a */
    public final HttpURLConnection m38128a(long j, int i) throws IOException, C28411m {
        HttpURLConnection httpURLConnection;
        boolean z;
        String str = this.f73813c.f73836a;
        int i2 = 0;
        do {
            C28392b c28392b = f73810f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Open connection ");
            int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            sb2.append(i3 > 0 ? " with offset " + j : "");
            sb2.append(" to ");
            sb2.append(str);
            c28392b.m38146a(sb2.toString());
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            for (Map.Entry<String, String> entry : this.f73812b.mo38098a(str).entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            if (i3 > 0) {
                httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-");
            }
            if (i > 0) {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                str = httpURLConnection.getHeaderField("Location");
                i2++;
                httpURLConnection.disconnect();
            }
            if (i2 > 5) {
                throw new C28411m("Too many redirects: " + i2);
            }
        } while (z);
        return httpURLConnection;
    }
}
