package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.mc */
/* loaded from: classes8.dex */
public final class C30838mc<V extends ViewGroup> implements InterfaceC30890mz<V> {
    @NotNull

    /* renamed from: a */
    private final C30578is f82116a;
    @NotNull

    /* renamed from: b */
    private final c21 f82117b;

    public C30838mc(@NotNull C30578is nativeAdAssets, @NotNull c21 nativeAdDividerViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdDividerViewProvider, "nativeAdDividerViewProvider");
        this.f82116a = nativeAdAssets;
        this.f82117b = nativeAdDividerViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f82117b.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewById = container.findViewById(C29880R.C29884id.age_divider);
        if (findViewById != null && this.f82116a.m33146a() == null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
    }
}
