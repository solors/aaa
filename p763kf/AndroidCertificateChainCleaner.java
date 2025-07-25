package p763kf;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p791mf.CertificateChainCleaner;

@Metadata
/* renamed from: kf.b */
/* loaded from: classes10.dex */
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
    @NotNull

    /* renamed from: d */
    public static final C37515a f99178d = new C37515a(null);
    @NotNull

    /* renamed from: b */
    private final X509TrustManager f99179b;
    @NotNull

    /* renamed from: c */
    private final X509TrustManagerExtensions f99180c;

    /* compiled from: AndroidCertificateChainCleaner.kt */
    @Metadata
    /* renamed from: kf.b$a */
    /* loaded from: classes10.dex */
    public static final class C37515a {
        private C37515a() {
        }

        public /* synthetic */ C37515a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final AndroidCertificateChainCleaner m17659a(@NotNull X509TrustManager trustManager) {
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
            return new AndroidCertificateChainCleaner(trustManager, x509TrustManagerExtensions);
        }
    }

    public AndroidCertificateChainCleaner(@NotNull X509TrustManager trustManager, @NotNull X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f99179b = trustManager;
        this.f99180c = x509TrustManagerExtensions;
    }

    @Override // p791mf.CertificateChainCleaner
    @NotNull
    /* renamed from: a */
    public List<Certificate> mo15124a(@NotNull List<? extends Certificate> chain, @NotNull String hostname) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f99180c.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
                Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof AndroidCertificateChainCleaner) && ((AndroidCertificateChainCleaner) obj).f99179b == this.f99179b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f99179b);
    }
}
