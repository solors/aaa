package p1077ze;

import af.Util;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.MutableCollections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.AbstractC45317r;
import p1077ze.InterfaceC45299e;
import p658ef.C33060e;
import p658ef.RouteDatabase;
import p747jf.C37357h;
import p778lf.NullProxySelector;
import p791mf.CertificateChainCleaner;
import p791mf.OkHostnameVerifier;

@Metadata
/* renamed from: ze.y */
/* loaded from: classes10.dex */
public class OkHttpClient implements Cloneable, InterfaceC45299e.InterfaceC45300a {
    @NotNull

    /* renamed from: G */
    public static final C45337b f119355G = new C45337b(null);
    @NotNull

    /* renamed from: H */
    private static final List<Protocol> f119356H = Util.m105716w(Protocol.HTTP_2, Protocol.HTTP_1_1);
    @NotNull

    /* renamed from: I */
    private static final List<ConnectionSpec> f119357I = Util.m105716w(ConnectionSpec.f119268i, ConnectionSpec.f119270k);

    /* renamed from: A */
    private final int f119358A;

    /* renamed from: B */
    private final int f119359B;

    /* renamed from: C */
    private final int f119360C;

    /* renamed from: D */
    private final int f119361D;

    /* renamed from: E */
    private final long f119362E;
    @NotNull

    /* renamed from: F */
    private final RouteDatabase f119363F;
    @NotNull

    /* renamed from: b */
    private final C45314p f119364b;
    @NotNull

    /* renamed from: c */
    private final ConnectionPool f119365c;
    @NotNull

    /* renamed from: d */
    private final List<InterfaceC45333w> f119366d;
    @NotNull

    /* renamed from: f */
    private final List<InterfaceC45333w> f119367f;
    @NotNull

    /* renamed from: g */
    private final AbstractC45317r.InterfaceC45320c f119368g;

    /* renamed from: h */
    private final boolean f119369h;
    @NotNull

    /* renamed from: i */
    private final Authenticator f119370i;

    /* renamed from: j */
    private final boolean f119371j;

    /* renamed from: k */
    private final boolean f119372k;
    @NotNull

    /* renamed from: l */
    private final CookieJar f119373l;
    @Nullable

    /* renamed from: m */
    private final C45284c f119374m;
    @NotNull

    /* renamed from: n */
    private final Dns f119375n;
    @Nullable

    /* renamed from: o */
    private final Proxy f119376o;
    @NotNull

    /* renamed from: p */
    private final ProxySelector f119377p;
    @NotNull

    /* renamed from: q */
    private final Authenticator f119378q;
    @NotNull

    /* renamed from: r */
    private final SocketFactory f119379r;
    @Nullable

    /* renamed from: s */
    private final SSLSocketFactory f119380s;
    @Nullable

    /* renamed from: t */
    private final X509TrustManager f119381t;
    @NotNull

    /* renamed from: u */
    private final List<ConnectionSpec> f119382u;
    @NotNull

    /* renamed from: v */
    private final List<Protocol> f119383v;
    @NotNull

    /* renamed from: w */
    private final HostnameVerifier f119384w;
    @NotNull

    /* renamed from: x */
    private final CertificatePinner f119385x;
    @Nullable

    /* renamed from: y */
    private final CertificateChainCleaner f119386y;

    /* renamed from: z */
    private final int f119387z;

    /* compiled from: OkHttpClient.kt */
    @Metadata
    /* renamed from: ze.y$b */
    /* loaded from: classes10.dex */
    public static final class C45337b {
        private C45337b() {
        }

        public /* synthetic */ C45337b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final List<ConnectionSpec> m4a() {
            return OkHttpClient.f119357I;
        }

        @NotNull
        /* renamed from: b */
        public final List<Protocol> m3b() {
            return OkHttpClient.f119356H;
        }
    }

