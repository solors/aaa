package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.impl.ii2;

/* loaded from: classes8.dex */
public final class ej2 implements si2, ii2.InterfaceC30557a {

    /* renamed from: f */
    private static ej2 f78670f;

    /* renamed from: a */
    private float f78671a = 0.0f;

    /* renamed from: b */
    private final bj2 f78672b;

    /* renamed from: c */
    private final hi2 f78673c;

    /* renamed from: d */
    private wi2 f78674d;

    /* renamed from: e */
    private yh2 f78675e;

    public ej2(bj2 bj2Var, hi2 hi2Var) {
        this.f78672b = bj2Var;
        this.f78673c = hi2Var;
    }

    /* renamed from: a */
    public static ej2 m34515a() {
        if (f78670f == null) {
            f78670f = new ej2(new bj2(), new hi2());
        }
        return f78670f;
    }

    /* renamed from: b */
    public final void m34512b() {
        ii2.m33265a().m33263a(this);
        ii2.m33265a().m33262b();
        b22.m35671g().getClass();
        b22.m35680a();
        this.f78674d.m27891a();
    }

    /* renamed from: c */
    public final void m34511c() {
        b22.m35671g().m35677b();
        ii2.m33265a().m33261c();
        this.f78674d.m27890b();
    }

    /* renamed from: d */
    public final float m34510d() {
        return this.f78671a;
    }

    /* renamed from: a */
    public final void m34514a(float f) {
        this.f78671a = f;
        if (this.f78675e == null) {
            this.f78675e = yh2.m26905a();
        }
        for (xh2 xh2Var : this.f78675e.m26901c()) {
            xh2Var.m27481j().m28509a(f);
        }
    }

    /* renamed from: a */
    public final void m34513a(Context context) {
        this.f78673c.getClass();
        fi2 fi2Var = new fi2();
        bj2 bj2Var = this.f78672b;
        Handler handler = new Handler();
        bj2Var.getClass();
        this.f78674d = new wi2(handler, context, fi2Var, this);
    }
}
