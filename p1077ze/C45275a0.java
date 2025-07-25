package p1077ze;

import af.Util;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.C45327u;
import p1077ze.HttpUrl;
import p675ff.HttpMethod;

/* compiled from: Request.kt */
@Metadata
/* renamed from: ze.a0 */
/* loaded from: classes10.dex */
public final class C45275a0 {
    @NotNull

    /* renamed from: a */
    private final HttpUrl f119002a;
    @NotNull

    /* renamed from: b */
    private final String f119003b;
    @NotNull

    /* renamed from: c */
    private final C45327u f119004c;
    @Nullable

    /* renamed from: d */
    private final AbstractC45279b0 f119005d;
    @NotNull

    /* renamed from: e */
    private final Map<Class<?>, Object> f119006e;
    @Nullable

    /* renamed from: f */
    private CacheControl f119007f;

    public C45275a0(@NotNull HttpUrl url, @NotNull String method, @NotNull C45327u headers, @Nullable AbstractC45279b0 abstractC45279b0, @NotNull Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f119002a = url;
        this.f119003b = method;
        this.f119004c = headers;
        this.f119005d = abstractC45279b0;
        this.f119006e = tags;
    }

    @Nullable
    /* renamed from: a */
    public final AbstractC45279b0 m495a() {
        return this.f119005d;
    }

    @NotNull
    /* renamed from: b */
    public final CacheControl m494b() {
        CacheControl cacheControl = this.f119007f;
        if (cacheControl == null) {
            CacheControl m349b = CacheControl.f119085n.m349b(this.f119004c);
            this.f119007f = m349b;
            return m349b;
        }
        return cacheControl;
    }

    @NotNull
    /* renamed from: c */
    public final Map<Class<?>, Object> m493c() {
        return this.f119006e;
    }

