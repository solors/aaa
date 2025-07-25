package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.tr0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class kt0<V extends ViewGroup> implements InterfaceC30890mz<V> {
    @NotNull

    /* renamed from: a */
    private final q11 f81567a;
    @NotNull

    /* renamed from: b */
    private final zr0 f81568b;

    public kt0(@NotNull C30578is nativeAdAssets, @NotNull q11 nativeAdContainerViewProvider, @NotNull zr0 mediaAspectRatioProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        Intrinsics.checkNotNullParameter(mediaAspectRatioProvider, "mediaAspectRatioProvider");
        this.f81567a = nativeAdContainerViewProvider;
        this.f81568b = mediaAspectRatioProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V view) {
        Intrinsics.checkNotNullParameter(view, "container");
        this.f81567a.getClass();
        Intrinsics.checkNotNullParameter(view, "container");
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) view.findViewById(C29880R.C29884id.media_container);
        Float m26010a = this.f81568b.m26010a();
        if (extendedViewContainer != null && m26010a != null) {
            gi1 gi1Var = new gi1(Math.min(Math.max(m26010a.floatValue(), 1.0f), 1.7777778f), new tr0.C31476a());
            Intrinsics.checkNotNullParameter(view, "view");
            Context applicationContext = view.getContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            extendedViewContainer.setMeasureSpecProvider(new C31833xp(gi1Var, new rr0(view, 0.5f, applicationContext)));
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
    }
}
