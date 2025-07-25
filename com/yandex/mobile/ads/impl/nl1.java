package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C31463tl;
import com.yandex.mobile.ads.impl.nf0;
import com.yandex.mobile.ads.impl.zc0;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class nl1 {
    @NotNull

    /* renamed from: a */
    private final nf0 f82819a;
    @NotNull

    /* renamed from: b */
    private final String f82820b;
    @NotNull

    /* renamed from: c */
    private final zc0 f82821c;
    @Nullable

    /* renamed from: d */
    private final ql1 f82822d;
    @NotNull

    /* renamed from: e */
    private final Map<Class<?>, Object> f82823e;
    @Nullable

    /* renamed from: f */
    private C31463tl f82824f;

    public nl1(@NotNull nf0 url, @NotNull String method, @NotNull zc0 headers, @Nullable ql1 ql1Var, @NotNull Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f82819a = url;
        this.f82820b = method;
        this.f82821c = headers;
        this.f82822d = ql1Var;
        this.f82823e = tags;
    }

    @Nullable
    /* renamed from: a */
    public final ql1 m31483a() {
        return this.f82822d;
    }

    @NotNull
    /* renamed from: b */
    public final C31463tl m31481b() {
        C31463tl c31463tl = this.f82824f;
        if (c31463tl == null) {
            int i = C31463tl.f85739n;
            C31463tl m29109a = C31463tl.C31465b.m29109a(this.f82821c);
            this.f82824f = m29109a;
            return m29109a;
        }
        return c31463tl;
    }

    @NotNull
    /* renamed from: c */
    public final Map<Class<?>, Object> m31480c() {
        return this.f82823e;
    }

    @NotNull
    /* renamed from: d */
    public final zc0 m31479d() {
        return this.f82821c;
    }

    /* renamed from: e */
    public final boolean m31478e() {
        return this.f82819a.m31558h();
    }

    @NotNull
    /* renamed from: f */
    public final String m31477f() {
        return this.f82820b;
    }

    @NotNull
    /* renamed from: g */
    public final nf0 m31476g() {
        return this.f82819a;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f82820b);
        sb2.append(", url=");
        sb2.append(this.f82819a);
        if (this.f82821c.size() != 0) {
            sb2.append(", headers=[");
            int i = 0;
            for (Tuples<? extends String, ? extends String> tuples : this.f82821c) {
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
        if (!this.f82823e.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f82823e);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Nullable
    /* renamed from: a */
    public final String m31482a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f82821c.m26279a(name);
    }

    /* renamed from: com.yandex.mobile.ads.impl.nl1$a */
    /* loaded from: classes8.dex */
    public static class C30955a {
        @Nullable

        /* renamed from: a */
        private nf0 f82825a;
        @NotNull

        /* renamed from: b */
        private String f82826b;
        @NotNull

        /* renamed from: c */
        private zc0.C31971a f82827c;
        @Nullable

        /* renamed from: d */
        private ql1 f82828d;
        @NotNull

        /* renamed from: e */
        private Map<Class<?>, Object> f82829e;

        public C30955a() {
            this.f82829e = new LinkedHashMap();
            this.f82826b = "GET";
            this.f82827c = new zc0.C31971a();
        }

        @NotNull
        /* renamed from: a */
        public final void m31469a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            zc0.C31971a c31971a = this.f82827c;
            c31971a.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            zc0.C31972b.m26266b(name);
            zc0.C31972b.m26265b(value, name);
            c31971a.m26272a(name, value);
        }

        @NotNull
        /* renamed from: b */
        public final C30955a m31467b(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            zc0.C31971a c31971a = this.f82827c;
            c31971a.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            zc0.C31972b.m26266b(name);
            zc0.C31972b.m26265b(value, name);
            c31971a.m26273a(name);
            c31971a.m26272a(name, value);
            return this;
        }

        public C30955a(@NotNull nl1 request) {
            Map<Class<?>, Object> m17285D;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f82829e = new LinkedHashMap();
            this.f82825a = request.m31476g();
            this.f82826b = request.m31477f();
            this.f82828d = request.m31483a();
            if (!request.m31480c().isEmpty()) {
                m17285D = C37559r0.m17285D(request.m31480c());
            } else {
                m17285D = new LinkedHashMap<>();
            }
            this.f82829e = m17285D;
            this.f82827c = request.m31479d().m26278b();
        }

        @NotNull
        /* renamed from: a */
        public final nl1 m31475a() {
            Map unmodifiableMap;
            nf0 nf0Var = this.f82825a;
            if (nf0Var != null) {
                String str = this.f82826b;
                zc0 m26274a = this.f82827c.m26274a();
                ql1 ql1Var = this.f82828d;
                Map<Class<?>, Object> map = this.f82829e;
                byte[] bArr = z32.f88697a;
                Intrinsics.checkNotNullParameter(map, "<this>");
                if (map.isEmpty()) {
                    unmodifiableMap = C37559r0.m17284j();
                } else {
                    unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
                    Intrinsics.m17074g(unmodifiableMap);
                }
                return new nl1(nf0Var, str, m26274a, ql1Var, unmodifiableMap);
            }
            throw new IllegalStateException("url == null".toString());
        }

        @NotNull
        /* renamed from: a */
        public final void m31473a(@NotNull C31463tl cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String value = cacheControl.toString();
            if (value.length() == 0) {
                Intrinsics.checkNotNullParameter("Cache-Control", "name");
                this.f82827c.m26273a("Cache-Control");
                return;
            }
            Intrinsics.checkNotNullParameter("Cache-Control", "name");
            Intrinsics.checkNotNullParameter(value, "value");
            zc0.C31971a c31971a = this.f82827c;
            c31971a.getClass();
            Intrinsics.checkNotNullParameter("Cache-Control", "name");
            Intrinsics.checkNotNullParameter(value, "value");
            zc0.C31972b.m26266b("Cache-Control");
            zc0.C31972b.m26265b(value, "Cache-Control");
            c31971a.m26273a("Cache-Control");
            c31971a.m26272a("Cache-Control", value);
        }

        @NotNull
        /* renamed from: a */
        public final C30955a m31472a(@NotNull zc0 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f82827c = headers.m26278b();
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30955a m31470a(@NotNull String method, @Nullable ql1 ql1Var) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() > 0) {
                if (ql1Var == null) {
                    if (!(!hf0.m33566b(method))) {
                        throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                    }
                } else if (!hf0.m33567a(method)) {
                    throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
                }
                this.f82826b = method;
                this.f82828d = ql1Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        @NotNull
        /* renamed from: a */
        public final void m31471a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f82827c.m26273a(name);
        }

        @NotNull
        /* renamed from: a */
        public final C30955a m31474a(@NotNull nf0 url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f82825a = url;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30955a m31468a(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            String url2 = url.toString();
            Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
            Intrinsics.checkNotNullParameter(url2, "<this>");
            nf0 url3 = new nf0.C30938a().m31550a(null, url2).m31552a();
            Intrinsics.checkNotNullParameter(url3, "url");
            this.f82825a = url3;
            return this;
        }
    }
}
