package com.p551my.target;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.my.target.s */
/* loaded from: classes7.dex */
public final class C26073s {

    /* renamed from: A */
    public Boolean f67795A;

    /* renamed from: B */
    public Boolean f67796B;

    /* renamed from: C */
    public Boolean f67797C;

    /* renamed from: D */
    public Boolean f67798D;

    /* renamed from: E */
    public Boolean f67799E;

    /* renamed from: F */
    public Boolean f67800F;

    /* renamed from: G */
    public Boolean f67801G;

    /* renamed from: H */
    public Boolean f67802H;

    /* renamed from: I */
    public Boolean f67803I;

    /* renamed from: J */
    public C26010p7 f67804J;

    /* renamed from: K */
    public C25669c f67805K;

    /* renamed from: a */
    public final String f67806a;

    /* renamed from: b */
    public final String f67807b;

    /* renamed from: f */
    public ArrayList f67811f;

    /* renamed from: g */
    public ArrayList f67812g;

    /* renamed from: h */
    public C26073s f67813h;

    /* renamed from: i */
    public String f67814i;

    /* renamed from: j */
    public String f67815j;

    /* renamed from: k */
    public String f67816k;

    /* renamed from: l */
    public int f67817l;

    /* renamed from: t */
    public boolean f67825t;

    /* renamed from: u */
    public boolean f67826u;

    /* renamed from: v */
    public boolean f67827v;

    /* renamed from: x */
    public Boolean f67829x;

    /* renamed from: y */
    public Boolean f67830y;

    /* renamed from: z */
    public Boolean f67831z;

    /* renamed from: c */
    public final ArrayList f67808c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f67809d = new ArrayList();

    /* renamed from: e */
    public final C25711da f67810e = C25711da.m43995c();

    /* renamed from: m */
    public int f67818m = -1;

    /* renamed from: n */
    public int f67819n = -1;

    /* renamed from: o */
    public int f67820o = -1;

    /* renamed from: p */
    public int f67821p = -1;

    /* renamed from: q */
    public int f67822q = -1;

    /* renamed from: r */
    public float f67823r = -1.0f;

    /* renamed from: s */
    public float f67824s = -1.0f;

    /* renamed from: w */
    public float f67828w = -1.0f;

    public C26073s(String str, String str2) {
        this.f67807b = str;
        this.f67806a = str2;
    }

    /* renamed from: A */
    public int m43014A() {
        return this.f67819n;
    }

    /* renamed from: B */
    public int m43013B() {
        return this.f67817l;
    }

    /* renamed from: C */
    public int m43012C() {
        return this.f67821p;
    }

    /* renamed from: D */
    public ArrayList m43011D() {
        return this.f67808c;
    }

    /* renamed from: E */
    public boolean m43010E() {
        return this.f67825t;
    }

    /* renamed from: F */
    public boolean m43009F() {
        return this.f67826u;
    }

    /* renamed from: G */
    public Boolean m43008G() {
        return this.f67803I;
    }

    /* renamed from: H */
    public boolean m43007H() {
        return this.f67827v;
    }

    /* renamed from: a */
    public void m42996a(ArrayList arrayList) {
        ArrayList arrayList2 = this.f67811f;
        if (arrayList2 == null) {
            this.f67811f = arrayList;
        } else if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
    }

    /* renamed from: b */
    public String m42994b() {
        return this.f67816k;
    }

    /* renamed from: c */
    public Boolean m42986c() {
        return this.f67800F;
    }

    /* renamed from: d */
    public Boolean m42979d() {
        return this.f67829x;
    }

    /* renamed from: e */
    public float m42975e() {
        return this.f67828w;
    }

    /* renamed from: f */
    public Boolean m42971f() {
        return this.f67830y;
    }

    /* renamed from: g */
    public Boolean m42968g() {
        return this.f67799E;
    }

    /* renamed from: h */
    public Boolean m42966h() {
        return this.f67831z;
    }

    /* renamed from: i */
    public Boolean m42964i() {
        return this.f67795A;
    }

    /* renamed from: j */
    public Boolean m42962j() {
        return this.f67796B;
    }

    /* renamed from: k */
    public Boolean m42960k() {
        return this.f67801G;
    }

    /* renamed from: l */
    public Boolean m42958l() {
        return this.f67802H;
    }

    /* renamed from: m */
    public C25711da m42956m() {
        return this.f67810e;
    }

    /* renamed from: n */
    public int m42955n() {
        return this.f67822q;
    }

    /* renamed from: o */
    public ArrayList m42954o() {
        return this.f67812g;
    }

    /* renamed from: p */
    public String m42953p() {
        return this.f67815j;
    }

    /* renamed from: q */
    public Boolean m42952q() {
        return this.f67797C;
    }

    /* renamed from: r */
    public int m42951r() {
        return this.f67820o;
    }

    /* renamed from: s */
    public int m42950s() {
        return this.f67818m;
    }

    /* renamed from: t */
    public ArrayList m42949t() {
        if (this.f67811f != null) {
            return new ArrayList(this.f67811f);
        }
        return null;
    }

