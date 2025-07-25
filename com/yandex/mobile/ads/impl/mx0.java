package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pp0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class mx0 {
    @Nullable

    /* renamed from: a */
    private static volatile kx0 f82470a;

    @NotNull
    /* renamed from: a */
    public static final InterfaceC31438td m31753a() {
        Object obj;
        kx0 kx0Var;
        kx0 kx0Var2 = f82470a;
        if (kx0Var2 == null) {
            obj = kx0.f81602b;
            synchronized (obj) {
                kx0Var = f82470a;
                if (kx0Var == null) {
                    int i = pp0.f84044f;
                    kx0Var = new kx0(pp0.C31146a.m30600a().m30601c());
                    f82470a = kx0Var;
                }
            }
            return kx0Var;
        }
        return kx0Var2;
    }
}
