package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.i3 */
/* loaded from: classes8.dex */
public final class C30531i3 {

    /* renamed from: a */
    private final xh2 f80312a;

    private C30531i3(xh2 xh2Var) {
        this.f80312a = xh2Var;
    }

    /* renamed from: a */
    public static C30531i3 m33376a(xh2 xh2Var) {
        if (xh2Var.m27481j().m28495c() == null) {
            if (!xh2Var.m27480k()) {
                C30531i3 c30531i3 = new C30531i3(xh2Var);
                xh2Var.m27481j().m28506a(c30531i3);
                return c30531i3;
            }
            throw new IllegalStateException("AdSession is finished");
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: a */
    public final void m33378a() {
        if (!this.f80312a.m27480k()) {
            if (this.f80312a.m27479l()) {
                if (!this.f80312a.m27484g()) {
                    try {
                        this.f80312a.mo27489b();
                    } catch (Exception unused) {
                    }
                }
                if (this.f80312a.m27484g()) {
                    this.f80312a.m27486e();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: a */
    public final void m33377a(@NonNull x42 x42Var) {
        zi2.m26150a(this.f80312a);
        if (this.f80312a.m27479l()) {
            this.f80312a.m27490a(x42Var.m27663a());
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
