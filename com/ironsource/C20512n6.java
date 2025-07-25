package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.n6 */
/* loaded from: classes6.dex */
public class C20512n6 {

    /* renamed from: q */
    private static final int f52130q = 0;

    /* renamed from: a */
    private C19568a4 f52131a;

    /* renamed from: b */
    private int f52132b;

    /* renamed from: c */
    private long f52133c;

    /* renamed from: d */
    private boolean f52134d;

    /* renamed from: e */
    private ArrayList<C19619b7> f52135e;

    /* renamed from: f */
    private C19619b7 f52136f;

    /* renamed from: g */
    private int f52137g;

    /* renamed from: h */
    private int f52138h;

    /* renamed from: i */
    private C20028h5 f52139i;

    /* renamed from: j */
    private boolean f52140j;

    /* renamed from: k */
    private boolean f52141k;

    /* renamed from: l */
    private long f52142l;

    /* renamed from: m */
    private boolean f52143m;

    /* renamed from: n */
    private boolean f52144n;

    /* renamed from: o */
    private boolean f52145o;

    /* renamed from: p */
    private long f52146p;

    public C20512n6() {
        this.f52131a = new C19568a4();
        this.f52135e = new ArrayList<>();
    }

    /* renamed from: a */
    public int m56194a() {
        return this.f52132b;
    }

    /* renamed from: b */
    public long m56191b() {
        return this.f52133c;
    }

    /* renamed from: c */
    public boolean m56190c() {
        return this.f52134d;
    }

    /* renamed from: d */
    public C20028h5 m56189d() {
        return this.f52139i;
    }

    /* renamed from: e */
    public boolean m56188e() {
        return this.f52141k;
    }

    /* renamed from: f */
    public long m56187f() {
        return this.f52142l;
    }

    /* renamed from: g */
    public int m56186g() {
        return this.f52138h;
    }

    /* renamed from: h */
    public C19568a4 m56185h() {
        return this.f52131a;
    }

    /* renamed from: i */
    public int m56184i() {
        return this.f52137g;
    }

    @NotNull
    /* renamed from: j */
    public C19619b7 m56183j() {
        Iterator<C19619b7> it = this.f52135e.iterator();
        while (it.hasNext()) {
            C19619b7 next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f52136f;
    }

    /* renamed from: k */
    public long m56182k() {
        return this.f52146p;
    }

    /* renamed from: l */
    public boolean m56181l() {
        return this.f52140j;
    }

    /* renamed from: m */
    public boolean m56180m() {
        return this.f52143m;
    }

    /* renamed from: n */
    public boolean m56179n() {
        return this.f52145o;
    }

    /* renamed from: o */
    public boolean m56178o() {
        return this.f52144n;
    }

    public String toString() {
        return "BannerConfigurations{parallelLoad=" + this.f52132b + ", bidderExclusive=" + this.f52134d + '}';
    }

    public C20512n6(int i, long j, boolean z, C19568a4 c19568a4, int i2, C20028h5 c20028h5, int i3, boolean z2, boolean z3, long j2, boolean z4, boolean z5, boolean z6, long j3) {
        this.f52135e = new ArrayList<>();
        this.f52132b = i;
        this.f52133c = j;
        this.f52134d = z;
        this.f52131a = c19568a4;
        this.f52137g = i2;
        this.f52138h = i3;
        this.f52139i = c20028h5;
        this.f52140j = z2;
        this.f52141k = z3;
        this.f52142l = j2;
        this.f52143m = z4;
        this.f52144n = z5;
        this.f52145o = z6;
        this.f52146p = j3;
    }

    /* renamed from: a */
    public C19619b7 m56192a(String str) {
        Iterator<C19619b7> it = this.f52135e.iterator();
        while (it.hasNext()) {
            C19619b7 next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m56193a(C19619b7 c19619b7) {
        if (c19619b7 != null) {
            this.f52135e.add(c19619b7);
            if (this.f52136f == null || c19619b7.isPlacementId(0)) {
                this.f52136f = c19619b7;
            }
        }
    }
}
