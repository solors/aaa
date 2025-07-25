package okio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p822of.C39178d;

/* compiled from: Path.kt */
@Metadata
/* renamed from: okio.s0 */
/* loaded from: classes10.dex */
public final class C39223s0 implements Comparable<C39223s0> {
    @NotNull

    /* renamed from: c */
    public static final C39224a f103001c = new C39224a(null);
    @NotNull

    /* renamed from: d */
    public static final String f103002d;
    @NotNull

    /* renamed from: b */
    private final C39208h f103003b;

    /* compiled from: Path.kt */
    @Metadata
    /* renamed from: okio.s0$a */
    /* loaded from: classes10.dex */
    public static final class C39224a {
        private C39224a() {
        }

        public /* synthetic */ C39224a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ C39223s0 m13447d(C39224a c39224a, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return c39224a.m13450a(file, z);
        }

        /* renamed from: e */
        public static /* synthetic */ C39223s0 m13446e(C39224a c39224a, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return c39224a.m13449b(str, z);
        }

        /* renamed from: f */
        public static /* synthetic */ C39223s0 m13445f(C39224a c39224a, Path path, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return c39224a.m13448c(path, z);
        }

        @NotNull
        /* renamed from: a */
        public final C39223s0 m13450a(@NotNull File file, boolean z) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String file2 = file.toString();
            Intrinsics.checkNotNullExpressionValue(file2, "toString()");
            return m13449b(file2, z);
        }

        @NotNull
        /* renamed from: b */
        public final C39223s0 m13449b(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return C39178d.m13697k(str, z);
        }

