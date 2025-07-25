package com.p551my.target;

import android.graphics.Rect;

/* renamed from: com.my.target.y5 */
/* loaded from: classes7.dex */
public class C26246y5 {

    /* renamed from: a */
    public final Rect f68337a = new Rect();

    /* renamed from: b */
    public final Rect f68338b = new Rect();

    /* renamed from: c */
    public final Rect f68339c = new Rect();

    /* renamed from: d */
    public final Rect f68340d = new Rect();

    /* renamed from: e */
    public final Rect f68341e = new Rect();

    /* renamed from: f */
    public final Rect f68342f = new Rect();

    /* renamed from: g */
    public final Rect f68343g = new Rect();

    /* renamed from: h */
    public final Rect f68344h = new Rect();

    /* renamed from: a */
    public static void m42345a(Rect rect, Rect rect2) {
        rect2.set(C25869ka.m43592c(rect.left), C25869ka.m43592c(rect.top), C25869ka.m43592c(rect.right), C25869ka.m43592c(rect.bottom));
    }

    /* renamed from: e */
    public static C26246y5 m42339e() {
        return new C26246y5();
    }

    /* renamed from: b */
    public Rect m42344b() {
        return this.f68342f;
    }

    /* renamed from: c */
    public Rect m42342c() {
        return this.f68344h;
    }

    /* renamed from: d */
    public Rect m42340d() {
        return this.f68338b;
    }

    /* renamed from: a */
    public Rect m42348a() {
        return this.f68340d;
    }

    /* renamed from: b */
    public void m42343b(int i, int i2, int i3, int i4) {
        this.f68341e.set(i, i2, i3, i4);
        m42345a(this.f68341e, this.f68342f);
    }

    /* renamed from: c */
    public void m42341c(int i, int i2, int i3, int i4) {
        this.f68343g.set(i, i2, i3, i4);
        m42345a(this.f68343g, this.f68344h);
    }

    /* renamed from: a */
    public void m42346a(int i, int i2, int i3, int i4) {
        this.f68339c.set(i, i2, i3, i4);
        m42345a(this.f68339c, this.f68340d);
    }

    /* renamed from: a */
    public void m42347a(int i, int i2) {
        this.f68337a.set(0, 0, i, i2);
        m42345a(this.f68337a, this.f68338b);
    }
}
