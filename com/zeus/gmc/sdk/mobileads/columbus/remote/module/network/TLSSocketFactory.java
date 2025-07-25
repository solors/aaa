package com.zeus.gmc.sdk.mobileads.columbus.remote.module.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public class TLSSocketFactory extends SSLSocketFactory {
    private SSLSocketFactory internalSSLSocketFactory;

    public TLSSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.internalSSLSocketFactory = sSLSocketFactory;
    }

    public static TLSSocketFactory create() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            return new TLSSocketFactory(sSLContext.getSocketFactory());
        } catch (KeyManagementException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private Socket enableTLSOnSocket(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return enableTLSOnSocket(this.internalSSLSocketFactory.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.internalSSLSocketFactory.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.internalSSLSocketFactory.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return enableTLSOnSocket(this.internalSSLSocketFactory.createSocket(socket, str, i, z));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return enableTLSOnSocket(this.internalSSLSocketFactory.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return enableTLSOnSocket(this.internalSSLSocketFactory.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return enableTLSOnSocket(this.internalSSLSocketFactory.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return enableTLSOnSocket(this.internalSSLSocketFactory.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public static void initDefaultSocketFactory() {
    }
}
