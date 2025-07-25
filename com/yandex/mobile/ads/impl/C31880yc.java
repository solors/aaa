package com.yandex.mobile.ads.impl;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.yc */
/* loaded from: classes8.dex */
public final class C31880yc extends AbstractC30180dn {
    @NotNull

    /* renamed from: a */
    private final X509TrustManager f88142a;
    @NotNull

    /* renamed from: b */
    private final X509TrustManagerExtensions f88143b;

    /* renamed from: com.yandex.mobile.ads.impl.yc$a */
    /* loaded from: classes8.dex */
    public static final class C31881a {
        @Nullable
        /* renamed from: a */
        public static C31880yc m26967a(@NotNull X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions == null) {
                return null;
            }
            return new C31880yc(trustManager, x509TrustManagerExtensions);
        }
    }

    public C31880yc(@NotNull X509TrustManager trustManager, @NotNull X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f88142a = trustManager;
        this.f88143b = x509TrustManagerExtensions;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30180dn
    @NotNull
    /* renamed from: a */
    public final List mo26968a(@NotNull String hostname, @NotNull List chain) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f88143b.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "checkServerTrusted(...)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof C31880yc) && ((C31880yc) obj).f88142a == this.f88142a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f88142a);
    }
}
