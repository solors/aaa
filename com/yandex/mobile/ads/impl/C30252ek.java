package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ek */
/* loaded from: classes8.dex */
public final class C30252ek {
    @Nullable

    /* renamed from: a */
    private final EnumC30803lr f78676a;
    @Nullable

    /* renamed from: b */
    private final qu1 f78677b;
    @NotNull

    /* renamed from: c */
    private final Map<String, String> f78678c;

    public C30252ek(@Nullable EnumC30803lr enumC30803lr, @Nullable qu1 qu1Var, @NotNull Map<String, String> parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f78676a = enumC30803lr;
        this.f78677b = qu1Var;
        this.f78678c = parameters;
    }

    @Nullable
    /* renamed from: a */
    public final EnumC30803lr m34509a() {
        return this.f78676a;
    }

    @NotNull
    /* renamed from: b */
    public final Map<String, String> m34508b() {
        return this.f78678c;
    }

    @Nullable
    /* renamed from: c */
    public final qu1 m34507c() {
        return this.f78677b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30252ek)) {
            return false;
        }
        C30252ek c30252ek = (C30252ek) obj;
        if (this.f78676a == c30252ek.f78676a && Intrinsics.m17075f(this.f78677b, c30252ek.f78677b) && Intrinsics.m17075f(this.f78678c, c30252ek.f78678c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        EnumC30803lr enumC30803lr = this.f78676a;
        int i = 0;
        if (enumC30803lr == null) {
            hashCode = 0;
        } else {
            hashCode = enumC30803lr.hashCode();
        }
        int i2 = hashCode * 31;
        qu1 qu1Var = this.f78677b;
        if (qu1Var != null) {
            i = qu1Var.hashCode();
        }
        return this.f78678c.hashCode() + ((i2 + i) * 31);
    }

    @NotNull
    public final String toString() {
        EnumC30803lr enumC30803lr = this.f78676a;
        qu1 qu1Var = this.f78677b;
        Map<String, String> map = this.f78678c;
        return "BidderTokenRequestData(adType=" + enumC30803lr + ", sizeInfo=" + qu1Var + ", parameters=" + map + ")";
    }
}
