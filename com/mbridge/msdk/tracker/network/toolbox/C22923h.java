package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.AbstractC22930u;
import com.mbridge.msdk.tracker.network.C22909h;
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

/* compiled from: HurlStack.java */
/* renamed from: com.mbridge.msdk.tracker.network.toolbox.h */
/* loaded from: classes6.dex */
public final class C22923h extends AbstractC22916a {

    /* renamed from: a */
    private final InterfaceC22925b f59834a;

    /* renamed from: b */
    private final SSLSocketFactory f59835b;

    /* compiled from: HurlStack.java */
    /* renamed from: com.mbridge.msdk.tracker.network.toolbox.h$a */
    /* loaded from: classes6.dex */
    static class C22924a extends FilterInputStream {

        /* renamed from: a */
        private final HttpURLConnection f59836a;

        C22924a(HttpURLConnection httpURLConnection) {
            super(C22923h.m49431b(httpURLConnection));
            this.f59836a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f59836a.disconnect();
        }
    }

    /* compiled from: HurlStack.java */
    /* renamed from: com.mbridge.msdk.tracker.network.toolbox.h$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC22925b extends UrlRewriter {
    }

    public C22923h() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static InputStream m49431b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private C22923h(InterfaceC22925b interfaceC22925b) {
        this(interfaceC22925b, null);
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.AbstractC22916a
    /* renamed from: a */
    public final C22922g mo49427a(AbstractC22930u<?> abstractC22930u, Map<String, String> map) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        String m49447a = abstractC22930u.m49405i() == 0 ? C22920d.m49447a(abstractC22930u.m49403k(), abstractC22930u) : abstractC22930u.m49403k();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(abstractC22930u.mo49317c());
        InterfaceC22925b interfaceC22925b = this.f59834a;
        if (interfaceC22925b != null) {
            String m49425a = interfaceC22925b.m49425a(m49447a);
            if (m49425a == null) {
                throw new IOException("URL blocked by rewriter: " + m49447a);
            }
            m49447a = m49425a;
        }
        URL url = new URL(m49447a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int m49393u = abstractC22930u.m49393u();
        httpURLConnection.setConnectTimeout(m49393u);
        httpURLConnection.setReadTimeout(m49393u);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f59835b) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            switch (abstractC22930u.m49405i()) {
                case 0:
                    httpURLConnection.setRequestMethod("GET");
                    break;
                case 1:
                    httpURLConnection.setRequestMethod("POST");
                    m49434a(httpURLConnection, abstractC22930u);
                    break;
                case 2:
                    httpURLConnection.setRequestMethod("PUT");
                    m49434a(httpURLConnection, abstractC22930u);
                    break;
                case 3:
                    httpURLConnection.setRequestMethod("DELETE");
                    break;
                case 4:
                    httpURLConnection.setRequestMethod("HEAD");
                    break;
                case 5:
                    httpURLConnection.setRequestMethod("OPTIONS");
                    break;
                case 6:
                    httpURLConnection.setRequestMethod("TRACE");
                    break;
                case 7:
                    httpURLConnection.setRequestMethod("PATCH");
                    m49434a(httpURLConnection, abstractC22930u);
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                if (!((abstractC22930u.m49405i() == 4 || (100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) ? false : true)) {
                    C22922g c22922g = new C22922g(responseCode, m49432a(httpURLConnection.getHeaderFields()));
                    httpURLConnection.disconnect();
                    return c22922g;
                }
                try {
                    return new C22922g(responseCode, m49432a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new C22924a(httpURLConnection));
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private C22923h(InterfaceC22925b interfaceC22925b, SSLSocketFactory sSLSocketFactory) {
        this.f59834a = interfaceC22925b;
        this.f59835b = sSLSocketFactory;
    }

    /* renamed from: a */
    private static List<C22909h> m49432a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new C22909h(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m49434a(HttpURLConnection httpURLConnection, AbstractC22930u<?> abstractC22930u) throws IOException {
        byte[] m49398p = abstractC22930u.m49398p();
        if (m49398p != null) {
            m49433a(httpURLConnection, abstractC22930u, m49398p);
        }
    }

    /* renamed from: a */
    private void m49433a(HttpURLConnection httpURLConnection, AbstractC22930u<?> abstractC22930u, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", abstractC22930u.m49399o());
        }
        int length = bArr.length;
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}