        @NotNull
        /* renamed from: c */
        public final C39223s0 m13448c(@NotNull Path path, boolean z) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return m13449b(path.toString(), z);
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f103002d = separator;
    }

    public C39223s0(@NotNull C39208h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f103003b = bytes;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(@NotNull C39223s0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return m13461c().compareTo(other.m13461c());
    }

    @NotNull
    /* renamed from: c */
    public final C39208h m13461c() {
        return this.f103003b;
    }

    @Nullable
    /* renamed from: d */
    public final C39223s0 m13460d() {
        int m13693o;
        m13693o = C39178d.m13693o(this);
        if (m13693o == -1) {
            return null;
        }
        return new C39223s0(m13461c().mo13405E(0, m13693o));
    }

    @NotNull
    /* renamed from: e */
    public final List<C39208h> m13459e() {
        int m13693o;
        ArrayList arrayList = new ArrayList();
        m13693o = C39178d.m13693o(this);
        if (m13693o == -1) {
            m13693o = 0;
        } else if (m13693o < m13461c().m13569C() && m13461c().m13562g(m13693o) == 92) {
            m13693o++;
        }
        int m13569C = m13461c().m13569C();
        int i = m13693o;
        while (m13693o < m13569C) {
            if (m13461c().m13562g(m13693o) == 47 || m13461c().m13562g(m13693o) == 92) {
                arrayList.add(m13461c().mo13405E(i, m13693o));
                i = m13693o + 1;
            }
            m13693o++;
        }
        if (i < m13461c().m13569C()) {
            arrayList.add(m13461c().mo13405E(i, m13461c().m13569C()));
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof C39223s0) && Intrinsics.m17075f(((C39223s0) obj).m13461c(), m13461c())) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final String m13458f() {
        return m13457g().m13566H();
    }

    @NotNull
    /* renamed from: g */
    public final C39208h m13457g() {
        int m13696l;
        m13696l = C39178d.m13696l(this);
        if (m13696l != -1) {
            return C39208h.m13567F(m13461c(), m13696l + 1, 0, 2, null);
        }
        if (m13451m() != null && m13461c().m13569C() == 2) {
            return C39208h.f102953g;
        }
        return m13461c();
    }

    @Nullable
    /* renamed from: h */
    public final C39223s0 m13456h() {
        C39208h c39208h;
        C39208h c39208h2;
        C39208h c39208h3;
        boolean m13694n;
        int m13696l;
        C39223s0 c39223s0;
        C39208h c39208h4;
        C39208h c39208h5;
        C39208h m13461c = m13461c();
        c39208h = C39178d.f102887d;
        if (Intrinsics.m17075f(m13461c, c39208h)) {
            return null;
        }
        C39208h m13461c2 = m13461c();
        c39208h2 = C39178d.f102884a;
        if (Intrinsics.m17075f(m13461c2, c39208h2)) {
            return null;
        }
        C39208h m13461c3 = m13461c();
        c39208h3 = C39178d.f102885b;
        if (!Intrinsics.m17075f(m13461c3, c39208h3)) {
            m13694n = C39178d.m13694n(this);
            if (!m13694n) {
                m13696l = C39178d.m13696l(this);
                if (m13696l == 2 && m13451m() != null) {
                    if (m13461c().m13569C() == 3) {
                        return null;
                    }
                    c39223s0 = new C39223s0(C39208h.m13567F(m13461c(), 0, 3, 1, null));
                } else {
                    if (m13696l == 1) {
                        C39208h m13461c4 = m13461c();
                        c39208h5 = C39178d.f102885b;
                        if (m13461c4.m13568D(c39208h5)) {
                            return null;
                        }
                    }
                    if (m13696l == -1 && m13451m() != null) {
                        if (m13461c().m13569C() == 2) {
                            return null;
                        }
                        c39223s0 = new C39223s0(C39208h.m13567F(m13461c(), 0, 2, 1, null));
                    } else if (m13696l == -1) {
                        c39208h4 = C39178d.f102887d;
                        return new C39223s0(c39208h4);
                    } else if (m13696l == 0) {
                        c39223s0 = new C39223s0(C39208h.m13567F(m13461c(), 0, 1, 1, null));
                    } else {
                        return new C39223s0(C39208h.m13567F(m13461c(), 0, m13696l, 1, null));
                    }
                }
                return c39223s0;
            }
            return null;
        }
        return null;
    }

    public int hashCode() {
        return m13461c().hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
        r9 = p822of.C39178d.m13695m(r8);
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okio.C39223s0 m13455i(@org.jetbrains.annotations.NotNull okio.C39223s0 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            okio.s0 r0 = r8.m13460d()
            okio.s0 r1 = r9.m13460d()
            boolean r0 = kotlin.jvm.internal.Intrinsics.m17075f(r0, r1)
            java.lang.String r1 = " and "
            if (r0 == 0) goto Lda
            java.util.List r0 = r8.m13459e()
            java.util.List r2 = r9.m13459e()
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = 0
            r5 = r4
        L2b:
            if (r5 >= r3) goto L3e
            java.lang.Object r6 = r0.get(r5)
            java.lang.Object r7 = r2.get(r5)
            boolean r6 = kotlin.jvm.internal.Intrinsics.m17075f(r6, r7)
            if (r6 == 0) goto L3e
            int r5 = r5 + 1
            goto L2b
        L3e:
            r6 = 1
            if (r5 != r3) goto L5d
            okio.h r3 = r8.m13461c()
            int r3 = r3.m13569C()
            okio.h r7 = r9.m13461c()
            int r7 = r7.m13569C()
            if (r3 != r7) goto L5d
            okio.s0$a r9 = okio.C39223s0.f103001c
            java.lang.String r0 = "."
            r1 = 0
            okio.s0 r9 = okio.C39223s0.C39224a.m13446e(r9, r0, r4, r6, r1)
            goto Lb8
        L5d:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            okio.h r7 = p822of.C39178d.m13705c()
            int r3 = r3.indexOf(r7)
            r7 = -1
            if (r3 != r7) goto L71
            goto L72
        L71:
            r6 = r4
        L72:
            if (r6 == 0) goto Lb9
            okio.e r1 = new okio.e
            r1.<init>()
            okio.h r9 = p822of.C39178d.m13702f(r9)
            if (r9 != 0) goto L8b
            okio.h r9 = p822of.C39178d.m13702f(r8)
            if (r9 != 0) goto L8b
            java.lang.String r9 = okio.C39223s0.f103002d
            okio.h r9 = p822of.C39178d.m13699i(r9)
        L8b:
            int r2 = r2.size()
            r3 = r5
        L90:
            if (r3 >= r2) goto L9f
            okio.h r6 = p822of.C39178d.m13705c()
            r1.mo13441E(r6)
            r1.mo13441E(r9)
            int r3 = r3 + 1
            goto L90
        L9f:
            int r2 = r0.size()
        La3:
            if (r5 >= r2) goto Lb4
            java.lang.Object r3 = r0.get(r5)
            okio.h r3 = (okio.C39208h) r3
            r1.mo13441E(r3)
            r1.mo13441E(r9)
            int r5 = r5 + 1
            goto La3
        Lb4:
            okio.s0 r9 = p822of.C39178d.m13691q(r1, r4)
        Lb8:
            return r9
        Lb9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Impossible relative path to resolve: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        Lda:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Paths of different roots cannot be relative to each other: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C39223s0.m13455i(okio.s0):okio.s0");
    }

    public final boolean isAbsolute() {
        int m13693o;
        m13693o = C39178d.m13693o(this);
        if (m13693o != -1) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: j */
    public final C39223s0 m13454j(@NotNull String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return C39178d.m13698j(this, C39178d.m13691q(new C39200e().writeUtf8(child), false), false);
    }

    @NotNull
    /* renamed from: k */
    public final C39223s0 m13453k(@NotNull C39223s0 child, boolean z) {
        Intrinsics.checkNotNullParameter(child, "child");
        return C39178d.m13698j(this, child, z);
    }

    @NotNull
    /* renamed from: l */
    public final Path m13452l() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(toString())");
        return path;
    }

    @Nullable
    /* renamed from: m */
    public final Character m13451m() {
        C39208h c39208h;
        boolean z;
        C39208h m13461c = m13461c();
        c39208h = C39178d.f102884a;
        boolean z2 = false;
        if (C39208h.m13557o(m13461c, c39208h, 0, 2, null) != -1 || m13461c().m13569C() < 2 || m13461c().m13562g(1) != 58) {
            return null;
        }
        char m13562g = (char) m13461c().m13562g(0);
        if ('a' <= m13562g && m13562g < '{') {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if ('A' <= m13562g && m13562g < '[') {
                z2 = true;
            }
            if (!z2) {
                return null;
            }
        }
        return Character.valueOf(m13562g);
    }

    @NotNull
    public final File toFile() {
        return new File(toString());
    }

    @NotNull
    public String toString() {
        return m13461c().m13566H();
    }
}
