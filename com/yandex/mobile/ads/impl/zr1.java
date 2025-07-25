package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class zr1 implements ln1 {

    /* renamed from: a */
    private final int f89085a;
    @NotNull

    /* renamed from: b */
    private final String f89086b;

    public zr1(int i, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f89085a = i;
        this.f89086b = type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr1)) {
            return false;
        }
        zr1 zr1Var = (zr1) obj;
        if (this.f89085a == zr1Var.f89085a && Intrinsics.m17075f(this.f89086b, zr1Var.f89086b)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.ln1
    public final int getAmount() {
        return this.f89085a;
    }

    @Override // com.yandex.mobile.ads.impl.ln1
    @NotNull
    public final String getType() {
        return this.f89086b;
    }

    public final int hashCode() {
        return this.f89086b.hashCode() + (Integer.hashCode(this.f89085a) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f89085a;
        String str = this.f89086b;
        return "SdkReward(amount=" + i + ", type=" + str + ")";
    }
}
