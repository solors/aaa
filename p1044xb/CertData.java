package p1044xb;

import androidx.annotation.NonNull;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: xb.a */
/* loaded from: classes9.dex */
public final class CertData {
    @NonNull

    /* renamed from: a */
    public final X509TrustManager f118299a;
    @NonNull

    /* renamed from: b */
    public final SSLContext f118300b;
    @NonNull

    /* renamed from: c */
    public final TrustManagerFactory f118301c;

    public CertData(@NonNull X509TrustManager x509TrustManager, @NonNull SSLContext sSLContext, @NonNull TrustManagerFactory trustManagerFactory) {
        this.f118299a = x509TrustManager;
        this.f118300b = sSLContext;
        this.f118301c = trustManagerFactory;
    }
}
