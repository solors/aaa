package com.yandex.mobile.ads.impl;

import ae.KMarkers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Tuples;
import kotlin.collections.C37563v;
import kotlin.collections.MutableCollections;
import kotlin.jvm.internal.C37598c;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1001ud.progressionUtil;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class zc0 implements Iterable<Tuples<? extends String, ? extends String>>, KMarkers {
    @NotNull

    /* renamed from: b */
    private final String[] f88821b;

    /* renamed from: com.yandex.mobile.ads.impl.zc0$b */
    /* loaded from: classes8.dex */
    public static final class C31972b {
        private C31972b() {
        }

        /* renamed from: b */
        public static void m26266b(String str) {
            if (str.length() > 0) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if ('!' > charAt || charAt >= 127) {
                        throw new IllegalArgumentException(z32.m26412a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        public /* synthetic */ C31972b(int i) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public static zc0 m26268a(@NotNull Map map) {
            CharSequence m16571b1;
            CharSequence m16571b12;
            Intrinsics.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                m16571b1 = C37690r.m16571b1((String) entry.getKey());
                String obj = m16571b1.toString();
                m16571b12 = C37690r.m16571b1((String) entry.getValue());
                String obj2 = m16571b12.toString();
                m26266b(obj);
                m26265b(obj2, obj);
                strArr[i] = obj;
                strArr[i + 1] = obj2;
                i += 2;
            }
            return new zc0(strArr, 0);
        }

        /* renamed from: b */
        public static void m26265b(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    throw new IllegalArgumentException((z32.m26412a("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2) + (z32.m26395c(str2) ? "" : ": " + str)).toString());
                }
            }
        }

        @NotNull
        /* renamed from: a */
        public static zc0 m26267a(@NotNull String... namesAndValues) {
            CharSequence m16571b1;
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 == 0) {
                String[] strArr = (String[]) namesAndValues.clone();
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    String str = strArr[i];
                    if (str != null) {
                        m16571b1 = C37690r.m16571b1(str);
                        strArr[i] = m16571b1.toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int m2862c = progressionUtil.m2862c(0, strArr.length - 1, 2);
                if (m2862c >= 0) {
                    int i2 = 0;
                    while (true) {
                        String str2 = strArr[i2];
                        String str3 = strArr[i2 + 1];
                        m26266b(str2);
                        m26265b(str3, str2);
                        if (i2 == m2862c) {
                            break;
                        }
                        i2 += 2;
                    }
                }
                return new zc0(strArr, 0);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    private zc0(String[] strArr) {
        this.f88821b = strArr;
    }

    /* JADX WARN: Incorrect condition in loop: B:33:0x0019 */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m26279a(@org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String[] r0 = r5.f88821b
            int r1 = r0.length
            int r1 = r1 + (-2)
            r2 = 0
            r3 = -2
            int r2 = p1001ud.progressionUtil.m2862c(r1, r2, r3)
            if (r2 > r1) goto L24
        L12:
            r3 = r0[r1]
            r4 = 1
            boolean r3 = kotlin.text.C37686h.m16656y(r6, r3, r4)
            if (r3 == 0) goto L1f
            int r1 = r1 + r4
            r6 = r0[r1]
            goto L25
        L1f:
            if (r1 == r2) goto L24
            int r1 = r1 + (-2)
            goto L12
        L24:
            r6 = 0
        L25:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zc0.m26279a(java.lang.String):java.lang.String");
    }

    @NotNull
    /* renamed from: b */
    public final String m26277b(int i) {
        return this.f88821b[(i * 2) + 1];
    }

    @NotNull
    /* renamed from: c */
    public final TreeMap m26276c() {
        Comparator m16636A;
        m16636A = StringsJVM.m16636A(C37612s0.f99333a);
        TreeMap treeMap = new TreeMap(m16636A);
        int length = this.f88821b.length / 2;
        for (int i = 0; i < length; i++) {
            String str = this.f88821b[i * 2];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(m26277b(i));
        }
        return treeMap;
    }

    @NotNull
    /* renamed from: d */
    public final List m26275d() {
        List m17166m;
        boolean m16615y;
        Intrinsics.checkNotNullParameter("Set-Cookie", "name");
        int length = this.f88821b.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            m16615y = StringsJVM.m16615y("Set-Cookie", this.f88821b[i * 2], true);
            if (m16615y) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m26277b(i));
            }
        }
        if (arrayList == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.m17074g(unmodifiableList);
        return unmodifiableList;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof zc0) && Arrays.equals(this.f88821b, ((zc0) obj).f88821b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f88821b);
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Tuples<? extends String, ? extends String>> iterator() {
        int length = this.f88821b.length / 2;
        Tuples[] tuplesArr = new Tuples[length];
        for (int i = 0; i < length; i++) {
            tuplesArr[i] = C38513v.m14532a(this.f88821b[i * 2], m26277b(i));
        }
        return C37598c.m17055a(tuplesArr);
    }

    public final int size() {
        return this.f88821b.length / 2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int length = this.f88821b.length / 2;
        for (int i = 0; i < length; i++) {
            String str = this.f88821b[i * 2];
            String m26277b = m26277b(i);
            sb2.append(str);
            sb2.append(": ");
            if (z32.m26395c(str)) {
                m26277b = "██";
            }
            sb2.append(m26277b);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    /* renamed from: b */
    public final C31971a m26278b() {
        C31971a c31971a = new C31971a();
        MutableCollections.m17622F(c31971a.m26271b(), this.f88821b);
        return c31971a;
    }

    /* renamed from: com.yandex.mobile.ads.impl.zc0$a */
    /* loaded from: classes8.dex */
    public static final class C31971a {
        @NotNull

        /* renamed from: a */
        private final ArrayList f88822a = new ArrayList(20);

        @NotNull
        /* renamed from: a */
        public final void m26272a(@NotNull String name, @NotNull String value) {
            CharSequence m16571b1;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f88822a.add(name);
            ArrayList arrayList = this.f88822a;
            m16571b1 = C37690r.m16571b1(value);
            arrayList.add(m16571b1.toString());
        }

        @NotNull
        /* renamed from: b */
        public final ArrayList m26271b() {
            return this.f88822a;
        }

        @NotNull
        /* renamed from: a */
        public final C31971a m26273a(@NotNull String name) {
            boolean m16615y;
            Intrinsics.checkNotNullParameter(name, "name");
            int i = 0;
            while (i < this.f88822a.size()) {
                m16615y = StringsJVM.m16615y(name, (String) this.f88822a.get(i), true);
                if (m16615y) {
                    this.f88822a.remove(i);
                    this.f88822a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final zc0 m26274a() {
            return new zc0((String[]) this.f88822a.toArray(new String[0]), 0);
        }
    }

    public /* synthetic */ zc0(String[] strArr, int i) {
        this(strArr);
    }

    @NotNull
    /* renamed from: a */
    public final String m26280a(int i) {
        return this.f88821b[i * 2];
    }
}
