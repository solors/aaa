package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC30180dn;
import com.yandex.mobile.ads.impl.InterfaceC30865mm;
import com.yandex.mobile.ads.impl.m30;
import com.yandex.mobile.ads.impl.qd1;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ja1 implements Cloneable, InterfaceC30865mm.InterfaceC30866a {
    @NotNull

    /* renamed from: A */
    private static final List<hi1> f80806A = z32.m26402a(hi1.f80080g, hi1.f80078e);
    @NotNull

    /* renamed from: B */
    private static final List<C30652jq> f80807B = z32.m26402a(C30652jq.f81045e, C30652jq.f81046f);

    /* renamed from: C */
    public static final /* synthetic */ int f80808C = 0;
    @NotNull

    /* renamed from: b */
    private final c00 f80809b;
    @NotNull

    /* renamed from: c */
    private final C30491hq f80810c;
    @NotNull

    /* renamed from: d */
    private final List<pm0> f80811d;
    @NotNull

    /* renamed from: e */
    private final List<pm0> f80812e;
    @NotNull

    /* renamed from: f */
    private final m30.InterfaceC30828b f80813f;

    /* renamed from: g */
    private final boolean f80814g;
    @NotNull

    /* renamed from: h */
    private final InterfaceC30463hh f80815h;

    /* renamed from: i */
    private final boolean f80816i;

    /* renamed from: j */
    private final boolean f80817j;
    @NotNull

    /* renamed from: k */
    private final InterfaceC30577ir f80818k;
    @NotNull

    /* renamed from: l */
    private final w10 f80819l;
    @NotNull

    /* renamed from: m */
    private final ProxySelector f80820m;
    @NotNull

    /* renamed from: n */
    private final InterfaceC30463hh f80821n;
    @NotNull

    /* renamed from: o */
    private final SocketFactory f80822o;
    @Nullable

    /* renamed from: p */
    private final SSLSocketFactory f80823p;
    @Nullable

    /* renamed from: q */
    private final X509TrustManager f80824q;
    @NotNull

    /* renamed from: r */
    private final List<C30652jq> f80825r;
    @NotNull

    /* renamed from: s */
    private final List<hi1> f80826s;
    @NotNull

    /* renamed from: t */
    private final ia1 f80827t;
    @NotNull

    /* renamed from: u */
    private final C30256en f80828u;
    @Nullable

    /* renamed from: v */
    private final AbstractC30180dn f80829v;

    /* renamed from: w */
    private final int f80830w;

    /* renamed from: x */
    private final int f80831x;

    /* renamed from: y */
    private final int f80832y;
    @NotNull

    /* renamed from: z */
    private final lo1 f80833z;

    /* renamed from: com.yandex.mobile.ads.impl.ja1$a */
    /* loaded from: classes8.dex */
    public static final class C30614a {
        @NotNull

        /* renamed from: a */
        private c00 f80834a = new c00();
        @NotNull

        /* renamed from: b */
        private C30491hq f80835b = new C30491hq();
        @NotNull

        /* renamed from: c */
        private final ArrayList f80836c = new ArrayList();
        @NotNull

        /* renamed from: d */
        private final ArrayList f80837d = new ArrayList();
        @NotNull

        /* renamed from: e */
        private m30.InterfaceC30828b f80838e = z32.m26423a(m30.f82030a);

        /* renamed from: f */
        private boolean f80839f = true;
        @NotNull

        /* renamed from: g */
        private InterfaceC30463hh f80840g;

        /* renamed from: h */
        private boolean f80841h;

        /* renamed from: i */
        private boolean f80842i;
        @NotNull

        /* renamed from: j */
        private InterfaceC30577ir f80843j;
        @NotNull

        /* renamed from: k */
        private w10 f80844k;
        @NotNull

        /* renamed from: l */
        private InterfaceC30463hh f80845l;
        @NotNull

        /* renamed from: m */
        private SocketFactory f80846m;
        @Nullable

        /* renamed from: n */
        private SSLSocketFactory f80847n;
        @Nullable

        /* renamed from: o */
        private X509TrustManager f80848o;
        @NotNull

        /* renamed from: p */
        private List<C30652jq> f80849p;
        @NotNull

        /* renamed from: q */
        private List<? extends hi1> f80850q;
        @NotNull

        /* renamed from: r */
        private ia1 f80851r;
        @NotNull

        /* renamed from: s */
        private C30256en f80852s;
        @Nullable

        /* renamed from: t */
        private AbstractC30180dn f80853t;

        /* renamed from: u */
        private int f80854u;

        /* renamed from: v */
        private int f80855v;

        /* renamed from: w */
        private int f80856w;

        public C30614a() {
            InterfaceC30463hh interfaceC30463hh = InterfaceC30463hh.f80068a;
            this.f80840g = interfaceC30463hh;
            this.f80841h = true;
            this.f80842i = true;
            this.f80843j = InterfaceC30577ir.f80588a;
            this.f80844k = w10.f87081a;
            this.f80845l = interfaceC30463hh;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault(...)");
            this.f80846m = socketFactory;
            int i = ja1.f80808C;
            this.f80849p = C30615b.m32951a();
            this.f80850q = C30615b.m32950b();
            this.f80851r = ia1.f80392a;
            this.f80852s = C30256en.f78718c;
            this.f80854u = 10000;
            this.f80855v = 10000;
            this.f80856w = 10000;
        }

        @NotNull
        /* renamed from: a */
        public final C30614a m32977a(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f80854u = z32.m26424a(j, unit);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final InterfaceC30463hh m32975b() {
            return this.f80840g;
        }

        @Nullable
        /* renamed from: c */
        public final AbstractC30180dn m32973c() {
            return this.f80853t;
        }

        @NotNull
        /* renamed from: d */
        public final C30256en m32972d() {
            return this.f80852s;
        }

        /* renamed from: e */
        public final int m32971e() {
            return this.f80854u;
        }

        @NotNull
        /* renamed from: f */
        public final C30491hq m32970f() {
            return this.f80835b;
        }

        @NotNull
        /* renamed from: g */
        public final List<C30652jq> m32969g() {
            return this.f80849p;
        }

        @NotNull
        /* renamed from: h */
        public final InterfaceC30577ir m32968h() {
            return this.f80843j;
        }

        @NotNull
        /* renamed from: i */
        public final c00 m32967i() {
            return this.f80834a;
        }

        @NotNull
        /* renamed from: j */
        public final w10 m32966j() {
            return this.f80844k;
        }

        @NotNull
        /* renamed from: k */
        public final m30.InterfaceC30828b m32965k() {
            return this.f80838e;
        }

        /* renamed from: l */
        public final boolean m32964l() {
            return this.f80841h;
        }

        /* renamed from: m */
        public final boolean m32963m() {
            return this.f80842i;
        }

        @NotNull
        /* renamed from: n */
        public final ia1 m32962n() {
            return this.f80851r;
        }

        @NotNull
        /* renamed from: o */
        public final ArrayList m32961o() {
            return this.f80836c;
        }

        @NotNull
        /* renamed from: p */
        public final ArrayList m32960p() {
            return this.f80837d;
        }

        @NotNull
        /* renamed from: q */
        public final List<hi1> m32959q() {
            return this.f80850q;
        }

        @NotNull
        /* renamed from: r */
        public final InterfaceC30463hh m32958r() {
            return this.f80845l;
        }

        /* renamed from: s */
        public final int m32957s() {
            return this.f80855v;
        }

        /* renamed from: t */
        public final boolean m32956t() {
            return this.f80839f;
        }

        @NotNull
        /* renamed from: u */
        public final SocketFactory m32955u() {
            return this.f80846m;
        }

        @Nullable
        /* renamed from: v */
        public final SSLSocketFactory m32954v() {
            return this.f80847n;
        }

        /* renamed from: w */
        public final int m32953w() {
            return this.f80856w;
        }

        @Nullable
        /* renamed from: x */
        public final X509TrustManager m32952x() {
            return this.f80848o;
        }

        @NotNull
        /* renamed from: b */
        public final C30614a m32974b(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f80855v = z32.m26424a(j, unit);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30614a m32978a() {
            this.f80841h = true;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30614a m32976a(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (Intrinsics.m17075f(sslSocketFactory, this.f80847n)) {
                Intrinsics.m17075f(trustManager, this.f80848o);
            }
            this.f80847n = sslSocketFactory;
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            this.f80853t = qd1.f84301a.mo27987a(trustManager);
            this.f80848o = trustManager;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ja1$b */
    /* loaded from: classes8.dex */
    public static final class C30615b {
        @NotNull
        /* renamed from: a */
        public static List m32951a() {
            return ja1.f80807B;
        }

        @NotNull
        /* renamed from: b */
        public static List m32950b() {
            return ja1.f80806A;
        }
    }

    public ja1() {
        this(new C30614a());
    }

    /* renamed from: y */
    private final void m32980y() {
        List<pm0> list = this.f80811d;
        Intrinsics.m17073h(list, "null cannot be cast to non-null type kotlin.collections.List<com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.Interceptor?>");
        if (!list.contains(null)) {
            List<pm0> list2 = this.f80812e;
            Intrinsics.m17073h(list2, "null cannot be cast to non-null type kotlin.collections.List<com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.Interceptor?>");
            if (!list2.contains(null)) {
                List<C30652jq> list3 = this.f80825r;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (C30652jq c30652jq : list3) {
                        if (c30652jq.m32808a()) {
                            if (this.f80823p != null) {
                                if (this.f80829v != null) {
                                    if (this.f80824q == null) {
                                        throw new IllegalStateException("x509TrustManager == null".toString());
                                    }
                                    return;
                                }
                                throw new IllegalStateException("certificateChainCleaner == null".toString());
                            }
                            throw new IllegalStateException("sslSocketFactory == null".toString());
                        }
                    }
                }
                if (this.f80823p == null) {
                    if (this.f80829v == null) {
                        if (this.f80824q == null) {
                            if (Intrinsics.m17075f(this.f80828u, C30256en.f78718c)) {
                                return;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            List<pm0> list4 = this.f80812e;
            throw new IllegalStateException(("Null network interceptor: " + list4).toString());
        }
        List<pm0> list5 = this.f80811d;
        throw new IllegalStateException(("Null interceptor: " + list5).toString());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30865mm.InterfaceC30866a
    @NotNull
    /* renamed from: a */
    public final qj1 mo31932a(@NotNull nl1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new qj1(this, request, false);
    }

    @NotNull
    /* renamed from: c */
    public final InterfaceC30463hh m33002c() {
        return this.f80815h;
    }

    @NotNull
    public final Object clone() {
        return super.clone();
    }

    @NotNull
    /* renamed from: d */
    public final C30256en m33001d() {
        return this.f80828u;
    }

    /* renamed from: e */
    public final int m33000e() {
        return this.f80830w;
    }

    @NotNull
    /* renamed from: f */
    public final C30491hq m32999f() {
        return this.f80810c;
    }

    @NotNull
    /* renamed from: g */
    public final List<C30652jq> m32998g() {
        return this.f80825r;
    }

    @NotNull
    /* renamed from: h */
    public final InterfaceC30577ir m32997h() {
        return this.f80818k;
    }

    @NotNull
    /* renamed from: i */
    public final c00 m32996i() {
        return this.f80809b;
    }

    @NotNull
    /* renamed from: j */
    public final w10 m32995j() {
        return this.f80819l;
    }

    @NotNull
    /* renamed from: k */
    public final m30.InterfaceC30828b m32994k() {
        return this.f80813f;
    }

    /* renamed from: l */
    public final boolean m32993l() {
        return this.f80816i;
    }

    /* renamed from: m */
    public final boolean m32992m() {
        return this.f80817j;
    }

    @NotNull
    /* renamed from: n */
    public final lo1 m32991n() {
        return this.f80833z;
    }

    @NotNull
    /* renamed from: o */
    public final ia1 m32990o() {
        return this.f80827t;
    }

    @NotNull
    /* renamed from: p */
    public final List<pm0> m32989p() {
        return this.f80811d;
    }

    @NotNull
    /* renamed from: q */
    public final List<pm0> m32988q() {
        return this.f80812e;
    }

    @NotNull
    /* renamed from: r */
    public final List<hi1> m32987r() {
        return this.f80826s;
    }

    @NotNull
    /* renamed from: s */
    public final InterfaceC30463hh m32986s() {
        return this.f80821n;
    }

    @NotNull
    /* renamed from: t */
    public final ProxySelector m32985t() {
        return this.f80820m;
    }

    /* renamed from: u */
    public final int m32984u() {
        return this.f80831x;
    }

    /* renamed from: v */
    public final boolean m32983v() {
        return this.f80814g;
    }

    @NotNull
    /* renamed from: w */
    public final SocketFactory m32982w() {
        return this.f80822o;
    }

    @NotNull
    /* renamed from: x */
    public final SSLSocketFactory m32981x() {
        SSLSocketFactory sSLSocketFactory = this.f80823p;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: z */
    public final int m32979z() {
        return this.f80832y;
    }

    public ja1(@NotNull C30614a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f80809b = builder.m32967i();
        this.f80810c = builder.m32970f();
        this.f80811d = z32.m26397b(builder.m32961o());
        this.f80812e = z32.m26397b(builder.m32960p());
        this.f80813f = builder.m32965k();
        this.f80814g = builder.m32956t();
        this.f80815h = builder.m32975b();
        this.f80816i = builder.m32964l();
        this.f80817j = builder.m32963m();
        this.f80818k = builder.m32968h();
        this.f80819l = builder.m32966j();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f80820m = proxySelector == null ? z91.f88792a : proxySelector;
        this.f80821n = builder.m32958r();
        this.f80822o = builder.m32955u();
        List<C30652jq> m32969g = builder.m32969g();
        this.f80825r = m32969g;
        this.f80826s = builder.m32959q();
        this.f80827t = builder.m32962n();
        this.f80830w = builder.m32971e();
        this.f80831x = builder.m32957s();
        this.f80832y = builder.m32953w();
        this.f80833z = new lo1();
        if (!(m32969g instanceof Collection) || !m32969g.isEmpty()) {
            for (C30652jq c30652jq : m32969g) {
                if (c30652jq.m32808a()) {
                    if (builder.m32954v() != null) {
                        this.f80823p = builder.m32954v();
                        AbstractC30180dn m32973c = builder.m32973c();
                        Intrinsics.m17074g(m32973c);
                        this.f80829v = m32973c;
                        X509TrustManager m32952x = builder.m32952x();
                        Intrinsics.m17074g(m32952x);
                        this.f80824q = m32952x;
                        C30256en m32972d = builder.m32972d();
                        Intrinsics.m17074g(m32973c);
                        this.f80828u = m32972d.m34489a(m32973c);
                    } else {
                        int i = qd1.f84303c;
                        qd1.C31196a.m30396a().getClass();
                        X509TrustManager m30398c = qd1.m30398c();
                        this.f80824q = m30398c;
                        qd1 m30396a = qd1.C31196a.m30396a();
                        Intrinsics.m17074g(m30398c);
                        m30396a.getClass();
                        this.f80823p = qd1.m30397c(m30398c);
                        Intrinsics.m17074g(m30398c);
                        AbstractC30180dn m34881a = AbstractC30180dn.C30181a.m34881a(m30398c);
                        this.f80829v = m34881a;
                        C30256en m32972d2 = builder.m32972d();
                        Intrinsics.m17074g(m34881a);
                        this.f80828u = m32972d2.m34489a(m34881a);
                    }
                    m32980y();
                }
            }
        }
        this.f80823p = null;
        this.f80829v = null;
        this.f80824q = null;
        this.f80828u = C30256en.f78718c;
        m32980y();
    }
}
