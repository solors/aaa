package p761kc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: kc.p0 */
/* loaded from: classes9.dex */
public final class Url {
    @NotNull

    /* renamed from: q */
    public static final C37480a f99005q = new C37480a(null);
    @NotNull

    /* renamed from: a */
    private final URLProtocol f99006a;
    @NotNull

    /* renamed from: b */
    private final String f99007b;

    /* renamed from: c */
    private final int f99008c;
    @NotNull

    /* renamed from: d */
    private final List<String> f99009d;
    @NotNull

    /* renamed from: e */
    private final InterfaceC37497z f99010e;
    @NotNull

    /* renamed from: f */
    private final String f99011f;
    @Nullable

    /* renamed from: g */
    private final String f99012g;
    @Nullable

    /* renamed from: h */
    private final String f99013h;

    /* renamed from: i */
    private final boolean f99014i;
    @NotNull

    /* renamed from: j */
    private final String f99015j;
    @NotNull

    /* renamed from: k */
    private final InterfaceC38501j f99016k;
    @NotNull

    /* renamed from: l */
    private final InterfaceC38501j f99017l;
    @NotNull

    /* renamed from: m */
    private final InterfaceC38501j f99018m;
    @NotNull

    /* renamed from: n */
    private final InterfaceC38501j f99019n;
    @NotNull

    /* renamed from: o */
    private final InterfaceC38501j f99020o;
    @NotNull

    /* renamed from: p */
    private final InterfaceC38501j f99021p;

    /* compiled from: Url.kt */
    @Metadata
    /* renamed from: kc.p0$a */
    /* loaded from: classes9.dex */
    public static final class C37480a {
        private C37480a() {
        }

