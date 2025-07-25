package com.android.volley.toolbox;

import androidx.annotation.VisibleForTesting;
import com.android.volley.AuthFailureError;
import com.android.volley.Header;
import com.android.volley.Request;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.android.volley.toolbox.h */
/* loaded from: classes2.dex */
public class HurlStack extends BaseHttpStack {

    /* renamed from: a */
    private final SSLSocketFactory f3537a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HurlStack.java */
    /* renamed from: com.android.volley.toolbox.h$a */
    /* loaded from: classes2.dex */
    public static class C3763a extends FilterInputStream {

        /* renamed from: b */
        private final HttpURLConnection f3538b;

        C3763a(HttpURLConnection httpURLConnection) {
            super(HurlStack.m102216j(httpURLConnection));
            this.f3538b = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f3538b.disconnect();
        }
    }

    /* compiled from: HurlStack.java */
    /* renamed from: com.android.volley.toolbox.h$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3764b {
    }

    public HurlStack() {
        this(null);
    }

    /* renamed from: c */
    private void m102223c(HttpURLConnection httpURLConnection, Request<?> request, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(m102218h(request, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    /* renamed from: d */
    private void m102222d(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        byte[] body = request.getBody();
        if (body != null) {
            m102223c(httpURLConnection, request, body);
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    static List<Header> m102221e(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new Header(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private static boolean m102217i(int i, int i2) {
        if (i != 4 && ((100 > i2 || i2 >= 200) && i2 != 204 && i2 != 304)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static InputStream m102216j(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: k */
    private HttpURLConnection m102215k(URL url, Request<?> request) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection m102220f = m102220f(url);
        int timeoutMs = request.getTimeoutMs();
        m102220f.setConnectTimeout(timeoutMs);
        m102220f.setReadTimeout(timeoutMs);
        m102220f.setUseCaches(false);
        m102220f.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f3537a) != null) {
            ((HttpsURLConnection) m102220f).setSSLSocketFactory(sSLSocketFactory);
        }
        return m102220f;
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    /* renamed from: a */
    public HttpResponse mo102225a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        String url = request.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(request.getHeaders());
        HttpURLConnection m102215k = m102215k(new URL(url), request);
        try {
            for (String str : hashMap.keySet()) {
                m102215k.setRequestProperty(str, (String) hashMap.get(str));
            }
            m102214l(m102215k, request);
            int responseCode = m102215k.getResponseCode();
            if (responseCode != -1) {
                if (!m102217i(request.getMethod(), responseCode)) {
                    HttpResponse httpResponse = new HttpResponse(responseCode, m102221e(m102215k.getHeaderFields()));
                    m102215k.disconnect();
                    return httpResponse;
                }
                return new HttpResponse(responseCode, m102221e(m102215k.getHeaderFields()), m102215k.getContentLength(), m102219g(request, m102215k));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th) {
            if (0 == 0) {
                m102215k.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: f */
    protected HttpURLConnection m102220f(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* renamed from: g */
    protected InputStream m102219g(Request<?> request, HttpURLConnection httpURLConnection) {
        return new C3763a(httpURLConnection);
    }

    /* renamed from: h */
    protected OutputStream m102218h(Request<?> request, HttpURLConnection httpURLConnection, int i) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    /* renamed from: l */
    void m102214l(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    m102223c(httpURLConnection, request, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m102222d(httpURLConnection, request);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m102222d(httpURLConnection, request);
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
                m102222d(httpURLConnection, request);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public HurlStack(InterfaceC3764b interfaceC3764b) {
        this(interfaceC3764b, null);
    }

    public HurlStack(InterfaceC3764b interfaceC3764b, SSLSocketFactory sSLSocketFactory) {
        this.f3537a = sSLSocketFactory;
    }
}
