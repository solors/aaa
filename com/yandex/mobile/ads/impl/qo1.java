package com.yandex.mobile.ads.impl;

import android.net.http.SslCertificate;
import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class qo1 {
    @Nullable
    /* renamed from: a */
    public static final X509Certificate m30254a(@NotNull SslCertificate sslCertificate, @NotNull CertificateFactory x509CertificateFactory) {
        byte[] byteArray;
        Intrinsics.checkNotNullParameter(sslCertificate, "<this>");
        Intrinsics.checkNotNullParameter(x509CertificateFactory, "x509CertificateFactory");
        if (!Intrinsics.m17075f(x509CertificateFactory.getType(), AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509)) {
            x509CertificateFactory.getType();
            um0.m28727b(new Object[0]);
            return null;
        }
        Bundle saveState = SslCertificate.saveState(sslCertificate);
        if (saveState == null || (byteArray = saveState.getByteArray("x509-certificate")) == null) {
            return null;
        }
        try {
            Certificate generateCertificate = x509CertificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
            if (!(generateCertificate instanceof X509Certificate)) {
                return null;
            }
            return (X509Certificate) generateCertificate;
        } catch (CertificateException unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }
}
