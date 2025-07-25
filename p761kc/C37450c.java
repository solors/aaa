package p761kc;

import androidx.webkit.ProxyConfig;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C37561t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761kc.HeaderValueWithParameters;

/* compiled from: ContentTypes.kt */
@Metadata
/* renamed from: kc.c */
/* loaded from: classes9.dex */
public final class C37450c extends HeaderValueWithParameters {
    @NotNull

    /* renamed from: f */
    public static final C37452b f98827f = new C37452b(null);
    @NotNull

    /* renamed from: g */
    private static final C37450c f98828g = new C37450c(ProxyConfig.MATCH_ALL_SCHEMES, ProxyConfig.MATCH_ALL_SCHEMES, null, 4, null);
    @NotNull

    /* renamed from: d */
    private final String f98829d;
    @NotNull

    /* renamed from: e */
    private final String f98830e;

    /* compiled from: ContentTypes.kt */
    @Metadata
    /* renamed from: kc.c$a */
    /* loaded from: classes9.dex */
    public static final class C37451a {
        @NotNull

        /* renamed from: a */
        public static final C37451a f98831a = new C37451a();
        @NotNull

        /* renamed from: b */
        private static final C37450c f98832b = new C37450c("application", ProxyConfig.MATCH_ALL_SCHEMES, null, 4, null);
        @NotNull

        /* renamed from: c */
        private static final C37450c f98833c = new C37450c("application", "atom+xml", null, 4, null);
        @NotNull

        /* renamed from: d */
        private static final C37450c f98834d = new C37450c("application", "cbor", null, 4, null);
        @NotNull

        /* renamed from: e */
        private static final C37450c f98835e = new C37450c("application", "json", null, 4, null);
        @NotNull

        /* renamed from: f */
        private static final C37450c f98836f = new C37450c("application", "hal+json", null, 4, null);
        @NotNull

        /* renamed from: g */
        private static final C37450c f98837g = new C37450c("application", "javascript", null, 4, null);
        @NotNull

        /* renamed from: h */
        private static final C37450c f98838h = new C37450c("application", "octet-stream", null, 4, null);
        @NotNull

        /* renamed from: i */
        private static final C37450c f98839i = new C37450c("application", "rss+xml", null, 4, null);
        @NotNull

        /* renamed from: j */
        private static final C37450c f98840j = new C37450c("application", "xml", null, 4, null);
        @NotNull

        /* renamed from: k */
        private static final C37450c f98841k = new C37450c("application", "xml-dtd", null, 4, null);
        @NotNull

        /* renamed from: l */
        private static final C37450c f98842l = new C37450c("application", "zip", null, 4, null);
        @NotNull

        /* renamed from: m */
        private static final C37450c f98843m = new C37450c("application", "gzip", null, 4, null);
        @NotNull

        /* renamed from: n */
        private static final C37450c f98844n = new C37450c("application", "x-www-form-urlencoded", null, 4, null);
        @NotNull

        /* renamed from: o */
        private static final C37450c f98845o = new C37450c("application", "pdf", null, 4, null);
        @NotNull

        /* renamed from: p */
        private static final C37450c f98846p = new C37450c("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", null, 4, null);
        @NotNull

        /* renamed from: q */
        private static final C37450c f98847q = new C37450c("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", null, 4, null);
        @NotNull

        /* renamed from: r */
        private static final C37450c f98848r = new C37450c("application", "vnd.openxmlformats-officedocument.presentationml.presentation", null, 4, null);
        @NotNull

        /* renamed from: s */
        private static final C37450c f98849s = new C37450c("application", "protobuf", null, 4, null);
        @NotNull

        /* renamed from: t */
        private static final C37450c f98850t = new C37450c("application", "wasm", null, 4, null);
        @NotNull

        /* renamed from: u */
        private static final C37450c f98851u = new C37450c("application", "problem+json", null, 4, null);
        @NotNull

        /* renamed from: v */
        private static final C37450c f98852v = new C37450c("application", "problem+xml", null, 4, null);

        private C37451a() {
        }

        @NotNull
        /* renamed from: a */
        public final C37450c m18019a() {
            return f98838h;
        }

