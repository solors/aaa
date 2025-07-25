package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.yandex.mobile.ads.impl.as1;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* loaded from: classes8.dex */
public final class ce2 implements be2 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC38501j f77613a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.ce2$a */
    /* loaded from: classes8.dex */
    public static final class C30089a extends Lambda implements Functions<CertificateFactory> {

        /* renamed from: b */
        public static final C30089a f77614b = new C30089a();

        C30089a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final CertificateFactory invoke() {
            return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        }
    }

    public ce2() {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(C30089a.f77614b);
        this.f77613a = m14554a;
    }

    @Override // com.yandex.mobile.ads.impl.be2
    /* renamed from: a */
    public final boolean mo35239a(@NotNull Context context, @NotNull SslError sslError) {
        X509Certificate m30254a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sslError, "sslError");
        int i = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (m35796a == null || !m35796a.m26759f0()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m30254a = sslError.getCertificate().getX509Certificate();
        } else {
            SslCertificate certificate = sslError.getCertificate();
            Intrinsics.checkNotNullExpressionValue(certificate, "getCertificate(...)");
            Object value = this.f77613a.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            m30254a = qo1.m30254a(certificate, (CertificateFactory) value);
        }
        if (m30254a == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ro0.m29971a(new xp1(context)).checkServerTrusted(new X509Certificate[]{m30254a}, "RSA");
            return true;
        } catch (Exception unused) {
            Object[] args = new Object[0];
            int i2 = um0.f86330b;
            Intrinsics.checkNotNullParameter(args, "args");
            return false;
        }
    }
}
