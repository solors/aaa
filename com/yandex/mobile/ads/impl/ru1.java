package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ru1 {
    @Nullable

    /* renamed from: a */
    private qu1 f84895a;

    @Nullable
    /* renamed from: a */
    public final qu1 m29935a() {
        return this.f84895a;
    }

    /* renamed from: a */
    public final void m29934a(@Nullable qu1 qu1Var) {
        if (qu1Var == null) {
            km0.m32485c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        qu1 qu1Var2 = this.f84895a;
        if (qu1Var2 != null && !Intrinsics.m17075f(qu1Var2, qu1Var)) {
            km0.m32485c("Ad size can't be set twice.", new Object[0]);
        } else {
            this.f84895a = qu1Var;
        }
    }
}
