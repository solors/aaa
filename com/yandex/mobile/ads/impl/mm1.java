package com.yandex.mobile.ads.impl;

import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.zc0;
import java.io.Closeable;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class mm1 implements Closeable {
    @NotNull

    /* renamed from: b */
    private final nl1 f82272b;
    @NotNull

    /* renamed from: c */
    private final hi1 f82273c;
    @NotNull

    /* renamed from: d */
    private final String f82274d;

    /* renamed from: e */
    private final int f82275e;
    @Nullable

    /* renamed from: f */
    private final rc0 f82276f;
    @NotNull

    /* renamed from: g */
    private final zc0 f82277g;
    @Nullable

    /* renamed from: h */
    private final qm1 f82278h;
    @Nullable

    /* renamed from: i */
    private final mm1 f82279i;
    @Nullable

    /* renamed from: j */
    private final mm1 f82280j;
    @Nullable

    /* renamed from: k */
    private final mm1 f82281k;

    /* renamed from: l */
    private final long f82282l;

    /* renamed from: m */
    private final long f82283m;
    @Nullable

    /* renamed from: n */
    private final q30 f82284n;

    /* renamed from: com.yandex.mobile.ads.impl.mm1$a */
    /* loaded from: classes8.dex */
    public static class C30867a {
        @Nullable

        /* renamed from: a */
        private nl1 f82285a;
        @Nullable

        /* renamed from: b */
        private hi1 f82286b;

        /* renamed from: c */
        private int f82287c;
        @Nullable

        /* renamed from: d */
        private String f82288d;
        @Nullable

        /* renamed from: e */
        private rc0 f82289e;
        @NotNull

        /* renamed from: f */
        private zc0.C31971a f82290f;
        @Nullable

        /* renamed from: g */
        private qm1 f82291g;
        @Nullable

        /* renamed from: h */
        private mm1 f82292h;
        @Nullable

        /* renamed from: i */
        private mm1 f82293i;
        @Nullable

        /* renamed from: j */
        private mm1 f82294j;

        /* renamed from: k */
        private long f82295k;

        /* renamed from: l */
        private long f82296l;
        @Nullable

        /* renamed from: m */
        private q30 f82297m;

        public C30867a() {
            this.f82287c = -1;
            this.f82290f = new zc0.C31971a();
        }

        @NotNull
        /* renamed from: a */
        public final C30867a m31905a(@Nullable qm1 qm1Var) {
            this.f82291g = qm1Var;
            return this;
        }

        /* renamed from: b */
        public final int m31901b() {
            return this.f82287c;
        }

        @NotNull
        /* renamed from: c */
        public final C30867a m31898c() {
            Intrinsics.checkNotNullParameter(HttpHeaders.PROXY_AUTHENTICATE, "name");
            Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
            zc0.C31971a c31971a = this.f82290f;
            c31971a.getClass();
            Intrinsics.checkNotNullParameter(HttpHeaders.PROXY_AUTHENTICATE, "name");
            Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
            zc0.C31972b.m26266b(HttpHeaders.PROXY_AUTHENTICATE);
            zc0.C31972b.m26265b("OkHttp-Preemptive", HttpHeaders.PROXY_AUTHENTICATE);
            c31971a.m26273a(HttpHeaders.PROXY_AUTHENTICATE);
            c31971a.m26272a(HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive");
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final mm1 m31913a() {
            int i = this.f82287c;
            if (i >= 0) {
                nl1 nl1Var = this.f82285a;
                if (nl1Var != null) {
                    hi1 hi1Var = this.f82286b;
                    if (hi1Var != null) {
                        String str = this.f82288d;
                        if (str != null) {
                            return new mm1(nl1Var, hi1Var, str, i, this.f82289e, this.f82290f.m26274a(), this.f82291g, this.f82292h, this.f82293i, this.f82294j, this.f82295k, this.f82296l, this.f82297m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + i).toString());
        }

        @NotNull
        /* renamed from: b */
        public final C30867a m31899b(@Nullable mm1 mm1Var) {
            m31908a(mm1Var, "networkResponse");
            this.f82292h = mm1Var;
            return this;
        }

        public C30867a(@NotNull mm1 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f82287c = -1;
            this.f82285a = response.m31915o();
            this.f82286b = response.m31917m();
            this.f82287c = response.m31926d();
            this.f82288d = response.m31921i();
            this.f82289e = response.m31924f();
            this.f82290f = response.m31923g().m26278b();
            this.f82291g = response.m31930a();
            this.f82292h = response.m31920j();
            this.f82293i = response.m31928b();
            this.f82294j = response.m31918l();
            this.f82295k = response.m31914p();
            this.f82296l = response.m31916n();
            this.f82297m = response.m31925e();
        }

        @NotNull
        /* renamed from: b */
        public final C30867a m31900b(long j) {
            this.f82295k = j;
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final C30867a m31897c(@Nullable mm1 mm1Var) {
            if (mm1Var.m31930a() == null) {
                this.f82294j = mm1Var;
                return this;
            }
            throw new IllegalArgumentException("priorResponse.body != null".toString());
        }

        @NotNull
        /* renamed from: a */
        public final C30867a m31909a(@Nullable mm1 mm1Var) {
            m31908a(mm1Var, "cacheResponse");
            this.f82293i = mm1Var;
            return this;
        }

        /* renamed from: a */
        private static void m31908a(mm1 mm1Var, String str) {
            if (mm1Var != null) {
                if (mm1Var.m31930a() == null) {
                    if (mm1Var.m31920j() == null) {
                        if (mm1Var.m31928b() == null) {
                            if (mm1Var.m31918l() == null) {
                                return;
                            }
                            throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        @NotNull
        /* renamed from: a */
        public final C30867a m31912a(int i) {
            this.f82287c = i;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30867a m31904a(@Nullable rc0 rc0Var) {
            this.f82289e = rc0Var;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30867a m31903a(@NotNull zc0 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f82290f = headers.m26278b();
            return this;
        }

        /* renamed from: a */
        public final void m31906a(@NotNull q30 deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f82297m = deferredTrailers;
        }

        @NotNull
        /* renamed from: a */
        public final C30867a m31902a(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f82288d = message;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30867a m31910a(@NotNull hi1 protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f82286b = protocol;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30867a m31911a(long j) {
            this.f82296l = j;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30867a m31907a(@NotNull nl1 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f82285a = request;
            return this;
        }
    }

    public mm1(@NotNull nl1 request, @NotNull hi1 protocol, @NotNull String message, int i, @Nullable rc0 rc0Var, @NotNull zc0 headers, @Nullable qm1 qm1Var, @Nullable mm1 mm1Var, @Nullable mm1 mm1Var2, @Nullable mm1 mm1Var3, long j, long j2, @Nullable q30 q30Var) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f82272b = request;
        this.f82273c = protocol;
        this.f82274d = message;
        this.f82275e = i;
        this.f82276f = rc0Var;
        this.f82277g = headers;
        this.f82278h = qm1Var;
        this.f82279i = mm1Var;
        this.f82280j = mm1Var2;
        this.f82281k = mm1Var3;
        this.f82282l = j;
        this.f82283m = j2;
        this.f82284n = q30Var;
    }

    @Nullable
    /* renamed from: a */
    public final qm1 m31930a() {
        return this.f82278h;
    }

    @Nullable
    /* renamed from: b */
    public final mm1 m31928b() {
        return this.f82280j;
    }

    @NotNull
    /* renamed from: c */
    public final List<C30328fn> m31927c() {
        String str;
        List<C30328fn> m17166m;
        zc0 zc0Var = this.f82277g;
        int i = this.f82275e;
        if (i != 401) {
            if (i != 407) {
                m17166m = C37563v.m17166m();
                return m17166m;
            }
            str = HttpHeaders.PROXY_AUTHENTICATE;
        } else {
            str = HttpHeaders.WWW_AUTHENTICATE;
        }
        return ff0.m34162a(zc0Var, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qm1 qm1Var = this.f82278h;
        if (qm1Var != null) {
            z32.m26419a((Closeable) qm1Var.mo28295c());
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    /* renamed from: d */
    public final int m31926d() {
        return this.f82275e;
    }

    @Nullable
    /* renamed from: e */
    public final q30 m31925e() {
        return this.f82284n;
    }

    @Nullable
    /* renamed from: f */
    public final rc0 m31924f() {
        return this.f82276f;
    }

    @NotNull
    /* renamed from: g */
    public final zc0 m31923g() {
        return this.f82277g;
    }

    /* renamed from: h */
    public final boolean m31922h() {
        int i = this.f82275e;
        if (200 <= i && i < 300) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: i */
    public final String m31921i() {
        return this.f82274d;
    }

    @Nullable
    /* renamed from: j */
    public final mm1 m31920j() {
        return this.f82279i;
    }

    @NotNull
    /* renamed from: k */
    public final C30867a m31919k() {
        return new C30867a(this);
    }

    @Nullable
    /* renamed from: l */
    public final mm1 m31918l() {
        return this.f82281k;
    }

    @NotNull
    /* renamed from: m */
    public final hi1 m31917m() {
        return this.f82273c;
    }

    /* renamed from: n */
    public final long m31916n() {
        return this.f82283m;
    }

    @NotNull
    /* renamed from: o */
    public final nl1 m31915o() {
        return this.f82272b;
    }

    /* renamed from: p */
    public final long m31914p() {
        return this.f82282l;
    }

    @NotNull
    public final String toString() {
        hi1 hi1Var = this.f82273c;
        int i = this.f82275e;
        String str = this.f82274d;
        nf0 m31476g = this.f82272b.m31476g();
        return "Response{protocol=" + hi1Var + ", code=" + i + ", message=" + str + ", url=" + m31476g + "}";
    }

    /* renamed from: a */
    public static String m31929a(mm1 mm1Var, String name) {
        mm1Var.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String m26279a = mm1Var.f82277g.m26279a(name);
        if (m26279a == null) {
            return null;
        }
        return m26279a;
    }
}
