package p761kc;

import com.google.common.net.HttpHeaders;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpHeaders.kt */
@Metadata
/* renamed from: kc.o */
/* loaded from: classes9.dex */
public final class C37477o {
    @NotNull

    /* renamed from: V0 */
    private static final String[] f98947V0;
    @NotNull

    /* renamed from: W0 */
    private static final List<String> f98949W0;
    @NotNull

    /* renamed from: a */
    public static final C37477o f98953a = new C37477o();
    @NotNull

    /* renamed from: b */
    private static final String f98955b = "Accept";
    @NotNull

    /* renamed from: c */
    private static final String f98957c = HttpHeaders.ACCEPT_CHARSET;
    @NotNull

    /* renamed from: d */
    private static final String f98959d = "Accept-Encoding";
    @NotNull

    /* renamed from: e */
    private static final String f98961e = "Accept-Language";
    @NotNull

    /* renamed from: f */
    private static final String f98963f = HttpHeaders.ACCEPT_RANGES;
    @NotNull

    /* renamed from: g */
    private static final String f98965g = HttpHeaders.AGE;
    @NotNull

    /* renamed from: h */
    private static final String f98967h = HttpHeaders.ALLOW;
    @NotNull

    /* renamed from: i */
    private static final String f98969i = "ALPN";
    @NotNull

    /* renamed from: j */
    private static final String f98971j = "Authentication-Info";
    @NotNull

    /* renamed from: k */
    private static final String f98973k = "Authorization";
    @NotNull

    /* renamed from: l */
    private static final String f98975l = "Cache-Control";
    @NotNull

    /* renamed from: m */
    private static final String f98977m = "Connection";
    @NotNull

    /* renamed from: n */
    private static final String f98979n = "Content-Disposition";
    @NotNull

    /* renamed from: o */
    private static final String f98981o = "Content-Encoding";
    @NotNull

    /* renamed from: p */
    private static final String f98983p = HttpHeaders.CONTENT_LANGUAGE;
    @NotNull

    /* renamed from: q */
    private static final String f98985q = "Content-Length";
    @NotNull

    /* renamed from: r */
    private static final String f98987r = HttpHeaders.CONTENT_LOCATION;
    @NotNull

    /* renamed from: s */
    private static final String f98989s = "Content-Range";
    @NotNull

    /* renamed from: t */
    private static final String f98991t = "Content-Type";
    @NotNull

    /* renamed from: u */
    private static final String f98993u = "Cookie";
    @NotNull

    /* renamed from: v */
    private static final String f98995v = "DASL";
    @NotNull

    /* renamed from: w */
    private static final String f98997w = "Date";
    @NotNull

    /* renamed from: x */
    private static final String f98999x = "DAV";
    @NotNull

    /* renamed from: y */
    private static final String f99001y = "Depth";
    @NotNull

    /* renamed from: z */
    private static final String f99003z = "Destination";
    @NotNull

    /* renamed from: A */
    private static final String f98904A = "ETag";
    @NotNull

    /* renamed from: B */
    private static final String f98906B = HttpHeaders.EXPECT;
    @NotNull

    /* renamed from: C */
    private static final String f98908C = "Expires";
    @NotNull

    /* renamed from: D */
    private static final String f98910D = HttpHeaders.FROM;
    @NotNull

    /* renamed from: E */
    private static final String f98912E = HttpHeaders.FORWARDED;
    @NotNull

    /* renamed from: F */
    private static final String f98914F = "Host";
    @NotNull

    /* renamed from: G */
    private static final String f98916G = HttpHeaders.HTTP2_SETTINGS;
    @NotNull

    /* renamed from: H */
    private static final String f98918H = "If";
    @NotNull

    /* renamed from: I */
    private static final String f98920I = HttpHeaders.IF_MATCH;
    @NotNull

    /* renamed from: J */
    private static final String f98922J = "If-Modified-Since";
    @NotNull

    /* renamed from: K */
    private static final String f98924K = "If-None-Match";
    @NotNull

    /* renamed from: L */
    private static final String f98926L = HttpHeaders.IF_RANGE;
    @NotNull

    /* renamed from: M */
    private static final String f98928M = "If-Schedule-Tag-Match";
    @NotNull

    /* renamed from: N */
    private static final String f98930N = HttpHeaders.IF_UNMODIFIED_SINCE;
    @NotNull

    /* renamed from: O */
    private static final String f98932O = "Last-Modified";
    @NotNull

    /* renamed from: P */
    private static final String f98934P = "Location";
    @NotNull

    /* renamed from: Q */
    private static final String f98936Q = "Lock-Token";
    @NotNull

    /* renamed from: R */
    private static final String f98938R = HttpHeaders.LINK;
    @NotNull

    /* renamed from: S */
    private static final String f98940S = HttpHeaders.MAX_FORWARDS;
    @NotNull

    /* renamed from: T */
    private static final String f98942T = "MIME-Version";
    @NotNull

