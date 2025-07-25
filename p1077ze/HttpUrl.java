package p1077ze;

import af.Util;
import af.hostnames;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.ironsource.C20517nb;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C37629d;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import kotlin.text.C37690r;
import kotlin.text.Regex;
import kotlin.text.StringsJVM;
import kotlin.text._Strings;
import okio.C39200e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ze.v */
/* loaded from: classes10.dex */
public final class HttpUrl {
    @NotNull

    /* renamed from: k */
    public static final C45332b f119327k = new C45332b(null);
    @NotNull

    /* renamed from: l */
    private static final char[] f119328l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    @NotNull

    /* renamed from: a */
    private final String f119329a;
    @NotNull

    /* renamed from: b */
    private final String f119330b;
    @NotNull

    /* renamed from: c */
    private final String f119331c;
    @NotNull

    /* renamed from: d */
    private final String f119332d;

    /* renamed from: e */
    private final int f119333e;
    @NotNull

    /* renamed from: f */
    private final List<String> f119334f;
    @Nullable

    /* renamed from: g */
    private final List<String> f119335g;
    @Nullable

    /* renamed from: h */
    private final String f119336h;
    @NotNull

    /* renamed from: i */
    private final String f119337i;

    /* renamed from: j */
    private final boolean f119338j;

    /* compiled from: HttpUrl.kt */
    @Metadata
    /* renamed from: ze.v$a */
    /* loaded from: classes10.dex */
    public static final class C45330a {
        @NotNull

        /* renamed from: i */
        public static final C45331a f119339i = new C45331a(null);
        @Nullable

        /* renamed from: a */
        private String f119340a;
        @Nullable

        /* renamed from: d */
        private String f119343d;
        @NotNull

        /* renamed from: f */
        private final List<String> f119345f;
        @Nullable

        /* renamed from: g */
        private List<String> f119346g;
        @Nullable

        /* renamed from: h */
        private String f119347h;
        @NotNull

        /* renamed from: b */
        private String f119341b = "";
        @NotNull

        /* renamed from: c */
        private String f119342c = "";

        /* renamed from: e */
        private int f119344e = -1;

        /* compiled from: HttpUrl.kt */
        @Metadata
        /* renamed from: ze.v$a$a */
        /* loaded from: classes10.dex */
        public static final class C45331a {
            private C45331a() {
            }

            public /* synthetic */ C45331a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: e */
            public final int m120e(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(C45332b.m115b(HttpUrl.f119327k, str, i, i2, "", false, false, false, false, null, 248, null));
                    boolean z = false;
                    if (1 <= parseInt && parseInt < 65536) {
                        z = true;
                    }
                    if (!z) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* renamed from: f */
            public final int m119f(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    } else if (charAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i2;
            }

            /* renamed from: g */
            public final int m118g(String str, int i, int i2) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((Intrinsics.m17071j(charAt, 97) < 0 || Intrinsics.m17071j(charAt, 122) > 0) && (Intrinsics.m17071j(charAt, 65) < 0 || Intrinsics.m17071j(charAt, 90) > 0)) {
                    return -1;
                }
                int i3 = i + 1;
                while (i3 < i2) {
                    int i4 = i3 + 1;
                    char charAt2 = str.charAt(i3);
                    boolean z6 = false;
                    if ('a' <= charAt2 && charAt2 < '{') {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || ('A' <= charAt2 && charAt2 < '[')) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 || ('0' <= charAt2 && charAt2 < ':')) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 || charAt2 == '+') {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 || charAt2 == '-') {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5 || charAt2 == '.') {
                        z6 = true;
                    }
                    if (z6) {
                        i3 = i4;
                    } else if (charAt2 != ':') {
                        return -1;
                    } else {
                        return i3;
                    }
                }
                return -1;
            }

