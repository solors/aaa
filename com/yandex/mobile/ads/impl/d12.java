package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.er0;

/* loaded from: classes8.dex */
public final class d12 {

    /* renamed from: a */
    public final int f77834a;

    /* renamed from: b */
    public final rk1[] f77835b;

    /* renamed from: c */
    public final v40[] f77836c;

    /* renamed from: d */
    public final w12 f77837d;
    @Nullable

    /* renamed from: e */
    public final Object f77838e;

    public d12(rk1[] rk1VarArr, v40[] v40VarArr, w12 w12Var, @Nullable er0.C30267a c30267a) {
        this.f77835b = rk1VarArr;
        this.f77836c = (v40[]) v40VarArr.clone();
        this.f77837d = w12Var;
        this.f77838e = c30267a;
        this.f77834a = rk1VarArr.length;
    }

    /* renamed from: a */
    public final boolean m35123a(int i) {
        if (this.f77835b[i] != null) {
            return true;
        }
        return false;
    }
}
