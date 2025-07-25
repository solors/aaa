package p833p9;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37563v;
import kotlin.collections.MutableCollections;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C37629d;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;
import p833p9.DivStatePath;

@Metadata
/* renamed from: p9.e */
/* loaded from: classes8.dex */
public final class DivStatePath {
    @NotNull

    /* renamed from: e */
    public static final C39290a f103160e = new C39290a(null);

    /* renamed from: a */
    private final long f103161a;
    @NotNull

    /* renamed from: b */
    private final List<Tuples<String, String>> f103162b;
    @NotNull

    /* renamed from: c */
    private final String f103163c;
    @Nullable

    /* renamed from: d */
    private final String f103164d;

    /* compiled from: DivStatePath.kt */
    @Metadata
    /* renamed from: p9.e$a */
    /* loaded from: classes8.dex */
    public static final class C39290a {
        private C39290a() {
        }

        public /* synthetic */ C39290a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static final int m13233c(DivStatePath lhs, DivStatePath rhs) {
            String m13227c;
            String m13227c2;
            String m13226d;
            String m13226d2;
            if (lhs.m13240i() != rhs.m13240i()) {
                return (int) (lhs.m13240i() - rhs.m13240i());
            }
            Intrinsics.checkNotNullExpressionValue(lhs, "lhs");
            int size = lhs.f103162b.size();
            Intrinsics.checkNotNullExpressionValue(rhs, "rhs");
            int min = Math.min(size, rhs.f103162b.size());
            for (int i = 0; i < min; i++) {
                Tuples tuples = (Tuples) lhs.f103162b.get(i);
                Tuples tuples2 = (Tuples) rhs.f103162b.get(i);
                m13227c = C39291f.m13227c(tuples);
                m13227c2 = C39291f.m13227c(tuples2);
                int compareTo = m13227c.compareTo(m13227c2);
                if (compareTo == 0) {
                    m13226d = C39291f.m13226d(tuples);
                    m13226d2 = C39291f.m13226d(tuples2);
                    if (m13226d.compareTo(m13226d2) != 0) {
                        return compareTo;
                    }
                } else {
                    return compareTo;
                }
            }
            return lhs.f103162b.size() - rhs.f103162b.size();
        }

        @NotNull
        /* renamed from: b */
        public final Comparator<DivStatePath> m13234b() {
            return new Comparator() { // from class: p9.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m13233c;
                    m13233c = DivStatePath.C39290a.m13233c((DivStatePath) obj, (DivStatePath) obj2);
                    return m13233c;
                }
            };
        }

        @NotNull
        /* renamed from: d */
        public final DivStatePath m13232d(long j) {
            return new DivStatePath(j, new ArrayList(), null, null, 12, null);
        }

        @Nullable
        /* renamed from: e */
        public final DivStatePath m13231e(@NotNull DivStatePath somePath, @NotNull DivStatePath otherPath) {
            Object m17528s0;
            Intrinsics.checkNotNullParameter(somePath, "somePath");
            Intrinsics.checkNotNullParameter(otherPath, "otherPath");
            if (somePath.m13240i() != otherPath.m13240i()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : somePath.f103162b) {
                int i2 = i + 1;
                if (i < 0) {
                    C37563v.m17156w();
                }
                Tuples tuples = (Tuples) obj;
                m17528s0 = _Collections.m17528s0(otherPath.f103162b, i);
                Tuples tuples2 = (Tuples) m17528s0;
                if (tuples2 != null && Intrinsics.m17075f(tuples, tuples2)) {
                    arrayList.add(tuples);
                    i = i2;
                } else {
                    return new DivStatePath(somePath.m13240i(), arrayList, null, null, 12, null);
                }
            }
            return new DivStatePath(somePath.m13240i(), arrayList, null, null, 12, null);
        }