    @Nullable
    /* renamed from: d */
    public final String m492d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f119004c.m202a(name);
    }

    @NotNull
    /* renamed from: e */
    public final List<String> m491e(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f119004c.m195i(name);
    }

    @NotNull
    /* renamed from: f */
    public final C45327u m490f() {
        return this.f119004c;
    }

    /* renamed from: g */
    public final boolean m489g() {
        return this.f119002a.m170i();
    }

    @NotNull
    /* renamed from: h */
    public final String m488h() {
        return this.f119003b;
    }

    @NotNull
    /* renamed from: i */
    public final C45276a m487i() {
        return new C45276a(this);
    }

    @NotNull
    /* renamed from: j */
    public final HttpUrl m486j() {
        return this.f119002a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(m488h());
        sb2.append(", url=");
        sb2.append(m486j());
        if (m490f().size() != 0) {
            sb2.append(", headers=[");
            int i = 0;
            for (Tuples<? extends String, ? extends String> tuples : m490f()) {
                int i2 = i + 1;
                if (i < 0) {
                    C37563v.m17156w();
                }
                Tuples<? extends String, ? extends String> tuples2 = tuples;
                String m17632a = tuples2.m17632a();
                String m17631b = tuples2.m17631b();
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(m17632a);
                sb2.append(':');
                sb2.append(m17631b);
                i = i2;
            }
            sb2.append(']');
        }
        if (!m493c().isEmpty()) {
            sb2.append(", tags=");
            sb2.append(m493c());
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* compiled from: Request.kt */
    @Metadata
    /* renamed from: ze.a0$a */
    /* loaded from: classes10.dex */
    public static class C45276a {
        @Nullable

        /* renamed from: a */
        private HttpUrl f119008a;
        @NotNull

        /* renamed from: b */
        private String f119009b;
        @NotNull

        /* renamed from: c */
        private C45327u.C45328a f119010c;
        @Nullable

        /* renamed from: d */
        private AbstractC45279b0 f119011d;
        @NotNull

        /* renamed from: e */
        private Map<Class<?>, Object> f119012e;

        public C45276a() {
            this.f119012e = new LinkedHashMap();
            this.f119009b = "GET";
            this.f119010c = new C45327u.C45328a();
        }

        @NotNull
        /* renamed from: a */
        public C45276a m485a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            m481e().m194a(name, value);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public C45275a0 m484b() {
            HttpUrl httpUrl = this.f119008a;
            if (httpUrl != null) {
                return new C45275a0(httpUrl, this.f119009b, this.f119010c.m190e(), this.f119011d, Util.m105745U(this.f119012e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @NotNull
        /* renamed from: c */
        public C45276a m483c(@NotNull CacheControl cacheControl) {
            boolean z;
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return m475k("Cache-Control");
            }
            return m479g("Cache-Control", cacheControl2);
        }

        @NotNull
        /* renamed from: d */
        public C45276a m482d() {
            return m477i("GET", null);
        }

        @NotNull
        /* renamed from: e */
        public final C45327u.C45328a m481e() {
            return this.f119010c;
        }

        @NotNull
        /* renamed from: f */
        public final Map<Class<?>, Object> m480f() {
            return this.f119012e;
        }

        @NotNull
        /* renamed from: g */
        public C45276a m479g(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            m481e().m186i(name, value);
            return this;
        }

        @NotNull
        /* renamed from: h */
        public C45276a m478h(@NotNull C45327u headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            m473m(headers.m198f());
            return this;
        }

        @NotNull
        /* renamed from: i */
        public C45276a m477i(@NotNull String method, @Nullable AbstractC45279b0 abstractC45279b0) {
            boolean z;
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (abstractC45279b0 == null) {
                    if (!(true ^ HttpMethod.m24620e(method))) {
                        throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                    }
                } else if (!HttpMethod.m24623b(method)) {
                    throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
                }
                m472n(method);
                m474l(abstractC45279b0);
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        @NotNull
        /* renamed from: j */
        public C45276a m476j(@NotNull AbstractC45279b0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return m477i("POST", body);
        }

        @NotNull
        /* renamed from: k */
        public C45276a m475k(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            m481e().m187h(name);
            return this;
        }

        /* renamed from: l */
        public final void m474l(@Nullable AbstractC45279b0 abstractC45279b0) {
            this.f119011d = abstractC45279b0;
        }

        /* renamed from: m */
        public final void m473m(@NotNull C45327u.C45328a c45328a) {
            Intrinsics.checkNotNullParameter(c45328a, "<set-?>");
            this.f119010c = c45328a;
        }

        /* renamed from: n */
        public final void m472n(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f119009b = str;
        }

        /* renamed from: o */
        public final void m471o(@NotNull Map<Class<?>, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.f119012e = map;
        }

        /* renamed from: p */
        public final void m470p(@Nullable HttpUrl httpUrl) {
            this.f119008a = httpUrl;
        }

        @NotNull
        /* renamed from: q */
        public <T> C45276a m469q(@NotNull Class<? super T> type, @Nullable T t) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (t == null) {
                m480f().remove(type);
            } else {
                if (m480f().isEmpty()) {
                    m471o(new LinkedHashMap());
                }
                Map<Class<?>, Object> m480f = m480f();
                T cast = type.cast(t);
                Intrinsics.m17074g(cast);
                m480f.put(type, cast);
            }
            return this;
        }

        @NotNull
        /* renamed from: r */
        public C45276a m468r(@NotNull String url) {
            boolean m16626K;
            boolean m16626K2;
            Intrinsics.checkNotNullParameter(url, "url");
            m16626K = StringsJVM.m16626K(url, "ws:", true);
            if (!m16626K) {
                m16626K2 = StringsJVM.m16626K(url, "wss:", true);
                if (m16626K2) {
                    String substring = url.substring(4);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                    url = Intrinsics.m17064q("https:", substring);
                }
            } else {
                String substring2 = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                url = Intrinsics.m17064q("http:", substring2);
            }
            return m466t(HttpUrl.f119327k.m113d(url));
        }

        @NotNull
        /* renamed from: s */
        public C45276a m467s(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            HttpUrl.C45332b c45332b = HttpUrl.f119327k;
            String url2 = url.toString();
            Intrinsics.checkNotNullExpressionValue(url2, "url.toString()");
            return m466t(c45332b.m113d(url2));
        }

        @NotNull
        /* renamed from: t */
        public C45276a m466t(@NotNull HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            m470p(url);
            return this;
        }

        public C45276a(@NotNull C45275a0 request) {
            Map<Class<?>, Object> m17285D;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f119012e = new LinkedHashMap();
            this.f119008a = request.m486j();
            this.f119009b = request.m488h();
            this.f119011d = request.m495a();
            if (!request.m493c().isEmpty()) {
                m17285D = C37559r0.m17285D(request.m493c());
            } else {
                m17285D = new LinkedHashMap<>();
            }
            this.f119012e = m17285D;
            this.f119010c = request.m490f().m198f();
        }
    }
}