        public /* synthetic */ C37480a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Url.kt */
    @Metadata
    /* renamed from: kc.p0$b */
    /* loaded from: classes9.dex */
    public static final class C37481b extends Lambda implements Functions<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37481b() {
            super(0);
            Url.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        public final String invoke() {
            int m16568d0;
            m16568d0 = C37690r.m16568d0(Url.this.f99015j, '#', 0, false, 6, null);
            int i = m16568d0 + 1;
            if (i == 0) {
                return "";
            }
            String substring = Url.this.f99015j.substring(i);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Url.kt */
    @Metadata
    /* renamed from: kc.p0$c */
    /* loaded from: classes9.dex */
    public static final class C37482c extends Lambda implements Functions<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37482c() {
            super(0);
            Url.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        @Nullable
        public final String invoke() {
            int m16568d0;
            int m16568d02;
            if (Url.this.m17877h() == null) {
                return null;
            }
            if (Url.this.m17877h().length() == 0) {
                return "";
            }
            m16568d0 = C37690r.m16568d0(Url.this.f99015j, ':', Url.this.m17874k().m17936d().length() + 3, false, 4, null);
            m16568d02 = C37690r.m16568d0(Url.this.f99015j, '@', 0, false, 6, null);
            String substring = Url.this.f99015j.substring(m16568d0 + 1, m16568d02);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Url.kt */
    @Metadata
    /* renamed from: kc.p0$d */
    /* loaded from: classes9.dex */
    public static final class C37483d extends Lambda implements Functions<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37483d() {
            super(0);
            Url.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x000f, code lost:
            r0 = kotlin.text.C37690r.m16568d0(p761kc.Url.this.f99015j, '/', p761kc.Url.this.m17874k().m17936d().length() + 3, false, 4, null);
         */
        @Override // kotlin.jvm.functions.Functions
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String invoke() {
            /*
                r14 = this;
                kc.p0 r0 = p761kc.Url.this
                java.util.List r0 = r0.m17876i()
                boolean r0 = r0.isEmpty()
                java.lang.String r1 = ""
                if (r0 == 0) goto Lf
                return r1
            Lf:
                kc.p0 r0 = p761kc.Url.this
                java.lang.String r2 = p761kc.Url.m17884a(r0)
                r3 = 47
                kc.p0 r0 = p761kc.Url.this
                kc.l0 r0 = r0.m17874k()
                java.lang.String r0 = r0.m17936d()
                int r0 = r0.length()
                int r4 = r0 + 3
                r5 = 0
                r6 = 4
                r7 = 0
                int r0 = kotlin.text.C37686h.m16692d0(r2, r3, r4, r5, r6, r7)
                r2 = -1
                if (r0 != r2) goto L32
                return r1
            L32:
                kc.p0 r1 = p761kc.Url.this
                java.lang.String r8 = p761kc.Url.m17884a(r1)
                r1 = 2
                char[] r9 = new char[r1]
                r9 = {x0068: FILL_ARRAY_DATA  , data: [63, 35} // fill-array
                r11 = 0
                r12 = 4
                r13 = 0
                r10 = r0
                int r1 = kotlin.text.C37686h.m16686g0(r8, r9, r10, r11, r12, r13)
                if (r1 != r2) goto L58
                kc.p0 r1 = p761kc.Url.this
                java.lang.String r1 = p761kc.Url.m17884a(r1)
                java.lang.String r0 = r1.substring(r0)
                java.lang.String r1 = "this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            L58:
                kc.p0 r2 = p761kc.Url.this
                java.lang.String r2 = p761kc.Url.m17884a(r2)
                java.lang.String r0 = r2.substring(r0, r1)
                java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p761kc.Url.C37483d.invoke():java.lang.String");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Url.kt */
    @Metadata
    /* renamed from: kc.p0$e */
    /* loaded from: classes9.dex */
    public static final class C37484e extends Lambda implements Functions<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37484e() {
            super(0);
            Url.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        public final String invoke() {
            int m16568d0;
            int m16568d02;
            m16568d0 = C37690r.m16568d0(Url.this.f99015j, '/', Url.this.m17874k().m17936d().length() + 3, false, 4, null);
            if (m16568d0 == -1) {
                return "";
            }
            m16568d02 = C37690r.m16568d0(Url.this.f99015j, '#', m16568d0, false, 4, null);
            if (m16568d02 == -1) {
                String substring = Url.this.f99015j.substring(m16568d0);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            String substring2 = Url.this.f99015j.substring(m16568d0, m16568d02);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Url.kt */
    @Metadata
    /* renamed from: kc.p0$f */
    /* loaded from: classes9.dex */
    public static final class C37485f extends Lambda implements Functions<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37485f() {
            super(0);
            Url.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        public final String invoke() {
            int m16568d0;
            int m16568d02;
            m16568d0 = C37690r.m16568d0(Url.this.f99015j, '?', 0, false, 6, null);
            int i = m16568d0 + 1;
            if (i == 0) {
                return "";
            }
            m16568d02 = C37690r.m16568d0(Url.this.f99015j, '#', i, false, 4, null);
            if (m16568d02 == -1) {
                String substring = Url.this.f99015j.substring(i);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            String substring2 = Url.this.f99015j.substring(i, m16568d02);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Url.kt */
    @Metadata
    /* renamed from: kc.p0$g */
    /* loaded from: classes9.dex */
    public static final class C37486g extends Lambda implements Functions<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37486g() {
            super(0);
            Url.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        @Nullable
        public final String invoke() {
            int m16562g0;
            if (Url.this.m17871n() == null) {
                return null;
            }
            if (Url.this.m17871n().length() == 0) {
                return "";
            }
            int length = Url.this.m17874k().m17936d().length() + 3;
            m16562g0 = C37690r.m16562g0(Url.this.f99015j, new char[]{':', '@'}, length, false, 4, null);
            String substring = Url.this.f99015j.substring(length, m16562g0);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    public Url(@NotNull URLProtocol protocol, @NotNull String host, int i, @NotNull List<String> pathSegments, @NotNull InterfaceC37497z parameters, @NotNull String fragment, @Nullable String str, @Nullable String str2, boolean z, @NotNull String urlString) {
        boolean z2;
        InterfaceC38501j m14554a;
        InterfaceC38501j m14554a2;
        InterfaceC38501j m14554a3;
        InterfaceC38501j m14554a4;
        InterfaceC38501j m14554a5;
        InterfaceC38501j m14554a6;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.f99006a = protocol;
        this.f99007b = host;
        this.f99008c = i;
        this.f99009d = pathSegments;
        this.f99010e = parameters;
        this.f99011f = fragment;
        this.f99012g = str;
        this.f99013h = str2;
        this.f99014i = z;
        this.f99015j = urlString;
        boolean z3 = true;
        if (i >= 0 && i < 65536) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && i != 0) {
            z3 = false;
        }
        if (z3) {
            m14554a = LazyJVM.m14554a(new C37483d());
            this.f99016k = m14554a;
            m14554a2 = LazyJVM.m14554a(new C37485f());
            this.f99017l = m14554a2;
            m14554a3 = LazyJVM.m14554a(new C37484e());
            this.f99018m = m14554a3;
            m14554a4 = LazyJVM.m14554a(new C37486g());
            this.f99019n = m14554a4;
            m14554a5 = LazyJVM.m14554a(new C37482c());
            this.f99020o = m14554a5;
            m14554a6 = LazyJVM.m14554a(new C37481b());
            this.f99021p = m14554a6;
            return;
        }
        throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set".toString());
    }

    @NotNull
    /* renamed from: b */
    public final String m17883b() {
        return (String) this.f99021p.getValue();
    }

    @Nullable
    /* renamed from: c */
    public final String m17882c() {
        return (String) this.f99020o.getValue();
    }

    @NotNull
    /* renamed from: d */
    public final String m17881d() {
        return (String) this.f99016k.getValue();
    }

    @NotNull
    /* renamed from: e */
    public final String m17880e() {
        return (String) this.f99017l.getValue();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Url.class == obj.getClass() && Intrinsics.m17075f(this.f99015j, ((Url) obj).f99015j)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final String m17879f() {
        return (String) this.f99019n.getValue();
    }

    @NotNull
    /* renamed from: g */
    public final String m17878g() {
        return this.f99007b;
    }

    @Nullable
    /* renamed from: h */
    public final String m17877h() {
        return this.f99013h;
    }

    public int hashCode() {
        return this.f99015j.hashCode();
    }

    @NotNull
    /* renamed from: i */
    public final List<String> m17876i() {
        return this.f99009d;
    }

    /* renamed from: j */
    public final int m17875j() {
        boolean z;
        Integer valueOf = Integer.valueOf(this.f99008c);
        if (valueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return this.f99006a.m17937c();
    }

    @NotNull
    /* renamed from: k */
    public final URLProtocol m17874k() {
        return this.f99006a;
    }

    /* renamed from: l */
    public final int m17873l() {
        return this.f99008c;
    }

    /* renamed from: m */
    public final boolean m17872m() {
        return this.f99014i;
    }

    @Nullable
    /* renamed from: n */
    public final String m17871n() {
        return this.f99012g;
    }

    @NotNull
    public String toString() {
        return this.f99015j;
    }
}
