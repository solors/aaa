package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.vp */
/* loaded from: classes8.dex */
public final class C31674vp implements InterfaceC30890mz<ExtendedNativeAdView> {
    @NotNull

    /* renamed from: a */
    private final C30578is f86832a;

    /* renamed from: b */
    private final int f86833b;

    public C31674vp(@NotNull C30578is nativeAdAssets, int i) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        this.f86832a = nativeAdAssets;
        this.f86833b = i;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView adView = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(adView, "adView");
        C31760wp c31760wp = new C31760wp(this.f86832a, this.f86833b, new a11());
        ImageView m27861a = c31760wp.m27861a(adView);
        ImageView m27859b = c31760wp.m27859b(adView);
        if (m27861a != null) {
            m27861a.setId(C29880R.C29884id.favicon);
        }
        if (m27859b != null) {
            m27859b.setId(C29880R.C29884id.icon);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
    }
}
