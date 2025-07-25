package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ys0<V extends ViewGroup> implements InterfaceC30890mz<V> {
    @NotNull

    /* renamed from: a */
    private final C30578is f88513a;
    @NotNull

    /* renamed from: b */
    private final q11 f88514b;

    public ys0(@NotNull C30578is nativeAdAssets, @NotNull q11 nativeAdContainerViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        this.f88513a = nativeAdAssets;
        this.f88514b = nativeAdContainerViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f88514b.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) container.findViewById(C29880R.C29884id.media_container);
        if (extendedViewContainer != null && this.f88513a.m33139h() == null && this.f88513a.m33138i() == null) {
            extendedViewContainer.setVisibility(8);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
    }
}
