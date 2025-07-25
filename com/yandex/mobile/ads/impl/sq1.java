package com.yandex.mobile.ads.impl;

import androidx.annotation.RequiresApi;
import java.net.Socket;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(24)
/* loaded from: classes8.dex */
public final class sq1 extends X509ExtendedTrustManager implements es1 {
    @NotNull

    /* renamed from: a */
    private final fs1 f85344a;

    public sq1(@NotNull InterfaceC30120cu customCertificatesProvider) {
        Intrinsics.checkNotNullParameter(customCertificatesProvider, "customCertificatesProvider");
        this.f85344a = new fs1(customCertificatesProvider);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        this.f85344a.m34094a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        this.f85344a.m34090b(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f85344a.m34087c();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) {
        this.f85344a.m34093a(x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) {
        this.f85344a.m34089b(x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) {
        this.f85344a.m34092a(x509CertificateArr, str, sSLEngine);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) {
        this.f85344a.m34088b(x509CertificateArr, str, sSLEngine);
    }
}
