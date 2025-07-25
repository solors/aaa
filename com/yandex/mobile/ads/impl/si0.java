package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class si0 {
    @NotNull

    /* renamed from: a */
    private final String f85276a;

    /* renamed from: b */
    private final int f85277b;

    /* renamed from: c */
    private final int f85278c;

    public si0(int i, int i2, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f85276a = name;
        this.f85277b = i;
        this.f85278c = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si0)) {
            return false;
        }
        si0 si0Var = (si0) obj;
        if (Intrinsics.m17075f(this.f85276a, si0Var.f85276a) && this.f85277b == si0Var.f85277b && this.f85278c == si0Var.f85278c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85278c) + nt1.m31295a(this.f85277b, this.f85276a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f85276a;
        int i = this.f85277b;
        int i2 = this.f85278c;
        return "InstalledPackage(name=" + str + ", minVersion=" + i + ", maxVersion=" + i2 + ")";
    }
}
