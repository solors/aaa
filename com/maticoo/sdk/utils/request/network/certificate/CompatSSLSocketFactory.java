package com.maticoo.sdk.utils.request.network.certificate;

import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes6.dex */
public class CompatSSLSocketFactory extends SSLSocketFactory {
    private SSLSocketFactory delegate;
    private X509TrustManager proxyTrustManager;
    private static final String[] PROTOCOL_ARRAY_LOWER = {"SSLv3", "TLSv1"};
    private static final String[] PROTOCOL_ARRAY = {"SSLv3", "TLSv1", "TLSv1.1", "TLSv1.2"};

    public CompatSSLSocketFactory() {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                this.proxyTrustManager = platformTrustManager();
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new X509TrustManager() { // from class: com.maticoo.sdk.utils.request.network.certificate.CompatSSLSocketFactory.1
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                    if (CompatSSLSocketFactory.this.proxyTrustManager != null) {
                        CompatSSLSocketFactory.this.proxyTrustManager.checkClientTrusted(x509CertificateArr, str);
                    }
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                    if (x509CertificateArr != null) {
                        if (x509CertificateArr.length > 0) {
                            try {
                                x509CertificateArr[0].checkValidity();
                                if (CompatSSLSocketFactory.this.proxyTrustManager != null) {
                                    CompatSSLSocketFactory.this.proxyTrustManager.checkServerTrusted(x509CertificateArr, str);
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                throw new CertificateException("Certificate not valid or trusted.");
                            }
                        }
                        throw new IllegalArgumentException("X509Certificate is empty");
                    }
                    throw new IllegalArgumentException("X509Certificate array is null");
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }}, new SecureRandom());
            this.delegate = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    public static X509TrustManager platformTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        throw new IllegalStateException("Unexpected default trust managers: " + Arrays.toString(trustManagers));
    }

    private static void setSupportProtocolAndCipherSuites(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(PROTOCOL_ARRAY);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.delegate.createSocket(socket, str, i, z);
        setSupportProtocolAndCipherSuites(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.delegate.createSocket(str, i);
        setSupportProtocolAndCipherSuites(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.delegate.createSocket(str, i, inetAddress, i2);
        setSupportProtocolAndCipherSuites(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.delegate.createSocket(inetAddress, i);
        setSupportProtocolAndCipherSuites(createSocket);
        return createSocket;
    }

    public CompatSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.delegate.createSocket(inetAddress, i, inetAddress2, i2);
        setSupportProtocolAndCipherSuites(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        Socket createSocket = this.delegate.createSocket();
        setSupportProtocolAndCipherSuites(createSocket);
        return createSocket;
    }
}
