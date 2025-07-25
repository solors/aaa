package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class m70 {
    @NotNull

    /* renamed from: a */
    private final dx0 f82068a;

    public m70(@NotNull dx0 memoryUtils) {
        Intrinsics.checkNotNullParameter(memoryUtils, "memoryUtils");
        this.f82068a = memoryUtils;
    }

    /* renamed from: a */
    public final boolean m32081a() {
        this.f82068a.getClass();
        if (dx0.m34838a() / 1048576.0d >= 20.0d) {
            return true;
        }
        return false;
    }
}
