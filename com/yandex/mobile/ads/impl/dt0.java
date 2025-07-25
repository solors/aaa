package com.yandex.mobile.ads.impl;

import com.ironsource.C21114v8;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class dt0 {

    /* renamed from: a */
    private final xh2 f78241a;

    private dt0(xh2 xh2Var) {
        this.f78241a = xh2Var;
    }

    /* renamed from: a */
    public final void m34862a() {
        om0 om0Var = om0.f83554c;
        zi2.m26150a(this.f78241a);
        JSONObject jSONObject = new JSONObject();
        ki2.m32540a(jSONObject, "interactionType", om0Var);
        this.f78241a.m27481j().m28500a("adUserInteraction", jSONObject);
    }

    /* renamed from: b */
    public final void m34858b() {
        zi2.m26150a(this.f78241a);
        this.f78241a.m27481j().m28502a("bufferFinish");
    }

    /* renamed from: c */
    public final void m34857c() {
        zi2.m26150a(this.f78241a);
        this.f78241a.m27481j().m28502a("bufferStart");
    }

    /* renamed from: d */
    public final void m34856d() {
        zi2.m26150a(this.f78241a);
        this.f78241a.m27481j().m28502a("complete");
    }

    /* renamed from: e */
    public final void m34855e() {
        zi2.m26150a(this.f78241a);
        this.f78241a.m27481j().m28502a("firstQuartile");
    }

    /* renamed from: f */
    public final void m34854f() {
        zi2.m26150a(this.f78241a);
        this.f78241a.m27481j().m28502a("midpoint");
    }

    /* renamed from: g */
    public final void m34853g() {
        zi2.m26150a(this.f78241a);
        this.f78241a.m27481j().m28502a("pause");
    }

    /* renamed from: h */
    public final void m34852h() {
        zi2.m26150a(this.f78241a);
        this.f78241a.m27481j().m28502a("resume");
    }

    /* renamed from: i */
    public final void m34851i() {
        zi2.m26150a(this.f78241a);
        this.f78241a.m27481j().m28502a("skipped");
    }

    /* renamed from: j */
    public final void m34850j() {
        zi2.m26150a(this.f78241a);
        this.f78241a.m27481j().m28502a("thirdQuartile");
    }

    /* renamed from: a */
    public static dt0 m34859a(xh2 xh2Var) {
        if (xh2Var.m27478m()) {
            if (!xh2Var.m27483h()) {
                if (!xh2Var.m27480k()) {
                    if (xh2Var.m27481j().m28494d() == null) {
                        dt0 dt0Var = new dt0(xh2Var);
                        xh2Var.m27481j().m28507a(dt0Var);
                        return dt0Var;
                    }
                    throw new IllegalStateException("MediaEvents already exists for AdSession");
                }
                throw new IllegalStateException("AdSession is finished");
            }
            throw new IllegalStateException("AdSession is started");
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    /* renamed from: a */
    public final void m34860a(float f, float f2) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
        if (f2 >= 0.0f && f2 <= 1.0f) {
            zi2.m26150a(this.f78241a);
            JSONObject jSONObject = new JSONObject();
            ki2.m32540a(jSONObject, "duration", Float.valueOf(f));
            ki2.m32540a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
            ki2.m32540a(jSONObject, C21114v8.C21123i.f54121P, Float.valueOf(ej2.m34515a().m34510d()));
            this.f78241a.m27481j().m28500a("start", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }

    /* renamed from: a */
    public final void m34861a(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            zi2.m26150a(this.f78241a);
            JSONObject jSONObject = new JSONObject();
            ki2.m32540a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
            ki2.m32540a(jSONObject, C21114v8.C21123i.f54121P, Float.valueOf(ej2.m34515a().m34510d()));
            this.f78241a.m27481j().m28500a("volumeChange", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }
}
