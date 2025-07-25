package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class c01 {
    @NotNull

    /* renamed from: a */
    private final vo1<MultiBannerControlsContainer> f77468a = new vo1<>();

    @Nullable
    /* renamed from: a */
    public final MultiBannerControlsContainer m35385a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        vo1<MultiBannerControlsContainer> vo1Var = this.f77468a;
        int i = C29880R.C29885layout.monetization_ads_internal_multibanner_controls;
        vo1Var.getClass();
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) vo1.m28247a(context, MultiBannerControlsContainer.class, i, null);
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.setLayoutParams(layoutParams);
        }
        return multiBannerControlsContainer;
    }
}
