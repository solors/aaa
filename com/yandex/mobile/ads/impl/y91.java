package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class y91 {
    @NotNull

    /* renamed from: a */
    private final n12 f88122a;
    @NotNull

    /* renamed from: b */
    private final g42 f88123b;

    public y91(@NotNull n12 notice, @NotNull g42 validationResult) {
        Intrinsics.checkNotNullParameter(notice, "notice");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        this.f88122a = notice;
        this.f88123b = validationResult;
    }

    @NotNull
    /* renamed from: a */
    public final n12 m26977a() {
        return this.f88122a;
    }

    @NotNull
    /* renamed from: b */
    public final g42 m26976b() {
        return this.f88123b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y91)) {
            return false;
        }
        y91 y91Var = (y91) obj;
        if (Intrinsics.m17075f(this.f88122a, y91Var.f88122a) && Intrinsics.m17075f(this.f88123b, y91Var.f88123b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f88123b.hashCode() + (this.f88122a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        n12 n12Var = this.f88122a;
        g42 g42Var = this.f88123b;
        return "NoticeValidationHolder(notice=" + n12Var + ", validationResult=" + g42Var + ")";
    }
}