    public OkHttpClient(@NotNull C45336a builder) {
        ProxySelector m54E;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f119364b = builder.m13r();
        this.f119365c = builder.m16o();
        this.f119366d = Util.m105746T(builder.m7x());
        this.f119367f = Util.m105746T(builder.m5z());
        this.f119368g = builder.m11t();
        this.f119369h = builder.m52G();
        this.f119370i = builder.m22i();
        this.f119371j = builder.m10u();
        this.f119372k = builder.m9v();
        this.f119373l = builder.m14q();
        this.f119374m = builder.m21j();
        this.f119375n = builder.m12s();
        this.f119376o = builder.m56C();
        if (builder.m56C() != null) {
            m54E = NullProxySelector.f100957a;
        } else {
            m54E = builder.m54E();
            m54E = m54E == null ? ProxySelector.getDefault() : m54E;
            if (m54E == null) {
                m54E = NullProxySelector.f100957a;
            }
        }
        this.f119377p = m54E;
        this.f119378q = builder.m55D();
        this.f119379r = builder.m50I();
        List<ConnectionSpec> m15p = builder.m15p();
        this.f119382u = m15p;
        this.f119383v = builder.m57B();
        this.f119384w = builder.m8w();
        this.f119387z = builder.m20k();
        this.f119358A = builder.m17n();
        this.f119359B = builder.m53F();
        this.f119360C = builder.m48K();
        this.f119361D = builder.m58A();
        this.f119362E = builder.m6y();
        RouteDatabase m51H = builder.m51H();
        this.f119363F = m51H == null ? new RouteDatabase() : m51H;
        List<ConnectionSpec> list = m15p;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ConnectionSpec) it.next()).m300f()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            this.f119380s = null;
            this.f119386y = null;
            this.f119381t = null;
            this.f119385x = CertificatePinner.f119128d;
        } else if (builder.m49J() != null) {
            this.f119380s = builder.m49J();
            CertificateChainCleaner m19l = builder.m19l();
            Intrinsics.m17074g(m19l);
            this.f119386y = m19l;
            X509TrustManager m47L = builder.m47L();
            Intrinsics.m17074g(m47L);
            this.f119381t = m47L;
            CertificatePinner m18m = builder.m18m();
            Intrinsics.m17074g(m19l);
            this.f119385x = m18m.m327e(m19l);
        } else {
            C37357h.C37358a c37358a = C37357h.f98616a;
            X509TrustManager mo18325q = c37358a.m18318g().mo18325q();
            this.f119381t = mo18325q;
            C37357h m18318g = c37358a.m18318g();
            Intrinsics.m17074g(mo18325q);
            this.f119380s = m18318g.mo18326p(mo18325q);
            CertificateChainCleaner.C38297a c38297a = CertificateChainCleaner.f101204a;
            Intrinsics.m17074g(mo18325q);
            CertificateChainCleaner m15123a = c38297a.m15123a(mo18325q);
            this.f119386y = m15123a;
            CertificatePinner m18m2 = builder.m18m();
            Intrinsics.m17074g(m15123a);
            this.f119385x = m18m2.m327e(m15123a);
        }
        m86I();
    }

    /* renamed from: I */
    private final void m86I() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (!this.f119366d.contains(null)) {
            if (!this.f119367f.contains(null)) {
                List<ConnectionSpec> list = this.f119382u;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (ConnectionSpec connectionSpec : list) {
                        if (connectionSpec.m300f()) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    if (this.f119380s == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (this.f119386y == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (this.f119381t != null) {
                                z4 = false;
                            }
                            if (z4) {
                                if (!Intrinsics.m17075f(this.f119385x, CertificatePinner.f119128d)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                return;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                } else if (this.f119380s != null) {
                    if (this.f119386y != null) {
                        if (this.f119381t != null) {
                            return;
                        }
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                } else {
                    throw new IllegalStateException("sslSocketFactory == null".toString());
                }
            }
            throw new IllegalStateException(Intrinsics.m17064q("Null network interceptor: ", m61x()).toString());
        }
        throw new IllegalStateException(Intrinsics.m17064q("Null interceptor: ", m63v()).toString());
    }

    @NotNull
    /* renamed from: A */
    public final List<Protocol> m94A() {
        return this.f119383v;
    }

    @Nullable
    /* renamed from: B */
    public final Proxy m93B() {
        return this.f119376o;
    }

    @NotNull
    /* renamed from: C */
    public final Authenticator m92C() {
        return this.f119378q;
    }

    @NotNull
    /* renamed from: D */
    public final ProxySelector m91D() {
        return this.f119377p;
    }

    /* renamed from: E */
    public final int m90E() {
        return this.f119359B;
    }

    /* renamed from: F */
    public final boolean m89F() {
        return this.f119369h;
    }

    @NotNull
    /* renamed from: G */
    public final SocketFactory m88G() {
        return this.f119379r;
    }

    @NotNull
    /* renamed from: H */
    public final SSLSocketFactory m87H() {
        SSLSocketFactory sSLSocketFactory = this.f119380s;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: J */
    public final int m85J() {
        return this.f119360C;
    }

    @Nullable
    /* renamed from: K */
    public final X509TrustManager m84K() {
        return this.f119381t;
    }

    @Override // p1077ze.InterfaceC45299e.InterfaceC45300a
    @NotNull
    /* renamed from: b */
    public InterfaceC45299e mo83b(@NotNull C45275a0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new C33060e(this, request, false);
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @NotNull
    /* renamed from: f */
    public final Authenticator m79f() {
        return this.f119370i;
    }

    @Nullable
    /* renamed from: g */
    public final C45284c m78g() {
        return this.f119374m;
    }

    /* renamed from: h */
    public final int m77h() {
        return this.f119387z;
    }

    @Nullable
    /* renamed from: i */
    public final CertificateChainCleaner m76i() {
        return this.f119386y;
    }

    @NotNull
    /* renamed from: j */
    public final CertificatePinner m75j() {
        return this.f119385x;
    }

    /* renamed from: k */
    public final int m74k() {
        return this.f119358A;
    }

    @NotNull
    /* renamed from: l */
    public final ConnectionPool m73l() {
        return this.f119365c;
    }

    @NotNull
    /* renamed from: m */
    public final List<ConnectionSpec> m72m() {
        return this.f119382u;
    }

    @NotNull
    /* renamed from: n */
    public final CookieJar m71n() {
        return this.f119373l;
    }

    @NotNull
    /* renamed from: o */
    public final C45314p m70o() {
        return this.f119364b;
    }

    @NotNull
    /* renamed from: p */
    public final Dns m69p() {
        return this.f119375n;
    }

    @NotNull
    /* renamed from: q */
    public final AbstractC45317r.InterfaceC45320c m68q() {
        return this.f119368g;
    }

    /* renamed from: r */
    public final boolean m67r() {
        return this.f119371j;
    }

    /* renamed from: s */
    public final boolean m66s() {
        return this.f119372k;
    }

    @NotNull
    /* renamed from: t */
    public final RouteDatabase m65t() {
        return this.f119363F;
    }

    @NotNull
    /* renamed from: u */
    public final HostnameVerifier m64u() {
        return this.f119384w;
    }

    @NotNull
    /* renamed from: v */
    public final List<InterfaceC45333w> m63v() {
        return this.f119366d;
    }

    /* renamed from: w */
    public final long m62w() {
        return this.f119362E;
    }

    @NotNull
    /* renamed from: x */
    public final List<InterfaceC45333w> m61x() {
        return this.f119367f;
    }

    @NotNull
    /* renamed from: y */
    public C45336a m60y() {
        return new C45336a(this);
    }

    /* renamed from: z */
    public final int m59z() {
        return this.f119361D;
    }

    /* compiled from: OkHttpClient.kt */
    @Metadata
    /* renamed from: ze.y$a */
    /* loaded from: classes10.dex */
    public static final class C45336a {

        /* renamed from: A */
        private int f119388A;

        /* renamed from: B */
        private int f119389B;

        /* renamed from: C */
        private long f119390C;
        @Nullable

        /* renamed from: D */
        private RouteDatabase f119391D;
        @NotNull

        /* renamed from: a */
        private C45314p f119392a;
        @NotNull

        /* renamed from: b */
        private ConnectionPool f119393b;
        @NotNull

        /* renamed from: c */
        private final List<InterfaceC45333w> f119394c;
        @NotNull

        /* renamed from: d */
        private final List<InterfaceC45333w> f119395d;
        @NotNull

        /* renamed from: e */
        private AbstractC45317r.InterfaceC45320c f119396e;

        /* renamed from: f */
        private boolean f119397f;
        @NotNull

        /* renamed from: g */
        private Authenticator f119398g;

        /* renamed from: h */
        private boolean f119399h;

        /* renamed from: i */
        private boolean f119400i;
        @NotNull

        /* renamed from: j */
        private CookieJar f119401j;
        @Nullable

        /* renamed from: k */
        private C45284c f119402k;
        @NotNull

        /* renamed from: l */
        private Dns f119403l;
        @Nullable

        /* renamed from: m */
        private Proxy f119404m;
        @Nullable

        /* renamed from: n */
        private ProxySelector f119405n;
        @NotNull

        /* renamed from: o */
        private Authenticator f119406o;
        @NotNull

        /* renamed from: p */
        private SocketFactory f119407p;
        @Nullable

        /* renamed from: q */
        private SSLSocketFactory f119408q;
        @Nullable

        /* renamed from: r */
        private X509TrustManager f119409r;
        @NotNull

        /* renamed from: s */
        private List<ConnectionSpec> f119410s;
        @NotNull

        /* renamed from: t */
        private List<? extends Protocol> f119411t;
        @NotNull

        /* renamed from: u */
        private HostnameVerifier f119412u;
        @NotNull

        /* renamed from: v */
        private CertificatePinner f119413v;
        @Nullable

        /* renamed from: w */
        private CertificateChainCleaner f119414w;

        /* renamed from: x */
        private int f119415x;

        /* renamed from: y */
        private int f119416y;

        /* renamed from: z */
        private int f119417z;

        public C45336a() {
            this.f119392a = new C45314p();
            this.f119393b = new ConnectionPool();
            this.f119394c = new ArrayList();
            this.f119395d = new ArrayList();
            this.f119396e = Util.m105732g(AbstractC45317r.f119308b);
            this.f119397f = true;
            Authenticator authenticator = Authenticator.f119014b;
            this.f119398g = authenticator;
            this.f119399h = true;
            this.f119400i = true;
            this.f119401j = CookieJar.f119294b;
            this.f119403l = Dns.f119305b;
            this.f119406o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.f119407p = socketFactory;
            C45337b c45337b = OkHttpClient.f119355G;
            this.f119410s = c45337b.m4a();
            this.f119411t = c45337b.m3b();
            this.f119412u = OkHostnameVerifier.f101205a;
            this.f119413v = CertificatePinner.f119128d;
            this.f119416y = 10000;
            this.f119417z = 10000;
            this.f119388A = 10000;
            this.f119390C = 1024L;
        }

        /* renamed from: A */
        public final int m58A() {
            return this.f119389B;
        }

        @NotNull
        /* renamed from: B */
        public final List<Protocol> m57B() {
            return this.f119411t;
        }

        @Nullable
        /* renamed from: C */
        public final Proxy m56C() {
            return this.f119404m;
        }

        @NotNull
        /* renamed from: D */
        public final Authenticator m55D() {
            return this.f119406o;
        }

        @Nullable
        /* renamed from: E */
        public final ProxySelector m54E() {
            return this.f119405n;
        }

        /* renamed from: F */
        public final int m53F() {
            return this.f119417z;
        }

        /* renamed from: G */
        public final boolean m52G() {
            return this.f119397f;
        }

        @Nullable
        /* renamed from: H */
        public final RouteDatabase m51H() {
            return this.f119391D;
        }

        @NotNull
        /* renamed from: I */
        public final SocketFactory m50I() {
            return this.f119407p;
        }

        @Nullable
        /* renamed from: J */
        public final SSLSocketFactory m49J() {
            return this.f119408q;
        }

        /* renamed from: K */
        public final int m48K() {
            return this.f119388A;
        }

        @Nullable
        /* renamed from: L */
        public final X509TrustManager m47L() {
            return this.f119409r;
        }

        @NotNull
        /* renamed from: M */
        public final C45336a m46M(@NotNull HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!Intrinsics.m17075f(hostnameVerifier, m8w())) {
                m33Z(null);
            }
            m37V(hostnameVerifier);
            return this;
        }

        @NotNull
        /* renamed from: N */
        public final C45336a m45N(@NotNull ProxySelector proxySelector) {
            Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
            if (!Intrinsics.m17075f(proxySelector, m54E())) {
                m33Z(null);
            }
            m36W(proxySelector);
            return this;
        }

        @NotNull
        /* renamed from: O */
        public final C45336a m44O(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            m35X(Util.m105728k("timeout", j, unit));
            return this;
        }

        @NotNull
        /* renamed from: P */
        public final C45336a m43P(boolean z) {
            m34Y(z);
            return this;
        }

        /* renamed from: Q */
        public final void m42Q(@Nullable C45284c c45284c) {
            this.f119402k = c45284c;
        }

        /* renamed from: R */
        public final void m41R(int i) {
            this.f119416y = i;
        }

        /* renamed from: S */
        public final void m40S(@NotNull C45314p c45314p) {
            Intrinsics.checkNotNullParameter(c45314p, "<set-?>");
            this.f119392a = c45314p;
        }

        /* renamed from: T */
        public final void m39T(boolean z) {
            this.f119399h = z;
        }

        /* renamed from: U */
        public final void m38U(boolean z) {
            this.f119400i = z;
        }

        /* renamed from: V */
        public final void m37V(@NotNull HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "<set-?>");
            this.f119412u = hostnameVerifier;
        }

        /* renamed from: W */
        public final void m36W(@Nullable ProxySelector proxySelector) {
            this.f119405n = proxySelector;
        }

        /* renamed from: X */
        public final void m35X(int i) {
            this.f119417z = i;
        }

        /* renamed from: Y */
        public final void m34Y(boolean z) {
            this.f119397f = z;
        }

        /* renamed from: Z */
        public final void m33Z(@Nullable RouteDatabase routeDatabase) {
            this.f119391D = routeDatabase;
        }

        @NotNull
        /* renamed from: a */
        public final C45336a m32a(@NotNull InterfaceC45333w interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            m7x().add(interceptor);
            return this;
        }

        /* renamed from: a0 */
        public final void m31a0(int i) {
            this.f119388A = i;
        }

        @NotNull
        /* renamed from: b */
        public final C45336a m30b(@NotNull InterfaceC45333w interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            m5z().add(interceptor);
            return this;
        }

        @NotNull
        /* renamed from: b0 */
        public final C45336a m29b0(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            m31a0(Util.m105728k("timeout", j, unit));
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final OkHttpClient m28c() {
            return new OkHttpClient(this);
        }

        @NotNull
        /* renamed from: d */
        public final C45336a m27d(@Nullable C45284c c45284c) {
            m42Q(c45284c);
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final C45336a m26e(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            m41R(Util.m105728k("timeout", j, unit));
            return this;
        }

        @NotNull
        /* renamed from: f */
        public final C45336a m25f(@NotNull C45314p dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            m40S(dispatcher);
            return this;
        }

        @NotNull
        /* renamed from: g */
        public final C45336a m24g(boolean z) {
            m39T(z);
            return this;
        }

        @NotNull
        /* renamed from: h */
        public final C45336a m23h(boolean z) {
            m38U(z);
            return this;
        }

        @NotNull
        /* renamed from: i */
        public final Authenticator m22i() {
            return this.f119398g;
        }

        @Nullable
        /* renamed from: j */
        public final C45284c m21j() {
            return this.f119402k;
        }

        /* renamed from: k */
        public final int m20k() {
            return this.f119415x;
        }

        @Nullable
        /* renamed from: l */
        public final CertificateChainCleaner m19l() {
            return this.f119414w;
        }

        @NotNull
        /* renamed from: m */
        public final CertificatePinner m18m() {
            return this.f119413v;
        }

        /* renamed from: n */
        public final int m17n() {
            return this.f119416y;
        }

        @NotNull
        /* renamed from: o */
        public final ConnectionPool m16o() {
            return this.f119393b;
        }

        @NotNull
        /* renamed from: p */
        public final List<ConnectionSpec> m15p() {
            return this.f119410s;
        }

        @NotNull
        /* renamed from: q */
        public final CookieJar m14q() {
            return this.f119401j;
        }

        @NotNull
        /* renamed from: r */
        public final C45314p m13r() {
            return this.f119392a;
        }

        @NotNull
        /* renamed from: s */
        public final Dns m12s() {
            return this.f119403l;
        }

        @NotNull
        /* renamed from: t */
        public final AbstractC45317r.InterfaceC45320c m11t() {
            return this.f119396e;
        }

        /* renamed from: u */
        public final boolean m10u() {
            return this.f119399h;
        }

        /* renamed from: v */
        public final boolean m9v() {
            return this.f119400i;
        }

        @NotNull
        /* renamed from: w */
        public final HostnameVerifier m8w() {
            return this.f119412u;
        }

        @NotNull
        /* renamed from: x */
        public final List<InterfaceC45333w> m7x() {
            return this.f119394c;
        }

        /* renamed from: y */
        public final long m6y() {
            return this.f119390C;
        }

        @NotNull
        /* renamed from: z */
        public final List<InterfaceC45333w> m5z() {
            return this.f119395d;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C45336a(@NotNull OkHttpClient okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.f119392a = okHttpClient.m70o();
            this.f119393b = okHttpClient.m73l();
            MutableCollections.m17624D(this.f119394c, okHttpClient.m63v());
            MutableCollections.m17624D(this.f119395d, okHttpClient.m61x());
            this.f119396e = okHttpClient.m68q();
            this.f119397f = okHttpClient.m89F();
            this.f119398g = okHttpClient.m79f();
            this.f119399h = okHttpClient.m67r();
            this.f119400i = okHttpClient.m66s();
            this.f119401j = okHttpClient.m71n();
            this.f119402k = okHttpClient.m78g();
            this.f119403l = okHttpClient.m69p();
            this.f119404m = okHttpClient.m93B();
            this.f119405n = okHttpClient.m91D();
            this.f119406o = okHttpClient.m92C();
            this.f119407p = okHttpClient.m88G();
            this.f119408q = okHttpClient.f119380s;
            this.f119409r = okHttpClient.m84K();
            this.f119410s = okHttpClient.m72m();
            this.f119411t = okHttpClient.m94A();
            this.f119412u = okHttpClient.m64u();
            this.f119413v = okHttpClient.m75j();
            this.f119414w = okHttpClient.m76i();
            this.f119415x = okHttpClient.m77h();
            this.f119416y = okHttpClient.m74k();
            this.f119417z = okHttpClient.m90E();
            this.f119388A = okHttpClient.m85J();
            this.f119389B = okHttpClient.m59z();
            this.f119390C = okHttpClient.m62w();
            this.f119391D = okHttpClient.m65t();
        }
    }

    public OkHttpClient() {
        this(new C45336a());
    }
}
