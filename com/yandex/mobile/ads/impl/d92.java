package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class d92 {
    @Nullable

    /* renamed from: a */
    private final ea2 f78009a;

    /* renamed from: b */
    private final boolean f78010b;

    /* renamed from: c */
    private final boolean f78011c;
    @Nullable

    /* renamed from: d */
    private final Double f78012d;

    public d92(@Nullable ea2 ea2Var, boolean z, boolean z2, @Nullable Double d) {
        this.f78009a = ea2Var;
        this.f78010b = z;
        this.f78011c = z2;
        this.f78012d = d;
    }

    @Nullable
    /* renamed from: a */
    public final Double m34988a() {
        return this.f78012d;
    }

    /* renamed from: b */
    public final boolean m34987b() {
        return this.f78011c;
    }

    @Nullable
    /* renamed from: c */
    public final ea2 m34986c() {
        return this.f78009a;
    }

    /* renamed from: d */
    public final boolean m34985d() {
        return this.f78010b;
    }

    /* renamed from: e */
    public final boolean m34984e() {
        if (!Intrinsics.m17079b(this.f78012d, 0.0d) && this.f78012d != null) {
            return false;
        }
        return true;
    }
}
