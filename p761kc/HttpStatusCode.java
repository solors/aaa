package p761kc;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.maticoo.sdk.p405ad.utils.error.ErrorCode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kc.v */
/* loaded from: classes9.dex */
public final class HttpStatusCode implements Comparable<HttpStatusCode> {
    @NotNull

    /* renamed from: g0 */
    private static final List<HttpStatusCode> f99084g0;
    @NotNull

    /* renamed from: h0 */
    private static final Map<Integer, HttpStatusCode> f99086h0;

    /* renamed from: b */
    private final int f99105b;
    @NotNull

    /* renamed from: c */
    private final String f99106c;
    @NotNull

    /* renamed from: d */
    public static final C37493a f99078d = new C37493a(null);
    @NotNull

    /* renamed from: f */
    private static final HttpStatusCode f99081f = new HttpStatusCode(100, "Continue");
    @NotNull

    /* renamed from: g */
    private static final HttpStatusCode f99083g = new HttpStatusCode(101, "Switching Protocols");
    @NotNull

    /* renamed from: h */
    private static final HttpStatusCode f99085h = new HttpStatusCode(102, "Processing");
    @NotNull

    /* renamed from: i */
    private static final HttpStatusCode f99087i = new HttpStatusCode(200, "OK");
    @NotNull

    /* renamed from: j */
    private static final HttpStatusCode f99088j = new HttpStatusCode(201, "Created");
    @NotNull

    /* renamed from: k */
    private static final HttpStatusCode f99089k = new HttpStatusCode(202, "Accepted");
    @NotNull

    /* renamed from: l */
    private static final HttpStatusCode f99090l = new HttpStatusCode(203, "Non-Authoritative Information");
    @NotNull

    /* renamed from: m */
    private static final HttpStatusCode f99091m = new HttpStatusCode(204, "No Content");
    @NotNull

    /* renamed from: n */
    private static final HttpStatusCode f99092n = new HttpStatusCode(205, "Reset Content");
    @NotNull

    /* renamed from: o */
    private static final HttpStatusCode f99093o = new HttpStatusCode(206, "Partial Content");
    @NotNull

    /* renamed from: p */
    private static final HttpStatusCode f99094p = new HttpStatusCode(207, "Multi-Status");
    @NotNull

    /* renamed from: q */
    private static final HttpStatusCode f99095q = new HttpStatusCode(300, "Multiple Choices");
    @NotNull

    /* renamed from: r */
    private static final HttpStatusCode f99096r = new HttpStatusCode(301, "Moved Permanently");
    @NotNull

    /* renamed from: s */
    private static final HttpStatusCode f99097s = new HttpStatusCode(302, "Found");
    @NotNull

    /* renamed from: t */
    private static final HttpStatusCode f99098t = new HttpStatusCode(303, "See Other");
    @NotNull

    /* renamed from: u */
    private static final HttpStatusCode f99099u = new HttpStatusCode(304, "Not Modified");
    @NotNull

    /* renamed from: v */
    private static final HttpStatusCode f99100v = new HttpStatusCode(305, "Use Proxy");
    @NotNull

    /* renamed from: w */
    private static final HttpStatusCode f99101w = new HttpStatusCode(ErrorCode.CODE_SHOW_RESOURCE_ERROR, "Switch Proxy");
    @NotNull

    /* renamed from: x */
    private static final HttpStatusCode f99102x = new HttpStatusCode(307, "Temporary Redirect");
    @NotNull

    /* renamed from: y */
    private static final HttpStatusCode f99103y = new HttpStatusCode(308, "Permanent Redirect");
    @NotNull

    /* renamed from: z */
    private static final HttpStatusCode f99104z = new HttpStatusCode(400, "Bad Request");
    @NotNull

    /* renamed from: A */
    private static final HttpStatusCode f99049A = new HttpStatusCode(401, "Unauthorized");
    @NotNull

    /* renamed from: B */
    private static final HttpStatusCode f99050B = new HttpStatusCode(402, "Payment Required");
    @NotNull

    /* renamed from: C */
    private static final HttpStatusCode f99051C = new HttpStatusCode(403, "Forbidden");
    @NotNull

    /* renamed from: D */
    private static final HttpStatusCode f99052D = new HttpStatusCode(404, "Not Found");
    @NotNull

    /* renamed from: E */
    private static final HttpStatusCode f99053E = new HttpStatusCode(405, "Method Not Allowed");
    @NotNull

