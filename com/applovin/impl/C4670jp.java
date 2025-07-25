package com.applovin.impl;

import android.text.Layout;

/* renamed from: com.applovin.impl.jp */
/* loaded from: classes2.dex */
final class C4670jp {

    /* renamed from: a */
    private String f7247a;

    /* renamed from: b */
    private int f7248b;

    /* renamed from: c */
    private boolean f7249c;

    /* renamed from: d */
    private int f7250d;

    /* renamed from: e */
    private boolean f7251e;

    /* renamed from: k */
    private float f7257k;

    /* renamed from: l */
    private String f7258l;

    /* renamed from: o */
    private Layout.Alignment f7261o;

    /* renamed from: p */
    private Layout.Alignment f7262p;

    /* renamed from: r */
    private C5861xn f7264r;

    /* renamed from: f */
    private int f7252f = -1;

    /* renamed from: g */
    private int f7253g = -1;

    /* renamed from: h */
    private int f7254h = -1;

    /* renamed from: i */
    private int f7255i = -1;

    /* renamed from: j */
    private int f7256j = -1;

    /* renamed from: m */
    private int f7259m = -1;

    /* renamed from: n */
    private int f7260n = -1;

    /* renamed from: q */
    private int f7263q = -1;

    /* renamed from: s */
    private float f7265s = Float.MAX_VALUE;

    /* renamed from: a */
    public C4670jp m98136a(C4670jp c4670jp) {
        return m98135a(c4670jp, true);
    }

    /* renamed from: b */
    public int m98131b() {
        if (this.f7249c) {
            return this.f7248b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: c */
    public String m98125c() {
        return this.f7247a;
    }

    /* renamed from: d */
    public float m98122d() {
        return this.f7257k;
    }

    /* renamed from: e */
    public int m98119e() {
        return this.f7256j;
    }

    /* renamed from: f */
    public String m98116f() {
        return this.f7258l;
    }

    /* renamed from: g */
    public Layout.Alignment m98115g() {
        return this.f7262p;
    }

    /* renamed from: h */
    public int m98114h() {
        return this.f7260n;
    }

    /* renamed from: i */
    public int m98113i() {
        return this.f7259m;
    }

    /* renamed from: j */
    public float m98112j() {
        return this.f7265s;
    }

    /* renamed from: k */
    public int m98111k() {
        int i;
        int i2 = this.f7254h;
        if (i2 == -1 && this.f7255i == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f7255i == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    /* renamed from: l */
    public Layout.Alignment m98110l() {
        return this.f7261o;
    }

    /* renamed from: m */
    public boolean m98109m() {
        if (this.f7263q == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public C5861xn m98108n() {
        return this.f7264r;
    }

    /* renamed from: o */
    public boolean m98107o() {
        return this.f7251e;
    }

    /* renamed from: p */
    public boolean m98106p() {
        return this.f7249c;
    }

    /* renamed from: q */
    public boolean m98105q() {
        if (this.f7252f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean m98104r() {
        if (this.f7253g == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int m98140a() {
        if (this.f7251e) {
            return this.f7250d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public C4670jp m98124c(int i) {
        this.f7256j = i;
        return this;
    }

    /* renamed from: d */
    public C4670jp m98121d(int i) {
        this.f7260n = i;
        return this;
    }

    /* renamed from: e */
    public C4670jp m98118e(int i) {
        this.f7259m = i;
        return this;
    }

    /* renamed from: c */
    public C4670jp m98123c(boolean z) {
        this.f7252f = z ? 1 : 0;
        return this;
    }

    /* renamed from: d */
    public C4670jp m98120d(boolean z) {
        this.f7263q = z ? 1 : 0;
        return this;
    }

    /* renamed from: e */
    public C4670jp m98117e(boolean z) {
        this.f7253g = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public C4670jp m98129b(int i) {
        this.f7248b = i;
        this.f7249c = true;
        return this;
    }

    /* renamed from: a */
    private C4670jp m98135a(C4670jp c4670jp, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c4670jp != null) {
            if (!this.f7249c && c4670jp.f7249c) {
                m98129b(c4670jp.f7248b);
            }
            if (this.f7254h == -1) {
                this.f7254h = c4670jp.f7254h;
            }
            if (this.f7255i == -1) {
                this.f7255i = c4670jp.f7255i;
            }
            if (this.f7247a == null && (str = c4670jp.f7247a) != null) {
                this.f7247a = str;
            }
            if (this.f7252f == -1) {
                this.f7252f = c4670jp.f7252f;
            }
            if (this.f7253g == -1) {
                this.f7253g = c4670jp.f7253g;
            }
            if (this.f7260n == -1) {
                this.f7260n = c4670jp.f7260n;
            }
            if (this.f7261o == null && (alignment2 = c4670jp.f7261o) != null) {
                this.f7261o = alignment2;
            }
            if (this.f7262p == null && (alignment = c4670jp.f7262p) != null) {
                this.f7262p = alignment;
            }
            if (this.f7263q == -1) {
                this.f7263q = c4670jp.f7263q;
            }
            if (this.f7256j == -1) {
                this.f7256j = c4670jp.f7256j;
                this.f7257k = c4670jp.f7257k;
            }
            if (this.f7264r == null) {
                this.f7264r = c4670jp.f7264r;
            }
            if (this.f7265s == Float.MAX_VALUE) {
                this.f7265s = c4670jp.f7265s;
            }
            if (z && !this.f7251e && c4670jp.f7251e) {
                m98138a(c4670jp.f7250d);
            }
            if (z && this.f7259m == -1 && (i = c4670jp.f7259m) != -1) {
                this.f7259m = i;
            }
        }
        return this;
    }

    /* renamed from: b */
    public C4670jp m98127b(String str) {
        this.f7258l = str;
        return this;
    }

    /* renamed from: b */
    public C4670jp m98126b(boolean z) {
        this.f7255i = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public C4670jp m98130b(float f) {
        this.f7265s = f;
        return this;
    }

    /* renamed from: b */
    public C4670jp m98128b(Layout.Alignment alignment) {
        this.f7261o = alignment;
        return this;
    }

    /* renamed from: a */
    public C4670jp m98138a(int i) {
        this.f7250d = i;
        this.f7251e = true;
        return this;
    }

    /* renamed from: a */
    public C4670jp m98132a(boolean z) {
        this.f7254h = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public C4670jp m98133a(String str) {
        this.f7247a = str;
        return this;
    }

    /* renamed from: a */
    public C4670jp m98139a(float f) {
        this.f7257k = f;
        return this;
    }

    /* renamed from: a */
    public C4670jp m98137a(Layout.Alignment alignment) {
        this.f7262p = alignment;
        return this;
    }

    /* renamed from: a */
    public C4670jp m98134a(C5861xn c5861xn) {
        this.f7264r = c5861xn;
        return this;
    }
}
