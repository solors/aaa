package com.yandex.mobile.ads.impl;

import androidx.annotation.VisibleForTesting;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class qf0 extends AbstractC31047oj {

    /* renamed from: a */
    private final InterfaceC31200b f84326a;

    /* renamed from: b */
    private final SSLSocketFactory f84327b;

    /* renamed from: com.yandex.mobile.ads.impl.qf0$a */
    /* loaded from: classes8.dex */
    static class C31199a extends FilterInputStream {

        /* renamed from: b */
        private final HttpURLConnection f84328b;

        C31199a(HttpURLConnection httpURLConnection) {
            super(qf0.m30385a(httpURLConnection));
            this.f84328b = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f84328b.disconnect();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qf0$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31200b extends n32 {
    }

    public qf0(InterfaceC31200b interfaceC31200b, SSLSocketFactory sSLSocketFactory) {
        this.f84326a = interfaceC31200b;
        this.f84327b = sSLSocketFactory;
    }

    /* renamed from: a */
    private static void m30384a(HttpURLConnection httpURLConnection, ml1 ml1Var, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    @VisibleForTesting
    /* renamed from: a */
    static ArrayList m30383a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : (List) entry.getValue()) {
                    arrayList.add(new tc0((String) entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31047oj
    /* renamed from: a */
    public final jf0 mo27164a(ml1<?> ml1Var, Map<String, String> map) throws IOException, C30313fh {
        SSLSocketFactory sSLSocketFactory;
        String mo31943l = ml1Var.mo31943l();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(ml1Var.mo31949e());
        InterfaceC31200b interfaceC31200b = this.f84326a;
        if (interfaceC31200b != null) {
            String mo31667a = interfaceC31200b.mo31667a(mo31943l);
            if (mo31667a == null) {
                throw new IOException("URL blocked by rewriter: " + mo31943l);
            }
            mo31943l = mo31667a;
        }
        URL url = new URL(mo31943l);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int m31945j = ml1Var.m31945j();
        httpURLConnection.setConnectTimeout(m31945j);
        httpURLConnection.setReadTimeout(m31945j);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f84327b) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            m30386a(ml1Var, httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                if (ml1Var.m31948f() != 4 && ((100 > responseCode || responseCode >= 200) && responseCode != 204 && responseCode != 304)) {
                    try {
                        return new jf0(responseCode, m30383a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new C31199a(httpURLConnection));
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        if (!z) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                jf0 jf0Var = new jf0(responseCode, m30383a(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return jf0Var;
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static InputStream m30385a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: a */
    static void m30386a(ml1 ml1Var, HttpURLConnection httpURLConnection) throws IOException, C30313fh {
        switch (ml1Var.m31948f()) {
            case -1:
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                byte[] mo31957b = ml1Var.mo31957b();
                if (mo31957b != null) {
                    m30384a(httpURLConnection, ml1Var, mo31957b);
                    return;
                }
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                byte[] mo31957b2 = ml1Var.mo31957b();
                if (mo31957b2 != null) {
                    m30384a(httpURLConnection, ml1Var, mo31957b2);
                    return;
                }
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                byte[] mo31957b3 = ml1Var.mo31957b();
                if (mo31957b3 != null) {
                    m30384a(httpURLConnection, ml1Var, mo31957b3);
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
