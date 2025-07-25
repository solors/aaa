package com.yandex.mobile.ads.impl;

import androidx.annotation.MainThread;
import com.monetization.ads.common.AdImpressionData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
/* renamed from: com.yandex.mobile.ads.impl.ys */
/* loaded from: classes8.dex */
public interface InterfaceC31923ys {
    /* renamed from: a */
    void mo26617a(@Nullable AdImpressionData adImpressionData);

    /* renamed from: a */
    void mo26616a(@NotNull ln1 ln1Var);

    /* renamed from: a */
    void mo26615a(@NotNull ut1 ut1Var);

    void onAdClicked();

    void onAdDismissed();

    void onAdShown();
}
