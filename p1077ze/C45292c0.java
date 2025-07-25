package p1077ze;

import com.google.common.net.HttpHeaders;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.C45327u;
import p658ef.Exchange;

/* compiled from: Response.kt */
@Metadata
/* renamed from: ze.c0 */
/* loaded from: classes10.dex */
public final class C45292c0 implements Closeable {
    @NotNull

    /* renamed from: b */
    private final C45275a0 f119058b;
    @NotNull

    /* renamed from: c */
    private final Protocol f119059c;
    @NotNull

    /* renamed from: d */
    private final String f119060d;

    /* renamed from: f */
    private final int f119061f;
    @Nullable

    /* renamed from: g */
    private final Handshake f119062g;
    @NotNull

    /* renamed from: h */
    private final C45327u f119063h;
    @Nullable

    /* renamed from: i */
    private final ResponseBody f119064i;
    @Nullable

    /* renamed from: j */
    private final C45292c0 f119065j;
    @Nullable

    /* renamed from: k */
    private final C45292c0 f119066k;
    @Nullable

    /* renamed from: l */
    private final C45292c0 f119067l;

    /* renamed from: m */
    private final long f119068m;

    /* renamed from: n */
    private final long f119069n;
    @Nullable

    /* renamed from: o */
    private final Exchange f119070o;
    @Nullable

    /* renamed from: p */
    private CacheControl f119071p;

