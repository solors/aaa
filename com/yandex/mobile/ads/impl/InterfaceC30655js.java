package com.yandex.mobile.ads.impl;

import androidx.annotation.MainThread;
import com.monetization.ads.common.AdImpressionData;
import org.jetbrains.annotations.Nullable;

@MainThread
/* renamed from: com.yandex.mobile.ads.impl.js */
/* loaded from: classes8.dex */
public interface InterfaceC30655js {
    /* renamed from: a */
    void mo26241a(@Nullable AdImpressionData adImpressionData);

    void closeNativeAd();

    void onAdClicked();

    void onLeftApplication();

    void onReturnedToApplication();
}
