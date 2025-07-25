package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.applovin.impl.C3989a5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.gp */
/* loaded from: classes2.dex */
public final class C4485gp {

    /* renamed from: a */
    public final String f6460a;

    /* renamed from: b */
    public final String f6461b;

    /* renamed from: c */
    public final boolean f6462c;

    /* renamed from: d */
    public final long f6463d;

    /* renamed from: e */
    public final long f6464e;

    /* renamed from: f */
    public final C4670jp f6465f;

    /* renamed from: g */
    private final String[] f6466g;

    /* renamed from: h */
    public final String f6467h;

    /* renamed from: i */
    public final String f6468i;

    /* renamed from: j */
    public final C4485gp f6469j;

    /* renamed from: k */
    private final HashMap f6470k;

    /* renamed from: l */
    private final HashMap f6471l;

    /* renamed from: m */
    private List f6472m;

    private C4485gp(String str, String str2, long j, long j2, C4670jp c4670jp, String[] strArr, String str3, String str4, C4485gp c4485gp) {
        boolean z;
        this.f6460a = str;
        this.f6461b = str2;
        this.f6468i = str4;
        this.f6465f = c4670jp;
        this.f6466g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f6462c = z;
        this.f6463d = j;
        this.f6464e = j2;
        this.f6467h = (String) AbstractC4100b1.m100583a((Object) str3);
        this.f6469j = c4485gp;
        this.f6470k = new HashMap();
        this.f6471l = new HashMap();
    }

    /* renamed from: a */
    public void m98883a(C4485gp c4485gp) {
        if (this.f6472m == null) {
            this.f6472m = new ArrayList();
        }
        this.f6472m.add(c4485gp);
    }

    /* renamed from: b */
    public long[] m98877b() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m98878a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: c */
    public String[] m98876c() {
        return this.f6466g;
    }

