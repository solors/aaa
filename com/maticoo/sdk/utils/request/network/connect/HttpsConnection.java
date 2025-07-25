package com.maticoo.sdk.utils.request.network.connect;

import android.os.Build;
import com.maticoo.sdk.utils.IOUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.network.Headers;
import com.maticoo.sdk.utils.request.network.Request;
import com.maticoo.sdk.utils.request.network.certificate.PublicKeyTrustManager;
import com.maticoo.sdk.utils.request.network.certificate.SSLUtils;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* loaded from: classes6.dex */
public final class HttpsConnection extends AbstractUrlConnection {
    private HttpsURLConnection mConnection;

    @Override // com.maticoo.sdk.utils.request.network.connect.AbstractUrlConnection
    public void cancel() throws Exception {
        super.cancel();
        HttpsURLConnection httpsURLConnection = this.mConnection;
        if (httpsURLConnection != null) {
            IOUtil.closeQuietly(httpsURLConnection.getInputStream());
            this.mConnection.disconnect();
        }
    }

    @Override // com.maticoo.sdk.utils.request.network.connect.AbstractUrlConnection
    public URLConnection connect(Request request) throws Exception {
        String url = request.getUrl();
        DeveloperLog.LogD("HttpsConnection", "url is : " + url);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(url).openConnection();
        this.mConnection = httpsURLConnection;
        httpsURLConnection.setConnectTimeout(request.getConnectTimeout());
        this.mConnection.setReadTimeout(request.getReadTimeout());
        this.mConnection.setInstanceFollowRedirects(request.isInstanceFollowRedirects());
        Request.Method requestMethod = request.getRequestMethod();
        this.mConnection.setRequestMethod(requestMethod.toString());
        this.mConnection.setDoInput(true);
        this.mConnection.setDoOutput(isAllowBody(requestMethod));
        this.mConnection.setUseCaches(false);
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
        if (request.isCheckChain()) {
            TrustManager[] trustManagerArr = {new PublicKeyTrustManager()};
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            this.mConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.mConnection.setSSLSocketFactory(SSLUtils.defaultSSLSocketFactory());
        }
        this.mConnection.connect();
        return this.mConnection;
    }

    @Override // com.maticoo.sdk.utils.request.network.connect.AbstractUrlConnection
    int getResponseCode() throws IOException {
        return this.mConnection.getResponseCode();
    }
}
