package com.maticoo.sdk.utils.request.network.certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes6.dex */
public class SSLUtils {
    private static final HostnameVerifier HOSTNAME_VERIFIER = new HostnameVerifier() { // from class: com.maticoo.sdk.utils.request.network.certificate.SSLUtils.1
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    };

    public static HostnameVerifier defaultHostnameVerifier() {
        return HOSTNAME_VERIFIER;
    }

    public static SSLSocketFactory defaultSSLSocketFactory() {
        return new CompatSSLSocketFactory();
    }

    public static SSLSocketFactory fixSSLLowerThanLollipop(SSLSocketFactory sSLSocketFactory) {
        return sSLSocketFactory;
    }
}