        @NotNull
        /* renamed from: b */
        public final C37450c m18018b() {
            return f98849s;
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata
    /* renamed from: kc.c$b */
    /* loaded from: classes9.dex */
    public static final class C37452b {
        private C37452b() {
        }

        public /* synthetic */ C37452b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C37450c m18017a() {
            return C37450c.f98828g;
        }

        @NotNull
        /* renamed from: b */
        public final C37450c m18016b(@NotNull String value) {
            boolean z;
            Intrinsics.checkNotNullParameter(value, "value");
            if (C37686h.m16727B(value)) {
                return m18017a();
            }
            HeaderValueWithParameters.C37461a c37461a = HeaderValueWithParameters.f98883c;
            HttpHeaderValueParser httpHeaderValueParser = (HttpHeaderValueParser) C37561t.m17264B0(C37473n.m17929b(value));
            String m17976b = httpHeaderValueParser.m17976b();
            List<C37459h> m17977a = httpHeaderValueParser.m17977a();
            int m16692d0 = C37686h.m16692d0(m17976b, '/', 0, false, 6, null);
            if (m16692d0 == -1) {
                if (Intrinsics.m17075f(C37686h.m16694b1(m17976b).toString(), ProxyConfig.MATCH_ALL_SCHEMES)) {
                    return C37450c.f98827f.m18017a();
                }
                throw new ContentTypes(value);
            }
            String substring = m17976b.substring(0, m16692d0);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String obj = C37686h.m16694b1(substring).toString();
            boolean z2 = true;
            if (obj.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String substring2 = m17976b.substring(m16692d0 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                String obj2 = C37686h.m16694b1(substring2).toString();
                if (!C37686h.m16708Q(obj, ' ', false, 2, null) && !C37686h.m16708Q(obj2, ' ', false, 2, null)) {
                    if (obj2.length() != 0) {
                        z2 = false;
                    }
                    if (!z2 && !C37686h.m16708Q(obj2, '/', false, 2, null)) {
                        return new C37450c(obj, obj2, m17977a);
                    }
                    throw new ContentTypes(value);
                }
                throw new ContentTypes(value);
            }
            throw new ContentTypes(value);
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata
    /* renamed from: kc.c$c */
    /* loaded from: classes9.dex */
    public static final class C37453c {
        @NotNull

        /* renamed from: a */
        public static final C37453c f98853a = new C37453c();
        @NotNull

        /* renamed from: b */
        private static final C37450c f98854b = new C37450c("text", ProxyConfig.MATCH_ALL_SCHEMES, null, 4, null);
        @NotNull

        /* renamed from: c */
        private static final C37450c f98855c = new C37450c("text", "plain", null, 4, null);
        @NotNull

        /* renamed from: d */
        private static final C37450c f98856d = new C37450c("text", "css", null, 4, null);
        @NotNull

        /* renamed from: e */
        private static final C37450c f98857e = new C37450c("text", "csv", null, 4, null);
        @NotNull

        /* renamed from: f */
        private static final C37450c f98858f = new C37450c("text", "html", null, 4, null);
        @NotNull

        /* renamed from: g */
        private static final C37450c f98859g = new C37450c("text", "javascript", null, 4, null);
        @NotNull

        /* renamed from: h */
        private static final C37450c f98860h = new C37450c("text", "vcard", null, 4, null);
        @NotNull

        /* renamed from: i */
        private static final C37450c f98861i = new C37450c("text", "xml", null, 4, null);
        @NotNull

        /* renamed from: j */
        private static final C37450c f98862j = new C37450c("text", "event-stream", null, 4, null);

        private C37453c() {
        }

        @NotNull
        /* renamed from: a */
        public final C37450c m18015a() {
            return f98855c;
        }
    }

    private C37450c(String str, String str2, String str3, List<C37459h> list) {
        super(str3, list);
        this.f98829d = str;
        this.f98830e = str2;
    }

    /* renamed from: f */
    private final boolean m18021f(String str, String str2) {
        boolean z;
        int size = m17962b().size();
        if (size == 0) {
            return false;
        }
        if (size != 1) {
            List<C37459h> m17962b = m17962b();
            if ((m17962b instanceof Collection) && m17962b.isEmpty()) {
                return false;
            }
            for (C37459h c37459h : m17962b) {
                if (C37686h.m16656y(c37459h.m17974a(), str, true) && C37686h.m16656y(c37459h.m17973b(), str2, true)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                }
            }
            return false;
        }
        C37459h c37459h2 = m17962b().get(0);
        if (!C37686h.m16656y(c37459h2.m17974a(), str, true) || !C37686h.m16656y(c37459h2.m17973b(), str2, true)) {
            return false;
        }
        return true;
    }

    @NotNull
    /* renamed from: e */
    public final String m18022e() {
        return this.f98829d;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C37450c) {
            C37450c c37450c = (C37450c) obj;
            if (C37686h.m16656y(this.f98829d, c37450c.f98829d, true) && C37686h.m16656y(this.f98830e, c37450c.f98830e, true) && Intrinsics.m17075f(m17962b(), c37450c.m17962b())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: g */
    public final C37450c m18020g(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        if (m18021f(name, value)) {
            return this;
        }
        return new C37450c(this.f98829d, this.f98830e, m17963a(), C37561t.m17249K0(m17962b(), new C37459h(name, value)));
    }

    public int hashCode() {
        String str = this.f98829d;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f98830e.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode() + (m17962b().hashCode() * 31);
    }

    public /* synthetic */ C37450c(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? C37561t.m17202m() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37450c(@NotNull String contentType, @NotNull String contentSubtype, @NotNull List<C37459h> parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }
}
