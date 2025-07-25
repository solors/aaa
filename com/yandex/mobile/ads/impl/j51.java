package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.monetization.ads.common.AdImpressionData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class j51 implements InterfaceC30655js {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30355g1 f80754a;
    @NotNull

    /* renamed from: b */
    private final gb0 f80755b;

    public j51(@NotNull C31012o1 adActivityListener, @NotNull gb0 fullscreenAdtuneCloseEnabledProvider) {
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(fullscreenAdtuneCloseEnabledProvider, "fullscreenAdtuneCloseEnabledProvider");
        this.f80754a = adActivityListener;
        this.f80755b = fullscreenAdtuneCloseEnabledProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    /* renamed from: a */
    public final void mo26241a(@Nullable AdImpressionData adImpressionData) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", adImpressionData);
        this.f80754a.mo31193a(16, bundle);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void closeNativeAd() {
        if (this.f80755b.m33892a()) {
            this.f80754a.mo31195a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onLeftApplication() {
        this.f80754a.mo31193a(17, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onReturnedToApplication() {
        this.f80754a.mo31193a(18, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onAdClicked() {
    }
}
