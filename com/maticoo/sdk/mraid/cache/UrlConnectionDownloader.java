package com.maticoo.sdk.mraid.cache;

import android.content.Context;
import android.net.http.HttpResponseCache;
import android.os.Build;
import android.text.TextUtils;
import com.maticoo.sdk.mraid.utils.ContextHolder;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.network.certificate.SSLUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes6.dex */
public class UrlConnectionDownloader {
    private static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 15000;
    private static final int DEFAULT_READ_TIMEOUT_MILLIS = 20000;
    private static final String REQUEST_METHOD = "GET";
    private static final String RESPONSE_SOURCE = "X-Android-Response-Source";
    private static volatile Object cache;
    private static final Object lock = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class ResponseCacheIcs {
        private ResponseCacheIcs() {
        }

        static void close(Object obj) {
            try {
                ((HttpResponseCache) obj).close();
            } catch (IOException unused) {
            }
        }

        static Object install(Context context) throws IOException {
            File createDefaultCacheDir = Util.createDefaultCacheDir(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            if (installed == null) {
                return HttpResponseCache.install(createDefaultCacheDir, Util.calculateDiskCacheSize(createDefaultCacheDir));
            }
            return installed;
        }
    }

    /* loaded from: classes6.dex */
    private static class SingleTonHolder {
        private static UrlConnectionDownloader INSTANCE = new UrlConnectionDownloader();

        private SingleTonHolder() {
        }
    }

    public static UrlConnectionDownloader getInstance() {
        return SingleTonHolder.INSTANCE;
    }

    private static void installCacheIfNeeded(Context context) {
        if (cache == null) {
            try {
                synchronized (lock) {
                    if (cache == null) {
                        cache = ResponseCacheIcs.install(context);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    private HttpURLConnection openConnection(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            if (Build.VERSION.SDK_INT < 28) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(SSLUtils.defaultSSLSocketFactory());
            }
            HostnameVerifier defaultHostnameVerifier = SSLUtils.defaultHostnameVerifier();
            if (defaultHostnameVerifier != null) {
                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(defaultHostnameVerifier);
            }
        }
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }

    public DownloadResult load(String str, Map<String, String> map) throws RedirectsException, IOException {
        String str2;
        installCacheIfNeeded(ContextHolder.getGlobalAppContext());
        HttpURLConnection openConnection = openConnection(str);
        openConnection.setRequestMethod("GET");
        openConnection.setUseCaches(true);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                openConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        int responseCode = openConnection.getResponseCode();
        if (responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307) {
            openConnection.disconnect();
            String headerField = openConnection.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                DeveloperLog.LogW(String.format("Uri redirects failed. newUri is empty, originUri: %s", str));
            } else {
                DeveloperLog.LogW("Uri redirect, newUri is " + headerField);
                throw new RedirectsException(headerField);
            }
        }
        String responseMessage = openConnection.getResponseMessage();
        InputStream inputStream = openConnection.getInputStream();
        boolean parseResponseSourceHeader = Util.parseResponseSourceHeader(openConnection.getHeaderField(RESPONSE_SOURCE));
        HashMap hashMap = new HashMap();
        if (openConnection.getContentEncoding() != null) {
            str2 = openConnection.getContentEncoding();
        } else {
            str2 = "UTF-8";
        }
        String str3 = str2;
        String contentType = openConnection.getContentType();
        Map<String, List<String>> headerFields = openConnection.getHeaderFields();
        if (headerFields != null) {
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                List<String> value = entry2.getValue();
                if (!value.isEmpty()) {
                    hashMap.put(entry2.getKey(), value.get(0));
                }
            }
        }
        return new DownloadResult(responseCode, responseMessage, inputStream, hashMap, str3, contentType, parseResponseSourceHeader);
    }

    public void shutdown() {
        if (cache != null) {
            ResponseCacheIcs.close(cache);
        }
    }

    private UrlConnectionDownloader() {
    }
}
