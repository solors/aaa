package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.C30868mn;
import com.yandex.mobile.ads.impl.o02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections._Arrays;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p850qd.C39385c;

/* renamed from: com.yandex.mobile.ads.impl.jq */
/* loaded from: classes8.dex */
public final class C30652jq {
    @NotNull

    /* renamed from: e */
    public static final C30652jq f81045e;
    @NotNull

    /* renamed from: f */
    public static final C30652jq f81046f;

    /* renamed from: a */
    private final boolean f81047a;

    /* renamed from: b */
    private final boolean f81048b;
    @Nullable

    /* renamed from: c */
    private final String[] f81049c;
    @Nullable

    /* renamed from: d */
    private final String[] f81050d;

    static {
        C30868mn c30868mn = C30868mn.f82314r;
        C30868mn c30868mn2 = C30868mn.f82315s;
        C30868mn c30868mn3 = C30868mn.f82316t;
        C30868mn c30868mn4 = C30868mn.f82308l;
        C30868mn c30868mn5 = C30868mn.f82310n;
        C30868mn c30868mn6 = C30868mn.f82309m;
        C30868mn c30868mn7 = C30868mn.f82311o;
        C30868mn c30868mn8 = C30868mn.f82313q;
        C30868mn c30868mn9 = C30868mn.f82312p;
        C30868mn[] c30868mnArr = {c30868mn, c30868mn2, c30868mn3, c30868mn4, c30868mn5, c30868mn6, c30868mn7, c30868mn8, c30868mn9, C30868mn.f82306j, C30868mn.f82307k, C30868mn.f82304h, C30868mn.f82305i, C30868mn.f82302f, C30868mn.f82303g, C30868mn.f82301e};
        C30653a m32801a = new C30653a(true).m32801a((C30868mn[]) Arrays.copyOf(new C30868mn[]{c30868mn, c30868mn2, c30868mn3, c30868mn4, c30868mn5, c30868mn6, c30868mn7, c30868mn8, c30868mn9}, 9));
        o02 o02Var = o02.f83254d;
        o02 o02Var2 = o02.f83255e;
        m32801a.m32800a(o02Var, o02Var2).m32798b().m32802a();
        f81045e = new C30653a(true).m32801a((C30868mn[]) Arrays.copyOf(c30868mnArr, 16)).m32800a(o02Var, o02Var2).m32798b().m32802a();
        new C30653a(true).m32801a((C30868mn[]) Arrays.copyOf(c30868mnArr, 16)).m32800a(o02Var, o02Var2, o02.f83256f, o02.f83257g).m32798b().m32802a();
        f81046f = new C30653a(false).m32802a();
    }

