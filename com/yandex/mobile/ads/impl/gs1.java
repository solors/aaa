package com.yandex.mobile.ads.impl;

import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class gs1 implements es1 {
    @NotNull

    /* renamed from: a */
    private final fs1 f79764a;

    public gs1(@NotNull xp1 customCertificatesProvider) {
        Intrinsics.checkNotNullParameter(customCertificatesProvider, "customCertificatesProvider");
        this.f79764a = new fs1(customCertificatesProvider);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        this.f79764a.m34094a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        this.f79764a.m34090b(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f79764a.m34087c();
    }
}
