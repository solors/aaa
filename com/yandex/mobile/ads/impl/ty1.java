package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class ty1 extends AbstractC30511hx implements oy1 {
    @Nullable

    /* renamed from: d */
    private oy1 f86023d;

    /* renamed from: e */
    private long f86024e;

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final long mo26263a(int i) {
        oy1 oy1Var = this.f86023d;
        oy1Var.getClass();
        return oy1Var.mo26263a(i) + this.f86024e;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30321fl
    /* renamed from: b */
    public final void mo28933b() {
        super.mo28933b();
        this.f86023d = null;
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: b */
    public final List<C31840xt> mo26261b(long j) {
        oy1 oy1Var = this.f86023d;
        oy1Var.getClass();
        return oy1Var.mo26261b(j - this.f86024e);
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26264a() {
        oy1 oy1Var = this.f86023d;
        oy1Var.getClass();
        return oy1Var.mo26264a();
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26262a(long j) {
        oy1 oy1Var = this.f86023d;
        oy1Var.getClass();
        return oy1Var.mo26262a(j - this.f86024e);
    }

    /* renamed from: a */
    public final void m28934a(long j, oy1 oy1Var, long j2) {
        this.f80230c = j;
        this.f86023d = oy1Var;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f86024e = j;
    }
}
