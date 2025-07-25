package com.meevii.abtest.business.remote.https;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.LinkedList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* loaded from: classes6.dex */
public class SSLSocketFactoryCompat extends SSLSocketFactory {
    static String[] cipherSuites;
    static String[] protocols;
    private final SSLSocketFactory defaultFactory;

    static {
        String[] supportedProtocols;
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket != null) {
                LinkedList linkedList = new LinkedList();
                for (String str : sSLSocket.getSupportedProtocols()) {
                    if (!str.toUpperCase().contains("SSL")) {
                        linkedList.add(str);
                    }
                }
                protocols = (String[]) linkedList.toArray(new String[linkedList.size()]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SSLSocketFactoryCompat(TrustManager[] trustManagerArr) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerArr, null);
            this.defaultFactory = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    private void upgradeTLS(SSLSocket sSLSocket) {
        String[] strArr = protocols;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.defaultFactory.createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            upgradeTLS((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return cipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return cipherSuites;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.defaultFactory.createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            upgradeTLS((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.defaultFactory.createSocket(str, i, inetAddress, i2);
        if (createSocket instanceof SSLSocket) {
            upgradeTLS((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.defaultFactory.createSocket(inetAddress, i);
        if (createSocket instanceof SSLSocket) {
            upgradeTLS((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.defaultFactory.createSocket(inetAddress, i, inetAddress2, i2);
        if (createSocket instanceof SSLSocket) {
            upgradeTLS((SSLSocket) createSocket);
        }
        return createSocket;
    }
}
