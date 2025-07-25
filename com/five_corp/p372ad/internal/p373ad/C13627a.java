package com.five_corp.p372ad.internal.p373ad;

import com.five_corp.p372ad.CreativeType;
import com.five_corp.p372ad.internal.p373ad.beacon.C13629a;
import com.five_corp.p372ad.internal.p373ad.beacon.C13632d;
import com.five_corp.p372ad.internal.p373ad.beacon.C13634f;
import com.five_corp.p372ad.internal.p373ad.beacon.C13638j;
import com.five_corp.p372ad.internal.p373ad.format_config.C13658a;
import com.five_corp.p372ad.internal.p373ad.third_party.C13690a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.five_corp.ad.internal.ad.a */
/* loaded from: classes4.dex */
public final class C13627a {

    /* renamed from: A */
    public final List f25171A;

    /* renamed from: B */
    public final C13638j f25172B;

    /* renamed from: C */
    public final C13634f f25173C;

    /* renamed from: D */
    public final C13634f f25174D;

    /* renamed from: E */
    public final List f25175E;

    /* renamed from: F */
    public final C13690a f25176F;

    /* renamed from: G */
    public final String f25177G;

    /* renamed from: H */
    public final List f25178H;

    /* renamed from: I */
    public final C13677h f25179I;

    /* renamed from: J */
    public final int f25180J;

    /* renamed from: K */
    public final int f25181K;

    /* renamed from: L */
    public final int f25182L;

    /* renamed from: a */
    public final String f25183a;

    /* renamed from: b */
    public final CreativeType f25184b;

    /* renamed from: c */
    public final String f25185c;

    /* renamed from: d */
    public final Long f25186d;

    /* renamed from: e */
    public final C13676g f25187e;

    /* renamed from: f */
    public final Long f25188f;

    /* renamed from: g */
    public final Integer f25189g;

    /* renamed from: h */
    public final C13689t f25190h;

    /* renamed from: i */
    public final C13683n f25191i;

    /* renamed from: j */
    public final String f25192j;

    /* renamed from: k */
    public final String f25193k;

    /* renamed from: l */
    public final List f25194l;

    /* renamed from: m */
    public final List f25195m;

    /* renamed from: n */
    public final int f25196n;

    /* renamed from: o */
    public final C13691u f25197o;

    /* renamed from: p */
    public final Long f25198p;

    /* renamed from: q */
    public final C13691u f25199q;

    /* renamed from: r */
    public final C13691u f25200r;

    /* renamed from: s */
    public final C13691u f25201s;

    /* renamed from: t */
    public final String f25202t;

    /* renamed from: u */
    public final String f25203u;

    /* renamed from: v */
    public final String f25204v;

    /* renamed from: w */
    public final String f25205w;

    /* renamed from: x */
    public final String f25206x;

    /* renamed from: y */
    public final List f25207y;

    /* renamed from: z */
    public final List f25208z;

    public C13627a(String str, CreativeType creativeType, String str2, Long l, C13676g c13676g, Long l2, Integer num, int i, int i2, C13689t c13689t, C13683n c13683n, int i3, String str3, String str4, List list, List list2, int i4, C13691u c13691u, Long l3, C13691u c13691u2, C13691u c13691u3, C13691u c13691u4, String str5, String str6, String str7, String str8, String str9, List list3, List list4, List list5, C13638j c13638j, C13634f c13634f, C13634f c13634f2, List list6, C13690a c13690a, String str10, ArrayList arrayList, C13677h c13677h) {
        this.f25183a = str;
        this.f25184b = creativeType;
        this.f25185c = str2;
        this.f25186d = l;
        this.f25187e = c13676g;
        this.f25188f = l2;
        this.f25189g = num;
        this.f25180J = i;
        this.f25181K = i2;
        this.f25190h = c13689t;
        this.f25191i = c13683n;
        this.f25182L = i3;
        this.f25192j = str3;
        this.f25193k = str4;
        this.f25194l = list;
        this.f25195m = list2;
        this.f25196n = i4;
        this.f25197o = c13691u;
        this.f25198p = l3;
        this.f25199q = c13691u2;
        this.f25200r = c13691u3;
        this.f25201s = c13691u4;
        this.f25202t = str5;
        this.f25203u = str6;
        this.f25204v = str7;
        this.f25205w = str8;
        this.f25206x = str9;
        this.f25207y = list3;
        this.f25208z = list4;
        this.f25171A = list5;
        this.f25172B = c13638j;
        this.f25173C = c13634f;
        this.f25174D = c13634f2;
        this.f25175E = list6;
        this.f25176F = c13690a;
        this.f25177G = str10;
        this.f25178H = arrayList;
        this.f25179I = c13677h;
    }

    /* renamed from: a */
    public static C13658a m78472a(C13627a c13627a, String str) {
        if (c13627a != null && str != null) {
            Integer num = null;
            for (C13692v c13692v : c13627a.f25207y) {
                if (str.equals(c13692v.f25406a)) {
                    num = Integer.valueOf(c13692v.f25407b);
                }
            }
            if (num == null) {
                return null;
            }
            for (C13658a c13658a : c13627a.f25208z) {
                if (num.equals(Integer.valueOf(c13658a.f25338a))) {
                    return c13658a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m78471b() {
        if (this.f25184b == CreativeType.MOVIE && this.f25180J == 2 && this.f25190h != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final HashSet m78473a() {
        HashSet hashSet = new HashSet();
        List<C13634f> list = this.f25175E;
        if (list != null) {
            for (C13634f c13634f : list) {
                C13629a c13629a = c13634f.f25269b;
                if (c13629a != null) {
                    hashSet.add(c13629a);
                }
            }
        }
        List<C13632d> list2 = this.f25171A;
        if (list2 != null) {
            for (C13632d c13632d : list2) {
                C13629a c13629a2 = c13632d.f25254c;
                if (c13629a2 != null) {
                    hashSet.add(c13629a2);
                }
            }
        }
        return hashSet;
    }
}
