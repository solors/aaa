package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ew1 implements InterfaceC31780x {
    @NotNull

    /* renamed from: a */
    private final String f78817a;
    @NotNull

    /* renamed from: b */
    private final List<hw1> f78818b;

    public ew1(@NotNull String actionType, @NotNull ArrayList items) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f78817a = actionType;
        this.f78818b = items;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31780x
    @NotNull
    /* renamed from: a */
    public final String mo27604a() {
        return this.f78817a;
    }

    @NotNull
    /* renamed from: c */
    public final List<hw1> m34415c() {
        return this.f78818b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew1)) {
            return false;
        }
        ew1 ew1Var = (ew1) obj;
        if (Intrinsics.m17075f(this.f78817a, ew1Var.f78817a) && Intrinsics.m17075f(this.f78818b, ew1Var.f78818b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f78818b.hashCode() + (this.f78817a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f78817a;
        List<hw1> list = this.f78818b;
        return "SocialAction(actionType=" + str + ", items=" + list + ")";
    }
}
