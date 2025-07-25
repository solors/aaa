package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class po0 {
    @Nullable

    /* renamed from: a */
    private final Integer f84029a;
    @Nullable

    /* renamed from: b */
    private final Integer f84030b;

    public po0(@Nullable Integer num, @Nullable Integer num2) {
        this.f84029a = num;
        this.f84030b = num2;
    }

    @Nullable
    /* renamed from: a */
    public final Integer m30611a() {
        return this.f84030b;
    }

    @Nullable
    /* renamed from: b */
    public final Integer m30610b() {
        return this.f84029a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po0)) {
            return false;
        }
        po0 po0Var = (po0) obj;
        if (Intrinsics.m17075f(this.f84029a, po0Var.f84029a) && Intrinsics.m17075f(this.f84030b, po0Var.f84030b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f84029a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.f84030b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        Integer num = this.f84029a;
        Integer num2 = this.f84030b;
        return "LayoutParamsSize(width=" + num + ", height=" + num2 + ")";
    }
}
