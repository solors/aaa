package p1077ze;

import af.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p850qd.C39385c;

@Metadata
/* renamed from: ze.l */
/* loaded from: classes10.dex */
public final class ConnectionSpec {
    @NotNull

    /* renamed from: e */
    public static final C45310b f119264e = new C45310b(null);
    @NotNull

    /* renamed from: f */
    private static final CipherSuite[] f119265f;
    @NotNull

    /* renamed from: g */
    private static final CipherSuite[] f119266g;
    @NotNull

    /* renamed from: h */
    public static final ConnectionSpec f119267h;
    @NotNull

    /* renamed from: i */
    public static final ConnectionSpec f119268i;
    @NotNull

    /* renamed from: j */
    public static final ConnectionSpec f119269j;
    @NotNull

    /* renamed from: k */
    public static final ConnectionSpec f119270k;

    /* renamed from: a */
    private final boolean f119271a;

    /* renamed from: b */
    private final boolean f119272b;
    @Nullable

    /* renamed from: c */
    private final String[] f119273c;
    @Nullable

    /* renamed from: d */
    private final String[] f119274d;

    /* compiled from: ConnectionSpec.kt */
    @Metadata
    /* renamed from: ze.l$b */
    /* loaded from: classes10.dex */
    public static final class C45310b {
        private C45310b() {
        }

