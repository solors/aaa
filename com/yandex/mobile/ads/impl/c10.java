package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class c10 {
    @NotNull

    /* renamed from: a */
    private final d10 f77470a;
    @NotNull

    /* renamed from: b */
    private final String f77471b;

    public c10(@NotNull d10 type, @NotNull String assetName) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f77470a = type;
        this.f77471b = assetName;
    }

    @NotNull
    /* renamed from: a */
    public final String m35384a() {
        return this.f77471b;
    }

    @NotNull
    /* renamed from: b */
    public final d10 m35383b() {
        return this.f77470a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c10)) {
            return false;
        }
        c10 c10Var = (c10) obj;
        if (this.f77470a == c10Var.f77470a && Intrinsics.m17075f(this.f77471b, c10Var.f77471b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f77471b.hashCode() + (this.f77470a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        d10 d10Var = this.f77470a;
        String str = this.f77471b;
        return "DivKitAsset(type=" + d10Var + ", assetName=" + str + ")";
    }
}
