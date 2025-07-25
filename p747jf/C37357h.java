package p747jf;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.C39200e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.OkHttpClient;
import p1077ze.Protocol;
import p763kf.AndroidLog;
import p791mf.BasicCertificateChainCleaner;
import p791mf.BasicTrustRootIndex;
import p791mf.CertificateChainCleaner;
import p791mf.TrustRootIndex;

/* compiled from: Platform.kt */
@Metadata
/* renamed from: jf.h */
/* loaded from: classes10.dex */
public class C37357h {
    @NotNull

    /* renamed from: a */
    public static final C37358a f98616a;
    @NotNull

    /* renamed from: b */
    private static volatile C37357h f98617b;

    /* renamed from: c */
    private static final Logger f98618c;

    /* compiled from: Platform.kt */
    @Metadata
    /* renamed from: jf.h$a */
    /* loaded from: classes10.dex */
    public static final class C37358a {
        private C37358a() {
        }

        public /* synthetic */ C37358a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        private final C37357h m18321d() {
            AndroidLog.f99181a.m17657b();
            C37357h m18362a = Android10Platform.f98586e.m18362a();
            if (m18362a == null) {
                C37357h m18359a = C37347b.f98589f.m18359a();
                Intrinsics.m17074g(m18359a);
                return m18359a;
            }
            return m18362a;
        }

        /* renamed from: e */
        private final C37357h m18320e() {
            OpenJSSEPlatform m18343a;
            BouncyCastlePlatform m18356a;
            ConscryptPlatform m18352b;
            if (m18315j() && (m18352b = ConscryptPlatform.f98598e.m18352b()) != null) {
                return m18352b;
            }
            if (m18316i() && (m18356a = BouncyCastlePlatform.f98595e.m18356a()) != null) {
                return m18356a;
            }
            if (m18314k() && (m18343a = OpenJSSEPlatform.f98613e.m18343a()) != null) {
                return m18343a;
            }
            Jdk9Platform m18346a = Jdk9Platform.f98611d.m18346a();
            if (m18346a != null) {
                return m18346a;
            }
            C37357h m18348a = Jdk8WithJettyBootPlatform.f98602i.m18348a();
            if (m18348a != null) {
                return m18348a;
            }
            return new C37357h();
        }

        /* renamed from: f */
        public final C37357h m18319f() {
            if (m18317h()) {
                return m18321d();
            }
            return m18320e();
        }

        /* renamed from: i */
        private final boolean m18316i() {
            return Intrinsics.m17075f("BC", Security.getProviders()[0].getName());
        }

        /* renamed from: j */
        private final boolean m18315j() {
            return Intrinsics.m17075f("Conscrypt", Security.getProviders()[0].getName());
        }

        /* renamed from: k */
        private final boolean m18314k() {
            return Intrinsics.m17075f("OpenJSSE", Security.getProviders()[0].getName());
        }

        @NotNull
        /* renamed from: b */
        public final List<String> m18323b(@NotNull List<? extends Protocol> protocols) {
            int m17154x;
            boolean z;
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList<Protocol> arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            m17154x = C37566w.m17154x(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m17154x);
            for (Protocol protocol : arrayList) {
                arrayList2.add(protocol.toString());
            }
            return arrayList2;
        }

        @NotNull
        /* renamed from: c */
        public final byte[] m18322c(@NotNull List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            C39200e c39200e = new C39200e();
            for (String str : m18323b(protocols)) {
                c39200e.writeByte(str.length());
                c39200e.writeUtf8(str);
            }
            return c39200e.readByteArray();
        }

        @NotNull
        /* renamed from: g */
        public final C37357h m18318g() {
            return C37357h.f98617b;
        }

        /* renamed from: h */
        public final boolean m18317h() {
            return Intrinsics.m17075f("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        C37358a c37358a = new C37358a(null);
        f98616a = c37358a;
        f98617b = c37358a.m18319f();
        f98618c = Logger.getLogger(OkHttpClient.class.getName());
    }

    @NotNull
    /* renamed from: g */
    public static final C37357h m18335g() {
        return f98616a.m18318g();
    }

    /* renamed from: m */
    public static /* synthetic */ void m18329m(C37357h c37357h, String str, int i, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            c37357h.m18330l(str, i, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    /* renamed from: b */
    public void mo18340b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    @NotNull
    /* renamed from: c */
    public CertificateChainCleaner mo18339c(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new BasicCertificateChainCleaner(mo18338d(trustManager));
    }

    @NotNull
    /* renamed from: d */
    public TrustRootIndex mo18338d(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo18337e(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    /* renamed from: f */
    public void mo18336f(@NotNull Socket socket, @NotNull InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i);
    }

    @NotNull
    /* renamed from: h */
    public final String m18334h() {
        return "OkHttp";
    }

    @Nullable
    /* renamed from: i */
    public String mo18333i(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    @Nullable
    /* renamed from: j */
    public Object mo18332j(@NotNull String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (f98618c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* renamed from: k */
    public boolean mo18331k(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    /* renamed from: l */
    public void m18330l(@NotNull String message, int i, @Nullable Throwable th) {
        Level level;
        Intrinsics.checkNotNullParameter(message, "message");
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f98618c.log(level, message, th);
    }

    /* renamed from: n */
    public void mo18328n(@NotNull String message, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = Intrinsics.m17064q(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m18330l(message, 5, (Throwable) obj);
    }

    @NotNull
    /* renamed from: o */
    public SSLContext mo18327o() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    @NotNull
    /* renamed from: p */
    public SSLSocketFactory mo18326p(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext mo18327o = mo18327o();
            mo18327o.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = mo18327o.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError(Intrinsics.m17064q("No System TLS: ", e), e);
        }
    }

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
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        throw new IllegalStateException(Intrinsics.m17064q("Unexpected default trust managers: ", arrays).toString());
    }

    @NotNull
    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
