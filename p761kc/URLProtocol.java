package p761kc;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import mc.C38281y;
import mc.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kc.l0 */
/* loaded from: classes9.dex */
public final class URLProtocol {
    @NotNull

    /* renamed from: c */
    public static final C37470a f98892c = new C37470a(null);
    @NotNull

    /* renamed from: d */
    private static final URLProtocol f98893d;
    @NotNull

    /* renamed from: e */
    private static final URLProtocol f98894e;
    @NotNull

    /* renamed from: f */
    private static final URLProtocol f98895f;
    @NotNull

    /* renamed from: g */
    private static final URLProtocol f98896g;
    @NotNull

    /* renamed from: h */
    private static final URLProtocol f98897h;
    @NotNull

    /* renamed from: i */
    private static final Map<String, URLProtocol> f98898i;
    @NotNull

    /* renamed from: a */
    private final String f98899a;

    /* renamed from: b */
    private final int f98900b;

    /* compiled from: URLProtocol.kt */
    @Metadata
    /* renamed from: kc.l0$a */
    /* loaded from: classes9.dex */
    public static final class C37470a {
        private C37470a() {
        }

        public /* synthetic */ C37470a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final URLProtocol m17935a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            String m15185c = C38281y.m15185c(name);
            URLProtocol uRLProtocol = URLProtocol.f98892c.m17934b().get(m15185c);
            if (uRLProtocol == null) {
                return new URLProtocol(m15185c, 0);
            }
            return uRLProtocol;
        }

        @NotNull
        /* renamed from: b */
        public final Map<String, URLProtocol> m17934b() {
            return URLProtocol.f98898i;
        }

        @NotNull
        /* renamed from: c */
        public final URLProtocol m17933c() {
            return URLProtocol.f98893d;
        }
    }

    static {
        List m17163p;
        int m17154x;
        int m17292f;
        int m16917e;
        URLProtocol uRLProtocol = new URLProtocol("http", 80);
        f98893d = uRLProtocol;
        URLProtocol uRLProtocol2 = new URLProtocol("https", 443);
        f98894e = uRLProtocol2;
        URLProtocol uRLProtocol3 = new URLProtocol("ws", 80);
        f98895f = uRLProtocol3;
        URLProtocol uRLProtocol4 = new URLProtocol("wss", 443);
        f98896g = uRLProtocol4;
        URLProtocol uRLProtocol5 = new URLProtocol("socks", 1080);
        f98897h = uRLProtocol5;
        m17163p = C37563v.m17163p(uRLProtocol, uRLProtocol2, uRLProtocol3, uRLProtocol4, uRLProtocol5);
        List list = m17163p;
        m17154x = C37566w.m17154x(list, 10);
        m17292f = MapsJVM.m17292f(m17154x);
        m16917e = _Ranges.m16917e(m17292f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
        for (Object obj : list) {
            linkedHashMap.put(((URLProtocol) obj).f98899a, obj);
        }
        f98898i = linkedHashMap;
    }

    public URLProtocol(@NotNull String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f98899a = name;
        this.f98900b = i;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < name.length()) {
                if (!Charset.m15233a(name.charAt(i2))) {
                    break;
                }
                i2++;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException("All characters should be lower case".toString());
    }

    /* renamed from: c */
    public final int m17937c() {
        return this.f98900b;
    }

    @NotNull
    /* renamed from: d */
    public final String m17936d() {
        return this.f98899a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URLProtocol)) {
            return false;
        }
        URLProtocol uRLProtocol = (URLProtocol) obj;
        if (Intrinsics.m17075f(this.f98899a, uRLProtocol.f98899a) && this.f98900b == uRLProtocol.f98900b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f98899a.hashCode() * 31) + Integer.hashCode(this.f98900b);
    }

    @NotNull
    public String toString() {
        return "URLProtocol(name=" + this.f98899a + ", defaultPort=" + this.f98900b + ')';
    }
}
