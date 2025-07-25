package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rn0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import okio.C39200e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public class qd1 {
    @NotNull

    /* renamed from: a */
    private static volatile qd1 f84301a;

    /* renamed from: b */
    private static final Logger f84302b;

    /* renamed from: c */
    public static final /* synthetic */ int f84303c = 0;

    /* renamed from: com.yandex.mobile.ads.impl.qd1$a */
    /* loaded from: classes8.dex */
    public static final class C31196a {
        private C31196a() {
        }

        @NotNull
        /* renamed from: a */
        public static ArrayList m30395a(@NotNull List protocols) {
            int m17154x;
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((hi1) obj) != hi1.f80077d) {
                    arrayList.add(obj);
                }
            }
            m17154x = C37566w.m17154x(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m17154x);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((hi1) it.next()).toString());
            }
            return arrayList2;
        }

        @NotNull
        /* renamed from: b */
        public static byte[] m30393b(@NotNull List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            C39200e c39200e = new C39200e();
            Iterator it = m30395a(protocols).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                c39200e.writeByte(str.length());
                c39200e.writeUtf8(str);
            }
            return c39200e.readByteArray();
        }

        public /* synthetic */ C31196a(int i) {
            this();
        }

        /* renamed from: b */
        public static boolean m30394b() {
            return Intrinsics.m17075f("Dalvik", System.getProperty("java.vm.name"));
        }

        @NotNull
        /* renamed from: a */
        public static qd1 m30396a() {
            return qd1.f84301a;
        }
    }

    static {
        boolean z;
        qd1 m29977a;
        boolean z2;
        boolean z3;
        qd1 qd1Var = null;
        if (!Intrinsics.m17075f("Dalvik", System.getProperty("java.vm.name"))) {
            z = sn0.f85314d;
            if (z) {
                qd1Var = new sn0();
            }
            if (qd1Var == null) {
                m29977a = rn0.C31302b.m29977a();
                if (m29977a == null) {
                    m29977a = new qd1();
                }
            }
            m29977a = qd1Var;
        } else {
            C31970zc.m26282a();
            z2 = C31734wc.f87201e;
            if (z2) {
                m29977a = new C31734wc();
            } else {
                m29977a = null;
            }
            if (m29977a == null) {
                z3 = C30012bd.f77265f;
                if (z3) {
                    qd1Var = new C30012bd();
                }
                Intrinsics.m17074g(qd1Var);
                m29977a = qd1Var;
            }
        }
        f84301a = m29977a;
        f84302b = Logger.getLogger(ja1.class.getName());
    }

    @NotNull
    /* renamed from: c */
    public static SSLSocketFactory m30397c(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(...)");
            sSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: a */
    public void mo29980a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    @NotNull
    /* renamed from: b */
    public f22 mo30399b(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "getAcceptedIssuers(...)");
        return new C31995zj((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    @NotNull
    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @NotNull
    /* renamed from: a */
    public AbstractC30180dn mo27987a(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new C31825xj(mo30399b(trustManager));
    }

    @Nullable
    /* renamed from: b */
    public String mo27986b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    /* renamed from: a */
    public void mo27988a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<hi1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    @Nullable
    /* renamed from: b */
    public Object mo30400b() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (f84302b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: a */
    public void mo30401a(@NotNull Socket socket, @NotNull InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i);
    }

    @NotNull
    /* renamed from: c */
    public static X509TrustManager m30398c() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.m17074g(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.m17073h(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        throw new IllegalStateException(("Unexpected default trust managers: " + arrays).toString());
    }

    /* renamed from: a */
    public boolean mo27989a(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    /* renamed from: a */
    public static void m30403a(int i, @NotNull String message, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        f84302b.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    /* renamed from: a */
    public void mo30402a(@Nullable Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m30403a(5, message, (Throwable) obj);
    }
}
