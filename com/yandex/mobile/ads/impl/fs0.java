package com.yandex.mobile.ads.impl;

import android.content.Context;
import be.MathJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class fs0 implements InterfaceC30989nz {

    /* renamed from: a */
    private final int f79295a;
    @NotNull

    /* renamed from: b */
    private final zr0 f79296b;

    public fs0(@NotNull C30578is nativeAdAssets, int i, @NotNull zr0 mediaAspectRatioProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(mediaAspectRatioProvider, "mediaAspectRatioProvider");
        this.f79295a = i;
        this.f79296b = mediaAspectRatioProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30989nz
    /* renamed from: a */
    public final boolean mo28715a(@NotNull Context context) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = cc2.f77597b;
        Intrinsics.checkNotNullParameter(context, "context");
        int i3 = context.getResources().getDisplayMetrics().heightPixels;
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = context.getResources().getDisplayMetrics().widthPixels;
        Float m26010a = this.f79296b.m26010a();
        if (m26010a != null) {
            i = MathJVM.m103791d(m26010a.floatValue() * i3);
        } else {
            i = 0;
        }
        if (i4 - i < this.f79295a) {
            return false;
        }
        return true;
    }
}