    /* renamed from: F */
    private static final HttpStatusCode f99054F = new HttpStatusCode(406, "Not Acceptable");
    @NotNull

    /* renamed from: G */
    private static final HttpStatusCode f99055G = new HttpStatusCode(407, "Proxy Authentication Required");
    @NotNull

    /* renamed from: H */
    private static final HttpStatusCode f99056H = new HttpStatusCode(408, "Request Timeout");
    @NotNull

    /* renamed from: I */
    private static final HttpStatusCode f99057I = new HttpStatusCode(409, "Conflict");
    @NotNull

    /* renamed from: J */
    private static final HttpStatusCode f99058J = new HttpStatusCode(410, "Gone");
    @NotNull

    /* renamed from: K */
    private static final HttpStatusCode f99059K = new HttpStatusCode(411, "Length Required");
    @NotNull

    /* renamed from: L */
    private static final HttpStatusCode f99060L = new HttpStatusCode(412, "Precondition Failed");
    @NotNull

    /* renamed from: M */
    private static final HttpStatusCode f99061M = new HttpStatusCode(413, "Payload Too Large");
    @NotNull

    /* renamed from: N */
    private static final HttpStatusCode f99062N = new HttpStatusCode(414, "Request-URI Too Long");
    @NotNull

    /* renamed from: O */
    private static final HttpStatusCode f99063O = new HttpStatusCode(415, "Unsupported Media Type");
    @NotNull

    /* renamed from: P */
    private static final HttpStatusCode f99064P = new HttpStatusCode(416, "Requested Range Not Satisfiable");
    @NotNull

    /* renamed from: Q */
    private static final HttpStatusCode f99065Q = new HttpStatusCode(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, "Expectation Failed");
    @NotNull

    /* renamed from: R */
    private static final HttpStatusCode f99066R = new HttpStatusCode(422, "Unprocessable Entity");
    @NotNull

    /* renamed from: S */
    private static final HttpStatusCode f99067S = new HttpStatusCode(423, "Locked");
    @NotNull

    /* renamed from: T */
    private static final HttpStatusCode f99068T = new HttpStatusCode(424, "Failed Dependency");
    @NotNull

    /* renamed from: U */
    private static final HttpStatusCode f99069U = new HttpStatusCode(425, "Too Early");
    @NotNull

    /* renamed from: V */
    private static final HttpStatusCode f99070V = new HttpStatusCode(426, "Upgrade Required");
    @NotNull

    /* renamed from: W */
    private static final HttpStatusCode f99071W = new HttpStatusCode(com.mobilefuse.sdk.network.client.HttpStatusCode.TOO_MANY_REQUESTS, "Too Many Requests");
    @NotNull

    /* renamed from: X */
    private static final HttpStatusCode f99072X = new HttpStatusCode(431, "Request Header Fields Too Large");
    @NotNull

    /* renamed from: Y */
    private static final HttpStatusCode f99073Y = new HttpStatusCode(500, "Internal Server Error");
    @NotNull

    /* renamed from: Z */
    private static final HttpStatusCode f99074Z = new HttpStatusCode(501, "Not Implemented");
    @NotNull

    /* renamed from: a0 */
    private static final HttpStatusCode f99075a0 = new HttpStatusCode(502, "Bad Gateway");
    @NotNull

    /* renamed from: b0 */
    private static final HttpStatusCode f99076b0 = new HttpStatusCode(503, "Service Unavailable");
    @NotNull

    /* renamed from: c0 */
    private static final HttpStatusCode f99077c0 = new HttpStatusCode(504, "Gateway Timeout");
    @NotNull

    /* renamed from: d0 */
    private static final HttpStatusCode f99079d0 = new HttpStatusCode(505, "HTTP Version Not Supported");
    @NotNull

    /* renamed from: e0 */
    private static final HttpStatusCode f99080e0 = new HttpStatusCode(506, "Variant Also Negotiates");
    @NotNull

    /* renamed from: f0 */
    private static final HttpStatusCode f99082f0 = new HttpStatusCode(507, "Insufficient Storage");

    /* compiled from: HttpStatusCode.kt */
    @Metadata
    /* renamed from: kc.v$a */
    /* loaded from: classes9.dex */
    public static final class C37493a {
        private C37493a() {
        }

        public /* synthetic */ C37493a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: A */
        public final HttpStatusCode m17793A() {
            return HttpStatusCode.f99099u;
        }

