package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C31840xt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class n22 {
    @Nullable

    /* renamed from: a */
    public final String f82584a;
    @Nullable

    /* renamed from: b */
    public final String f82585b;

    /* renamed from: c */
    public final boolean f82586c;

    /* renamed from: d */
    public final long f82587d;

    /* renamed from: e */
    public final long f82588e;
    @Nullable

    /* renamed from: f */
    public final q22 f82589f;
    @Nullable

    /* renamed from: g */
    private final String[] f82590g;

    /* renamed from: h */
    public final String f82591h;
    @Nullable

    /* renamed from: i */
    public final String f82592i;
    @Nullable

    /* renamed from: j */
    public final n22 f82593j;

    /* renamed from: k */
    private final HashMap<String, Integer> f82594k;

    /* renamed from: l */
    private final HashMap<String, Integer> f82595l;

    /* renamed from: m */
    private ArrayList f82596m;

    private n22(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable q22 q22Var, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable n22 n22Var) {
        boolean z;
        this.f82584a = str;
        this.f82585b = str2;
        this.f82592i = str4;
        this.f82589f = q22Var;
        this.f82590g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f82586c = z;
        this.f82587d = j;
        this.f82588e = j2;
        this.f82591h = (String) C30937nf.m31570a(str3);
        this.f82593j = n22Var;
        this.f82594k = new HashMap<>();
        this.f82595l = new HashMap<>();
    }

    /* renamed from: a */
    public final void m31684a(n22 n22Var) {
        if (this.f82596m == null) {
            this.f82596m = new ArrayList();
        }
        this.f82596m.add(n22Var);
    }

    /* renamed from: b */
    public final long[] m31679b() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        m31680a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    @Nullable
    /* renamed from: c */
    public final String[] m31678c() {
        return this.f82590g;
    }

    /* renamed from: a */
    public final n22 m31690a(int i) {
        ArrayList arrayList = this.f82596m;
        if (arrayList != null) {
            return (n22) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public final int m31691a() {
        ArrayList arrayList = this.f82596m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: a */
    private void m31680a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f82584a);
        boolean equals2 = "div".equals(this.f82584a);
        if (z || equals || (equals2 && this.f82592i != null)) {
            long j = this.f82587d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f82588e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f82596m == null) {
            return;
        }
        for (int i = 0; i < this.f82596m.size(); i++) {
            ((n22) this.f82596m.get(i)).m31680a(treeSet, z || equals);
        }
    }

    /* renamed from: a */
    private static SpannableStringBuilder m31681a(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C31840xt.C31841a c31841a = new C31840xt.C31841a();
            c31841a.m27244a(new SpannableStringBuilder());
            treeMap.put(str, c31841a);
        }
        CharSequence m27233d = ((C31840xt.C31841a) treeMap.get(str)).m27233d();
        m27233d.getClass();
        return (SpannableStringBuilder) m27233d;
    }

    /* renamed from: a */
    public final boolean m31689a(long j) {
        int i;
        long j2 = this.f82587d;
        int i2 = (j2 > (-9223372036854775807L) ? 1 : (j2 == (-9223372036854775807L) ? 0 : -1));
        return (i2 == 0 && this.f82588e == -9223372036854775807L) || (j2 <= j && this.f82588e == -9223372036854775807L) || ((i2 == 0 && j < this.f82588e) || (i <= 0 && j < this.f82588e));
    }

    /* renamed from: a */
    private void m31688a(long j, String str, ArrayList arrayList) {
        if (!"".equals(this.f82591h)) {
            str = this.f82591h;
        }
        if (m31689a(j) && "div".equals(this.f82584a) && this.f82592i != null) {
            arrayList.add(new Pair(str, this.f82592i));
            return;
        }
        for (int i = 0; i < m31691a(); i++) {
            m31690a(i).m31688a(j, str, arrayList);
        }
    }

    /* renamed from: a */
    private void m31687a(long j, Map map, Map map2, String str, TreeMap treeMap) {
        if (m31689a(j)) {
            String str2 = "".equals(this.f82591h) ? str : this.f82591h;
            Iterator<Map.Entry<String, Integer>> it = this.f82595l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.f82594k.containsKey(key) ? this.f82594k.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    C31840xt.C31841a c31841a = (C31840xt.C31841a) treeMap.get(key);
                    c31841a.getClass();
                    o22 o22Var = (o22) map2.get(str2);
                    o22Var.getClass();
                    int i = o22Var.f83291j;
                    q22 m30852a = p22.m30852a(this.f82589f, this.f82590g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c31841a.m27233d();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c31841a.m27244a(spannableStringBuilder);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    if (m30852a != null) {
                        p22.m30853a(spannableStringBuilder2, intValue, intValue2, m30852a, this.f82593j, map, i);
                        if ("p".equals(this.f82584a)) {
                            if (m30852a.m30509j() != Float.MAX_VALUE) {
                                c31841a.m27236c((m30852a.m30509j() * (-90.0f)) / 100.0f);
                            }
                            if (m30852a.m30507l() != null) {
                                c31841a.m27239b(m30852a.m30507l());
                            }
                            if (m30852a.m30512g() != null) {
                                c31841a.m27246a(m30852a.m30512g());
                            }
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < m31691a(); i2++) {
                m31690a(i2).m31687a(j, map, map2, str2, treeMap);
            }
        }
    }

    /* renamed from: a */
    private void m31685a(long j, boolean z, String str, TreeMap treeMap) {
        this.f82594k.clear();
        this.f82595l.clear();
        if ("metadata".equals(this.f82584a)) {
            return;
        }
        if (!"".equals(this.f82591h)) {
            str = this.f82591h;
        }
        if (this.f82586c && z) {
            SpannableStringBuilder m31681a = m31681a(str, treeMap);
            String str2 = this.f82585b;
            str2.getClass();
            m31681a.append((CharSequence) str2);
        } else if ("br".equals(this.f82584a) && z) {
            m31681a(str, treeMap).append('\n');
        } else if (m31689a(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                CharSequence m27233d = ((C31840xt.C31841a) entry.getValue()).m27233d();
                m27233d.getClass();
                this.f82594k.put((String) entry.getKey(), Integer.valueOf(m27233d.length()));
            }
            boolean equals = "p".equals(this.f82584a);
            for (int i = 0; i < m31691a(); i++) {
                m31690a(i).m31685a(j, z || equals, str, treeMap);
            }
            if (equals) {
                SpannableStringBuilder m31681a2 = m31681a(str, treeMap);
                int length = m31681a2.length() - 1;
                while (length >= 0 && m31681a2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && m31681a2.charAt(length) != '\n') {
                    m31681a2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                CharSequence m27233d2 = ((C31840xt.C31841a) entry2.getValue()).m27233d();
                m27233d2.getClass();
                this.f82595l.put((String) entry2.getKey(), Integer.valueOf(m27233d2.length()));
            }
        }
    }

    /* renamed from: a */
    public static n22 m31683a(String str) {
        return new n22(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: a */
    public static n22 m31682a(@Nullable String str, long j, long j2, @Nullable q22 q22Var, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable n22 n22Var) {
        return new n22(str, null, j, j2, q22Var, strArr, str2, str3, n22Var);
    }

    /* renamed from: a */
    public final ArrayList m31686a(long j, Map map, Map map2, Map map3) {
        C30759kz[] c30759kzArr;
        ArrayList arrayList = new ArrayList();
        m31688a(j, this.f82591h, arrayList);
        TreeMap treeMap = new TreeMap();
        m31685a(j, false, this.f82591h, treeMap);
        m31687a(j, map, map2, this.f82591h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                o22 o22Var = (o22) map2.get(pair.first);
                o22Var.getClass();
                arrayList2.add(new C31840xt.C31841a().m27247a(decodeByteArray).m27242b(o22Var.f83283b).m27241b(0).m27248a(0, o22Var.f83284c).m27249a(o22Var.f83286e).m27232d(o22Var.f83287f).m27250a(o22Var.f83288g).m27235c(o22Var.f83291j).m27251a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            o22 o22Var2 = (o22) map2.get(entry.getKey());
            o22Var2.getClass();
            C31840xt.C31841a c31841a = (C31840xt.C31841a) entry.getValue();
            CharSequence m27233d = c31841a.m27233d();
            m27233d.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m27233d;
            for (C30759kz c30759kz : (C30759kz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C30759kz.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c30759kz), spannableStringBuilder.getSpanEnd(c30759kz), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c31841a.m27248a(o22Var2.f83285d, o22Var2.f83284c);
            c31841a.m27249a(o22Var2.f83286e);
            c31841a.m27242b(o22Var2.f83283b);
            c31841a.m27232d(o22Var2.f83287f);
            c31841a.m27240b(o22Var2.f83289h, o22Var2.f83290i);
            c31841a.m27235c(o22Var2.f83291j);
            arrayList2.add(c31841a.m27251a());
        }
        return arrayList2;
    }
}
