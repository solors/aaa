package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class pi1 implements fo1 {
    @Nullable

    /* renamed from: a */
    private fo1 f83987a;

    @Override // com.yandex.mobile.ads.impl.fo1
    /* renamed from: a */
    public final void mo30651a(@NotNull zr1 reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        fo1 fo1Var = this.f83987a;
        if (fo1Var != null) {
            fo1Var.mo30651a(reward);
        }
    }

    /* renamed from: a */
    public final void m30652a(@NotNull fo1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83987a = listener;
    }
}
