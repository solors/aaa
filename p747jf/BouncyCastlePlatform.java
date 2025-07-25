package p747jf;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.Protocol;

@Metadata
/* renamed from: jf.c */
/* loaded from: classes10.dex */
public final class BouncyCastlePlatform extends C37357h {
    @NotNull

    /* renamed from: e */
    public static final C37350a f98595e;

    /* renamed from: f */
    private static final boolean f98596f;
    @NotNull

    /* renamed from: d */
    private final Provider f98597d;

    /* compiled from: BouncyCastlePlatform.kt */
    @Metadata
    /* renamed from: jf.c$a */
    /* loaded from: classes10.dex */
    public static final class C37350a {
        private C37350a() {
        }

        public /* synthetic */ C37350a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final BouncyCastlePlatform m18356a() {
            if (!m18355b()) {
                return null;
            }
            return new BouncyCastlePlatform(null);
        }

        /* renamed from: b */
        public final boolean m18355b() {
            return BouncyCastlePlatform.f98596f;
        }
    }

    static {
        C37350a c37350a = new C37350a(null);
        f98595e = c37350a;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, c37350a.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f98596f = z;
    }

    public /* synthetic */ BouncyCastlePlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // p747jf.C37357h
    /* renamed from: e */
    public void mo18337e(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (sslSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = C37357h.f98616a.m18323b(protocols).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        super.mo18337e(sslSocket, str, protocols);
    }

    @Override // p747jf.C37357h
    @Nullable
    /* renamed from: i */
    public String mo18333i(@NotNull SSLSocket sslSocket) {
        boolean m17075f;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (sslSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
            if (applicationProtocol == null) {
                m17075f = true;
            } else {
                m17075f = Intrinsics.m17075f(applicationProtocol, "");
            }
            if (m17075f) {
                return null;
            }
            return applicationProtocol;
        }
        return super.mo18333i(sslSocket);
    }

    @Override // p747jf.C37357h
    @NotNull
    /* renamed from: o */
    public SSLContext mo18327o() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f98597d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p747jf.C37357h
    @NotNull
    /* renamed from: q */
    public X509TrustManager mo18325q() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.m17074g(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        throw new IllegalStateException(Intrinsics.m17064q("Unexpected default trust managers: ", arrays).toString());
    }

    private BouncyCastlePlatform() {
        this.f98597d = new BouncyCastleJsseProvider();
    }
}
