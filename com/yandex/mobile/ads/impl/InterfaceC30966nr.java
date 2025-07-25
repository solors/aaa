package com.yandex.mobile.ads.impl;

import androidx.annotation.MainThread;
import com.monetization.ads.common.AdImpressionData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
/* renamed from: com.yandex.mobile.ads.impl.nr */
/* loaded from: classes8.dex */
public interface InterfaceC30966nr {
    /* renamed from: a */
    void mo29628a(@Nullable AdImpressionData adImpressionData);

    /* renamed from: a */
    void mo29626a(@NotNull ut1 ut1Var);

    void onAdClicked();

    void onAdDismissed();

    void onAdShown();
}
