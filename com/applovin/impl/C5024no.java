package com.applovin.impl;

/* renamed from: com.applovin.impl.no */
/* loaded from: classes2.dex */
final class C5024no {

    /* renamed from: a */
    public C4701k6 f8636a;

    /* renamed from: b */
    public long f8637b;

    /* renamed from: c */
    public long f8638c;

    /* renamed from: d */
    public long f8639d;

    /* renamed from: e */
    public int f8640e;

    /* renamed from: f */
    public int f8641f;

    /* renamed from: m */
    public boolean f8648m;

    /* renamed from: o */
    public C4967mo f8650o;

    /* renamed from: q */
    public boolean f8652q;

    /* renamed from: r */
    public long f8653r;

    /* renamed from: s */
    public boolean f8654s;

    /* renamed from: g */
    public long[] f8642g = new long[0];

    /* renamed from: h */
    public int[] f8643h = new int[0];

    /* renamed from: i */
    public int[] f8644i = new int[0];

    /* renamed from: j */
    public int[] f8645j = new int[0];

    /* renamed from: k */
    public long[] f8646k = new long[0];

    /* renamed from: l */
    public boolean[] f8647l = new boolean[0];

    /* renamed from: n */
    public boolean[] f8649n = new boolean[0];

    /* renamed from: p */
    public final C4066ah f8651p = new C4066ah();

    /* renamed from: a */
    public void m96923a(InterfaceC4703k8 interfaceC4703k8) {
        interfaceC4703k8.mo98000d(this.f8651p.m100787c(), 0, this.f8651p.m100783e());
        this.f8651p.m100780f(0);
        this.f8652q = false;
    }

    /* renamed from: b */
    public void m96922b(int i) {
        this.f8651p.m100784d(i);
        this.f8648m = true;
        this.f8652q = true;
    }

    /* renamed from: c */
    public boolean m96921c(int i) {
        if (this.f8648m && this.f8649n[i]) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m96924a(C4066ah c4066ah) {
        c4066ah.m100790a(this.f8651p.m100787c(), 0, this.f8651p.m100783e());
        this.f8651p.m100780f(0);
        this.f8652q = false;
    }

    /* renamed from: a */
    public long m96926a(int i) {
        return this.f8646k[i] + this.f8645j[i];
    }

    /* renamed from: a */
    public void m96925a(int i, int i2) {
        this.f8640e = i;
        this.f8641f = i2;
        if (this.f8643h.length < i) {
            this.f8642g = new long[i];
            this.f8643h = new int[i];
        }
        if (this.f8644i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f8644i = new int[i3];
            this.f8645j = new int[i3];
            this.f8646k = new long[i3];
            this.f8647l = new boolean[i3];
            this.f8649n = new boolean[i3];
        }
    }

    /* renamed from: a */
    public void m96927a() {
        this.f8640e = 0;
        this.f8653r = 0L;
        this.f8654s = false;
        this.f8648m = false;
        this.f8652q = false;
        this.f8650o = null;
    }
}