        @NotNull
        /* renamed from: B */
        public final HttpStatusCode m17792B() {
            return HttpStatusCode.f99087i;
        }

        @NotNull
        /* renamed from: C */
        public final HttpStatusCode m17791C() {
            return HttpStatusCode.f99093o;
        }

        @NotNull
        /* renamed from: D */
        public final HttpStatusCode m17790D() {
            return HttpStatusCode.f99061M;
        }

        @NotNull
        /* renamed from: E */
        public final HttpStatusCode m17789E() {
            return HttpStatusCode.f99050B;
        }

        @NotNull
        /* renamed from: F */
        public final HttpStatusCode m17788F() {
            return HttpStatusCode.f99103y;
        }

        @NotNull
        /* renamed from: G */
        public final HttpStatusCode m17787G() {
            return HttpStatusCode.f99060L;
        }

        @NotNull
        /* renamed from: H */
        public final HttpStatusCode m17786H() {
            return HttpStatusCode.f99085h;
        }

        @NotNull
        /* renamed from: I */
        public final HttpStatusCode m17785I() {
            return HttpStatusCode.f99055G;
        }

        @NotNull
        /* renamed from: J */
        public final HttpStatusCode m17784J() {
            return HttpStatusCode.f99072X;
        }

        @NotNull
        /* renamed from: K */
        public final HttpStatusCode m17783K() {
            return HttpStatusCode.f99056H;
        }

        @NotNull
        /* renamed from: L */
        public final HttpStatusCode m17782L() {
            return HttpStatusCode.f99062N;
        }

        @NotNull
        /* renamed from: M */
        public final HttpStatusCode m17781M() {
            return HttpStatusCode.f99064P;
        }

        @NotNull
        /* renamed from: N */
        public final HttpStatusCode m17780N() {
            return HttpStatusCode.f99092n;
        }

        @NotNull
        /* renamed from: O */
        public final HttpStatusCode m17779O() {
            return HttpStatusCode.f99098t;
        }

        @NotNull
        /* renamed from: P */
        public final HttpStatusCode m17778P() {
            return HttpStatusCode.f99076b0;
        }

        @NotNull
        /* renamed from: Q */
        public final HttpStatusCode m17777Q() {
            return HttpStatusCode.f99101w;
        }

        @NotNull
        /* renamed from: R */
        public final HttpStatusCode m17776R() {
            return HttpStatusCode.f99083g;
        }

        @NotNull
        /* renamed from: S */
        public final HttpStatusCode m17775S() {
            return HttpStatusCode.f99102x;
        }

        @NotNull
        /* renamed from: T */
        public final HttpStatusCode m17774T() {
            return HttpStatusCode.f99069U;
        }

        @NotNull
        /* renamed from: U */
        public final HttpStatusCode m17773U() {
            return HttpStatusCode.f99071W;
        }

        @NotNull
        /* renamed from: V */
        public final HttpStatusCode m17772V() {
            return HttpStatusCode.f99049A;
        }

        @NotNull
        /* renamed from: W */
        public final HttpStatusCode m17771W() {
            return HttpStatusCode.f99066R;
        }

        @NotNull
        /* renamed from: X */
        public final HttpStatusCode m17770X() {
            return HttpStatusCode.f99063O;
        }

        @NotNull
        /* renamed from: Y */
        public final HttpStatusCode m17769Y() {
            return HttpStatusCode.f99070V;
        }

        @NotNull
        /* renamed from: Z */
        public final HttpStatusCode m17768Z() {
            return HttpStatusCode.f99100v;
        }

        @NotNull
        /* renamed from: a */
        public final HttpStatusCode m17767a(int i) {
            HttpStatusCode httpStatusCode = (HttpStatusCode) HttpStatusCode.f99086h0.get(Integer.valueOf(i));
            if (httpStatusCode == null) {
                return new HttpStatusCode(i, "Unknown Status Code");
            }
            return httpStatusCode;
        }

        @NotNull
        /* renamed from: a0 */
        public final HttpStatusCode m17766a0() {
            return HttpStatusCode.f99080e0;
        }

        @NotNull
        /* renamed from: b */
        public final HttpStatusCode m17765b() {
            return HttpStatusCode.f99089k;
        }

        @NotNull
        /* renamed from: b0 */
        public final HttpStatusCode m17764b0() {
            return HttpStatusCode.f99079d0;
        }