    public C45292c0(@NotNull C45275a0 request, @NotNull Protocol protocol, @NotNull String message, int i, @Nullable Handshake handshake, @NotNull C45327u headers, @Nullable ResponseBody responseBody, @Nullable C45292c0 c45292c0, @Nullable C45292c0 c45292c02, @Nullable C45292c0 c45292c03, long j, long j2, @Nullable Exchange exchange) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f119058b = request;
        this.f119059c = protocol;
        this.f119060d = message;
        this.f119061f = i;
        this.f119062g = handshake;
        this.f119063h = headers;
        this.f119064i = responseBody;
        this.f119065j = c45292c0;
        this.f119066k = c45292c02;
        this.f119067l = c45292c03;
        this.f119068m = j;
        this.f119069n = j2;
        this.f119070o = exchange;
    }

    /* renamed from: n */
    public static /* synthetic */ String m410n(C45292c0 c45292c0, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c45292c0.m411m(str, str2);
    }

    @NotNull
    /* renamed from: I */
    public final C45275a0 m421I() {
        return this.f119058b;
    }

    /* renamed from: K */
    public final long m420K() {
        return this.f119068m;
    }

    @Nullable
    /* renamed from: a */
    public final ResponseBody m419a() {
        return this.f119064i;
    }

    @NotNull
    /* renamed from: b */
    public final CacheControl m418b() {
        CacheControl cacheControl = this.f119071p;
        if (cacheControl == null) {
            CacheControl m349b = CacheControl.f119085n.m349b(this.f119063h);
            this.f119071p = m349b;
            return m349b;
        }
        return cacheControl;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.f119064i;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    @Nullable
    /* renamed from: e */
    public final C45292c0 m417e() {
        return this.f119066k;
    }

    @NotNull
    /* renamed from: f */
    public final List<Challenge> m416f() {
        String str;
        List<Challenge> m17166m;
        C45327u c45327u = this.f119063h;
        int i = this.f119061f;
        if (i != 401) {
            if (i != 407) {
                m17166m = C37563v.m17166m();
                return m17166m;
            }
            str = HttpHeaders.PROXY_AUTHENTICATE;
        } else {
            str = HttpHeaders.WWW_AUTHENTICATE;
        }
        return p675ff.HttpHeaders.m24632b(c45327u, str);
    }

    /* renamed from: h */
    public final int m415h() {
        return this.f119061f;
    }

    @Nullable
    /* renamed from: i */
    public final Exchange m414i() {
        return this.f119070o;
    }

    public final boolean isSuccessful() {
        int i = this.f119061f;
        if (200 > i || i >= 300) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: k */
    public final Handshake m413k() {
        return this.f119062g;
    }

    @Nullable
    /* renamed from: l */
    public final String m412l(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return m410n(this, name, null, 2, null);
    }

    @Nullable
    /* renamed from: m */
    public final String m411m(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String m202a = this.f119063h.m202a(name);
        if (m202a != null) {
            return m202a;
        }
        return str;
    }

    @NotNull
    /* renamed from: r */
    public final C45327u m409r() {
        return this.f119063h;
    }

    /* renamed from: s */
    public final boolean m408s() {
        int i = this.f119061f;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @NotNull
    /* renamed from: t */
    public final String m407t() {
        return this.f119060d;
    }

    @NotNull
    public String toString() {
        return "Response{protocol=" + this.f119059c + ", code=" + this.f119061f + ", message=" + this.f119060d + ", url=" + this.f119058b.m486j() + '}';
    }

    @Nullable
    /* renamed from: u */
    public final C45292c0 m406u() {
        return this.f119065j;
    }

    @NotNull
    /* renamed from: v */
    public final C45293a m405v() {
        return new C45293a(this);
    }

    @Nullable
    /* renamed from: w */
    public final C45292c0 m404w() {
        return this.f119067l;
    }

    @NotNull
    /* renamed from: x */
    public final Protocol m403x() {
        return this.f119059c;
    }

    /* renamed from: y */
    public final long m402y() {
        return this.f119069n;
    }

    /* compiled from: Response.kt */
    @Metadata
    /* renamed from: ze.c0$a */
    /* loaded from: classes10.dex */
    public static class C45293a {
        @Nullable

        /* renamed from: a */
        private C45275a0 f119072a;
        @Nullable

        /* renamed from: b */
        private Protocol f119073b;

        /* renamed from: c */
        private int f119074c;
        @Nullable

        /* renamed from: d */
        private String f119075d;
        @Nullable

        /* renamed from: e */
        private Handshake f119076e;
        @NotNull

        /* renamed from: f */
        private C45327u.C45328a f119077f;
        @Nullable

        /* renamed from: g */
        private ResponseBody f119078g;
        @Nullable

        /* renamed from: h */
        private C45292c0 f119079h;
        @Nullable

        /* renamed from: i */
        private C45292c0 f119080i;
        @Nullable

        /* renamed from: j */
        private C45292c0 f119081j;

        /* renamed from: k */
        private long f119082k;

        /* renamed from: l */
        private long f119083l;
        @Nullable

        /* renamed from: m */
        private Exchange f119084m;

        public C45293a() {
            this.f119074c = -1;
            this.f119077f = new C45327u.C45328a();
        }

        /* renamed from: e */
        private final void m391e(C45292c0 c45292c0) {
            boolean z;
            if (c45292c0 != null) {
                if (c45292c0.m419a() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        /* renamed from: f */
        private final void m390f(String str, C45292c0 c45292c0) {
            boolean z;
            boolean z2;
            boolean z3;
            if (c45292c0 != null) {
                boolean z4 = true;
                if (c45292c0.m419a() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (c45292c0.m406u() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (c45292c0.m417e() == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (c45292c0.m404w() != null) {
                                z4 = false;
                            }
                            if (z4) {
                                return;
                            }
                            throw new IllegalArgumentException(Intrinsics.m17064q(str, ".priorResponse != null").toString());
                        }
                        throw new IllegalArgumentException(Intrinsics.m17064q(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(Intrinsics.m17064q(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(Intrinsics.m17064q(str, ".body != null").toString());
            }
        }

        /* renamed from: A */
        public final void m401A(@Nullable C45292c0 c45292c0) {
            this.f119079h = c45292c0;
        }

        /* renamed from: B */
        public final void m400B(@Nullable C45292c0 c45292c0) {
            this.f119081j = c45292c0;
        }

        /* renamed from: C */
        public final void m399C(@Nullable Protocol protocol) {
            this.f119073b = protocol;
        }

        /* renamed from: D */
        public final void m398D(long j) {
            this.f119083l = j;
        }

        /* renamed from: E */
        public final void m397E(@Nullable C45275a0 c45275a0) {
            this.f119072a = c45275a0;
        }

        /* renamed from: F */
        public final void m396F(long j) {
            this.f119082k = j;
        }

        @NotNull
        /* renamed from: a */
        public C45293a m395a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            m387i().m194a(name, value);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public C45293a m394b(@Nullable ResponseBody responseBody) {
            m375u(responseBody);
            return this;
        }

        @NotNull
        /* renamed from: c */
        public C45292c0 m393c() {
            boolean z;
            int i = this.f119074c;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C45275a0 c45275a0 = this.f119072a;
                if (c45275a0 != null) {
                    Protocol protocol = this.f119073b;
                    if (protocol != null) {
                        String str = this.f119075d;
                        if (str != null) {
                            return new C45292c0(c45275a0, protocol, str, i, this.f119076e, this.f119077f.m190e(), this.f119078g, this.f119079h, this.f119080i, this.f119081j, this.f119082k, this.f119083l, this.f119084m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(Intrinsics.m17064q("code < 0: ", Integer.valueOf(m388h())).toString());
        }

        @NotNull
        /* renamed from: d */
        public C45293a m392d(@Nullable C45292c0 c45292c0) {
            m390f("cacheResponse", c45292c0);
            m374v(c45292c0);
            return this;
        }

        @NotNull
        /* renamed from: g */
        public C45293a m389g(int i) {
            m373w(i);
            return this;
        }

        /* renamed from: h */
        public final int m388h() {
            return this.f119074c;
        }

        @NotNull
        /* renamed from: i */
        public final C45327u.C45328a m387i() {
            return this.f119077f;
        }

        @NotNull
        /* renamed from: j */
        public C45293a m386j(@Nullable Handshake handshake) {
            m372x(handshake);
            return this;
        }

        @NotNull
        /* renamed from: k */
        public C45293a m385k(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            m387i().m186i(name, value);
            return this;
        }

        @NotNull
        /* renamed from: l */
        public C45293a m384l(@NotNull C45327u headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            m371y(headers.m198f());
            return this;
        }

        /* renamed from: m */
        public final void m383m(@NotNull Exchange deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f119084m = deferredTrailers;
        }

        @NotNull
        /* renamed from: n */
        public C45293a m382n(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            m370z(message);
            return this;
        }

        @NotNull
        /* renamed from: o */
        public C45293a m381o(@Nullable C45292c0 c45292c0) {
            m390f("networkResponse", c45292c0);
            m401A(c45292c0);
            return this;
        }

        @NotNull
        /* renamed from: p */
        public C45293a m380p(@Nullable C45292c0 c45292c0) {
            m391e(c45292c0);
            m400B(c45292c0);
            return this;
        }

        @NotNull
        /* renamed from: q */
        public C45293a m379q(@NotNull Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            m399C(protocol);
            return this;
        }

        @NotNull
        /* renamed from: r */
        public C45293a m378r(long j) {
            m398D(j);
            return this;
        }

        @NotNull
        /* renamed from: s */
        public C45293a m377s(@NotNull C45275a0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            m397E(request);
            return this;
        }

        @NotNull
        /* renamed from: t */
        public C45293a m376t(long j) {
            m396F(j);
            return this;
        }

        /* renamed from: u */
        public final void m375u(@Nullable ResponseBody responseBody) {
            this.f119078g = responseBody;
        }

        /* renamed from: v */
        public final void m374v(@Nullable C45292c0 c45292c0) {
            this.f119080i = c45292c0;
        }

        /* renamed from: w */
        public final void m373w(int i) {
            this.f119074c = i;
        }

        /* renamed from: x */
        public final void m372x(@Nullable Handshake handshake) {
            this.f119076e = handshake;
        }

        /* renamed from: y */
        public final void m371y(@NotNull C45327u.C45328a c45328a) {
            Intrinsics.checkNotNullParameter(c45328a, "<set-?>");
            this.f119077f = c45328a;
        }

        /* renamed from: z */
        public final void m370z(@Nullable String str) {
            this.f119075d = str;
        }

        public C45293a(@NotNull C45292c0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f119074c = -1;
            this.f119072a = response.m421I();
            this.f119073b = response.m403x();
            this.f119074c = response.m415h();
            this.f119075d = response.m407t();
            this.f119076e = response.m413k();
            this.f119077f = response.m409r().m198f();
            this.f119078g = response.m419a();
            this.f119079h = response.m406u();
            this.f119080i = response.m417e();
            this.f119081j = response.m404w();
            this.f119082k = response.m420K();
            this.f119083l = response.m402y();
            this.f119084m = response.m414i();
        }
    }
}
