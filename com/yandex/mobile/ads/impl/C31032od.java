package com.yandex.mobile.ads.impl;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(24)
/* renamed from: com.yandex.mobile.ads.impl.od */
/* loaded from: classes8.dex */
public final class C31032od {
    @DoNotInline
    /* renamed from: a */
    public static final void m31052a(@NotNull X509TrustManager trustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) throws CertificateException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        if (trustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) trustManager).checkClientTrusted(x509CertificateArr, str, socket);
        } else {
            trustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    /* renamed from: b */
    public static final void m31050b(@NotNull X509TrustManager trustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) throws CertificateException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        if (trustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) trustManager).checkServerTrusted(x509CertificateArr, str, socket);
        } else {
            trustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    /* renamed from: a */
    public static final void m31051a(@NotNull X509TrustManager trustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) throws CertificateException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        if (trustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) trustManager).checkClientTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            trustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    /* renamed from: b */
    public static final void m31049b(@NotNull X509TrustManager trustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) throws CertificateException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        if (trustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) trustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            trustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    @NotNull
    /* renamed from: a */
    public static final es1 m31053a(@NotNull InterfaceC30120cu customCertificatesProvider) throws CertificateException {
        Intrinsics.checkNotNullParameter(customCertificatesProvider, "customCertificatesProvider");
        return new sq1(customCertificatesProvider);
    }
}
