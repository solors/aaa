package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class xf1 extends SSLSocketFactory {

    /* renamed from: b */
    public static final /* synthetic */ int f87675b = 0;
    @NotNull

    /* renamed from: a */
    private final SSLSocketFactory f87676a;

    /* renamed from: com.yandex.mobile.ads.impl.xf1$a */
    /* loaded from: classes8.dex */
    public static final class C31819a {
        private C31819a() {
        }

        /* renamed from: a */
        public static final String[] m27513a(SSLSocketFactory sSLSocketFactory) {
            int i = xf1.f87675b;
            String[] defaultCipherSuites = sSLSocketFactory.getDefaultCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(defaultCipherSuites, defaultCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            return (String[]) arrayList.toArray(new String[0]);
        }

        /* renamed from: b */
        public static final String[] m27512b(SSLSocketFactory sSLSocketFactory) {
            int i = xf1.f87675b;
            String[] supportedCipherSuites = sSLSocketFactory.getSupportedCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(supportedCipherSuites, supportedCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            return (String[]) arrayList.toArray(new String[0]);
        }

        public /* synthetic */ C31819a(int i) {
            this();
        }
    }

    public xf1(@NotNull SSLSocketFactory delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f87676a = delegate;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public final Socket createSocket(@NotNull String arg0, int i) throws IOException {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Socket createSocket = this.f87676a.createSocket(arg0, i);
        String[] m27513a = C31819a.m27513a(this.f87676a);
        Intrinsics.m17073h(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(m27513a);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public final String[] getDefaultCipherSuites() {
        return C31819a.m27513a(this.f87676a);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public final String[] getSupportedCipherSuites() {
        return C31819a.m27512b(this.f87676a);
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public final Socket createSocket(@NotNull String arg0, int i, @NotNull InetAddress arg2, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(arg2, "arg2");
        Socket createSocket = this.f87676a.createSocket(arg0, i, arg2, i2);
        String[] m27513a = C31819a.m27513a(this.f87676a);
        Intrinsics.m17073h(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(m27513a);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public final Socket createSocket(@NotNull InetAddress arg0, int i) throws IOException {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Socket createSocket = this.f87676a.createSocket(arg0, i);
        String[] m27513a = C31819a.m27513a(this.f87676a);
        Intrinsics.m17073h(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(m27513a);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public final Socket createSocket(@NotNull InetAddress arg0, int i, @NotNull InetAddress arg2, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(arg2, "arg2");
        Socket createSocket = this.f87676a.createSocket(arg0, i, arg2, i2);
        String[] m27513a = C31819a.m27513a(this.f87676a);
        Intrinsics.m17073h(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(m27513a);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public final Socket createSocket(@NotNull Socket arg0, @NotNull String arg1, int i, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(arg1, "arg1");
        Socket createSocket = this.f87676a.createSocket(arg0, arg1, i, z);
        String[] m27513a = C31819a.m27513a(this.f87676a);
        Intrinsics.m17073h(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(m27513a);
        return createSocket;
    }
}
