package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class n80 {
    @Nullable

    /* renamed from: a */
    private final bh0 f82630a;

    public n80(@Nullable bh0 bh0Var) {
        this.f82630a = bh0Var;
    }

    @Nullable
    /* renamed from: a */
    public final bh0 m31648a() {
        return this.f82630a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n80) && Intrinsics.m17075f(this.f82630a, ((n80) obj).f82630a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        bh0 bh0Var = this.f82630a;
        if (bh0Var == null) {
            return 0;
        }
        return bh0Var.hashCode();
    }

    @NotNull
    public final String toString() {
        bh0 bh0Var = this.f82630a;
        return "FeedbackValue(imageValue=" + bh0Var + ")";
    }
}
