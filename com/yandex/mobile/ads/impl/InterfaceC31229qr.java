package com.yandex.mobile.ads.impl;

import androidx.annotation.MainThread;
import com.monetization.ads.common.AdImpressionData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
/* renamed from: com.yandex.mobile.ads.impl.qr */
/* loaded from: classes8.dex */
public interface InterfaceC31229qr {
    /* renamed from: a */
    void mo26929a(@Nullable AdImpressionData adImpressionData);

    /* renamed from: a */
    void mo26928a(@NotNull C31082p3 c31082p3);

    void closeBannerAd();

    void onAdClicked();

    void onAdLoaded();

    void onLeftApplication();

    void onReturnedToApplication();
}