    /* renamed from: a */
    private void m98879a(Map map, C3989a5.C3991b c3991b, int i, int i2, int i3) {
        C4670jp m98379a = AbstractC4607ip.m98379a(this.f6465f, this.f6466g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c3991b.m101032e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c3991b.m101044a(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (m98379a != null) {
            AbstractC4607ip.m98382a(spannableStringBuilder2, i, i2, m98379a, this.f6469j, map, i3);
            if ("p".equals(this.f6460a)) {
                if (m98379a.m98112j() != Float.MAX_VALUE) {
                    c3991b.m101037c((m98379a.m98112j() * (-90.0f)) / 100.0f);
                }
                if (m98379a.m98110l() != null) {
                    c3991b.m101039b(m98379a.m98110l());
                }
                if (m98379a.m98115g() != null) {
                    c3991b.m101045a(m98379a.m98115g());
                }
            }
        }
    }

    /* renamed from: a */
    private static void m98884a(SpannableStringBuilder spannableStringBuilder) {
        C4992n6[] c4992n6Arr;
        for (C4992n6 c4992n6 : (C4992n6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C4992n6.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c4992n6), spannableStringBuilder.getSpanEnd(c4992n6), "");
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
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    /* renamed from: a */
    public C4485gp m98890a(int i) {
        List list = this.f6472m;
        if (list != null) {
            return (C4485gp) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public int m98891a() {
        List list = this.f6472m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    private void m98878a(TreeSet treeSet, boolean z) {
        boolean equals = "p".equals(this.f6460a);
        boolean equals2 = "div".equals(this.f6460a);
        if (z || equals || (equals2 && this.f6468i != null)) {
            long j = this.f6463d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f6464e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f6472m == null) {
            return;
        }
        for (int i = 0; i < this.f6472m.size(); i++) {
            ((C4485gp) this.f6472m.get(i)).m98878a(treeSet, z || equals);
        }
    }

    /* renamed from: a */
    private static SpannableStringBuilder m98880a(String str, Map map) {
        if (!map.containsKey(str)) {
            C3989a5.C3991b c3991b = new C3989a5.C3991b();
            c3991b.m101044a(new SpannableStringBuilder());
            map.put(str, c3991b);
        }
        return (SpannableStringBuilder) AbstractC4100b1.m100583a(((C3989a5.C3991b) map.get(str)).m101032e());
    }

    /* renamed from: a */
    public boolean m98889a(long j) {
        int i;
        long j2 = this.f6463d;
        int i2 = (j2 > (-9223372036854775807L) ? 1 : (j2 == (-9223372036854775807L) ? 0 : -1));
        return (i2 == 0 && this.f6464e == -9223372036854775807L) || (j2 <= j && this.f6464e == -9223372036854775807L) || ((i2 == 0 && j < this.f6464e) || (i <= 0 && j < this.f6464e));
    }

    /* renamed from: a */
    private void m98888a(long j, String str, List list) {
        if (!"".equals(this.f6467h)) {
            str = this.f6467h;
        }
        if (m98889a(j) && "div".equals(this.f6460a) && this.f6468i != null) {
            list.add(new Pair(str, this.f6468i));
            return;
        }
        for (int i = 0; i < m98891a(); i++) {
            m98890a(i).m98888a(j, str, list);
        }
    }

    /* renamed from: a */
    private void m98887a(long j, Map map, Map map2, String str, Map map3) {
        int i;
        if (m98889a(j)) {
            String str2 = "".equals(this.f6467h) ? str : this.f6467h;
            Iterator it = this.f6471l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int intValue = this.f6470k.containsKey(str3) ? ((Integer) this.f6470k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    m98879a(map, (C3989a5.C3991b) AbstractC4100b1.m100583a((C3989a5.C3991b) map3.get(str3)), intValue, intValue2, ((C4538hp) AbstractC4100b1.m100583a((C4538hp) map2.get(str2))).f6687j);
                }
            }
            while (i < m98891a()) {
                m98890a(i).m98887a(j, map, map2, str2, map3);
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m98885a(long j, boolean z, String str, Map map) {
        this.f6470k.clear();
        this.f6471l.clear();
        if ("metadata".equals(this.f6460a)) {
            return;
        }
        if (!"".equals(this.f6467h)) {
            str = this.f6467h;
        }
        if (this.f6462c && z) {
            m98880a(str, map).append((CharSequence) AbstractC4100b1.m100583a((Object) this.f6461b));
        } else if ("br".equals(this.f6460a) && z) {
            m98880a(str, map).append('\n');
        } else if (m98889a(j)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f6470k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) AbstractC4100b1.m100583a(((C3989a5.C3991b) entry.getValue()).m101032e())).length()));
            }
            boolean equals = "p".equals(this.f6460a);
            for (int i = 0; i < m98891a(); i++) {
                m98890a(i).m98885a(j, z || equals, str, map);
            }
            if (equals) {
                AbstractC4607ip.m98381a(m98880a(str, map));
            }
            for (Map.Entry entry2 : map.entrySet()) {
                this.f6471l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) AbstractC4100b1.m100583a(((C3989a5.C3991b) entry2.getValue()).m101032e())).length()));
            }
        }
    }

    /* renamed from: a */
    public static C4485gp m98882a(String str) {
        return new C4485gp(null, AbstractC4607ip.m98378a(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: a */
    public static C4485gp m98881a(String str, long j, long j2, C4670jp c4670jp, String[] strArr, String str2, String str3, C4485gp c4485gp) {
        return new C4485gp(str, null, j, j2, c4670jp, strArr, str2, str3, c4485gp);
    }

    /* renamed from: a */
    public List m98886a(long j, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        m98888a(j, this.f6467h, arrayList);
        TreeMap treeMap = new TreeMap();
        m98885a(j, false, this.f6467h, (Map) treeMap);
        m98887a(j, map, map2, this.f6467h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C4538hp c4538hp = (C4538hp) AbstractC4100b1.m100583a((C4538hp) map2.get(pair.first));
                arrayList2.add(new C3989a5.C3991b().m101046a(decodeByteArray).m101042b(c4538hp.f6679b).m101040b(0).m101048a(c4538hp.f6680c, 0).m101047a(c4538hp.f6682e).m101034d(c4538hp.f6683f).m101049a(c4538hp.f6684g).m101036c(c4538hp.f6687j).m101050a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C4538hp c4538hp2 = (C4538hp) AbstractC4100b1.m100583a((C4538hp) map2.get(entry.getKey()));
            C3989a5.C3991b c3991b = (C3989a5.C3991b) entry.getValue();
            m98884a((SpannableStringBuilder) AbstractC4100b1.m100583a(c3991b.m101032e()));
            c3991b.m101048a(c4538hp2.f6680c, c4538hp2.f6681d);
            c3991b.m101047a(c4538hp2.f6682e);
            c3991b.m101042b(c4538hp2.f6679b);
            c3991b.m101034d(c4538hp2.f6683f);
            c3991b.m101041b(c4538hp2.f6686i, c4538hp2.f6685h);
            c3991b.m101036c(c4538hp2.f6687j);
            arrayList2.add(c3991b.m101050a());
        }
        return arrayList2;
    }
}