            /* renamed from: h */
            public final int m117h(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    int i4 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i = i4;
                }
                return i3;
            }
        }

        public C45330a() {
            ArrayList arrayList = new ArrayList();
            this.f119345f = arrayList;
            arrayList.add("");
        }

        /* renamed from: c */
        private final int m148c() {
            int i = this.f119344e;
            if (i == -1) {
                C45332b c45332b = HttpUrl.f119327k;
                String str = this.f119340a;
                Intrinsics.m17074g(str);
                return c45332b.m114c(str);
            }
            return i;
        }

        /* renamed from: n */
        private final boolean m137n(String str) {
            boolean m16615y;
            if (!Intrinsics.m17075f(str, ".")) {
                m16615y = StringsJVM.m16615y(str, "%2e", true);
                if (m16615y) {
                    return true;
                }
                return false;
            }
            return true;
        }

        /* renamed from: o */
        private final boolean m136o(String str) {
            boolean m16615y;
            boolean m16615y2;
            boolean m16615y3;
            if (!Intrinsics.m17075f(str, "..")) {
                m16615y = StringsJVM.m16615y(str, "%2e.", true);
                if (!m16615y) {
                    m16615y2 = StringsJVM.m16615y(str, ".%2e", true);
                    if (!m16615y2) {
                        m16615y3 = StringsJVM.m16615y(str, "%2e%2e", true);
                        if (m16615y3) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }

        /* renamed from: r */
        private final void m133r() {
            boolean z;
            List<String> list = this.f119345f;
            if (list.remove(list.size() - 1).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!this.f119345f.isEmpty())) {
                List<String> list2 = this.f119345f;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.f119345f.add("");
        }

        /* renamed from: t */
        private final void m131t(String str, int i, int i2, boolean z, boolean z2) {
            boolean z3;
            String m115b = C45332b.m115b(HttpUrl.f119327k, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240, null);
            if (m137n(m115b)) {
                return;
            }
            if (m136o(m115b)) {
                m133r();
                return;
            }
            List<String> list = this.f119345f;
            if (list.get(list.size() - 1).length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                List<String> list2 = this.f119345f;
                list2.set(list2.size() - 1, m115b);
            } else {
                this.f119345f.add(m115b);
            }
            if (z) {
                this.f119345f.add("");
            }
        }

        /* renamed from: w */
        private final void m128w(String str, int i, int i2) {
            boolean z;
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.f119345f;
                list.set(list.size() - 1, "");
            } else {
                this.f119345f.clear();
                this.f119345f.add("");
                i++;
            }
            while (true) {
                int i3 = i;
                while (i3 < i2) {
                    i = Util.m105722q(str, "/\\", i3, i2);
                    if (i < i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m131t(str, i3, i, z, true);
                    if (z) {
                        i3 = i + 1;
                    }
                }
                return;
            }
        }

        /* renamed from: A */
        public final void m156A(@Nullable List<String> list) {
            this.f119346g = list;
        }

        /* renamed from: B */
        public final void m155B(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f119341b = str;
        }

        /* renamed from: C */
        public final void m154C(@Nullable String str) {
            this.f119343d = str;
        }

        /* renamed from: D */
        public final void m153D(int i) {
            this.f119344e = i;
        }

        /* renamed from: E */
        public final void m152E(@Nullable String str) {
            this.f119340a = str;
        }

        @NotNull
        /* renamed from: F */
        public final C45330a m151F(@NotNull String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            m155B(C45332b.m115b(HttpUrl.f119327k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C45330a m150a(@NotNull String name, @Nullable String str) {
            String m115b;
            Intrinsics.checkNotNullParameter(name, "name");
            if (m143h() == null) {
                m156A(new ArrayList());
            }
            List<String> m143h = m143h();
            Intrinsics.m17074g(m143h);
            C45332b c45332b = HttpUrl.f119327k;
            m143h.add(C45332b.m115b(c45332b, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List<String> m143h2 = m143h();
            Intrinsics.m17074g(m143h2);
            if (str == null) {
                m115b = null;
            } else {
                m115b = C45332b.m115b(c45332b, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null);
            }
            m143h2.add(m115b);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final HttpUrl m149b() {
            int m17154x;
            ArrayList arrayList;
            int m17154x2;
            String m109h;
            String m109h2;
            String str = this.f119340a;
            if (str != null) {
                C45332b c45332b = HttpUrl.f119327k;
                String m109h3 = C45332b.m109h(c45332b, this.f119341b, 0, 0, false, 7, null);
                String m109h4 = C45332b.m109h(c45332b, this.f119342c, 0, 0, false, 7, null);
                String str2 = this.f119343d;
                if (str2 != null) {
                    int m148c = m148c();
                    List<String> list = this.f119345f;
                    m17154x = C37566w.m17154x(list, 10);
                    ArrayList arrayList2 = new ArrayList(m17154x);
                    for (String str3 : list) {
                        arrayList2.add(C45332b.m109h(HttpUrl.f119327k, str3, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.f119346g;
                    if (list2 == null) {
                        arrayList = null;
                    } else {
                        List<String> list3 = list2;
                        m17154x2 = C37566w.m17154x(list3, 10);
                        arrayList = new ArrayList(m17154x2);
                        for (String str4 : list3) {
                            if (str4 == null) {
                                m109h = null;
                            } else {
                                m109h = C45332b.m109h(HttpUrl.f119327k, str4, 0, 0, true, 3, null);
                            }
                            arrayList.add(m109h);
                        }
                    }
                    String str5 = this.f119347h;
                    if (str5 == null) {
                        m109h2 = null;
                    } else {
                        m109h2 = C45332b.m109h(HttpUrl.f119327k, str5, 0, 0, false, 7, null);
                    }
                    return new HttpUrl(str, m109h3, m109h4, str2, m148c, arrayList2, arrayList, m109h2, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        @NotNull
        /* renamed from: d */
        public final C45330a m147d(@Nullable String str) {
            List<String> list = null;
            if (str != null) {
                C45332b c45332b = HttpUrl.f119327k;
                String m115b = C45332b.m115b(c45332b, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (m115b != null) {
                    list = c45332b.m107j(m115b);
                }
            }
            m156A(list);
            return this;
        }

        @Nullable
        /* renamed from: e */
        public final String m146e() {
            return this.f119347h;
        }

        @NotNull
        /* renamed from: f */
        public final String m145f() {
            return this.f119342c;
        }

        @NotNull
        /* renamed from: g */
        public final List<String> m144g() {
            return this.f119345f;
        }

        @Nullable
        /* renamed from: h */
        public final List<String> m143h() {
            return this.f119346g;
        }

        @NotNull
        /* renamed from: i */
        public final String m142i() {
            return this.f119341b;
        }

        @Nullable
        /* renamed from: j */
        public final String m141j() {
            return this.f119343d;
        }

        /* renamed from: k */
        public final int m140k() {
            return this.f119344e;
        }

        @Nullable
        /* renamed from: l */
        public final String m139l() {
            return this.f119340a;
        }

        @NotNull
        /* renamed from: m */
        public final C45330a m138m(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String m105766e = hostnames.m105766e(C45332b.m109h(HttpUrl.f119327k, host, 0, 0, false, 7, null));
            if (m105766e != null) {
                m154C(m105766e);
                return this;
            }
            throw new IllegalArgumentException(Intrinsics.m17064q("unexpected host: ", host));
        }

        @NotNull
        /* renamed from: p */
        public final C45330a m135p(@Nullable HttpUrl httpUrl, @NotNull String str) {
            String m16531o1;
            int m105722q;
            char c;
            int i;
            int i2;
            String str2;
            boolean z;
            boolean z2;
            boolean z3;
            int i3;
            String str3;
            int i4;
            boolean z4;
            boolean m16627J;
            boolean m16627J2;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            int m105765A = Util.m105765A(input, 0, 0, 3, null);
            int m105763C = Util.m105763C(input, m105765A, 0, 2, null);
            C45331a c45331a = f119339i;
            int m118g = c45331a.m118g(input, m105765A, m105763C);
            String str4 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z5 = true;
            char c2 = 65535;
            if (m118g != -1) {
                m16627J = StringsJVM.m16627J(input, "https:", m105765A, true);
                if (!m16627J) {
                    m16627J2 = StringsJVM.m16627J(input, "http:", m105765A, true);
                    if (m16627J2) {
                        this.f119340a = "http";
                        m105765A += 5;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, m118g);
                        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(substring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } else {
                    this.f119340a = "https";
                    m105765A += 6;
                }
            } else if (httpUrl != null) {
                this.f119340a = httpUrl.m159t();
            } else {
                if (str.length() > 6) {
                    m16531o1 = _Strings.m16531o1(input, 6);
                    input = Intrinsics.m17064q(m16531o1, APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                throw new IllegalArgumentException(Intrinsics.m17064q("Expected URL scheme 'http' or 'https' but no scheme was found for ", input));
            }
            int m117h = c45331a.m117h(input, m105765A, m105763C);
            char c3 = '?';
            char c4 = '#';
            if (m117h < 2 && httpUrl != null && Intrinsics.m17075f(httpUrl.m159t(), this.f119340a)) {
                this.f119341b = httpUrl.m172g();
                this.f119342c = httpUrl.m176c();
                this.f119343d = httpUrl.m171h();
                this.f119344e = httpUrl.m166m();
                this.f119345f.clear();
                this.f119345f.addAll(httpUrl.m174e());
                if (m105765A == m105763C || input.charAt(m105765A) == '#') {
                    m147d(httpUrl.m173f());
                }
                i = m105763C;
            } else {
                int i5 = m105765A + m117h;
                boolean z6 = false;
                boolean z7 = false;
                while (true) {
                    m105722q = Util.m105722q(input, "@/\\?#", i5, m105763C);
                    if (m105722q != m105763C) {
                        c = input.charAt(m105722q);
                    } else {
                        c = c2;
                    }
                    if (c == c2 || c == c4 || c == '/' || c == '\\' || c == c3) {
                        break;
                    } else if (c == '@') {
                        if (!z6) {
                            int m105723p = Util.m105723p(input, ':', i5, m105722q);
                            C45332b c45332b = HttpUrl.f119327k;
                            z3 = z5;
                            i3 = m105763C;
                            String str5 = str4;
                            String m115b = C45332b.m115b(c45332b, str, i5, m105723p, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z7) {
                                m115b = this.f119341b + "%40" + m115b;
                            }
                            this.f119341b = m115b;
                            if (m105723p != m105722q) {
                                this.f119342c = C45332b.m115b(c45332b, str, m105723p + 1, m105722q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z4 = z3;
                            } else {
                                z4 = z6;
                            }
                            z6 = z4;
                            str3 = str5;
                            z7 = z3;
                            i4 = m105722q;
                        } else {
                            z3 = z5;
                            i3 = m105763C;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f119342c);
                            sb3.append("%40");
                            str3 = str4;
                            i4 = m105722q;
                            sb3.append(C45332b.m115b(HttpUrl.f119327k, str, i5, m105722q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f119342c = sb3.toString();
                        }
                        i5 = i4 + 1;
                        str4 = str3;
                        z5 = z3;
                        m105763C = i3;
                        c4 = '#';
                        c3 = '?';
                        c2 = 65535;
                    }
                }
                boolean z8 = z5;
                String str6 = str4;
                i = m105763C;
                C45331a c45331a2 = f119339i;
                int m119f = c45331a2.m119f(input, i5, m105722q);
                int i6 = m119f + 1;
                if (i6 < m105722q) {
                    i2 = i5;
                    this.f119343d = hostnames.m105766e(C45332b.m109h(HttpUrl.f119327k, str, i5, m119f, false, 4, null));
                    int m120e = c45331a2.m120e(input, i6, m105722q);
                    this.f119344e = m120e;
                    if (m120e != -1) {
                        z2 = z8;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        str2 = str6;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = input.substring(i6, m105722q);
                        Intrinsics.checkNotNullExpressionValue(substring2, str6);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i2 = i5;
                    str2 = str6;
                    C45332b c45332b2 = HttpUrl.f119327k;
                    this.f119343d = hostnames.m105766e(C45332b.m109h(c45332b2, str, i2, m119f, false, 4, null));
                    String str7 = this.f119340a;
                    Intrinsics.m17074g(str7);
                    this.f119344e = c45332b2.m114c(str7);
                }
                if (this.f119343d != null) {
                    z = z8;
                } else {
                    z = false;
                }
                if (z) {
                    m105765A = m105722q;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = input.substring(i2, m119f);
                    Intrinsics.checkNotNullExpressionValue(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            }
            int i7 = i;
            int m105722q2 = Util.m105722q(input, "?#", m105765A, i7);
            m128w(input, m105765A, m105722q2);
            if (m105722q2 < i7 && input.charAt(m105722q2) == '?') {
                int m105723p2 = Util.m105723p(input, '#', m105722q2, i7);
                C45332b c45332b3 = HttpUrl.f119327k;
                this.f119346g = c45332b3.m107j(C45332b.m115b(c45332b3, str, m105722q2 + 1, m105723p2, " \"'<>#", true, false, true, false, null, 208, null));
                m105722q2 = m105723p2;
            }
            if (m105722q2 < i7 && input.charAt(m105722q2) == '#') {
                this.f119347h = C45332b.m115b(HttpUrl.f119327k, str, m105722q2 + 1, i7, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @NotNull
        /* renamed from: q */
        public final C45330a m134q(@NotNull String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            m125z(C45332b.m115b(HttpUrl.f119327k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        @NotNull
        /* renamed from: s */
        public final C45330a m132s(int i) {
            boolean z = false;
            if (1 <= i && i < 65536) {
                z = true;
            }
            if (z) {
                m153D(i);
                return this;
            }
            throw new IllegalArgumentException(Intrinsics.m17064q("unexpected port: ", Integer.valueOf(i)).toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x003d, code lost:
            if (r1 != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x00b5, code lost:
            if (r1 != r2.m114c(r3)) goto L36;
         */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.m139l()
                if (r1 == 0) goto L18
                java.lang.String r1 = r6.m139l()
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L1d
            L18:
                java.lang.String r1 = "//"
                r0.append(r1)
            L1d:
                java.lang.String r1 = r6.m142i()
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L2b
                r1 = r2
                goto L2c
            L2b:
                r1 = r3
            L2c:
                r4 = 58
                if (r1 != 0) goto L3f
                java.lang.String r1 = r6.m145f()
                int r1 = r1.length()
                if (r1 <= 0) goto L3c
                r1 = r2
                goto L3d
            L3c:
                r1 = r3
            L3d:
                if (r1 == 0) goto L63
            L3f:
                java.lang.String r1 = r6.m142i()
                r0.append(r1)
                java.lang.String r1 = r6.m145f()
                int r1 = r1.length()
                if (r1 <= 0) goto L51
                goto L52
            L51:
                r2 = r3
            L52:
                if (r2 == 0) goto L5e
                r0.append(r4)
                java.lang.String r1 = r6.m145f()
                r0.append(r1)
            L5e:
                r1 = 64
                r0.append(r1)
            L63:
                java.lang.String r1 = r6.m141j()
                if (r1 == 0) goto L91
                java.lang.String r1 = r6.m141j()
                kotlin.jvm.internal.Intrinsics.m17074g(r1)
                r2 = 2
                r5 = 0
                boolean r1 = kotlin.text.C37686h.m16708Q(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L8a
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.m141j()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L91
            L8a:
                java.lang.String r1 = r6.m141j()
                r0.append(r1)
            L91:
                int r1 = r6.m140k()
                r2 = -1
                if (r1 != r2) goto L9e
                java.lang.String r1 = r6.m139l()
                if (r1 == 0) goto Lbd
            L9e:
                int r1 = r6.m148c()
                java.lang.String r2 = r6.m139l()
                if (r2 == 0) goto Lb7
                ze.v$b r2 = p1077ze.HttpUrl.f119327k
                java.lang.String r3 = r6.m139l()
                kotlin.jvm.internal.Intrinsics.m17074g(r3)
                int r2 = r2.m114c(r3)
                if (r1 == r2) goto Lbd
            Lb7:
                r0.append(r4)
                r0.append(r1)
            Lbd:
                ze.v$b r1 = p1077ze.HttpUrl.f119327k
                java.util.List r2 = r6.m144g()
                r1.m108i(r2, r0)
                java.util.List r2 = r6.m143h()
                if (r2 == 0) goto Ldb
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.m143h()
                kotlin.jvm.internal.Intrinsics.m17074g(r2)
                r1.m106k(r2, r0)
            Ldb:
                java.lang.String r1 = r6.m146e()
                if (r1 == 0) goto Led
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.m146e()
                r0.append(r1)
            Led:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p1077ze.HttpUrl.C45330a.toString():java.lang.String");
        }

        @NotNull
        /* renamed from: u */
        public final C45330a m130u(@Nullable String str) {
            List<String> list = null;
            if (str != null) {
                C45332b c45332b = HttpUrl.f119327k;
                String m115b = C45332b.m115b(c45332b, str, 0, 0, " \"'<>#", false, false, true, false, null, 219, null);
                if (m115b != null) {
                    list = c45332b.m107j(m115b);
                }
            }
            m156A(list);
            return this;
        }

        @NotNull
        /* renamed from: v */
        public final C45330a m129v() {
            String replace;
            String m115b;
            String m141j = m141j();
            String str = null;
            if (m141j == null) {
                replace = null;
            } else {
                replace = new Regex("[\"<>^`{|}]").replace(m141j, "");
            }
            m154C(replace);
            int size = m144g().size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                m144g().set(i2, C45332b.m115b(HttpUrl.f119327k, m144g().get(i2), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> m143h = m143h();
            if (m143h != null) {
                int size2 = m143h.size();
                while (i < size2) {
                    int i3 = i + 1;
                    String str2 = m143h.get(i);
                    if (str2 == null) {
                        m115b = null;
                    } else {
                        m115b = C45332b.m115b(HttpUrl.f119327k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null);
                    }
                    m143h.set(i, m115b);
                    i = i3;
                }
            }
            String m146e = m146e();
            if (m146e != null) {
                str = C45332b.m115b(HttpUrl.f119327k, m146e, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null);
            }
            m126y(str);
            return this;
        }

        @NotNull
        /* renamed from: x */
        public final C45330a m127x(@NotNull String scheme) {
            boolean m16615y;
            boolean m16615y2;
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            m16615y = StringsJVM.m16615y(scheme, "http", true);
            if (!m16615y) {
                m16615y2 = StringsJVM.m16615y(scheme, "https", true);
                if (m16615y2) {
                    m152E("https");
                } else {
                    throw new IllegalArgumentException(Intrinsics.m17064q("unexpected scheme: ", scheme));
                }
            } else {
                m152E("http");
            }
            return this;
        }

        /* renamed from: y */
        public final void m126y(@Nullable String str) {
            this.f119347h = str;
        }

        /* renamed from: z */
        public final void m125z(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f119342c = str;
        }
    }

    /* compiled from: HttpUrl.kt */
    @Metadata
    /* renamed from: ze.v$b */
    /* loaded from: classes10.dex */
    public static final class C45332b {
        private C45332b() {
        }

        public /* synthetic */ C45332b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m115b(C45332b c45332b, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return c45332b.m116a(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        /* renamed from: e */
        private final boolean m112e(String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 < i2 && str.charAt(i) == '%' && Util.m105757I(str.charAt(i + 1)) != -1 && Util.m105757I(str.charAt(i3)) != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public static /* synthetic */ String m109h(C45332b c45332b, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return c45332b.m110g(str, i, i2, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:95:0x005f, code lost:
            if (m112e(r16, r5, r18) == false) goto L39;
         */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m105l(okio.C39200e r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lb9
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L28
                r8 = 9
                if (r7 == r8) goto L23
                r8 = 10
                if (r7 == r8) goto L23
                r8 = 12
                if (r7 == r8) goto L23
                r8 = 13
                if (r7 != r8) goto L28
            L23:
                r8 = r14
                r12 = r19
                goto Lb2
            L28:
                r8 = 43
                if (r7 != r8) goto L39
                if (r22 == 0) goto L39
                if (r20 == 0) goto L33
                java.lang.String r8 = "+"
                goto L35
            L33:
                java.lang.String r8 = "%2B"
            L35:
                r15.writeUtf8(r8)
                goto L23
            L39:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L69
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L69
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L49
                if (r23 == 0) goto L69
            L49:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.C37686h.m16708Q(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L67
                if (r7 != r9) goto L62
                if (r20 == 0) goto L67
                if (r21 == 0) goto L62
                r8 = r14
                boolean r10 = r14.m112e(r1, r5, r2)
                if (r10 != 0) goto L63
                goto L6c
            L62:
                r8 = r14
            L63:
                r15.m13598V(r7)
                goto Lb2
            L67:
                r8 = r14
                goto L6c
            L69:
                r8 = r14
                r12 = r19
            L6c:
                if (r6 != 0) goto L73
                okio.e r6 = new okio.e
                r6.<init>()
            L73:
                if (r3 == 0) goto L87
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.Intrinsics.m17075f(r3, r10)
                if (r10 == 0) goto L7e
                goto L87
            L7e:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.m13602R(r1, r5, r10, r3)
                goto L8a
            L87:
                r6.m13598V(r7)
            L8a:
                boolean r10 = r6.exhausted()
                if (r10 != 0) goto Lb2
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = p1077ze.HttpUrl.m178a()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = p1077ze.HttpUrl.m178a()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L8a
            Lb2:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lb9:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1077ze.HttpUrl.C45332b.m105l(okio.e, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        /* renamed from: m */
        private final void m104m(C39200e c39200e, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int m105757I = Util.m105757I(str.charAt(i + 1));
                    int m105757I2 = Util.m105757I(str.charAt(i3));
                    if (m105757I != -1 && m105757I2 != -1) {
                        c39200e.writeByte((m105757I << 4) + m105757I2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                    c39200e.m13598V(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z) {
                        c39200e.writeByte(32);
                        i++;
                    }
                    c39200e.m13598V(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
        }

        @NotNull
        /* renamed from: a */
        public final String m116a(@NotNull String str, int i, int i2, @NotNull String encodeSet, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
            boolean m16594Q;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                    m16594Q = C37690r.m16594Q(encodeSet, (char) codePointAt, false, 2, null);
                    if (!m16594Q) {
                        if (codePointAt == 37) {
                            if (z) {
                                if (z2) {
                                    if (!m112e(str, i3, i2)) {
                                        C39200e c39200e = new C39200e();
                                        c39200e.writeUtf8(str, i, i3);
                                        m105l(c39200e, str, i3, i2, encodeSet, z, z2, z3, z4, charset);
                                        return c39200e.readUtf8();
                                    }
                                    if (codePointAt == 43 || !z3) {
                                        i3 += Character.charCount(codePointAt);
                                    } else {
                                        C39200e c39200e2 = new C39200e();
                                        c39200e2.writeUtf8(str, i, i3);
                                        m105l(c39200e2, str, i3, i2, encodeSet, z, z2, z3, z4, charset);
                                        return c39200e2.readUtf8();
                                    }
                                }
                            }
                        }
                        if (codePointAt == 43) {
                        }
                        i3 += Character.charCount(codePointAt);
                    }
                }
                C39200e c39200e22 = new C39200e();
                c39200e22.writeUtf8(str, i, i3);
                m105l(c39200e22, str, i3, i2, encodeSet, z, z2, z3, z4, charset);
                return c39200e22.readUtf8();
            }
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: c */
        public final int m114c(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.m17075f(scheme, "http")) {
                return 80;
            }
            if (Intrinsics.m17075f(scheme, "https")) {
                return 443;
            }
            return -1;
        }

        @NotNull
        /* renamed from: d */
        public final HttpUrl m113d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new C45330a().m135p(null, str).m149b();
        }

        @Nullable
        /* renamed from: f */
        public final HttpUrl m111f(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return m113d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        /* renamed from: g */
        public final String m110g(@NotNull String str, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char charAt = str.charAt(i3);
                if (charAt != '%' && (charAt != '+' || !z)) {
                    i3 = i4;
                } else {
                    C39200e c39200e = new C39200e();
                    c39200e.writeUtf8(str, i, i3);
                    m104m(c39200e, str, i3, i2, z);
                    return c39200e.readUtf8();
                }
            }
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: i */
        public final void m108i(@NotNull List<String> list, @NotNull StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append(list.get(i));
            }
        }

        @NotNull
        /* renamed from: j */
        public final List<String> m107j(@NotNull String str) {
            int m16568d0;
            int m16568d02;
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                m16568d0 = C37690r.m16568d0(str, '&', i, false, 4, null);
                if (m16568d0 == -1) {
                    m16568d0 = str.length();
                }
                int i2 = m16568d0;
                m16568d02 = C37690r.m16568d0(str, C20517nb.f52173T, i, false, 4, null);
                if (m16568d02 != -1 && m16568d02 <= i2) {
                    String substring = str.substring(i, m16568d02);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str.substring(m16568d02 + 1, i2);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        /* renamed from: k */
        public final void m106k(@NotNull List<String> list, @NotNull StringBuilder out) {
            PrimitiveRanges m16900v;
            C37629d m16901u;
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            m16900v = _Ranges.m16900v(0, list.size());
            m16901u = _Ranges.m16901u(m16900v, 2);
            int m16953c = m16901u.m16953c();
            int m16952d = m16901u.m16952d();
            int m16951f = m16901u.m16951f();
            if ((m16951f <= 0 || m16953c > m16952d) && (m16951f >= 0 || m16952d > m16953c)) {
                return;
            }
            while (true) {
                int i = m16953c + m16951f;
                String str = list.get(m16953c);
                String str2 = list.get(m16953c + 1);
                if (m16953c > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append(C20517nb.f52173T);
                    out.append(str2);
                }
                if (m16953c != m16952d) {
                    m16953c = i;
                } else {
                    return;
                }
            }
        }
    }

    public HttpUrl(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i, @NotNull List<String> pathSegments, @Nullable List<String> list, @Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f119329a = scheme;
        this.f119330b = username;
        this.f119331c = password;
        this.f119332d = host;
        this.f119333e = i;
        this.f119334f = pathSegments;
        this.f119335g = list;
        this.f119336h = str;
        this.f119337i = url;
        this.f119338j = Intrinsics.m17075f(scheme, "https");
    }

    @Nullable
    /* renamed from: l */
    public static final HttpUrl m167l(@NotNull String str) {
        return f119327k.m111f(str);
    }

    @Nullable
    /* renamed from: b */
    public final String m177b() {
        int m16568d0;
        if (this.f119336h != null) {
            m16568d0 = C37690r.m16568d0(this.f119337i, '#', 0, false, 6, null);
            String substring = this.f119337i.substring(m16568d0 + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return null;
    }

    @NotNull
    /* renamed from: c */
    public final String m176c() {
        boolean z;
        int m16568d0;
        int m16568d02;
        if (this.f119331c.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m16568d0 = C37690r.m16568d0(this.f119337i, ':', this.f119329a.length() + 3, false, 4, null);
            m16568d02 = C37690r.m16568d0(this.f119337i, '@', 0, false, 6, null);
            String substring = this.f119337i.substring(m16568d0 + 1, m16568d02);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return "";
    }

    @NotNull
    /* renamed from: d */
    public final String m175d() {
        int m16568d0;
        m16568d0 = C37690r.m16568d0(this.f119337i, '/', this.f119329a.length() + 3, false, 4, null);
        String str = this.f119337i;
        String substring = this.f119337i.substring(m16568d0, Util.m105722q(str, "?#", m16568d0, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: e */
    public final List<String> m174e() {
        int m16568d0;
        m16568d0 = C37690r.m16568d0(this.f119337i, '/', this.f119329a.length() + 3, false, 4, null);
        String str = this.f119337i;
        int m105722q = Util.m105722q(str, "?#", m16568d0, str.length());
        ArrayList arrayList = new ArrayList();
        while (m16568d0 < m105722q) {
            int i = m16568d0 + 1;
            int m105723p = Util.m105723p(this.f119337i, '/', i, m105722q);
            String substring = this.f119337i.substring(i, m105723p);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            m16568d0 = m105723p;
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof HttpUrl) && Intrinsics.m17075f(((HttpUrl) obj).f119337i, this.f119337i)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final String m173f() {
        int m16568d0;
        if (this.f119335g != null) {
            m16568d0 = C37690r.m16568d0(this.f119337i, '?', 0, false, 6, null);
            int i = m16568d0 + 1;
            String str = this.f119337i;
            String substring = this.f119337i.substring(i, Util.m105723p(str, '#', i, str.length()));
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return null;
    }

    @NotNull
    /* renamed from: g */
    public final String m172g() {
        boolean z;
        if (this.f119330b.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        int length = this.f119329a.length() + 3;
        String str = this.f119337i;
        String substring = this.f119337i.substring(length, Util.m105722q(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: h */
    public final String m171h() {
        return this.f119332d;
    }

    public int hashCode() {
        return this.f119337i.hashCode();
    }

    /* renamed from: i */
    public final boolean m170i() {
        return this.f119338j;
    }

    @NotNull
    /* renamed from: j */
    public final C45330a m169j() {
        int i;
        C45330a c45330a = new C45330a();
        c45330a.m152E(this.f119329a);
        c45330a.m155B(m172g());
        c45330a.m125z(m176c());
        c45330a.m154C(this.f119332d);
        if (this.f119333e != f119327k.m114c(this.f119329a)) {
            i = this.f119333e;
        } else {
            i = -1;
        }
        c45330a.m153D(i);
        c45330a.m144g().clear();
        c45330a.m144g().addAll(m174e());
        c45330a.m147d(m173f());
        c45330a.m126y(m177b());
        return c45330a;
    }

    @Nullable
    /* renamed from: k */
    public final C45330a m168k(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new C45330a().m135p(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final int m166m() {
        return this.f119333e;
    }

    @Nullable
    /* renamed from: n */
    public final String m165n() {
        if (this.f119335g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f119327k.m106k(this.f119335g, sb2);
        return sb2.toString();
    }

    @NotNull
    /* renamed from: o */
    public final String m164o(int i) {
        List<String> list = this.f119335g;
        if (list != null) {
            String str = list.get(i * 2);
            Intrinsics.m17074g(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    @Nullable
    /* renamed from: p */
    public final String m163p(int i) {
        List<String> list = this.f119335g;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: q */
    public final int m162q() {
        List<String> list = this.f119335g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    /* renamed from: r */
    public final String m161r() {
        C45330a m168k = m168k("/...");
        Intrinsics.m17074g(m168k);
        return m168k.m151F("").m134q("").m149b().toString();
    }

    @Nullable
    /* renamed from: s */
    public final HttpUrl m160s(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        C45330a m168k = m168k(link);
        if (m168k == null) {
            return null;
        }
        return m168k.m149b();
    }

    @NotNull
    /* renamed from: t */
    public final String m159t() {
        return this.f119329a;
    }

    @NotNull
    public String toString() {
        return this.f119337i;
    }

    @NotNull
    /* renamed from: u */
    public final URI m158u() {
        String c45330a = m169j().m129v().toString();
        try {
            return new URI(c45330a);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(c45330a, ""));
                Intrinsics.checkNotNullExpressionValue(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    @NotNull
    /* renamed from: v */
    public final URL m157v() {
        try {
            return new URL(this.f119337i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
