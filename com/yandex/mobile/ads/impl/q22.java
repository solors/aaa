package com.yandex.mobile.ads.impl;

import android.text.Layout;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
final class q22 {
    @Nullable

    /* renamed from: a */
    private String f84170a;

    /* renamed from: b */
    private int f84171b;

    /* renamed from: c */
    private boolean f84172c;

    /* renamed from: d */
    private int f84173d;

    /* renamed from: e */
    private boolean f84174e;

    /* renamed from: k */
    private float f84180k;
    @Nullable

    /* renamed from: l */
    private String f84181l;
    @Nullable

    /* renamed from: o */
    private Layout.Alignment f84184o;
    @Nullable

    /* renamed from: p */
    private Layout.Alignment f84185p;
    @Nullable

    /* renamed from: r */
    private sz1 f84187r;

    /* renamed from: f */
    private int f84175f = -1;

    /* renamed from: g */
    private int f84176g = -1;

    /* renamed from: h */
    private int f84177h = -1;

    /* renamed from: i */
    private int f84178i = -1;

    /* renamed from: j */
    private int f84179j = -1;

    /* renamed from: m */
    private int f84182m = -1;

    /* renamed from: n */
    private int f84183n = -1;

    /* renamed from: q */
    private int f84186q = -1;

    /* renamed from: s */
    private float f84188s = Float.MAX_VALUE;

    /* renamed from: a */
    public final q22 m30532a(@Nullable q22 q22Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (q22Var != null) {
            if (!this.f84172c && q22Var.f84172c) {
                this.f84171b = q22Var.f84171b;
                this.f84172c = true;
            }
            if (this.f84177h == -1) {
                this.f84177h = q22Var.f84177h;
            }
            if (this.f84178i == -1) {
                this.f84178i = q22Var.f84178i;
            }
            if (this.f84170a == null && (str = q22Var.f84170a) != null) {
                this.f84170a = str;
            }
            if (this.f84175f == -1) {
                this.f84175f = q22Var.f84175f;
            }
            if (this.f84176g == -1) {
                this.f84176g = q22Var.f84176g;
            }
            if (this.f84183n == -1) {
                this.f84183n = q22Var.f84183n;
            }
            if (this.f84184o == null && (alignment2 = q22Var.f84184o) != null) {
                this.f84184o = alignment2;
            }
            if (this.f84185p == null && (alignment = q22Var.f84185p) != null) {
                this.f84185p = alignment;
            }
            if (this.f84186q == -1) {
                this.f84186q = q22Var.f84186q;
            }
            if (this.f84179j == -1) {
                this.f84179j = q22Var.f84179j;
                this.f84180k = q22Var.f84180k;
            }
            if (this.f84187r == null) {
                this.f84187r = q22Var.f84187r;
            }
            if (this.f84188s == Float.MAX_VALUE) {
                this.f84188s = q22Var.f84188s;
            }
            if (!this.f84174e && q22Var.f84174e) {
                this.f84173d = q22Var.f84173d;
                this.f84174e = true;
            }
            if (this.f84182m == -1 && (i = q22Var.f84182m) != -1) {
                this.f84182m = i;
            }
        }
        return this;
    }

    /* renamed from: b */
    public final int m30528b() {
        if (this.f84172c) {
            return this.f84171b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @Nullable
    /* renamed from: c */
    public final String m30522c() {
        return this.f84170a;
    }

    /* renamed from: d */
    public final float m30519d() {
        return this.f84180k;
    }

    /* renamed from: e */
    public final int m30516e() {
        return this.f84179j;
    }

    @Nullable
    /* renamed from: f */
    public final String m30513f() {
        return this.f84181l;
    }

    @Nullable
    /* renamed from: g */
    public final Layout.Alignment m30512g() {
        return this.f84185p;
    }

    /* renamed from: h */
    public final int m30511h() {
        return this.f84183n;
    }

    /* renamed from: i */
    public final int m30510i() {
        return this.f84182m;
    }

    /* renamed from: j */
    public final float m30509j() {
        return this.f84188s;
    }

    /* renamed from: k */
    public final int m30508k() {
        int i;
        int i2 = this.f84177h;
        if (i2 == -1 && this.f84178i == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f84178i == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    @Nullable
    /* renamed from: l */
    public final Layout.Alignment m30507l() {
        return this.f84184o;
    }

    /* renamed from: m */
    public final boolean m30506m() {
        if (this.f84186q == 1) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: n */
    public final sz1 m30505n() {
        return this.f84187r;
    }

    /* renamed from: o */
    public final boolean m30504o() {
        return this.f84174e;
    }

    /* renamed from: p */
    public final boolean m30503p() {
        return this.f84172c;
    }

    /* renamed from: q */
    public final boolean m30502q() {
        if (this.f84175f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m30501r() {
        if (this.f84176g == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void m30521c(int i) {
        this.f84179j = i;
    }

    /* renamed from: d */
    public final q22 m30518d(int i) {
        this.f84183n = i;
        return this;
    }

    /* renamed from: e */
    public final q22 m30515e(int i) {
        this.f84182m = i;
        return this;
    }

    /* renamed from: c */
    public final q22 m30520c(boolean z) {
        this.f84175f = z ? 1 : 0;
        return this;
    }

    /* renamed from: d */
    public final q22 m30517d(boolean z) {
        this.f84186q = z ? 1 : 0;
        return this;
    }

    /* renamed from: e */
    public final q22 m30514e(boolean z) {
        this.f84176g = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public final void m30526b(int i) {
        this.f84171b = i;
        this.f84172c = true;
    }

    /* renamed from: b */
    public final q22 m30524b(@Nullable String str) {
        this.f84181l = str;
        return this;
    }

    /* renamed from: b */
    public final q22 m30523b(boolean z) {
        this.f84178i = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public final q22 m30527b(float f) {
        this.f84188s = f;
        return this;
    }

    /* renamed from: b */
    public final q22 m30525b(@Nullable Layout.Alignment alignment) {
        this.f84184o = alignment;
        return this;
    }

    /* renamed from: a */
    public final int m30536a() {
        if (this.f84174e) {
            return this.f84173d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: a */
    public final void m30534a(int i) {
        this.f84173d = i;
        this.f84174e = true;
    }

    /* renamed from: a */
    public final q22 m30529a(boolean z) {
        this.f84177h = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public final q22 m30530a(@Nullable String str) {
        this.f84170a = str;
        return this;
    }

    /* renamed from: a */
    public final void m30535a(float f) {
        this.f84180k = f;
    }

    /* renamed from: a */
    public final q22 m30533a(@Nullable Layout.Alignment alignment) {
        this.f84185p = alignment;
        return this;
    }

    /* renamed from: a */
    public final q22 m30531a(@Nullable sz1 sz1Var) {
        this.f84187r = sz1Var;
        return this;
    }
}