    public C30652jq(boolean z, boolean z2, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.f81047a = z;
        this.f81048b = z2;
        this.f81049c = strArr;
        this.f81050d = strArr2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C30652jq)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f81047a;
        C30652jq c30652jq = (C30652jq) obj;
        if (z != c30652jq.f81047a) {
            return false;
        }
        if (z && (!Arrays.equals(this.f81049c, c30652jq.f81049c) || !Arrays.equals(this.f81050d, c30652jq.f81050d) || this.f81048b != c30652jq.f81048b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        if (this.f81047a) {
            String[] strArr = this.f81049c;
            int i2 = 0;
            if (strArr != null) {
                i = Arrays.hashCode(strArr);
            } else {
                i = 0;
            }
            int i3 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String[] strArr2 = this.f81050d;
            if (strArr2 != null) {
                i2 = Arrays.hashCode(strArr2);
            }
            return ((i3 + i2) * 31) + (!this.f81048b ? 1 : 0);
        }
        return 17;
    }

    @NotNull
    public final String toString() {
        List list;
        if (!this.f81047a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f81049c;
        List list2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C30868mn.f82298b.m31893a(str));
            }
            list = _Collections.m17553Z0(arrayList);
        } else {
            list = null;
        }
        String objects = Objects.toString(list, "[all enabled]");
        String[] strArr2 = this.f81050d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                o02.f83253c.getClass();
                arrayList2.add(o02.C31011a.m31196a(str2));
            }
            list2 = _Collections.m17553Z0(arrayList2);
        }
        return "ConnectionSpec(cipherSuites=" + objects + ", tlsVersions=" + Objects.toString(list2, "[all enabled]") + ", supportsTlsExtensions=" + this.f81048b + ")";
    }

    /* renamed from: a */
    public final void m32805a(@NotNull SSLSocket sslSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        C30868mn.C30869a comparator;
        List list;
        int m17325a0;
        Comparator m12775g;
        C30868mn.C30869a c30869a;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.f81049c != null) {
            String[] enabledCipherSuites2 = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites2, "getEnabledCipherSuites(...)");
            String[] strArr = this.f81049c;
            c30869a = C30868mn.f82299c;
            enabledCipherSuites = z32.m26396b(enabledCipherSuites2, strArr, c30869a);
        } else {
            enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        }
        if (this.f81050d != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "getEnabledProtocols(...)");
            String[] strArr2 = this.f81050d;
            m12775g = C39385c.m12775g();
            enabledProtocols = z32.m26396b(enabledProtocols2, strArr2, m12775g);
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.m17074g(supportedCipherSuites);
        comparator = C30868mn.f82299c;
        byte[] bArr = z32.f88697a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (comparator.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            Intrinsics.m17074g(enabledCipherSuites);
            String value = supportedCipherSuites[i];
            Intrinsics.checkNotNullExpressionValue(value, "get(...)");
            Intrinsics.checkNotNullParameter(enabledCipherSuites, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) copyOf;
            m17325a0 = _Arrays.m17325a0(enabledCipherSuites);
            enabledCipherSuites[m17325a0] = value;
        }
        C30653a c30653a = new C30653a(this);
        Intrinsics.m17074g(enabledCipherSuites);
        C30653a m32799a = c30653a.m32799a((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        Intrinsics.m17074g(enabledProtocols);
        C30652jq m32802a = m32799a.m32797b((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).m32802a();
        String[] strArr3 = m32802a.f81050d;
        List list2 = null;
        if (strArr3 != null) {
            ArrayList arrayList = new ArrayList(strArr3.length);
            for (String str : strArr3) {
                o02.f83253c.getClass();
                arrayList.add(o02.C31011a.m31196a(str));
            }
            list = _Collections.m17553Z0(arrayList);
        } else {
            list = null;
        }
        if (list != null) {
            sslSocket.setEnabledProtocols(m32802a.f81050d);
        }
        String[] strArr4 = m32802a.f81049c;
        if (strArr4 != null) {
            ArrayList arrayList2 = new ArrayList(strArr4.length);
            for (String str2 : strArr4) {
                arrayList2.add(C30868mn.f82298b.m31893a(str2));
            }
            list2 = _Collections.m17553Z0(arrayList2);
        }
        if (list2 != null) {
            sslSocket.setEnabledCipherSuites(m32802a.f81049c);
        }
    }

    /* renamed from: b */
    public final boolean m32804b() {
        return this.f81048b;
    }

    /* renamed from: com.yandex.mobile.ads.impl.jq$a */
    /* loaded from: classes8.dex */
    public static final class C30653a {

        /* renamed from: a */
        private boolean f81051a;
        @Nullable

        /* renamed from: b */
        private String[] f81052b;
        @Nullable

        /* renamed from: c */
        private String[] f81053c;

        /* renamed from: d */
        private boolean f81054d;

        public C30653a(@NotNull C30652jq connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f81051a = connectionSpec.m32808a();
            this.f81052b = connectionSpec.f81049c;
            this.f81053c = connectionSpec.f81050d;
            this.f81054d = connectionSpec.m32804b();
        }

        @NotNull
        /* renamed from: a */
        public final C30653a m32801a(@NotNull C30868mn... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (this.f81051a) {
                ArrayList arrayList = new ArrayList(cipherSuites.length);
                for (C30868mn c30868mn : cipherSuites) {
                    arrayList.add(c30868mn.m31894c());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return m32799a((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @NotNull
        /* renamed from: b */
        public final C30653a m32798b() {
            if (this.f81051a) {
                this.f81054d = true;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        @NotNull
        /* renamed from: b */
        public final C30653a m32797b(@NotNull String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (this.f81051a) {
                if (!(tlsVersions.length == 0)) {
                    this.f81053c = (String[]) tlsVersions.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public C30653a(boolean z) {
            this.f81051a = z;
        }

        @NotNull
        /* renamed from: a */
        public final C30653a m32799a(@NotNull String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (this.f81051a) {
                if (!(cipherSuites.length == 0)) {
                    this.f81052b = (String[]) cipherSuites.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @NotNull
        /* renamed from: a */
        public final C30653a m32800a(@NotNull o02... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (this.f81051a) {
                ArrayList arrayList = new ArrayList(tlsVersions.length);
                for (o02 o02Var : tlsVersions) {
                    arrayList.add(o02Var.m31197a());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return m32797b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        @NotNull
        /* renamed from: a */
        public final C30652jq m32802a() {
            return new C30652jq(this.f81051a, this.f81054d, this.f81052b, this.f81053c);
        }
    }

    /* renamed from: a */
    public final boolean m32806a(@NotNull SSLSocket socket) {
        C30868mn.C30869a c30869a;
        Comparator m12775g;
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (this.f81047a) {
            String[] strArr = this.f81050d;
            if (strArr != null) {
                String[] enabledProtocols = socket.getEnabledProtocols();
                m12775g = C39385c.m12775g();
                if (!z32.m26401a(strArr, enabledProtocols, m12775g)) {
                    return false;
                }
            }
            String[] strArr2 = this.f81049c;
            if (strArr2 != null) {
                String[] enabledCipherSuites = socket.getEnabledCipherSuites();
                c30869a = C30868mn.f82299c;
                return z32.m26401a(strArr2, enabledCipherSuites, c30869a);
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m32808a() {
        return this.f81047a;
    }
}