    /* renamed from: U */
    private static final String f98944U = "Ordering-Type";
    @NotNull

    /* renamed from: V */
    private static final String f98946V = HttpHeaders.ORIGIN;
    @NotNull

    /* renamed from: W */
    private static final String f98948W = "Overwrite";
    @NotNull

    /* renamed from: X */
    private static final String f98950X = "Position";
    @NotNull

    /* renamed from: Y */
    private static final String f98951Y = HttpHeaders.PRAGMA;
    @NotNull

    /* renamed from: Z */
    private static final String f98952Z = "Prefer";
    @NotNull

    /* renamed from: a0 */
    private static final String f98954a0 = "Preference-Applied";
    @NotNull

    /* renamed from: b0 */
    private static final String f98956b0 = HttpHeaders.PROXY_AUTHENTICATE;
    @NotNull

    /* renamed from: c0 */
    private static final String f98958c0 = "Proxy-Authentication-Info";
    @NotNull

    /* renamed from: d0 */
    private static final String f98960d0 = HttpHeaders.PROXY_AUTHORIZATION;
    @NotNull

    /* renamed from: e0 */
    private static final String f98962e0 = HttpHeaders.PUBLIC_KEY_PINS;
    @NotNull

    /* renamed from: f0 */
    private static final String f98964f0 = HttpHeaders.PUBLIC_KEY_PINS_REPORT_ONLY;
    @NotNull

    /* renamed from: g0 */
    private static final String f98966g0 = "Range";
    @NotNull

    /* renamed from: h0 */
    private static final String f98968h0 = HttpHeaders.REFERER;
    @NotNull

    /* renamed from: i0 */
    private static final String f98970i0 = HttpHeaders.RETRY_AFTER;
    @NotNull

    /* renamed from: j0 */
    private static final String f98972j0 = "Schedule-Reply";
    @NotNull

    /* renamed from: k0 */
    private static final String f98974k0 = "Schedule-Tag";
    @NotNull

    /* renamed from: l0 */
    private static final String f98976l0 = HttpHeaders.SEC_WEBSOCKET_ACCEPT;
    @NotNull

    /* renamed from: m0 */
    private static final String f98978m0 = HttpHeaders.SEC_WEBSOCKET_EXTENSIONS;
    @NotNull

    /* renamed from: n0 */
    private static final String f98980n0 = HttpHeaders.SEC_WEBSOCKET_KEY;
    @NotNull

    /* renamed from: o0 */
    private static final String f98982o0 = HttpHeaders.SEC_WEBSOCKET_PROTOCOL;
    @NotNull

    /* renamed from: p0 */
    private static final String f98984p0 = HttpHeaders.SEC_WEBSOCKET_VERSION;
    @NotNull

    /* renamed from: q0 */
    private static final String f98986q0 = HttpHeaders.SERVER;
    @NotNull

    /* renamed from: r0 */
    private static final String f98988r0 = "Set-Cookie";
    @NotNull

    /* renamed from: s0 */
    private static final String f98990s0 = "SLUG";
    @NotNull

    /* renamed from: t0 */
    private static final String f98992t0 = HttpHeaders.STRICT_TRANSPORT_SECURITY;
    @NotNull

    /* renamed from: u0 */
    private static final String f98994u0 = HttpHeaders.f41388TE;
    @NotNull

    /* renamed from: v0 */
    private static final String f98996v0 = AndroidInitializeBoldSDK.MSG_TIMEOUT;
    @NotNull

    /* renamed from: w0 */
    private static final String f98998w0 = HttpHeaders.TRAILER;
    @NotNull

    /* renamed from: x0 */
    private static final String f99000x0 = HttpHeaders.TRANSFER_ENCODING;
    @NotNull

    /* renamed from: y0 */
    private static final String f99002y0 = HttpHeaders.UPGRADE;
    @NotNull

    /* renamed from: z0 */
    private static final String f99004z0 = "User-Agent";
    @NotNull

    /* renamed from: A0 */
    private static final String f98905A0 = HttpHeaders.VARY;
    @NotNull

    /* renamed from: B0 */
    private static final String f98907B0 = HttpHeaders.VIA;
    @NotNull

    /* renamed from: C0 */
    private static final String f98909C0 = HttpHeaders.WARNING;
    @NotNull

    /* renamed from: D0 */
    private static final String f98911D0 = HttpHeaders.WWW_AUTHENTICATE;
    @NotNull

    /* renamed from: E0 */
    private static final String f98913E0 = HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN;
    @NotNull

    /* renamed from: F0 */
    private static final String f98915F0 = HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS;
    @NotNull

    /* renamed from: G0 */
    private static final String f98917G0 = HttpHeaders.ACCESS_CONTROL_ALLOW_CREDENTIALS;
    @NotNull

    /* renamed from: H0 */
    private static final String f98919H0 = HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS;
    @NotNull

