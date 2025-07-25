package p747jf;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.Protocol;

@Metadata
/* renamed from: jf.d */
/* loaded from: classes10.dex */
public final class ConscryptPlatform extends C37357h {
    @NotNull

    /* renamed from: e */
    public static final C37351a f98598e;

    /* renamed from: f */
    private static final boolean f98599f;
    @NotNull

    /* renamed from: d */
    private final Provider f98600d;

    /* compiled from: ConscryptPlatform.kt */
    @Metadata
    /* renamed from: jf.d$a */
    /* loaded from: classes10.dex */
    public static final class C37351a {
        private C37351a() {
        }

        public /* synthetic */ C37351a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m18353a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i) {
                if (version.major() > i) {
                    return true;
                }
                return false;
            } else if (version.minor() != i2) {
                if (version.minor() > i2) {
                    return true;
                }
                return false;
            } else if (version.patch() >= i3) {
                return true;
            } else {
                return false;
            }
        }

        @Nullable
        /* renamed from: b */
        public final ConscryptPlatform m18352b() {
            if (!m18351c()) {
                return null;
            }
            return new ConscryptPlatform(null);
        }

        /* renamed from: c */
        public final boolean m18351c() {
            return ConscryptPlatform.f98599f;
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    @Metadata
    /* renamed from: jf.d$b */
    /* loaded from: classes10.dex */
    public static final class C37352b implements ConscryptHostnameVerifier {
        @NotNull

        /* renamed from: a */
        public static final C37352b f98601a = new C37352b();

        private C37352b() {
        }
    }

    static {
        C37351a c37351a = new C37351a(null);
        f98598e = c37351a;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, c37351a.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (c37351a.m18353a(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f98599f = z;
    }

    public /* synthetic */ ConscryptPlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // p747jf.C37357h
    /* renamed from: e */
    public void mo18337e(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (Conscrypt.isConscrypt(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = C37357h.f98616a.m18323b(protocols).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
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
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return super.mo18333i(sslSocket);
    }

    @Override // p747jf.C37357h
    @NotNull
    /* renamed from: o */
    public SSLContext mo18327o() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f98600d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p747jf.C37357h
    @NotNull
    /* renamed from: p */
    public SSLSocketFactory mo18326p(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext mo18327o = mo18327o();
        mo18327o.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = mo18327o.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p747jf.C37357h
    @NotNull
    /* renamed from: q */
    public X509TrustManager mo18325q() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C37352b.f98601a);
                return x509TrustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        throw new IllegalStateException(Intrinsics.m17064q("Unexpected default trust managers: ", arrays).toString());
    }

    private ConscryptPlatform() {
        Provider newProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(newProvider, "newProvider()");
        this.f98600d = newProvider;
    }
}
