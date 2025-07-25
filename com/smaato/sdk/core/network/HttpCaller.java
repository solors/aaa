package com.smaato.sdk.core.network;

import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Request;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.core.network.j */
/* loaded from: classes7.dex */
public class HttpCaller implements Interceptor {

    /* renamed from: a */
    static final HttpCaller f71830a = new HttpCaller();

    HttpCaller() {
    }

    @Override // com.smaato.sdk.core.network.Interceptor
    @NonNull
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        MimeType mimeType;
        String uri = chain.request().uri().toString();
        if (!URLUtil.isHttpUrl(uri) && !URLUtil.isHttpsUrl(uri)) {
            throw new MalformedURLException("expected http(s) scheme, got " + chain.request().uri().getScheme());
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
        httpURLConnection.setConnectTimeout((int) chain.connectTimeoutMillis());
        httpURLConnection.setReadTimeout((int) chain.readTimeoutMillis());
        httpURLConnection.setInstanceFollowRedirects(chain.request().followRedirects());
        httpURLConnection.setRequestMethod(chain.request().method());
        Iterator<Map.Entry<String, List<String>>> it = chain.request().headers().iterator();
        while (it.hasNext()) {
            Map.Entry<String, List<String>> next = it.next();
            for (String str : next.getValue()) {
                httpURLConnection.addRequestProperty(next.getKey(), str);
            }
        }
        Request.Body body = chain.request().body();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            body.writeTo(httpURLConnection.getOutputStream());
        }
        int responseCode = httpURLConnection.getResponseCode();
        String contentEncoding = httpURLConnection.getContentEncoding();
        int contentLength = httpURLConnection.getContentLength();
        Headers m39436of = Headers.m39436of(httpURLConnection.getHeaderFields());
        List<String> values = m39436of.values("Content-Type");
        if (!values.isEmpty()) {
            mimeType = MimeType.parse(values.get(0));
        } else {
            mimeType = null;
        }
        try {
            return Response.builder().request(chain.request()).responseCode(responseCode).headers(m39436of).mimeType(mimeType).connection(httpURLConnection).body(HttpBody.m39430a().mo39427c(new BufferedInputStream(httpURLConnection.getInputStream())).mo39428b(contentLength).mo39429a()).encoding(contentEncoding).build();
        } catch (Exception e) {
            throw new HttpNoResponseBodyException(e, responseCode, m39436of);
        }
    }
}
