package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class od1<V extends ViewGroup> implements InterfaceC30890mz<V> {
    @NotNull

    /* renamed from: a */
    private final C30578is f83457a;
    @NotNull

    /* renamed from: b */
    private final a11 f83458b;
    @NotNull

    /* renamed from: c */
    private final d11 f83459c;

    public od1(@NotNull C30578is nativeAdAssets, @NotNull a11 nativeAdAdditionalViewProvider, @NotNull d11 nativeAdAssetViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdAdditionalViewProvider, "nativeAdAdditionalViewProvider");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        this.f83457a = nativeAdAssets;
        this.f83458b = nativeAdAdditionalViewProvider;
        this.f83459c = nativeAdAssetViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f83458b.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        ImageView imageView = (ImageView) container.findViewById(C29880R.C29884id.icon_placeholder);
        C30745ks m33140g = this.f83457a.m33140g();
        C30745ks m33142e = this.f83457a.m33142e();
        if (imageView != null && m33140g == null && m33142e == null) {
            this.f83459c.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            qb2 qb2Var = new qb2((TextView) container.findViewById(C29880R.C29884id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(qb2Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
    }
}
