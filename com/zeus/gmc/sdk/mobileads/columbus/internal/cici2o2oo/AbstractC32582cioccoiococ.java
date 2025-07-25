package com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo;

import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.cioccoiococ */
/* loaded from: classes8.dex */
public abstract class AbstractC32582cioccoiococ extends HttpURLConnection {
    private static final int c2oc2i = 10000;
    private static final int coi222o222 = 10000;
    private static final String coo2iico = "MiHttpUrlConnection";

    private AbstractC32582cioccoiococ(URL url) {
        super(url);
    }

    static boolean c2oc2i(@NonNull String str) {
        try {
            URLDecoder.decode(str, "UTF-8");
            return false;
        } catch (UnsupportedEncodingException unused) {
            MLog.m25889e(coo2iico, "Url is improperly encoded: " + str);
            return true;
        }
    }

    @NonNull
    public static String c2oc2o(@NonNull String str) throws Exception {
        URI uri;
        C32584coiic.coo2iico(str);
        if (!c2oc2i(str)) {
            if (cioccoiococ(str)) {
                uri = coo2iico(str);
            } else {
                uri = new URI(str);
            }
            return uri.toURL().toString();
        }
        throw new UnsupportedEncodingException("URL is improperly encoded: " + str);
    }

    static boolean cioccoiococ(@NonNull String str) {
        try {
            new URI(str);
            return false;
        } catch (URISyntaxException unused) {
            return true;
        }
    }

    public static HttpURLConnection coi222o222(@NonNull String str) throws IOException {
        C32584coiic.coo2iico(str);
        if (!c2oc2i(str)) {
            try {
                str = c2oc2o(str);
            } catch (Exception unused) {
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            return httpURLConnection;
        }
        throw new IllegalArgumentException("URL is improperly encoded: " + str);
    }

    @NonNull
    static URI coo2iico(@NonNull String str) throws Exception {
        try {
            URL url = new URL(str);
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        } catch (Exception e) {
            MLog.m25889e(coo2iico, "Failed to encode url: " + str);
            throw e;
        }
    }
}