        @NotNull
        /* renamed from: c */
        public final HttpStatusCode m17763c() {
            return HttpStatusCode.f99075a0;
        }

        @NotNull
        /* renamed from: d */
        public final HttpStatusCode m17762d() {
            return HttpStatusCode.f99104z;
        }

        @NotNull
        /* renamed from: e */
        public final HttpStatusCode m17761e() {
            return HttpStatusCode.f99057I;
        }

        @NotNull
        /* renamed from: f */
        public final HttpStatusCode m17760f() {
            return HttpStatusCode.f99081f;
        }

        @NotNull
        /* renamed from: g */
        public final HttpStatusCode m17759g() {
            return HttpStatusCode.f99088j;
        }

        @NotNull
        /* renamed from: h */
        public final HttpStatusCode m17758h() {
            return HttpStatusCode.f99065Q;
        }

        @NotNull
        /* renamed from: i */
        public final HttpStatusCode m17757i() {
            return HttpStatusCode.f99068T;
        }

        @NotNull
        /* renamed from: j */
        public final HttpStatusCode m17756j() {
            return HttpStatusCode.f99051C;
        }

        @NotNull
        /* renamed from: k */
        public final HttpStatusCode m17755k() {
            return HttpStatusCode.f99097s;
        }

        @NotNull
        /* renamed from: l */
        public final HttpStatusCode m17754l() {
            return HttpStatusCode.f99077c0;
        }

        @NotNull
        /* renamed from: m */
        public final HttpStatusCode m17753m() {
            return HttpStatusCode.f99058J;
        }

        @NotNull
        /* renamed from: n */
        public final HttpStatusCode m17752n() {
            return HttpStatusCode.f99082f0;
        }

        @NotNull
        /* renamed from: o */
        public final HttpStatusCode m17751o() {
            return HttpStatusCode.f99073Y;
        }

        @NotNull
        /* renamed from: p */
        public final HttpStatusCode m17750p() {
            return HttpStatusCode.f99059K;
        }

        @NotNull
        /* renamed from: q */
        public final HttpStatusCode m17749q() {
            return HttpStatusCode.f99067S;
        }

        @NotNull
        /* renamed from: r */
        public final HttpStatusCode m17748r() {
            return HttpStatusCode.f99053E;
        }

        @NotNull
        /* renamed from: s */
        public final HttpStatusCode m17747s() {
            return HttpStatusCode.f99096r;
        }

        @NotNull
        /* renamed from: t */
        public final HttpStatusCode m17746t() {
            return HttpStatusCode.f99094p;
        }

        @NotNull
        /* renamed from: u */
        public final HttpStatusCode m17745u() {
            return HttpStatusCode.f99095q;
        }

        @NotNull
        /* renamed from: v */
        public final HttpStatusCode m17744v() {
            return HttpStatusCode.f99091m;
        }

        @NotNull
        /* renamed from: w */
        public final HttpStatusCode m17743w() {
            return HttpStatusCode.f99090l;
        }

        @NotNull
        /* renamed from: x */
        public final HttpStatusCode m17742x() {
            return HttpStatusCode.f99054F;
        }

        @NotNull
        /* renamed from: y */
        public final HttpStatusCode m17741y() {
            return HttpStatusCode.f99052D;
        }

        @NotNull
        /* renamed from: z */
        public final HttpStatusCode m17740z() {
            return HttpStatusCode.f99074Z;
        }
    }

    static {
        int m17154x;
        int m17292f;
        int m16917e;
        List<HttpStatusCode> m17739a = C37494w.m17739a();
        f99084g0 = m17739a;
        List<HttpStatusCode> list = m17739a;
        m17154x = C37566w.m17154x(list, 10);
        m17292f = MapsJVM.m17292f(m17154x);
        m16917e = _Ranges.m16917e(m17292f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((HttpStatusCode) obj).f99105b), obj);
        }
        f99086h0 = linkedHashMap;
    }

    public HttpStatusCode(int i, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f99105b = i;
        this.f99106c = description;
    }

    @Override // java.lang.Comparable
    /* renamed from: d0 */
    public int compareTo(@NotNull HttpStatusCode other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f99105b - other.f99105b;
    }

    /* renamed from: e0 */
    public final int m17815e0() {
        return this.f99105b;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof HttpStatusCode) && ((HttpStatusCode) obj).f99105b == this.f99105b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.f99105b);
    }

    @NotNull
    public String toString() {
        return this.f99105b + ' ' + this.f99106c;
    }
}
