package com.yandex.mobile.ads.banner;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface BannerAdEventListener {
    void onAdClicked();

    void onAdFailedToLoad(@NotNull AdRequestError adRequestError);

    void onAdLoaded();

    void onImpression(@Nullable ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
