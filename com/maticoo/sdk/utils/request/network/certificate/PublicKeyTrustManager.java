package com.maticoo.sdk.utils.request.network.certificate;

import com.ironsource.C21114v8;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes6.dex */
public class PublicKeyTrustManager implements X509TrustManager {
    private final List<String> trustKeys = Arrays.asList("S7g1rSNao6g2EUBbylVSMu8TqeOAgZPlUeWoCEQE6G8=", "qo1QyzYCUCM6TTpkflyWle2ERuNQ8q7/99oCt1RmDgk=", "qiYwp7YXsE0KKUureoyqpQFubb5gSDeoOoVxn6tmfrU=");

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new UnsupportedOperationException();
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (x509CertificateArr.length != 0) {
            int length = x509CertificateArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (this.trustKeys.contains(new PublicKeyPin(x509CertificateArr[i]).toString())) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return;
            }
            throw new CertificateException("Certificate is not in trusted list (" + this.trustKeys.toString() + ")");
        }
        throw new IllegalArgumentException("null or zero-length certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return "PublicKeyTrustManager [trustKeys=" + this.trustKeys.toString() + C21114v8.C21123i.f54139e;
    }
}