        @NotNull
        /* renamed from: f */
        public final DivStatePath m13230f(@NotNull String path) throws C39293j {
            List m16611C0;
            PrimitiveRanges m16900v;
            C37629d m16901u;
            Intrinsics.checkNotNullParameter(path, "path");
            ArrayList arrayList = new ArrayList();
            m16611C0 = C37690r.m16611C0(path, new String[]{RemoteSettings.FORWARD_SLASH_STRING}, false, 0, 6, null);
            try {
                long parseLong = Long.parseLong((String) m16611C0.get(0));
                if (m16611C0.size() % 2 == 1) {
                    m16900v = _Ranges.m16900v(1, m16611C0.size());
                    m16901u = _Ranges.m16901u(m16900v, 2);
                    int m16953c = m16901u.m16953c();
                    int m16952d = m16901u.m16952d();
                    int m16951f = m16901u.m16951f();
                    if ((m16951f > 0 && m16953c <= m16952d) || (m16951f < 0 && m16952d <= m16953c)) {
                        while (true) {
                            arrayList.add(C38513v.m14532a(m16611C0.get(m16953c), m16611C0.get(m16953c + 1)));
                            if (m16953c == m16952d) {
                                break;
                            }
                            m16953c += m16951f;
                        }
                    }
                    return new DivStatePath(parseLong, arrayList, null, null, 12, null);
                }
                throw new C39293j("Must be even number of states in path: " + path, null, 2, null);
            } catch (NumberFormatException e) {
                throw new C39293j("Top level id must be number: " + path, e);
            }
        }
    }

    @VisibleForTesting
    public DivStatePath(long j, @NotNull List<Tuples<String, String>> states, @NotNull String fullPath, @Nullable String str) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(fullPath, "fullPath");
        this.f103161a = j;
        this.f103162b = states;
        this.f103163c = fullPath;
        this.f103164d = str;
    }

    @NotNull
    /* renamed from: m */
    public static final DivStatePath m13236m(@NotNull String str) throws C39293j {
        return f103160e.m13230f(str);
    }

    @NotNull
    /* renamed from: b */
    public final DivStatePath m13247b(@NotNull String divId, @NotNull String stateId) {
        List m17550c1;
        Intrinsics.checkNotNullParameter(divId, "divId");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        m17550c1 = _Collections.m17550c1(this.f103162b);
        m17550c1.add(C38513v.m14532a(divId, stateId));
        return new DivStatePath(this.f103161a, m17550c1, this.f103163c + '/' + divId + '/' + stateId, this.f103163c);
    }

    @NotNull
    /* renamed from: c */
    public final DivStatePath m13246c(@NotNull String divId) {
        Intrinsics.checkNotNullParameter(divId, "divId");
        return new DivStatePath(this.f103161a, this.f103162b, this.f103163c + '/' + divId, this.f103163c);
    }

    @NotNull
    /* renamed from: d */
    public final String m13245d() {
        return this.f103163c;
    }

    @Nullable
    /* renamed from: e */
    public final String m13244e() {
        Object m17577B0;
        String m13226d;
        if (!this.f103162b.isEmpty()) {
            m17577B0 = _Collections.m17577B0(this.f103162b);
            m13226d = C39291f.m13226d((Tuples) m17577B0);
            return m13226d;
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivStatePath)) {
            return false;
        }
        DivStatePath divStatePath = (DivStatePath) obj;
        if (this.f103161a == divStatePath.f103161a && Intrinsics.m17075f(this.f103162b, divStatePath.f103162b) && Intrinsics.m17075f(this.f103163c, divStatePath.f103163c) && Intrinsics.m17075f(this.f103164d, divStatePath.f103164d)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final String m13243f() {
        return this.f103164d;
    }

    @Nullable
    /* renamed from: g */
    public final String m13242g() {
        Object m17577B0;
        String m13227c;
        if (this.f103162b.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        long j = this.f103161a;
        List<Tuples<String, String>> list = this.f103162b;
        sb2.append(new DivStatePath(j, list.subList(0, list.size() - 1), null, null, 12, null));
        sb2.append('/');
        m17577B0 = _Collections.m17577B0(this.f103162b);
        m13227c = C39291f.m13227c((Tuples) m17577B0);
        sb2.append(m13227c);
        return sb2.toString();
    }

    @NotNull
    /* renamed from: h */
    public final List<Tuples<String, String>> m13241h() {
        return this.f103162b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((Long.hashCode(this.f103161a) * 31) + this.f103162b.hashCode()) * 31) + this.f103163c.hashCode()) * 31;
        String str = this.f103164d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    /* renamed from: i */
    public final long m13240i() {
        return this.f103161a;
    }

    /* renamed from: j */
    public final boolean m13239j(@NotNull DivStatePath other) {
        String m13227c;
        String m13227c2;
        String m13226d;
        String m13226d2;
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.f103161a != other.f103161a || this.f103162b.size() >= other.f103162b.size()) {
            return false;
        }
        int i = 0;
        for (Object obj : this.f103162b) {
            int i2 = i + 1;
            if (i < 0) {
                C37563v.m17156w();
            }
            Tuples tuples = (Tuples) obj;
            Tuples<String, String> tuples2 = other.f103162b.get(i);
            m13227c = C39291f.m13227c(tuples);
            m13227c2 = C39291f.m13227c(tuples2);
            if (Intrinsics.m17075f(m13227c, m13227c2)) {
                m13226d = C39291f.m13226d(tuples);
                m13226d2 = C39291f.m13226d(tuples2);
                if (Intrinsics.m17075f(m13226d, m13226d2)) {
                    i = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m13238k() {
        return this.f103162b.isEmpty();
    }

    @NotNull
    /* renamed from: l */
    public final DivStatePath m13237l() {
        List m17550c1;
        if (!m13238k()) {
            m17550c1 = _Collections.m17550c1(this.f103162b);
            MutableCollections.m17611Q(m17550c1);
            return new DivStatePath(this.f103161a, m17550c1, null, null, 12, null);
        }
        return this;
    }

    @NotNull
    public String toString() {
        String m17521z0;
        String m13227c;
        String m13226d;
        List m17163p;
        if (!this.f103162b.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f103161a);
            sb2.append('/');
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.f103162b.iterator();
            while (it.hasNext()) {
                Tuples tuples = (Tuples) it.next();
                m13227c = C39291f.m13227c(tuples);
                m13226d = C39291f.m13226d(tuples);
                m17163p = C37563v.m17163p(m13227c, m13226d);
                MutableCollections.m17624D(arrayList, m17163p);
            }
            m17521z0 = _Collections.m17521z0(arrayList, RemoteSettings.FORWARD_SLASH_STRING, null, null, 0, null, null, 62, null);
            sb2.append(m17521z0);
            return sb2.toString();
        }
        return String.valueOf(this.f103161a);
    }

    public /* synthetic */ DivStatePath(long j, List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? C37563v.m17166m() : list, (i & 4) != 0 ? String.valueOf(j) : str, (i & 8) != 0 ? null : str2);
    }
}
