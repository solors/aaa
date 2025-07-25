package com.yandex.mobile.ads.impl;

import androidx.autofill.HintConstants;
import com.ironsource.C20517nb;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.Regex;
import kotlin.text.StringsJVM;
import okio.C39200e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class nf0 {
    @NotNull

    /* renamed from: j */
    private static final char[] f82731j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    @NotNull

    /* renamed from: a */
    private final String f82732a;
    @NotNull

    /* renamed from: b */
    private final String f82733b;
    @NotNull

    /* renamed from: c */
    private final String f82734c;
    @NotNull

    /* renamed from: d */
    private final String f82735d;

    /* renamed from: e */
    private final int f82736e;
    @Nullable

    /* renamed from: f */
    private final List<String> f82737f;
    @Nullable

    /* renamed from: g */
    private final String f82738g;
    @NotNull

    /* renamed from: h */
    private final String f82739h;

    /* renamed from: i */
    private final boolean f82740i;

    /* renamed from: com.yandex.mobile.ads.impl.nf0$a */
    /* loaded from: classes8.dex */
    public static final class C30938a {
        @Nullable

        /* renamed from: a */
        private String f82741a;
        @Nullable

        /* renamed from: d */
        private String f82744d;
        @NotNull

        /* renamed from: f */
        private final ArrayList f82746f;
        @Nullable

        /* renamed from: g */
        private ArrayList f82747g;
        @Nullable

        /* renamed from: h */
        private String f82748h;
        @NotNull

        /* renamed from: b */
        private String f82742b = "";
        @NotNull

        /* renamed from: c */
        private String f82743c = "";

        /* renamed from: e */
        private int f82745e = -1;

        /* renamed from: com.yandex.mobile.ads.impl.nf0$a$a */
        /* loaded from: classes8.dex */
        public static final class C30939a {
            private C30939a() {
            }

            /* renamed from: a */
            public static final int m31536a(String str, int i, int i2) {
                int parseInt;
                try {
                    parseInt = Integer.parseInt(C30940b.m31531a(str, i, i2, "", false, false, false, false, 248));
                } catch (NumberFormatException unused) {
                }
                if (1 > parseInt || parseInt >= 65536) {
                    return -1;
                }
                return parseInt;
            }

            /* renamed from: b */
            public static final int m31535b(String str, int i, int i2) {
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

            /* renamed from: c */
            public static final int m31534c(String str, int i, int i2) {
                if (i2 - i >= 2) {
                    char charAt = str.charAt(i);
                    if ((Intrinsics.m17071j(charAt, 97) >= 0 && Intrinsics.m17071j(charAt, 122) <= 0) || (Intrinsics.m17071j(charAt, 65) >= 0 && Intrinsics.m17071j(charAt, 90) <= 0)) {
                        while (true) {
                            i++;
                            if (i >= i2) {
                                break;
                            }
                            char charAt2 = str.charAt(i);
                            if ('a' > charAt2 || charAt2 >= '{') {
                                if ('A' > charAt2 || charAt2 >= '[') {
                                    if ('0' > charAt2 || charAt2 >= ':') {
                                        if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                            if (charAt2 == ':') {
                                                return i;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* renamed from: d */
            public static final int m31533d(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            public /* synthetic */ C30939a(int i) {
                this();
            }
        }

        public C30938a() {
            ArrayList arrayList = new ArrayList();
            this.f82746f = arrayList;
            arrayList.add("");
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[LOOP:0: B:16:0x004e->B:18:0x0054, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
        @org.jetbrains.annotations.NotNull
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.yandex.mobile.ads.impl.nf0 m31552a() {
            /*
                r14 = this;
                java.lang.String r1 = r14.f82741a
                if (r1 == 0) goto Lb2
                java.lang.String r0 = r14.f82742b
                r2 = 0
                r3 = 7
                java.lang.String r4 = com.yandex.mobile.ads.impl.nf0.C30940b.m31530a(r0, r2, r2, r2, r3)
                java.lang.String r0 = r14.f82743c
                java.lang.String r5 = com.yandex.mobile.ads.impl.nf0.C30940b.m31530a(r0, r2, r2, r2, r3)
                java.lang.String r6 = r14.f82744d
                if (r6 == 0) goto Laa
                int r0 = r14.f82745e
                r7 = -1
                if (r0 == r7) goto L1d
            L1b:
                r7 = r0
                goto L3d
            L1d:
                java.lang.String r0 = r14.f82741a
                kotlin.jvm.internal.Intrinsics.m17074g(r0)
                java.lang.String r8 = "scheme"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)
                java.lang.String r8 = "http"
                boolean r8 = kotlin.jvm.internal.Intrinsics.m17075f(r0, r8)
                if (r8 == 0) goto L32
                r0 = 80
                goto L1b
            L32:
                java.lang.String r8 = "https"
                boolean r0 = kotlin.jvm.internal.Intrinsics.m17075f(r0, r8)
                if (r0 == 0) goto L3d
                r0 = 443(0x1bb, float:6.21E-43)
                goto L1b
            L3d:
                java.util.ArrayList r0 = r14.f82746f
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r10 = kotlin.collections.C37561t.m17185x(r0, r9)
                r8.<init>(r10)
                java.util.Iterator r0 = r0.iterator()
            L4e:
                boolean r10 = r0.hasNext()
                if (r10 == 0) goto L62
                java.lang.Object r10 = r0.next()
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r10 = com.yandex.mobile.ads.impl.nf0.C30940b.m31530a(r10, r2, r2, r2, r3)
                r8.add(r10)
                goto L4e
            L62:
                java.util.ArrayList r0 = r14.f82747g
                r10 = 0
                if (r0 == 0) goto L8e
                java.util.ArrayList r11 = new java.util.ArrayList
                int r9 = kotlin.collections.C37561t.m17185x(r0, r9)
                r11.<init>(r9)
                java.util.Iterator r0 = r0.iterator()
            L74:
                boolean r9 = r0.hasNext()
                if (r9 == 0) goto L8f
                java.lang.Object r9 = r0.next()
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L89
                r12 = 1
                r13 = 3
                java.lang.String r9 = com.yandex.mobile.ads.impl.nf0.C30940b.m31530a(r9, r2, r2, r12, r13)
                goto L8a
            L89:
                r9 = r10
            L8a:
                r11.add(r9)
                goto L74
            L8e:
                r11 = r10
            L8f:
                java.lang.String r0 = r14.f82748h
                if (r0 == 0) goto L98
                java.lang.String r0 = com.yandex.mobile.ads.impl.nf0.C30940b.m31530a(r0, r2, r2, r2, r3)
                r10 = r0
            L98:
                java.lang.String r9 = r14.toString()
                com.yandex.mobile.ads.impl.nf0 r12 = new com.yandex.mobile.ads.impl.nf0
                r0 = r12
                r2 = r4
                r3 = r5
                r4 = r6
                r5 = r7
                r6 = r8
                r7 = r11
                r8 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r12
            Laa:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "host == null"
                r0.<init>(r1)
                throw r0
            Lb2:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "scheme == null"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nf0.C30938a.m31552a():com.yandex.mobile.ads.impl.nf0");
        }

        @NotNull
        /* renamed from: b */
        public final ArrayList m31548b() {
            return this.f82746f;
        }

        @NotNull
        /* renamed from: c */
        public final C30938a m31545c() {
            Intrinsics.checkNotNullParameter("", HintConstants.AUTOFILL_HINT_PASSWORD);
            this.f82743c = C30940b.m31531a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        @NotNull
        /* renamed from: d */
        public final C30938a m31543d() {
            String str = this.f82744d;
            this.f82744d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f82746f.size();
            for (int i = 0; i < size; i++) {
                ArrayList arrayList = this.f82746f;
                arrayList.set(i, C30940b.m31531a((String) arrayList.get(i), 0, 0, "[]", true, true, false, false, 227));
            }
            ArrayList arrayList2 = this.f82747g;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = (String) arrayList2.get(i2);
                    arrayList2.set(i2, str2 != null ? C30940b.m31531a(str2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
                }
            }
            String str3 = this.f82748h;
            this.f82748h = str3 != null ? C30940b.m31531a(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
            return this;
        }

        /* renamed from: e */
        public final void m31540e(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f82743c = str;
        }

        /* renamed from: f */
        public final void m31539f(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f82742b = str;
        }

        /* renamed from: g */
        public final void m31538g(@Nullable String str) {
            this.f82744d = str;
        }

        /* renamed from: h */
        public final void m31537h(@Nullable String str) {
            this.f82741a = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
            if (r1 != r5) goto L63;
         */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 335
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nf0.C30938a.toString():java.lang.String");
        }

        @NotNull
        /* renamed from: b */
        public final C30938a m31546b(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String m29642a = sd0.m29642a(C30940b.m31530a(host, 0, 0, false, 7));
            if (m29642a != null) {
                this.f82744d = m29642a;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        @NotNull
        /* renamed from: c */
        public final C30938a m31544c(@NotNull String scheme) {
            boolean m16615y;
            boolean m16615y2;
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            m16615y = StringsJVM.m16615y(scheme, "http", true);
            if (m16615y) {
                this.f82741a = "http";
            } else {
                m16615y2 = StringsJVM.m16615y(scheme, "https", true);
                if (!m16615y2) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.f82741a = "https";
            }
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final C30938a m31541e() {
            Intrinsics.checkNotNullParameter("", "username");
            this.f82742b = C30940b.m31531a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        /* renamed from: b */
        public final void m31547b(int i) {
            this.f82745e = i;
        }

        /* renamed from: d */
        public final void m31542d(@Nullable String str) {
            this.f82748h = str;
        }

        @NotNull
        /* renamed from: a */
        public final void m31549a(@Nullable String str) {
            String m31531a;
            this.f82747g = (str == null || (m31531a = C30940b.m31531a(str, 0, 0, " \"'<>#", true, false, true, false, 211)) == null) ? null : C30940b.m31529b(m31531a);
        }

        @NotNull
        /* renamed from: a */
        public final C30938a m31550a(@Nullable nf0 nf0Var, @NotNull String input) {
            int m26427a;
            int m26400b;
            int m26426a;
            int i;
            char c;
            boolean m16615y;
            boolean m16615y2;
            boolean m16615y3;
            boolean m16615y4;
            boolean m16627J;
            boolean m16627J2;
            Intrinsics.checkNotNullParameter(input, "input");
            m26427a = z32.m26427a(0, input.length(), input);
            m26400b = z32.m26400b(m26427a, input.length(), input);
            int m31534c = C30939a.m31534c(input, m26427a, m26400b);
            boolean z = false;
            char c2 = 65535;
            if (m31534c != -1) {
                m16627J = StringsJVM.m16627J(input, "https:", m26427a, true);
                if (!m16627J) {
                    m16627J2 = StringsJVM.m16627J(input, "http:", m26427a, true);
                    if (m16627J2) {
                        this.f82741a = "http";
                        m26427a += 5;
                    } else {
                        String substring = input.substring(0, m31534c);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + substring + "'");
                    }
                } else {
                    this.f82741a = "https";
                    m26427a += 6;
                }
            } else if (nf0Var != null) {
                this.f82741a = nf0Var.m31555k();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int m31533d = C30939a.m31533d(input, m26427a, m26400b);
            char c3 = '?';
            char c4 = '\\';
            char c5 = '/';
            char c6 = '#';
            if (m31533d < 2 && nf0Var != null && Intrinsics.m17075f(nf0Var.m31555k(), this.f82741a)) {
                this.f82742b = nf0Var.m31560f();
                this.f82743c = nf0Var.m31564b();
                this.f82744d = nf0Var.m31559g();
                this.f82745e = nf0Var.m31557i();
                this.f82746f.clear();
                this.f82746f.addAll(nf0Var.m31562d());
                if (m26427a == m26400b || input.charAt(m26427a) == '#') {
                    m31549a(nf0Var.m31561e());
                }
            } else {
                int i2 = m26427a + m31533d;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    m26426a = z32.m26426a(i2, m26400b, input, "@/\\?#");
                    char charAt = m26426a != m26400b ? input.charAt(m26426a) : c2;
                    if (charAt == c2 || charAt == c6 || charAt == c5 || charAt == c4 || charAt == c3) {
                        break;
                    } else if (charAt == '@') {
                        if (!z2) {
                            int m26416a = z32.m26416a(input, ':', i2, m26426a);
                            i = m26426a;
                            String m31531a = C30940b.m31531a(input, i2, m26416a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z3) {
                                m31531a = this.f82742b + "%40" + m31531a;
                            }
                            this.f82742b = m31531a;
                            if (m26416a != i) {
                                this.f82743c = C30940b.m31531a(input, m26416a + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z2 = true;
                            }
                            z3 = true;
                        } else {
                            i = m26426a;
                            this.f82743c = this.f82743c + "%40" + C30940b.m31531a(input, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        }
                        i2 = i + 1;
                        c6 = '#';
                        c5 = '/';
                        c4 = '\\';
                        c3 = '?';
                        c2 = 65535;
                    }
                }
                int m31535b = C30939a.m31535b(input, i2, m26426a);
                int i3 = m31535b + 1;
                if (i3 < m26426a) {
                    this.f82744d = sd0.m29642a(C30940b.m31530a(input, i2, m31535b, false, 4));
                    int m31536a = C30939a.m31536a(input, i3, m26426a);
                    this.f82745e = m31536a;
                    if (m31536a == -1) {
                        String substring2 = input.substring(i3, m26426a);
                        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                        throw new IllegalArgumentException(("Invalid URL port: \"" + substring2 + "\"").toString());
                    }
                    z = false;
                } else {
                    z = false;
                    this.f82744d = sd0.m29642a(C30940b.m31530a(input, i2, m31535b, false, 4));
                    String str = this.f82741a;
                    Intrinsics.m17074g(str);
                    this.f82745e = C30940b.m31532a(str);
                }
                if (this.f82744d == null) {
                    String substring3 = input.substring(i2, m31535b);
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                    throw new IllegalArgumentException(("Invalid URL host: \"" + substring3 + "\"").toString());
                }
                m26427a = m26426a;
            }
            int m26426a2 = z32.m26426a(m26427a, m26400b, input, "?#");
            if (m26427a != m26426a2) {
                char charAt2 = input.charAt(m26427a);
                if (charAt2 != '/' && charAt2 != '\\') {
                    ArrayList arrayList = this.f82746f;
                    arrayList.set(arrayList.size() - 1, "");
                } else {
                    this.f82746f.clear();
                    this.f82746f.add("");
                    m26427a++;
                }
                int i4 = m26427a;
                while (i4 < m26426a2) {
                    int m26426a3 = z32.m26426a(i4, m26426a2, input, "/\\");
                    boolean z4 = m26426a3 < m26426a2 ? true : z;
                    String m31531a2 = C30940b.m31531a(input, i4, m26426a3, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                    if (!Intrinsics.m17075f(m31531a2, ".")) {
                        m16615y = StringsJVM.m16615y(m31531a2, "%2e", true);
                        if (!m16615y) {
                            if (!Intrinsics.m17075f(m31531a2, "..")) {
                                m16615y2 = StringsJVM.m16615y(m31531a2, "%2e.", true);
                                if (!m16615y2) {
                                    m16615y3 = StringsJVM.m16615y(m31531a2, ".%2e", true);
                                    if (!m16615y3) {
                                        m16615y4 = StringsJVM.m16615y(m31531a2, "%2e%2e", true);
                                        if (!m16615y4) {
                                            ArrayList arrayList2 = this.f82746f;
                                            if (((CharSequence) arrayList2.get(arrayList2.size() - 1)).length() == 0) {
                                                ArrayList arrayList3 = this.f82746f;
                                                arrayList3.set(arrayList3.size() - 1, m31531a2);
                                            } else {
                                                this.f82746f.add(m31531a2);
                                            }
                                            if (z4) {
                                                this.f82746f.add("");
                                            }
                                        }
                                    }
                                }
                            }
                            ArrayList arrayList4 = this.f82746f;
                            if (((String) arrayList4.remove(arrayList4.size() - 1)).length() == 0 && (!this.f82746f.isEmpty())) {
                                ArrayList arrayList5 = this.f82746f;
                                arrayList5.set(arrayList5.size() - 1, "");
                            } else {
                                this.f82746f.add("");
                            }
                        }
                    }
                    i4 = z4 ? m26426a3 + 1 : m26426a3;
                }
            }
            if (m26426a2 >= m26400b || input.charAt(m26426a2) != '?') {
                c = '#';
            } else {
                c = '#';
                int m26416a2 = z32.m26416a(input, '#', m26426a2, m26400b);
                this.f82747g = C30940b.m31529b(C30940b.m31531a(input, m26426a2 + 1, m26416a2, " \"'<>#", true, false, true, false, 208));
                m26426a2 = m26416a2;
            }
            if (m26426a2 < m26400b && input.charAt(m26426a2) == c) {
                this.f82748h = C30940b.m31531a(input, m26426a2 + 1, m26400b, "", true, false, false, true, 176);
            }
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30938a m31551a(int i) {
            if (1 <= i && i < 65536) {
                this.f82745e = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nf0$b */
    /* loaded from: classes8.dex */
    public static final class C30940b {
        private C30940b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:90:0x0105, code lost:
            if (com.yandex.mobile.ads.impl.z32.m26429a(r17.charAt(r12)) != (-1)) goto L68;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0120 A[LOOP:2: B:99:0x011a->B:101:0x0120, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0112  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String m31531a(java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, int r25) {
            /*
                Method dump skipped, instructions count: 349
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nf0.C30940b.m31531a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
        }

        @NotNull
        /* renamed from: b */
        public static ArrayList m31529b(@NotNull String str) {
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
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    arrayList.add(substring);
                    String substring2 = str.substring(m16568d02 + 1, i2);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        public /* synthetic */ C30940b(int i) {
            this();
        }

        /* renamed from: a */
        public static int m31532a(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.m17075f(scheme, "http")) {
                return 80;
            }
            return Intrinsics.m17075f(scheme, "https") ? 443 : -1;
        }

        /* renamed from: a */
        public static String m31530a(String str, int i, int i2, boolean z, int i3) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(str, "<this>");
            int i5 = i;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C39200e c39200e = new C39200e();
                    c39200e.writeUtf8(str, i, i5);
                    while (i5 < i2) {
                        int codePointAt = str.codePointAt(i5);
                        if (codePointAt == 37 && (i4 = i5 + 2) < i2) {
                            int m26429a = z32.m26429a(str.charAt(i5 + 1));
                            int m26429a2 = z32.m26429a(str.charAt(i4));
                            if (m26429a != -1 && m26429a2 != -1) {
                                c39200e.writeByte((m26429a << 4) + m26429a2);
                                i5 = Character.charCount(codePointAt) + i4;
                            }
                            c39200e.m13598V(codePointAt);
                            i5 += Character.charCount(codePointAt);
                        } else {
                            if (codePointAt == 43 && z) {
                                c39200e.writeByte(32);
                                i5++;
                            }
                            c39200e.m13598V(codePointAt);
                            i5 += Character.charCount(codePointAt);
                        }
                    }
                    return c39200e.readUtf8();
                }
                i5++;
            }
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
    }

    public nf0(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i, @NotNull ArrayList pathSegments, @Nullable ArrayList arrayList, @Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f82732a = scheme;
        this.f82733b = username;
        this.f82734c = password;
        this.f82735d = host;
        this.f82736e = i;
        this.f82737f = arrayList;
        this.f82738g = str;
        this.f82739h = url;
        this.f82740i = Intrinsics.m17075f(scheme, "https");
    }

    @NotNull
    /* renamed from: b */
    public final String m31564b() {
        int m16568d0;
        int m16568d02;
        if (this.f82734c.length() != 0) {
            m16568d0 = C37690r.m16568d0(this.f82739h, ':', this.f82732a.length() + 3, false, 4, null);
            m16568d02 = C37690r.m16568d0(this.f82739h, '@', 0, false, 6, null);
            String substring = this.f82739h.substring(m16568d0 + 1, m16568d02);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return "";
    }

    @NotNull
    /* renamed from: c */
    public final String m31563c() {
        int m16568d0;
        m16568d0 = C37690r.m16568d0(this.f82739h, '/', this.f82732a.length() + 3, false, 4, null);
        String str = this.f82739h;
        String substring = this.f82739h.substring(m16568d0, z32.m26426a(m16568d0, str.length(), str, "?#"));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    /* renamed from: d */
    public final ArrayList m31562d() {
        int m16568d0;
        m16568d0 = C37690r.m16568d0(this.f82739h, '/', this.f82732a.length() + 3, false, 4, null);
        String str = this.f82739h;
        int m26426a = z32.m26426a(m16568d0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (m16568d0 < m26426a) {
            int i = m16568d0 + 1;
            int m26416a = z32.m26416a(this.f82739h, '/', i, m26426a);
            String substring = this.f82739h.substring(i, m26416a);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            arrayList.add(substring);
            m16568d0 = m26416a;
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: e */
    public final String m31561e() {
        int m16568d0;
        if (this.f82737f != null) {
            m16568d0 = C37690r.m16568d0(this.f82739h, '?', 0, false, 6, null);
            int i = m16568d0 + 1;
            String str = this.f82739h;
            String substring = this.f82739h.substring(i, z32.m26416a(str, '#', i, str.length()));
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof nf0) && Intrinsics.m17075f(((nf0) obj).f82739h, this.f82739h)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final String m31560f() {
        if (this.f82733b.length() == 0) {
            return "";
        }
        int length = this.f82732a.length() + 3;
        String str = this.f82739h;
        String substring = this.f82739h.substring(length, z32.m26426a(length, str.length(), str, ":@"));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    /* renamed from: g */
    public final String m31559g() {
        return this.f82735d;
    }

    /* renamed from: h */
    public final boolean m31558h() {
        return this.f82740i;
    }

    public final int hashCode() {
        return this.f82739h.hashCode();
    }

    /* renamed from: i */
    public final int m31557i() {
        return this.f82736e;
    }

    @NotNull
    /* renamed from: j */
    public final String m31556j() {
        C30938a c30938a;
        Intrinsics.checkNotNullParameter("/...", "link");
        try {
            c30938a = new C30938a().m31550a(this, "/...");
        } catch (IllegalArgumentException unused) {
            c30938a = null;
        }
        Intrinsics.m17074g(c30938a);
        return c30938a.m31541e().m31545c().m31552a().f82739h;
    }

    @NotNull
    /* renamed from: k */
    public final String m31555k() {
        return this.f82732a;
    }

    @NotNull
    /* renamed from: l */
    public final URI m31554l() {
        int i;
        int m16568d0;
        String substring;
        C30938a c30938a = new C30938a();
        c30938a.m31537h(this.f82732a);
        c30938a.m31539f(m31560f());
        c30938a.m31540e(m31564b());
        c30938a.m31538g(this.f82735d);
        if (this.f82736e != C30940b.m31532a(this.f82732a)) {
            i = this.f82736e;
        } else {
            i = -1;
        }
        c30938a.m31547b(i);
        c30938a.m31548b().clear();
        c30938a.m31548b().addAll(m31562d());
        c30938a.m31549a(m31561e());
        if (this.f82738g != null) {
            m16568d0 = C37690r.m16568d0(this.f82739h, '#', 0, false, 6, null);
            substring = this.f82739h.substring(m16568d0 + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        } else {
            substring = null;
        }
        c30938a.m31542d(substring);
        String c30938a2 = c30938a.m31543d().toString();
        try {
            return new URI(c30938a2);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(c30938a2, ""));
                Intrinsics.m17074g(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    @NotNull
    /* renamed from: m */
    public final URL m31553m() {
        try {
            return new URL(this.f82739h);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @NotNull
    public final String toString() {
        return this.f82739h;
    }
}