    /* renamed from: u */
    public String m42948u() {
        return this.f67814i;
    }

    /* renamed from: v */
    public C26010p7 m42947v() {
        return this.f67804J;
    }

    /* renamed from: w */
    public C26073s m42946w() {
        return this.f67813h;
    }

    /* renamed from: x */
    public Boolean m42945x() {
        return this.f67798D;
    }

    /* renamed from: y */
    public float m42944y() {
        return this.f67823r;
    }

    /* renamed from: z */
    public float m42943z() {
        return this.f67824s;
    }

    /* renamed from: b */
    public static C26073s m42989b(String str) {
        return m42997a(str, null);
    }

    /* renamed from: a */
    public void m43002a(C25689ca c25689ca) {
        this.f67809d.add(c25689ca);
    }

    /* renamed from: c */
    public void m42982c(String str) {
        this.f67816k = str;
    }

    /* renamed from: d */
    public void m42977d(Boolean bool) {
        this.f67799E = bool;
    }

    /* renamed from: e */
    public void m42973e(Boolean bool) {
        this.f67831z = bool;
    }

    /* renamed from: f */
    public void m42969f(Boolean bool) {
        this.f67795A = bool;
    }

    /* renamed from: g */
    public void m42967g(Boolean bool) {
        this.f67796B = bool;
    }

    /* renamed from: h */
    public void m42965h(Boolean bool) {
        this.f67801G = bool;
    }

    /* renamed from: i */
    public void m42963i(Boolean bool) {
        this.f67802H = bool;
    }

    /* renamed from: j */
    public void m42961j(Boolean bool) {
        this.f67797C = bool;
    }

    /* renamed from: k */
    public void m42959k(Boolean bool) {
        this.f67803I = bool;
    }

    /* renamed from: l */
    public void m42957l(Boolean bool) {
        this.f67798D = bool;
    }

    /* renamed from: a */
    public void m43000a(C26073s c26073s) {
        this.f67808c.add(c26073s);
    }

    /* renamed from: b */
    public void m42990b(Boolean bool) {
        this.f67829x = bool;
    }

    /* renamed from: c */
    public void m42983c(Boolean bool) {
        this.f67830y = bool;
    }

    /* renamed from: d */
    public void m42976d(String str) {
        this.f67815j = str;
    }

    /* renamed from: e */
    public void m42972e(String str) {
        this.f67814i = str;
    }

    /* renamed from: f */
    public void m42970f(int i) {
        this.f67821p = i;
    }

    /* renamed from: a */
    public C25669c m43006a() {
        return this.f67805K;
    }

    /* renamed from: b */
    public void m42988b(ArrayList arrayList) {
        this.f67812g = arrayList;
    }

    /* renamed from: c */
    public void m42984c(int i) {
        this.f67818m = i;
    }

    /* renamed from: d */
    public void m42978d(int i) {
        this.f67819n = i;
        C26073s c26073s = this.f67813h;
        if (c26073s != null) {
            c26073s.m42978d(i);
        }
    }

    /* renamed from: e */
    public void m42974e(int i) {
        this.f67817l = i;
    }

    /* renamed from: a */
    public ArrayList m42998a(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f67809d.iterator();
        while (it.hasNext()) {
            C25689ca c25689ca = (C25689ca) it.next();
            if (str.equals(c25689ca.m44067a())) {
                arrayList.add(c25689ca);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public void m42987b(boolean z) {
        this.f67826u = z;
    }

    /* renamed from: c */
    public void m42981c(ArrayList arrayList) {
        this.f67811f = arrayList;
    }

    /* renamed from: a */
    public static C26073s m42997a(String str, String str2) {
        return new C26073s(str, str2);
    }

    /* renamed from: b */
    public void m42992b(int i) {
        this.f67820o = i;
    }

    /* renamed from: c */
    public void m42980c(boolean z) {
        this.f67827v = z;
    }

    /* renamed from: a */
    public void m43003a(C25669c c25669c) {
        this.f67805K = c25669c;
    }

    /* renamed from: b */
    public void m42991b(C26073s c26073s) {
        this.f67813h = c26073s;
        if (c26073s != null) {
            c26073s.m42978d(this.f67819n);
        }
    }

    /* renamed from: c */
    public void m42985c(float f) {
        this.f67824s = f;
    }

    /* renamed from: a */
    public void m42999a(Boolean bool) {
        this.f67800F = bool;
    }

    /* renamed from: b */
    public void m42993b(float f) {
        this.f67823r = f;
    }

    /* renamed from: a */
    public void m43005a(float f) {
        this.f67828w = f;
    }

    /* renamed from: a */
    public void m42995a(boolean z) {
        this.f67825t = z;
    }

    /* renamed from: a */
    public void m43004a(int i) {
        this.f67822q = i;
    }

    /* renamed from: a */
    public void m43001a(C26010p7 c26010p7) {
        this.f67804J = c26010p7;
    }
}
