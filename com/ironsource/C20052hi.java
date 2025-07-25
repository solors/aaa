package com.ironsource;

import com.ironsource.mediationsdk.model.InterstitialPlacement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.hi */
/* loaded from: classes6.dex */
public class C20052hi {

    /* renamed from: o */
    private static final int f50461o = 0;

    /* renamed from: a */
    private ArrayList<InterstitialPlacement> f50462a;

    /* renamed from: b */
    private C19568a4 f50463b;

    /* renamed from: c */
    private int f50464c;

    /* renamed from: d */
    private boolean f50465d;

    /* renamed from: e */
    private int f50466e;

    /* renamed from: f */
    private int f50467f;

    /* renamed from: g */
    private C20028h5 f50468g;

    /* renamed from: h */
    private boolean f50469h;

    /* renamed from: i */
    private boolean f50470i;

    /* renamed from: j */
    private long f50471j;

    /* renamed from: k */
    private boolean f50472k;

    /* renamed from: l */
    private boolean f50473l;

    /* renamed from: m */
    private boolean f50474m;

    /* renamed from: n */
    private InterstitialPlacement f50475n;

    public C20052hi() {
        this.f50462a = new ArrayList<>();
        this.f50463b = new C19568a4();
        this.f50468g = new C20028h5();
    }

    /* renamed from: a */
    public InterstitialPlacement m58144a() {
        Iterator<InterstitialPlacement> it = this.f50462a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f50475n;
    }

    /* renamed from: b */
    public int m58141b() {
        return this.f50467f;
    }

    /* renamed from: c */
    public int m58140c() {
        return this.f50464c;
    }

    /* renamed from: d */
    public int m58139d() {
        return this.f50466e;
    }

    /* renamed from: e */
    public long m58138e() {
        return TimeUnit.SECONDS.toMillis(this.f50466e);
    }

    /* renamed from: f */
    public boolean m58137f() {
        return this.f50465d;
    }

    /* renamed from: g */
    public C20028h5 m58136g() {
        return this.f50468g;
    }

    /* renamed from: h */
    public boolean m58135h() {
        return this.f50470i;
    }

    /* renamed from: i */
    public long m58134i() {
        return this.f50471j;
    }

    /* renamed from: j */
    public C19568a4 m58133j() {
        return this.f50463b;
    }

    /* renamed from: k */
    public boolean m58132k() {
        return this.f50469h;
    }

    /* renamed from: l */
    public boolean m58131l() {
        return this.f50472k;
    }

    /* renamed from: m */
    public boolean m58130m() {
        return this.f50474m;
    }

    /* renamed from: n */
    public boolean m58129n() {
        return this.f50473l;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.f50464c + ", bidderExclusive=" + this.f50465d + '}';
    }

    public C20052hi(int i, boolean z, int i2, C19568a4 c19568a4, C20028h5 c20028h5, int i3, boolean z2, boolean z3, long j, boolean z4, boolean z5, boolean z6) {
        this.f50462a = new ArrayList<>();
        this.f50464c = i;
        this.f50465d = z;
        this.f50466e = i2;
        this.f50463b = c19568a4;
        this.f50468g = c20028h5;
        this.f50472k = z4;
        this.f50473l = z5;
        this.f50467f = i3;
        this.f50469h = z2;
        this.f50470i = z3;
        this.f50471j = j;
        this.f50474m = z6;
    }

    /* renamed from: a */
    public InterstitialPlacement m58142a(String str) {
        Iterator<InterstitialPlacement> it = this.f50462a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m58143a(InterstitialPlacement interstitialPlacement) {
        if (interstitialPlacement != null) {
            this.f50462a.add(interstitialPlacement);
            if (this.f50475n == null || interstitialPlacement.isPlacementId(0)) {
                this.f50475n = interstitialPlacement;
            }
        }
    }
}
