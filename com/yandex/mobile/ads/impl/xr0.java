package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class xr0 {
    @Nullable

    /* renamed from: a */
    private final String f87788a;

    /* renamed from: b */
    private final float f87789b;

    public xr0(@Nullable String str, float f) {
        this.f87788a = str;
        this.f87789b = f;
    }

    /* renamed from: a */
    public final float m27422a() {
        return this.f87789b;
    }

    @Nullable
    /* renamed from: b */
    public final String m27421b() {
        return this.f87788a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0)) {
            return false;
        }
        xr0 xr0Var = (xr0) obj;
        if (Intrinsics.m17075f(this.f87788a, xr0Var.f87788a) && Float.compare(this.f87789b, xr0Var.f87789b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f87788a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Float.hashCode(this.f87789b) + (hashCode * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f87788a;
        float f = this.f87789b;
        return "Media(htmlContent=" + str + ", aspectRatio=" + f + ")";
    }
}
