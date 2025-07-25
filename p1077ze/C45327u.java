package p1077ze;

import ae.KMarkers;
import af.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37563v;
import kotlin.collections.MutableCollections;
import kotlin.jvm.internal.C37598c;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1001ud.progressionUtil;
import p675ff.dates;
import p804nd.C38513v;

/* compiled from: Headers.kt */
@Metadata
/* renamed from: ze.u */
/* loaded from: classes10.dex */
public final class C45327u implements Iterable<Tuples<? extends String, ? extends String>>, KMarkers {
    @NotNull

    /* renamed from: c */
    public static final C45329b f119324c = new C45329b(null);
    @NotNull

    /* renamed from: b */
    private final String[] f119325b;

    /* compiled from: Headers.kt */
    @Metadata
    /* renamed from: ze.u$a */
    /* loaded from: classes10.dex */
    public static final class C45328a {
        @NotNull

        /* renamed from: a */
        private final List<String> f119326a = new ArrayList(20);

        @NotNull
        /* renamed from: a */
        public final C45328a m194a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            C45329b c45329b = C45327u.f119324c;
            c45329b.m182d(name);
            c45329b.m181e(value, name);
            m192c(name, value);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C45328a m193b(@NotNull String line) {
            int m16568d0;
            Intrinsics.checkNotNullParameter(line, "line");
            m16568d0 = C37690r.m16568d0(line, ':', 1, false, 4, null);
            if (m16568d0 != -1) {
                String substring = line.substring(0, m16568d0);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(m16568d0 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                m192c(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
                m192c("", substring3);
            } else {
                m192c("", line);
            }
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final C45328a m192c(@NotNull String name, @NotNull String value) {
            CharSequence m16571b1;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            m188g().add(name);
            List<String> m188g = m188g();
            m16571b1 = C37690r.m16571b1(value);
            m188g.add(m16571b1.toString());
            return this;
        }

        @NotNull
        /* renamed from: d */
        public final C45328a m191d(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            C45327u.f119324c.m182d(name);
            m192c(name, value);
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final C45327u m190e() {
            Object[] array = this.f119326a.toArray(new String[0]);
            if (array != null) {
                return new C45327u((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        @Nullable
        /* renamed from: f */
        public final String m189f(@NotNull String name) {
            boolean m16615y;
            Intrinsics.checkNotNullParameter(name, "name");
            int size = this.f119326a.size() - 2;
            int m2862c = progressionUtil.m2862c(size, 0, -2);
            if (m2862c > size) {
                return null;
            }
            while (true) {
                int i = size - 2;
                m16615y = StringsJVM.m16615y(name, this.f119326a.get(size), true);
                if (m16615y) {
                    return this.f119326a.get(size + 1);
                }
                if (size != m2862c) {
                    size = i;
                } else {
                    return null;
                }
            }
        }

        @NotNull
        /* renamed from: g */
        public final List<String> m188g() {
            return this.f119326a;
        }

        @NotNull
        /* renamed from: h */
        public final C45328a m187h(@NotNull String name) {
            boolean m16615y;
            Intrinsics.checkNotNullParameter(name, "name");
            int i = 0;
            while (i < m188g().size()) {
                m16615y = StringsJVM.m16615y(name, m188g().get(i), true);
                if (m16615y) {
                    m188g().remove(i);
                    m188g().remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        @NotNull
        /* renamed from: i */
        public final C45328a m186i(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            C45329b c45329b = C45327u.f119324c;
            c45329b.m182d(name);
            c45329b.m181e(value, name);
            m187h(name);
            m192c(name, value);
            return this;
        }
    }

    /* compiled from: Headers.kt */
    @Metadata
    /* renamed from: ze.u$b */
    /* loaded from: classes10.dex */
    public static final class C45329b {
        private C45329b() {
        }

        public /* synthetic */ C45329b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public final void m182d(String str) {
            boolean z;
            boolean z2;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && charAt < 127) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i = i2;
                    } else {
                        throw new IllegalArgumentException(Util.m105719t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x005b A[LOOP:0: B:30:0x0006->B:50:0x005b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0026 A[SYNTHETIC] */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m181e(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                int r0 = r8.length()
                r1 = 0
                r2 = r1
            L6:
                if (r2 >= r0) goto L5d
                int r3 = r2 + 1
                char r4 = r8.charAt(r2)
                r5 = 9
                r6 = 1
                if (r4 == r5) goto L23
                r5 = 32
                if (r5 > r4) goto L1d
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L1d
                r5 = r6
                goto L1e
            L1d:
                r5 = r1
            L1e:
                if (r5 == 0) goto L21
                goto L23
            L21:
                r5 = r1
                goto L24
            L23:
                r5 = r6
            L24:
                if (r5 != 0) goto L5b
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r6] = r1
                r1 = 2
                r0[r1] = r9
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r0 = af.Util.m105719t(r1, r0)
                boolean r9 = af.Util.m105758H(r9)
                if (r9 == 0) goto L47
                java.lang.String r8 = ""
                goto L4d
            L47:
                java.lang.String r9 = ": "
                java.lang.String r8 = kotlin.jvm.internal.Intrinsics.m17064q(r9, r8)
            L4d:
                java.lang.String r8 = kotlin.jvm.internal.Intrinsics.m17064q(r0, r8)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L5b:
                r2 = r3
                goto L6
            L5d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1077ze.C45327u.C45329b.m181e(java.lang.String, java.lang.String):void");
        }

        /* renamed from: f */
        public final String m180f(String[] strArr, String str) {
            boolean m16615y;
            int length = strArr.length - 2;
            int m2862c = progressionUtil.m2862c(length, 0, -2);
            if (m2862c > length) {
                return null;
            }
            while (true) {
                int i = length - 2;
                m16615y = StringsJVM.m16615y(str, strArr[length], true);
                if (m16615y) {
                    return strArr[length + 1];
                }
                if (length != m2862c) {
                    length = i;
                } else {
                    return null;
                }
            }
        }

        @NotNull
        /* renamed from: g */
        public final C45327u m179g(@NotNull String... namesAndValues) {
            boolean z;
            boolean z2;
            CharSequence m16571b1;
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            int i = 0;
            if (namesAndValues.length % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String[] strArr = (String[]) namesAndValues.clone();
                int length = strArr.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    String str = strArr[i2];
                    if (str != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        m16571b1 = C37690r.m16571b1(str);
                        strArr[i2] = m16571b1.toString();
                        i2 = i3;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int m2862c = progressionUtil.m2862c(0, strArr.length - 1, 2);
                if (m2862c >= 0) {
                    while (true) {
                        int i4 = i + 2;
                        String str2 = strArr[i];
                        String str3 = strArr[i + 1];
                        m182d(str2);
                        m181e(str3, str2);
                        if (i == m2862c) {
                            break;
                        }
                        i = i4;
                    }
                }
                return new C45327u(strArr, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public /* synthetic */ C45327u(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    @Nullable
    /* renamed from: a */
    public final String m202a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f119324c.m180f(this.f119325b, name);
    }

    @Nullable
    /* renamed from: b */
    public final Date m201b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String m202a = m202a(name);
        if (m202a == null) {
            return null;
        }
        return dates.m24636a(m202a);
    }

    @NotNull
    /* renamed from: c */
    public final String m200c(int i) {
        return this.f119325b[i * 2];
    }

    @NotNull
    /* renamed from: d */
    public final Set<String> m199d() {
        Comparator m16636A;
        m16636A = StringsJVM.m16636A(C37612s0.f99333a);
        TreeSet treeSet = new TreeSet(m16636A);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(m200c(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof C45327u) && Arrays.equals(this.f119325b, ((C45327u) obj).f119325b)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final C45328a m198f() {
        C45328a c45328a = new C45328a();
        MutableCollections.m17622F(c45328a.m188g(), this.f119325b);
        return c45328a;
    }

    @NotNull
    /* renamed from: g */
    public final Map<String, List<String>> m197g() {
        Comparator m16636A;
        m16636A = StringsJVM.m16636A(C37612s0.f99333a);
        TreeMap treeMap = new TreeMap(m16636A);
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String m200c = m200c(i);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = m200c.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(m196h(i));
            i = i2;
        }
        return treeMap;
    }

    @NotNull
    /* renamed from: h */
    public final String m196h(int i) {
        return this.f119325b[(i * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f119325b);
    }

    @NotNull
    /* renamed from: i */
    public final List<String> m195i(@NotNull String name) {
        List<String> m17166m;
        boolean m16615y;
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            m16615y = StringsJVM.m16615y(name, m200c(i), true);
            if (m16615y) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m196h(i));
            }
            i = i2;
        }
        if (arrayList == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Tuples<? extends String, ? extends String>> iterator() {
        int size = size();
        Tuples[] tuplesArr = new Tuples[size];
        for (int i = 0; i < size; i++) {
            tuplesArr[i] = C38513v.m14532a(m200c(i), m196h(i));
        }
        return C37598c.m17055a(tuplesArr);
    }

    public final int size() {
        return this.f119325b.length / 2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String m200c = m200c(i);
            String m196h = m196h(i);
            sb2.append(m200c);
            sb2.append(": ");
            if (Util.m105758H(m200c)) {
                m196h = "██";
            }
            sb2.append(m196h);
            sb2.append("\n");
            i = i2;
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    private C45327u(String[] strArr) {
        this.f119325b = strArr;
    }
}