    /* renamed from: I0 */
    private static final String f98921I0 = HttpHeaders.ACCESS_CONTROL_REQUEST_METHOD;
    @NotNull

    /* renamed from: J0 */
    private static final String f98923J0 = HttpHeaders.ACCESS_CONTROL_REQUEST_HEADERS;
    @NotNull

    /* renamed from: K0 */
    private static final String f98925K0 = HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS;
    @NotNull

    /* renamed from: L0 */
    private static final String f98927L0 = HttpHeaders.ACCESS_CONTROL_MAX_AGE;
    @NotNull

    /* renamed from: M0 */
    private static final String f98929M0 = "X-Http-Method-Override";
    @NotNull

    /* renamed from: N0 */
    private static final String f98931N0 = HttpHeaders.X_FORWARDED_HOST;
    @NotNull

    /* renamed from: O0 */
    private static final String f98933O0 = "X-Forwarded-Server";
    @NotNull

    /* renamed from: P0 */
    private static final String f98935P0 = HttpHeaders.X_FORWARDED_PROTO;
    @NotNull

    /* renamed from: Q0 */
    private static final String f98937Q0 = HttpHeaders.X_FORWARDED_FOR;
    @NotNull

    /* renamed from: R0 */
    private static final String f98939R0 = HttpHeaders.X_FORWARDED_PORT;
    @NotNull

    /* renamed from: S0 */
    private static final String f98941S0 = HttpHeaders.X_REQUEST_ID;
    @NotNull

    /* renamed from: T0 */
    private static final String f98943T0 = "X-Correlation-ID";
    @NotNull

    /* renamed from: U0 */
    private static final String f98945U0 = "X-Total-Count";

    static {
        List<String> m17399f;
        String[] strArr = {HttpHeaders.TRANSFER_ENCODING, HttpHeaders.UPGRADE};
        f98947V0 = strArr;
        m17399f = _ArraysJvm.m17399f(strArr);
        f98949W0 = m17399f;
    }

    private C37477o() {
    }

    /* renamed from: a */
    public final void m17909a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i = 0;
        int i2 = 0;
        while (i < name.length()) {
            char charAt = name.charAt(i);
            int i3 = i2 + 1;
            if (Intrinsics.m17071j(charAt, 32) > 0 && !C37479p.m17886a(charAt)) {
                i++;
                i2 = i3;
            } else {
                throw new C37495x(name, i2);
            }
        }
    }

    /* renamed from: b */
    public final void m17908b(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i = 0;
        int i2 = 0;
        while (i < value.length()) {
            char charAt = value.charAt(i);
            int i3 = i2 + 1;
            if (Intrinsics.m17071j(charAt, 32) < 0 && charAt != '\t') {
                throw new C37496y(value, i2);
            }
            i++;
            i2 = i3;
        }
    }

    @NotNull
    /* renamed from: c */
    public final String m17907c() {
        return f98955b;
    }

    @NotNull
    /* renamed from: d */
    public final String m17906d() {
        return f98957c;
    }

    @NotNull
    /* renamed from: e */
    public final String m17905e() {
        return f98973k;
    }

    @NotNull
    /* renamed from: f */
    public final String m17904f() {
        return f98981o;
    }

    @NotNull
    /* renamed from: g */
    public final String m17903g() {
        return f98985q;
    }

    @NotNull
    /* renamed from: h */
    public final String m17902h() {
        return f98989s;
    }

    @NotNull
    /* renamed from: i */
    public final String m17901i() {
        return f98991t;
    }

    @NotNull
    /* renamed from: j */
    public final String m17900j() {
        return f98993u;
    }

    @NotNull
    /* renamed from: k */
    public final String m17899k() {
        return f98997w;
    }

    @NotNull
    /* renamed from: l */
    public final String m17898l() {
        return f98904A;
    }

    @NotNull
    /* renamed from: m */
    public final String m17897m() {
        return f98908C;
    }

    @NotNull
    /* renamed from: n */
    public final String m17896n() {
        return f98922J;
    }

    @NotNull
    /* renamed from: o */
    public final String m17895o() {
        return f98926L;
    }

    @NotNull
    /* renamed from: p */
    public final String m17894p() {
        return f98930N;
    }

    @NotNull
    /* renamed from: q */
    public final String m17893q() {
        return f98932O;
    }

    @NotNull
    /* renamed from: r */
    public final String m17892r() {
        return f98934P;
    }

    @NotNull
    /* renamed from: s */
    public final String m17891s() {
        return f98966g0;
    }

    @NotNull
    /* renamed from: t */
    public final String m17890t() {
        return f98970i0;
    }

    @NotNull
    /* renamed from: u */
    public final String m17889u() {
        return f99000x0;
    }

    @NotNull
    /* renamed from: v */
    public final List<String> m17888v() {
        return f98949W0;
    }

    @NotNull
    /* renamed from: w */
    public final String m17887w() {
        return f99004z0;
    }
}
