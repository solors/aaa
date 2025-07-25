package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.fo */
/* loaded from: classes8.dex */
public final class C30329fo implements InterfaceC31780x {
    @NotNull

    /* renamed from: a */
    private final String f79190a;

    public C30329fo(@NotNull String actionType) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f79190a = actionType;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31780x
    @NotNull
    /* renamed from: a */
    public final String mo27604a() {
        return this.f79190a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C30329fo) && Intrinsics.m17075f(this.f79190a, ((C30329fo) obj).f79190a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f79190a.hashCode();
    }

    @NotNull
    public final String toString() {
        String str = this.f79190a;
        return "CloseAction(actionType=" + str + ")";
    }
}
