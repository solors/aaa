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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p1077ze.Protocol;

@Metadata
/* renamed from: jf.g */
/* loaded from: classes10.dex */
public final class OpenJSSEPlatform extends C37357h {
    @NotNull

    /* renamed from: e */
    public static final C37356a f98613e;

    /* renamed from: f */
    private static final boolean f98614f;
    @NotNull

    /* renamed from: d */
    private final Provider f98615d;

    /* compiled from: OpenJSSEPlatform.kt */
    @Metadata
    /* renamed from: jf.g$a */
    /* loaded from: classes10.dex */
    public static final class C37356a {
        private C37356a() {
        }

        public /* synthetic */ C37356a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final OpenJSSEPlatform m18343a() {
            if (!m18342b()) {
                return null;
            }
            return new OpenJSSEPlatform(null);
        }

        /* renamed from: b */
        public final boolean m18342b() {
            return OpenJSSEPlatform.f98614f;
        }
    }

    static {
        C37356a c37356a = new C37356a(null);
        f98613e = c37356a;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, c37356a.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f98614f = z;
    }

    public /* synthetic */ OpenJSSEPlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // p747jf.C37357h
    /* renamed from: e */
    public void mo18337e(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket = (org.openjsse.javax.net.ssl.SSLSocket) sslSocket;
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = C37357h.f98616a.m18323b(protocols).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket.setSSLParameters(sSLParameters);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            return;
        }
        super.mo18337e(sslSocket, str, protocols);
    }

    @Override // p747jf.C37357h
    @Nullable
    /* renamed from: i */
    public String mo18333i(@NotNull SSLSocket sslSocket) {
        boolean m17075f;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sslSocket).getApplicationProtocol();
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
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f98615d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // p747jf.C37357h
    @NotNull
    /* renamed from: q */
    public X509TrustManager mo18325q() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f98615d);
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

    private OpenJSSEPlatform() {
        this.f98615d = new OpenJSSE();
    }
}
