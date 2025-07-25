package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class k10 implements InterfaceC30989nz {
    @NotNull

    /* renamed from: a */
    private final C30149d8<?> f81225a;

    public k10(@NotNull C30149d8<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f81225a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30989nz
    /* renamed from: a */
    public final boolean mo28715a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Intrinsics.m17075f(EnumC31322rz.f84949c.m29892a(), this.f81225a.m35046w());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k10) && Intrinsics.m17075f(this.f81225a, ((k10) obj).f81225a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f81225a.hashCode();
    }

    @NotNull
    public final String toString() {
        C30149d8<?> c30149d8 = this.f81225a;
        return "DivKitDesignConstraint(adResponse=" + c30149d8 + ")";
    }
}
