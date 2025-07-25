package com.yandex.mobile.ads.impl;

import androidx.annotation.ChecksSdkIntAtLeast;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* loaded from: classes8.dex */
public final class g22 {
    @NotNull

    /* renamed from: a */
    private static final InterfaceC38501j f79450a;

    /* renamed from: b */
    public static final /* synthetic */ int f79451b = 0;

    /* renamed from: com.yandex.mobile.ads.impl.g22$a */
    /* loaded from: classes8.dex */
    static final class C30358a extends Lambda implements Functions<CertificateFactory> {

        /* renamed from: b */
        public static final C30358a f79452b = new C30358a();

        C30358a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final CertificateFactory invoke() {
            try {
                return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            } catch (CertificateException unused) {
                return null;
            }
        }
    }

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(C30358a.f79452b);
        f79450a = m14554a;
    }

    @ChecksSdkIntAtLeast(api = 24)
    /* renamed from: a */
    public static final boolean m33984a() {
        return true;
    }

    @Nullable
    /* renamed from: a */
    public static final X509Certificate m33982a(@NotNull byte[] certBytes) {
        Intrinsics.checkNotNullParameter(certBytes, "certBytes");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(certBytes);
        try {
            CertificateFactory certificateFactory = (CertificateFactory) f79450a.getValue();
            return (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
        } catch (CertificateException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public static final X509TrustManager m33983a(@Nullable KeyStore keyStore) {
        Object m17529r0;
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            Intrinsics.m17074g(trustManagers);
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            m17529r0 = _Collections.m17529r0(arrayList);
            return (X509TrustManager) m17529r0;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }
}
