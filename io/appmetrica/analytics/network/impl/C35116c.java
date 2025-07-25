package io.appmetrica.analytics.network.impl;

import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.network.impl.c */
/* loaded from: classes9.dex */
public final class C35116c implements Call {

    /* renamed from: a */
    public final NetworkClient f95821a;

    /* renamed from: b */
    public final Request f95822b;

    /* renamed from: c */
    public final C35117d f95823c;

    @VisibleForTesting
    public C35116c(@NotNull NetworkClient networkClient, @NotNull Request request, @NotNull C35117d c35117d) {
        this.f95821a = networkClient;
        this.f95822b = request;
        this.f95823c = c35117d;
    }

    /* renamed from: a */
    public final void m20663a(HttpsURLConnection httpsURLConnection) {
        Iterator<T> it = this.f95822b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f95821a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f95821a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f95821a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f95821a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f95822b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f95821a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:10|11|12|(2:14|(2:16|17))|18|19|20|(3:21|22|23)|24|25|26|27|28) */
    @Override // io.appmetrica.analytics.network.internal.Call
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.network.internal.Response execute() {
        /*
            r15 = this;
            io.appmetrica.analytics.network.impl.d r0 = r15.f95823c     // Catch: java.lang.Throwable -> Lc4
            io.appmetrica.analytics.network.internal.Request r1 = r15.f95822b     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r1.getUrl()     // Catch: java.lang.Throwable -> Lc4
            r0.getClass()     // Catch: java.lang.Throwable -> Lc4
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lc4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lc4
            boolean r1 = r0 instanceof javax.net.ssl.HttpsURLConnection
            r2 = 0
            if (r1 == 0) goto L1c
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 != 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Connection created for "
            r0.<init>(r1)
            io.appmetrica.analytics.network.internal.Request r1 = r15.f95822b
            java.lang.String r1 = r1.getUrl()
            r0.append(r1)
            java.lang.String r1 = " does not represent https connection"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.appmetrica.analytics.network.internal.Response r1 = new io.appmetrica.analytics.network.internal.Response
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0)
            r1.<init>(r2)
            return r1
        L43:
            r1 = 0
            byte[] r3 = new byte[r1]
            byte[] r4 = new byte[r1]
            r15.m20663a(r0)     // Catch: java.lang.Throwable -> Lb2
            io.appmetrica.analytics.network.internal.Request r5 = r15.f95822b     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = r5.getMethod()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r6 = "POST"
            boolean r5 = kotlin.jvm.internal.Intrinsics.m17075f(r5, r6)     // Catch: java.lang.Throwable -> Lb2
            r6 = 1
            if (r5 == 0) goto L80
            r0.setDoOutput(r6)     // Catch: java.lang.Throwable -> Lb2
            java.io.OutputStream r5 = r0.getOutputStream()     // Catch: java.lang.Throwable -> Lb2
            if (r5 == 0) goto L80
            io.appmetrica.analytics.network.internal.Request r7 = r15.f95822b     // Catch: java.lang.Throwable -> L75
            byte[] r7 = r7.getBody()     // Catch: java.lang.Throwable -> L75
            r5.write(r7)     // Catch: java.lang.Throwable -> L75
            r5.flush()     // Catch: java.lang.Throwable -> L75
            kotlin.Unit r7 = kotlin.Unit.f99208a     // Catch: java.lang.Throwable -> L75
            p1046xd.Closeable.m1220a(r5, r2)     // Catch: java.lang.Throwable -> Lb2
            goto L80
        L75:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L77
        L77:
            r7 = move-exception
            p1046xd.Closeable.m1220a(r5, r6)     // Catch: java.lang.Throwable -> Lb2
            throw r7     // Catch: java.lang.Throwable -> Lb2
        L7c:
            r7 = r2
            r2 = r5
            r5 = r1
            goto Lb4
        L80:
            int r5 = r0.getResponseCode()     // Catch: java.lang.Throwable -> Lb2
            java.util.Map r7 = r0.getHeaderFields()     // Catch: java.lang.Throwable -> Lae
            io.appmetrica.analytics.network.internal.NetworkClient r8 = r15.f95821a     // Catch: java.lang.Throwable -> Lac
            int r8 = r8.getMaxResponseSize()     // Catch: java.lang.Throwable -> Lac
            io.appmetrica.analytics.network.impl.a r9 = new io.appmetrica.analytics.network.impl.a     // Catch: java.lang.Throwable -> Lac
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lac
            byte[] r3 = io.appmetrica.analytics.network.impl.AbstractC35118e.m20662a(r8, r9)     // Catch: java.lang.Throwable -> Lac
            io.appmetrica.analytics.network.internal.NetworkClient r8 = r15.f95821a     // Catch: java.lang.Throwable -> Lac
            int r8 = r8.getMaxResponseSize()     // Catch: java.lang.Throwable -> Lac
            io.appmetrica.analytics.network.impl.b r9 = new io.appmetrica.analytics.network.impl.b     // Catch: java.lang.Throwable -> Lac
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lac
            byte[] r4 = io.appmetrica.analytics.network.impl.AbstractC35118e.m20662a(r8, r9)     // Catch: java.lang.Throwable -> Lac
            r14 = r2
            r11 = r3
            r12 = r4
            r10 = r5
            r9 = r6
            goto Lb9
        Lac:
            r2 = move-exception
            goto Lb4
        Lae:
            r6 = move-exception
            r7 = r2
            r2 = r6
            goto Lb4
        Lb2:
            r5 = move-exception
            goto L7c
        Lb4:
            r9 = r1
            r14 = r2
            r11 = r3
            r12 = r4
            r10 = r5
        Lb9:
            r13 = r7
            r0.disconnect()     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            io.appmetrica.analytics.network.internal.Response r0 = new io.appmetrica.analytics.network.internal.Response
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r0
        Lc4:
            r0 = move-exception
            io.appmetrica.analytics.network.internal.Response r1 = new io.appmetrica.analytics.network.internal.Response
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.network.impl.C35116c.execute():io.appmetrica.analytics.network.internal.Response");
    }

    public C35116c(@NotNull NetworkClient networkClient, @NotNull Request request) {
        this(networkClient, request, new C35117d());
    }
}
