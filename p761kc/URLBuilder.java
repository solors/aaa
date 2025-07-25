package p761kc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kc.f0 */
/* loaded from: classes9.dex */
public final class URLBuilder {
    @NotNull

    /* renamed from: k */
    public static final C37458a f98865k;
    @NotNull

    /* renamed from: l */
    private static final Url f98866l;
    @NotNull

    /* renamed from: a */
    private URLProtocol f98867a;
    @NotNull

    /* renamed from: b */
    private String f98868b;

    /* renamed from: c */
    private int f98869c;

    /* renamed from: d */
    private boolean f98870d;
    @Nullable

    /* renamed from: e */
    private String f98871e;
    @Nullable

    /* renamed from: f */
    private String f98872f;
    @NotNull

    /* renamed from: g */
    private String f98873g;
    @NotNull

    /* renamed from: h */
    private List<String> f98874h;
    @NotNull

    /* renamed from: i */
    private Parameters f98875i;
    @NotNull

    /* renamed from: j */
    private Parameters f98876j;

    /* compiled from: URLBuilder.kt */
    @Metadata
    /* renamed from: kc.f0$a */
    /* loaded from: classes9.dex */
    public static final class C37458a {
        private C37458a() {
        }

        public /* synthetic */ C37458a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C37458a c37458a = new C37458a(null);
        f98865k = c37458a;
        f98866l = URLUtils.m17916c(URLBuilderJvm.m17975a(c37458a));
    }

    public URLBuilder(@NotNull URLProtocol protocol, @NotNull String host, int i, @Nullable String str, @Nullable String str2, @NotNull List<String> pathSegments, @NotNull InterfaceC37497z parameters, @NotNull String fragment, boolean z) {
        int m17154x;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f98867a = protocol;
        this.f98868b = host;
        this.f98869c = i;
        this.f98870d = z;
        this.f98871e = str != null ? C37445b.m18035m(str, false, 1, null) : null;
        this.f98872f = str2 != null ? C37445b.m18035m(str2, false, 1, null) : null;
        this.f98873g = C37445b.m18030r(fragment, false, false, null, 7, null);
        List<String> list = pathSegments;
        m17154x = C37566w.m17154x(list, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (String str3 : list) {
            arrayList.add(C37445b.m18032p(str3));
        }
        this.f98874h = arrayList;
        Parameters m17866e = C37488r0.m17866e(parameters);
        this.f98875i = m17866e;
        this.f98876j = new UrlDecodedParametersBuilder(m17866e);
    }

    /* renamed from: a */
    private final void m18003a() {
        boolean z;
        if (this.f98868b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !Intrinsics.m17075f(this.f98867a.m17936d(), "file")) {
            Url url = f98866l;
            this.f98868b = url.m17878g();
            if (Intrinsics.m17075f(this.f98867a, URLProtocol.f98892c.m17933c())) {
                this.f98867a = url.m17874k();
            }
            if (this.f98869c == 0) {
                this.f98869c = url.m17873l();
            }
        }
    }

    /* renamed from: A */
    public final void m18004A(@Nullable String str) {
        String str2 = null;
        if (str != null) {
            str2 = C37445b.m18035m(str, false, 1, null);
        }
        this.f98871e = str2;
    }

    @NotNull
    /* renamed from: b */
    public final Url m18002b() {
        m18003a();
        return new Url(this.f98867a, this.f98868b, this.f98869c, m17991m(), this.f98876j.build(), m17995i(), m17987q(), m17992l(), this.f98870d, m18001c());
    }

    @NotNull
    /* renamed from: c */
    public final String m18001c() {
        Appendable m17969d;
        m18003a();
        m17969d = C37460h0.m17969d(this, new StringBuilder(256));
        String sb2 = ((StringBuilder) m17969d).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "appendTo(StringBuilder(256)).toString()");
        return sb2;
    }

    @NotNull
    /* renamed from: d */
    public final String m18000d() {
        return this.f98873g;
    }

    @NotNull
    /* renamed from: e */
    public final Parameters m17999e() {
        return this.f98875i;
    }

    @Nullable
    /* renamed from: f */
    public final String m17998f() {
        return this.f98872f;
    }

    @NotNull
    /* renamed from: g */
    public final List<String> m17997g() {
        return this.f98874h;
    }

    @Nullable
    /* renamed from: h */
    public final String m17996h() {
        return this.f98871e;
    }

    @NotNull
    /* renamed from: i */
    public final String m17995i() {
        return C37445b.m18037k(this.f98873g, 0, 0, false, null, 15, null);
    }

    @NotNull
    /* renamed from: j */
    public final String m17994j() {
        return this.f98868b;
    }

    @NotNull
    /* renamed from: k */
    public final Parameters m17993k() {
        return this.f98876j;
    }

    @Nullable
    /* renamed from: l */
    public final String m17992l() {
        String str = this.f98872f;
        if (str != null) {
            return C37445b.m18039i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    @NotNull
    /* renamed from: m */
    public final List<String> m17991m() {
        int m17154x;
        List<String> list = this.f98874h;
        m17154x = C37566w.m17154x(list, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (String str : list) {
            arrayList.add(C37445b.m18039i(str, 0, 0, null, 7, null));
        }
        return arrayList;
    }

    /* renamed from: n */
    public final int m17990n() {
        return this.f98869c;
    }

    @NotNull
    /* renamed from: o */
    public final URLProtocol m17989o() {
        return this.f98867a;
    }

    /* renamed from: p */
    public final boolean m17988p() {
        return this.f98870d;
    }

    @Nullable
    /* renamed from: q */
    public final String m17987q() {
        String str = this.f98871e;
        if (str != null) {
            return C37445b.m18039i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    /* renamed from: r */
    public final void m17986r(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f98873g = str;
    }

    /* renamed from: s */
    public final void m17985s(@NotNull Parameters value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f98875i = value;
        this.f98876j = new UrlDecodedParametersBuilder(value);
    }

    /* renamed from: t */
    public final void m17984t(@Nullable String str) {
        this.f98872f = str;
    }

    @NotNull
    public String toString() {
        Appendable m17969d;
        m17969d = C37460h0.m17969d(this, new StringBuilder(256));
        String sb2 = ((StringBuilder) m17969d).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "appendTo(StringBuilder(256)).toString()");
        return sb2;
    }

    /* renamed from: u */
    public final void m17983u(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f98874h = list;
    }

    /* renamed from: v */
    public final void m17982v(@Nullable String str) {
        this.f98871e = str;
    }

    /* renamed from: w */
    public final void m17981w(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f98868b = str;
    }

    /* renamed from: x */
    public final void m17980x(int i) {
        this.f98869c = i;
    }

    /* renamed from: y */
    public final void m17979y(@NotNull URLProtocol uRLProtocol) {
        Intrinsics.checkNotNullParameter(uRLProtocol, "<set-?>");
        this.f98867a = uRLProtocol;
    }

    /* renamed from: z */
    public final void m17978z(boolean z) {
        this.f98870d = z;
    }

    public /* synthetic */ URLBuilder(URLProtocol uRLProtocol, String str, int i, String str2, String str3, List list, InterfaceC37497z interfaceC37497z, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? URLProtocol.f98892c.m17933c() : uRLProtocol, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str2, (i2 & 16) == 0 ? str3 : null, (i2 & 32) != 0 ? C37563v.m17166m() : list, (i2 & 64) != 0 ? InterfaceC37497z.f99111b.m17738a() : interfaceC37497z, (i2 & 128) == 0 ? str4 : "", (i2 & 256) == 0 ? z : false);
    }
}
