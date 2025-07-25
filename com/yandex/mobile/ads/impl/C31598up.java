package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.up */
/* loaded from: classes8.dex */
public final class C31598up implements InterfaceC30989nz {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30989nz[] f86346a;

    public C31598up(@NotNull InterfaceC30989nz... designConstraints) {
        Intrinsics.checkNotNullParameter(designConstraints, "designConstraints");
        this.f86346a = designConstraints;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30989nz
    /* renamed from: a */
    public final boolean mo28715a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        for (InterfaceC30989nz interfaceC30989nz : this.f86346a) {
            if (!interfaceC30989nz.mo28715a(context)) {
                return false;
            }
        }
        return true;
    }
}