        public /* synthetic */ C45310b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.f119235o1;
        CipherSuite cipherSuite2 = CipherSuite.f119238p1;
        CipherSuite cipherSuite3 = CipherSuite.f119241q1;
        CipherSuite cipherSuite4 = CipherSuite.f119193a1;
        CipherSuite cipherSuite5 = CipherSuite.f119205e1;
        CipherSuite cipherSuite6 = CipherSuite.f119196b1;
        CipherSuite cipherSuite7 = CipherSuite.f119208f1;
        CipherSuite cipherSuite8 = CipherSuite.f119226l1;
        CipherSuite cipherSuite9 = CipherSuite.f119223k1;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        f119265f = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.f119163L0, CipherSuite.f119165M0, CipherSuite.f119219j0, CipherSuite.f119222k0, CipherSuite.f119154H, CipherSuite.f119162L, CipherSuite.f119224l};
        f119266g = cipherSuiteArr2;
        C45309a m294c = new C45309a(true).m294c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f119267h = m294c.m287j(tlsVersion, tlsVersion2).m289h(true).m296a();
        f119268i = new C45309a(true).m294c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).m287j(tlsVersion, tlsVersion2).m289h(true).m296a();
        f119269j = new C45309a(true).m294c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).m287j(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).m289h(true).m296a();
        f119270k = new C45309a(false).m296a();
    }

    public ConnectionSpec(boolean z, boolean z2, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.f119271a = z;
        this.f119272b = z2;
        this.f119273c = strArr;
        this.f119274d = strArr2;
    }

    /* renamed from: g */
    private final ConnectionSpec m299g(SSLSocket sSLSocket, boolean z) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Comparator m12775g;
        if (this.f119273c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = Util.m105761E(enabledCipherSuites, this.f119273c, CipherSuite.f119194b.m309c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f119274d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            String[] strArr = this.f119274d;
            m12775g = C39385c.m12775g();
            tlsVersionsIntersection = Util.m105761E(enabledProtocols, strArr, m12775g);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int m105715x = Util.m105715x(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.f119194b.m309c());
        if (z && m105715x != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[m105715x];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = Util.m105724o(cipherSuitesIntersection, str);
        }
        C45309a c45309a = new C45309a(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        C45309a m295b = c45309a.m295b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return m295b.m288i((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).m296a();
    }

    /* renamed from: c */
    public final void m303c(@NotNull SSLSocket sslSocket, boolean z) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        ConnectionSpec m299g = m299g(sslSocket, z);
        if (m299g.m297i() != null) {
            sslSocket.setEnabledProtocols(m299g.f119274d);
        }
        if (m299g.m302d() != null) {
            sslSocket.setEnabledCipherSuites(m299g.f119273c);
        }
    }

    @Nullable
    /* renamed from: d */
    public final List<CipherSuite> m302d() {
        List<CipherSuite> m17553Z0;
        String[] strArr = this.f119273c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.f119194b.m310b(str));
        }
        m17553Z0 = _Collections.m17553Z0(arrayList);
        return m17553Z0;
    }

    /* renamed from: e */
    public final boolean m301e(@NotNull SSLSocket socket) {
        Comparator m12775g;
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f119271a) {
            return false;
        }
        String[] strArr = this.f119274d;
        if (strArr != null) {
            String[] enabledProtocols = socket.getEnabledProtocols();
            m12775g = C39385c.m12775g();
            if (!Util.m105718u(strArr, enabledProtocols, m12775g)) {
                return false;
            }
        }
        String[] strArr2 = this.f119273c;
        if (strArr2 != null && !Util.m105718u(strArr2, socket.getEnabledCipherSuites(), CipherSuite.f119194b.m309c())) {
            return false;
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f119271a;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z != connectionSpec.f119271a) {
            return false;
        }
        if (z && (!Arrays.equals(this.f119273c, connectionSpec.f119273c) || !Arrays.equals(this.f119274d, connectionSpec.f119274d) || this.f119272b != connectionSpec.f119272b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m300f() {
        return this.f119271a;
    }

    /* renamed from: h */
    public final boolean m298h() {
        return this.f119272b;
    }

    public int hashCode() {
        int hashCode;
        if (this.f119271a) {
            String[] strArr = this.f119273c;
            int i = 0;
            if (strArr == null) {
                hashCode = 0;
            } else {
                hashCode = Arrays.hashCode(strArr);
            }
            int i2 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + hashCode) * 31;
            String[] strArr2 = this.f119274d;
            if (strArr2 != null) {
                i = Arrays.hashCode(strArr2);
            }
            return ((i2 + i) * 31) + (!this.f119272b ? 1 : 0);
        }
        return 17;
    }

    @Nullable
    /* renamed from: i */
    public final List<TlsVersion> m297i() {
        List<TlsVersion> m17553Z0;
        String[] strArr = this.f119274d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.f119119c.m332a(str));
        }
        m17553Z0 = _Collections.m17553Z0(arrayList);
        return m17553Z0;
    }

    @NotNull
    public String toString() {
        if (!this.f119271a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(m302d(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(m297i(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f119272b + ')';
    }

    /* compiled from: ConnectionSpec.kt */
    @Metadata
    /* renamed from: ze.l$a */
    /* loaded from: classes10.dex */
    public static final class C45309a {

        /* renamed from: a */
        private boolean f119275a;
        @Nullable

        /* renamed from: b */
        private String[] f119276b;
        @Nullable

        /* renamed from: c */
        private String[] f119277c;

        /* renamed from: d */
        private boolean f119278d;

        public C45309a(boolean z) {
            this.f119275a = z;
        }

        @NotNull
        /* renamed from: a */
        public final ConnectionSpec m296a() {
            return new ConnectionSpec(this.f119275a, this.f119278d, this.f119276b, this.f119277c);
        }

        @NotNull
        /* renamed from: b */
        public final C45309a m295b(@NotNull String... cipherSuites) {
            boolean z;
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (m293d()) {
                if (cipherSuites.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    m292e((String[]) cipherSuites.clone());
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @NotNull
        /* renamed from: c */
        public final C45309a m294c(@NotNull CipherSuite... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (m293d()) {
                ArrayList arrayList = new ArrayList(cipherSuites.length);
                for (CipherSuite cipherSuite : cipherSuites) {
                    arrayList.add(cipherSuite.m313c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return m295b((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: d */
        public final boolean m293d() {
            return this.f119275a;
        }

        /* renamed from: e */
        public final void m292e(@Nullable String[] strArr) {
            this.f119276b = strArr;
        }

        /* renamed from: f */
        public final void m291f(boolean z) {
            this.f119278d = z;
        }

        /* renamed from: g */
        public final void m290g(@Nullable String[] strArr) {
            this.f119277c = strArr;
        }

        @NotNull
        /* renamed from: h */
        public final C45309a m289h(boolean z) {
            if (m293d()) {
                m291f(z);
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        @NotNull
        /* renamed from: i */
        public final C45309a m288i(@NotNull String... tlsVersions) {
            boolean z;
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (m293d()) {
                if (tlsVersions.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    m290g((String[]) tlsVersions.clone());
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        @NotNull
        /* renamed from: j */
        public final C45309a m287j(@NotNull TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (m293d()) {
                ArrayList arrayList = new ArrayList(tlsVersions.length);
                for (TlsVersion tlsVersion : tlsVersions) {
                    arrayList.add(tlsVersion.m333c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return m288i((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public C45309a(@NotNull ConnectionSpec connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f119275a = connectionSpec.m300f();
            this.f119276b = connectionSpec.f119273c;
            this.f119277c = connectionSpec.f119274d;
            this.f119278d = connectionSpec.m298h();
        }
    }
}
