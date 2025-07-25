package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class eu0 {
    @Nullable

    /* renamed from: a */
    private final xr0 f78796a;
    @Nullable

    /* renamed from: b */
    private final y52 f78797b;
    @Nullable

    /* renamed from: c */
    private final List<bh0> f78798c;

    public eu0(@Nullable xr0 xr0Var, @Nullable y52 y52Var, @Nullable List<bh0> list) {
        this.f78796a = xr0Var;
        this.f78797b = y52Var;
        this.f78798c = list;
    }

    @Nullable
    /* renamed from: a */
    public final List<bh0> m34431a() {
        return this.f78798c;
    }

    @Nullable
    /* renamed from: b */
    public final xr0 m34430b() {
        return this.f78796a;
    }

    @Nullable
    /* renamed from: c */
    public final y52 m34429c() {
        return this.f78797b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu0)) {
            return false;
        }
        eu0 eu0Var = (eu0) obj;
        if (Intrinsics.m17075f(this.f78796a, eu0Var.f78796a) && Intrinsics.m17075f(this.f78797b, eu0Var.f78797b) && Intrinsics.m17075f(this.f78798c, eu0Var.f78798c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        xr0 xr0Var = this.f78796a;
        int i = 0;
        if (xr0Var == null) {
            hashCode = 0;
        } else {
            hashCode = xr0Var.hashCode();
        }
        int i2 = hashCode * 31;
        y52 y52Var = this.f78797b;
        if (y52Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = y52Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<bh0> list = this.f78798c;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public final String toString() {
        xr0 xr0Var = this.f78796a;
        y52 y52Var = this.f78797b;
        List<bh0> list = this.f78798c;
        return "MediaValue(media=" + xr0Var + ", video=" + y52Var + ", imageValues=" + list + ")";
    }
}
