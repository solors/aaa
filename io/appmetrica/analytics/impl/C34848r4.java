package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.r4 */
/* loaded from: classes9.dex */
public final class C34848r4 {

    /* renamed from: r */
    public static volatile C34848r4 f95248r;

    /* renamed from: a */
    public final C34277Vb f95249a;

    /* renamed from: b */
    public final C33863E7 f95250b;

    /* renamed from: c */
    public final C34579h4 f95251c;

    /* renamed from: d */
    public final C34004K1 f95252d;

    /* renamed from: e */
    public final C34790p f95253e;

    /* renamed from: f */
    public final C34460ck f95254f;

    /* renamed from: g */
    public final C33984J5 f95255g;

    /* renamed from: h */
    public final C34682l f95256h;

    /* renamed from: i */
    public final C34732mm f95257i;

    /* renamed from: j */
    public C34374Zc f95258j;

    /* renamed from: k */
    public final C34683l0 f95259k;

    /* renamed from: l */
    public volatile C34768o4 f95260l;

    /* renamed from: m */
    public final C33843Dc f95261m;

    /* renamed from: n */
    public volatile C34751ne f95262n;

    /* renamed from: o */
    public C34914ti f95263o;

    /* renamed from: p */
    public final C34844r0 f95264p;

    /* renamed from: q */
    public final C34396aa f95265q;

    public C34848r4(C34277Vb c34277Vb, C34790p c34790p, C34579h4 c34579h4) {
        this(c34277Vb, c34790p, c34579h4, new C34682l(c34790p));
    }

    /* renamed from: i */
    public static C34848r4 m21050i() {
        if (f95248r == null) {
            synchronized (C34848r4.class) {
                if (f95248r == null) {
                    f95248r = new C34848r4(new C34277Vb(), new C34790p(), new C34579h4());
                }
            }
        }
        return f95248r;
    }

    /* renamed from: a */
    public final C34790p m21060a() {
        return this.f95253e;
    }

    /* renamed from: b */
    public final C34683l0 m21058b() {
        return this.f95259k;
    }

    /* renamed from: c */
    public final C34844r0 m21056c() {
        return this.f95264p;
    }

    /* renamed from: d */
    public final C34004K1 m21055d() {
        return this.f95252d;
    }

    /* renamed from: e */
    public final C34579h4 m21054e() {
        return this.f95251c;
    }

    /* renamed from: f */
    public final C33984J5 m21053f() {
        return this.f95255g;
    }

    /* renamed from: g */
    public final C33863E7 m21052g() {
        return this.f95250b;
    }

    /* renamed from: h */
    public final C34396aa m21051h() {
        return this.f95265q;
    }

    /* renamed from: j */
    public final C34277Vb m21049j() {
        return this.f95249a;
    }

    /* renamed from: k */
    public final C34768o4 m21048k() {
        C34768o4 c34768o4 = this.f95260l;
        if (c34768o4 == null) {
            synchronized (this) {
                c34768o4 = this.f95260l;
                if (c34768o4 == null) {
                    c34768o4 = new C34768o4();
                    this.f95260l = c34768o4;
                }
            }
        }
        return c34768o4;
    }

    /* renamed from: l */
    public final C34277Vb m21047l() {
        return this.f95249a;
    }

    /* renamed from: m */
    public final C34460ck m21046m() {
        return this.f95254f;
    }

    public C34848r4(C34277Vb c34277Vb, C34790p c34790p, C34579h4 c34579h4, C34682l c34682l) {
        this(c34277Vb, new C33863E7(), c34579h4, c34682l, new C34004K1(), c34790p, new C34460ck(c34790p, c34682l), new C33984J5(c34790p), new C34732mm(), new C34683l0());
    }

    /* renamed from: a */
    public final synchronized C34374Zc m21059a(Context context) {
        if (this.f95258j == null) {
            this.f95258j = new C34374Zc(context, new C34706ln());
        }
        return this.f95258j;
    }

    /* renamed from: b */
    public final C34751ne m21057b(Context context) {
        C34751ne c34751ne = this.f95262n;
        if (c34751ne == null) {
            synchronized (this) {
                c34751ne = this.f95262n;
                if (c34751ne == null) {
                    c34751ne = new C34751ne(C34393a7.m22013a(context).m22014a());
                    this.f95262n = c34751ne;
                }
            }
        }
        return c34751ne;
    }

    public C34848r4(C34277Vb c34277Vb, C33863E7 c33863e7, C34579h4 c34579h4, C34682l c34682l, C34004K1 c34004k1, C34790p c34790p, C34460ck c34460ck, C33984J5 c33984j5, C34732mm c34732mm, C34683l0 c34683l0) {
        this.f95261m = new C33843Dc();
        this.f95264p = new C34844r0();
        this.f95265q = new C34396aa();
        this.f95249a = c34277Vb;
        this.f95250b = c33863e7;
        this.f95251c = c34579h4;
        this.f95256h = c34682l;
        this.f95252d = c34004k1;
        this.f95253e = c34790p;
        this.f95254f = c34460ck;
        this.f95255g = c33984j5;
        this.f95257i = c34732mm;
        this.f95259k = c34683l0;
    }
}
