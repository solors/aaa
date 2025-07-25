package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.collections.SetsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class l30 {
    @NotNull

    /* renamed from: a */
    private final Set<String> f81679a;

    public l30() {
        Set<String> m17127d;
        m17127d = SetsJVM.m17127d("sysconst-update");
        this.f81679a = m17127d;
    }

    /* renamed from: a */
    public final boolean m32361a(@NotNull String param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return !this.f81679a.contains(param);
    }
}
