package com.maticoo.sdk.utils.request.network.connect;

import com.maticoo.sdk.utils.IOUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.network.Headers;
import com.maticoo.sdk.utils.request.network.Request;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class HttpConnection extends AbstractUrlConnection {
    private HttpURLConnection mConnection;

    @Override // com.maticoo.sdk.utils.request.network.connect.AbstractUrlConnection
    public void cancel() throws Exception {
        super.cancel();
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            IOUtil.closeQuietly(httpURLConnection.getInputStream());
            this.mConnection.disconnect();
        }
    }

    @Override // com.maticoo.sdk.utils.request.network.connect.AbstractUrlConnection
    public URLConnection connect(Request request) throws Exception {
        String url = request.getUrl();
        DeveloperLog.LogD("HttpConnection", "url is : " + url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
        this.mConnection = httpURLConnection;
        httpURLConnection.setConnectTimeout(request.getConnectTimeout());
        this.mConnection.setReadTimeout(request.getReadTimeout());
        this.mConnection.setInstanceFollowRedirects(request.isInstanceFollowRedirects());
        Request.Method requestMethod = request.getRequestMethod();
        this.mConnection.setRequestMethod(requestMethod.toString());
        this.mConnection.setDoInput(true);
        this.mConnection.setDoOutput(isAllowBody(requestMethod));
        Headers headers = request.getHeaders();
        if (headers != null) {
            List<String> list = headers.get("Connection");
            if (list != null && !list.isEmpty()) {
                headers.set("Connection", list.get(0));
            }
            for (Map.Entry<String, String> entry : Headers.getRequestHeaders(headers).entrySet()) {
                this.mConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        this.mConnection.connect();
        return this.mConnection;
    }

    @Override // com.maticoo.sdk.utils.request.network.connect.AbstractUrlConnection
    int getResponseCode() throws IOException {
        return this.mConnection.getResponseCode();
    }
}
