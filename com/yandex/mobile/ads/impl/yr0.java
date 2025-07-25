package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.tr0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class yr0<V extends ViewGroup> implements InterfaceC30890mz<V> {
    @NotNull

    /* renamed from: a */
    private final q11 f88496a;
    @NotNull

    /* renamed from: b */
    private final zr0 f88497b;

    public yr0(@NotNull C30578is nativeAdAssets, @NotNull q11 nativeAdContainerViewProvider, @NotNull zr0 mediaAspectRatioProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        Intrinsics.checkNotNullParameter(mediaAspectRatioProvider, "mediaAspectRatioProvider");
        this.f88496a = nativeAdContainerViewProvider;
        this.f88497b = mediaAspectRatioProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f88496a.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) container.findViewById(C29880R.C29884id.media_container);
        Float m26010a = this.f88497b.m26010a();
        if (extendedViewContainer != null && m26010a != null) {
            extendedViewContainer.setMeasureSpecProvider(new gi1(m26010a.floatValue(), new tr0.C31476a()));
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
    }
}
