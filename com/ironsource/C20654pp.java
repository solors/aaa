package com.ironsource;

import com.ironsource.mediationsdk.model.Placement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.pp */
/* loaded from: classes6.dex */
public class C20654pp {

    /* renamed from: p */
    private static final int f52451p = 0;

    /* renamed from: a */
    private ArrayList<Placement> f52452a;

    /* renamed from: b */
    private C19568a4 f52453b;

    /* renamed from: c */
    private int f52454c;

    /* renamed from: d */
    private boolean f52455d;

    /* renamed from: e */
    private int f52456e;

    /* renamed from: f */
    private int f52457f;

    /* renamed from: g */
    private int f52458g;

    /* renamed from: h */
    private boolean f52459h;

    /* renamed from: i */
    private long f52460i;

    /* renamed from: j */
    private boolean f52461j;

    /* renamed from: k */
    private boolean f52462k;

    /* renamed from: l */
    private boolean f52463l;

    /* renamed from: m */
    private Placement f52464m;

    /* renamed from: n */
    private C20028h5 f52465n;

    /* renamed from: o */
    private boolean f52466o;

    public C20654pp() {
        this.f52452a = new ArrayList<>();
        this.f52453b = new C19568a4();
    }

    /* renamed from: a */
    public Placement m55770a() {
        Iterator<Placement> it = this.f52452a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f52464m;
    }

    /* renamed from: b */
    public int m55767b() {
        return this.f52458g;
    }

    /* renamed from: c */
    public int m55766c() {
        return this.f52457f;
    }

    /* renamed from: d */
    public boolean m55765d() {
        return this.f52466o;
    }

    /* renamed from: e */
    public ArrayList<Placement> m55764e() {
        return this.f52452a;
    }

    /* renamed from: f */
    public boolean m55763f() {
        return this.f52461j;
    }

    /* renamed from: g */
    public int m55762g() {
        return this.f52454c;
    }

    /* renamed from: h */
    public int m55761h() {
        return this.f52456e;
    }

    /* renamed from: i */
    public long m55760i() {
        return TimeUnit.SECONDS.toMillis(this.f52456e);
    }

    /* renamed from: j */
    public boolean m55759j() {
        return this.f52455d;
    }

    /* renamed from: k */
    public C20028h5 m55758k() {
        return this.f52465n;
    }

    /* renamed from: l */
    public boolean m55757l() {
        return this.f52459h;
    }

    /* renamed from: m */
    public long m55756m() {
        return this.f52460i;
    }

    /* renamed from: n */
    public C19568a4 m55755n() {
        return this.f52453b;
    }

    /* renamed from: o */
    public boolean m55754o() {
        return this.f52463l;
    }

    /* renamed from: p */
    public boolean m55753p() {
        return this.f52462k;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.f52454c + ", bidderExclusive=" + this.f52455d + '}';
    }

    public C20654pp(int i, boolean z, int i2, int i3, C19568a4 c19568a4, C20028h5 c20028h5, int i4, boolean z2, boolean z3, long j, boolean z4, boolean z5, boolean z6) {
        this.f52452a = new ArrayList<>();
        this.f52454c = i;
        this.f52455d = z;
        this.f52456e = i2;
        this.f52453b = c19568a4;
        this.f52457f = i3;
        this.f52465n = c20028h5;
        this.f52458g = i4;
        this.f52466o = z2;
        this.f52459h = z3;
        this.f52460i = j;
        this.f52461j = z4;
        this.f52462k = z5;
        this.f52463l = z6;
    }

    /* renamed from: a */
    public Placement m55768a(String str) {
        Iterator<Placement> it = this.f52452a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m55769a(Placement placement) {
        if (placement != null) {
            this.f52452a.add(placement);
            if (this.f52464m == null || placement.isPlacementId(0)) {
                this.f52464m = placement;
            }
        }
    }
}
