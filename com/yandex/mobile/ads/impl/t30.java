package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class t30 {
    @NotNull

    /* renamed from: a */
    private final u30 f85493a;
    @NotNull

    /* renamed from: b */
    private final String f85494b;

    public t30(@NotNull u30 type, @NotNull String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f85493a = type;
        this.f85494b = value;
    }

    @NotNull
    /* renamed from: a */
    public final u30 m29311a() {
        return this.f85493a;
    }

    @NotNull
    /* renamed from: b */
    public final String m29310b() {
        return this.f85494b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t30)) {
            return false;
        }
        t30 t30Var = (t30) obj;
        if (this.f85493a == t30Var.f85493a && Intrinsics.m17075f(this.f85494b, t30Var.f85494b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f85494b.hashCode() + (this.f85493a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        u30 u30Var = this.f85493a;
        String str = this.f85494b;
        return "ExclusionRule(type=" + u30Var + ", value=" + str + ")";
    }
}
