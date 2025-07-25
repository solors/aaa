package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class d50 {

    /* renamed from: a */
    private final int f77885a;
    @Nullable

    /* renamed from: b */
    private final RectF f77886b;

    public d50(int i, @Nullable RectF rectF) {
        this.f77885a = i;
        this.f77886b = rectF;
    }

    /* renamed from: a */
    public final int m35101a() {
        return this.f77885a;
    }

    @Nullable
    /* renamed from: b */
    public final RectF m35100b() {
        return this.f77886b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d50)) {
            return false;
        }
        d50 d50Var = (d50) obj;
        if (this.f77885a == d50Var.f77885a && Intrinsics.m17075f(this.f77886b, d50Var.f77886b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f77885a) * 31;
        RectF rectF = this.f77886b;
        if (rectF == null) {
            hashCode = 0;
        } else {
            hashCode = rectF.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public final String toString() {
        int i = this.f77885a;
        RectF rectF = this.f77886b;
        return "Exposure(exposedPercentage=" + i + ", visibleRectangle=" + rectF + ")";
    }
}
